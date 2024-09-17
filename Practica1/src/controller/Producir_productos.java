package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Costo_producto;
import model.Hilo_barra;
import model.Hilo_contador;
import model.Hilo_contadorProductos;
import model.Hilos_serie;
import model.Lista_Productos;
import model.Tiempo_producto;
import view.EstacionDeCarga;
import view.EstacionDeTrabajo;
import view.Producir;
import view.EstacionDeResultados;

/**

 @author sebas
 */
public class Producir_productos implements ActionListener{
    
    private Producir view;
    private EstacionDeCarga estacion;
    private EstacionDeTrabajo trabajo;
//    private EstacionDeResultados resultados;
    
    public Producir_productos(Producir view, EstacionDeCarga estacion, EstacionDeTrabajo trabajo){
        this.view = view;
        this.view.btn_produce.addActionListener(this);
        this.estacion = estacion;
        this.trabajo = trabajo;
//        this.resultados = resultados;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == view.btn_produce){
            String codigo = view.field_cod.getText().toString();
            int cantidad = 0;
            
            EstacionDeResultados resultados = new EstacionDeResultados();

            Tiempo_producto calculador_tempo = new Tiempo_producto();
            Costo_producto calculador_costo = new Costo_producto();
            
            if(!view.field_cantidad.getText().equals("")){
                try {
                    cantidad = Integer.parseInt(view.field_cantidad.getText());
                    
                    Lista_Productos buscador = new Lista_Productos();
                    int index = buscador.Buscar_producto(codigo);

                    if(index == -1){
                        JOptionPane.showMessageDialog(null, "No se encontraron coincidencias", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else if(cantidad <= 0){
                        JOptionPane.showMessageDialog(null, "Debe ingresar al menos 1 producto para producir");
                    }
                    else if(calculador_tempo.tiempo(Lista_Productos.productos.get(index).getMaterial().toLowerCase()) == -1){
                        JOptionPane.showMessageDialog(null, "El material del producto no está registrado en el sistema");
                    }
                    else if(calculador_tempo.tiempo(Lista_Productos.productos.get(index).getColor().toLowerCase()) == -1){
                        JOptionPane.showMessageDialog(null, "El color del producto no está registrado en el sistema");
                    }
                    else{
                        this.view.dispose();
                        this.estacion.dispose();

                        this.trabajo.setVisible(true);


                        int tiempo_material = calculador_tempo.tiempo(Lista_Productos.productos.get(index).getMaterial().toLowerCase());
                        int tiempo_color = calculador_tempo.tiempo(Lista_Productos.productos.get(index).getColor().toLowerCase());
                        int costo_material = calculador_costo.costo(Lista_Productos.productos.get(index).getMaterial().toLowerCase());
                        int costo_color = calculador_costo.costo(Lista_Productos.productos.get(index).getColor().toLowerCase());

                        int tiempo = (tiempo_material + tiempo_color + 10) * cantidad;
                        int minutos = (int) tiempo/60;
                        int segundos = tiempo%60;

                        Hilos_serie serie = new Hilos_serie(Lista_Productos.productos.get(index).getMaterial().toLowerCase(), Lista_Productos.productos.get(index).getColor().toLowerCase(), cantidad, trabajo, resultados);
                        Hilo_contador timer = new Hilo_contador(tiempo, trabajo.label_sec, trabajo.label_min);
                        Hilo_contadorProductos num_productos = new Hilo_contadorProductos(tiempo_material, tiempo_color, 10, cantidad, trabajo.label_total, trabajo.label_contador);

                        serie.start(); 
                        timer.start();
                        num_productos.start();

                        resultados.getLabel_producto().setText(Lista_Productos.productos.get(index).getCodigo());
                        resultados.getLabel_nombre().setText(Lista_Productos.productos.get(index).getNombre());
                        resultados.getLabel_color().setText(Lista_Productos.productos.get(index).getColor());
                        resultados.getLabel_material().setText(Lista_Productos.productos.get(index).getMaterial());
                        resultados.getLabel_cantidad().setText(String.valueOf(cantidad));
                        resultados.getLabel_costoT().setText("Q" + ((costo_material*tiempo_material) + (costo_color*tiempo_color) + (20))*cantidad + ".00");
                        resultados.getLabel_costoU().setText("Q" + ((costo_material*tiempo_material) + (costo_color*tiempo_color) + (20)) + ".00");

                        String string_minutos;
                        String string_segundos;

                        if(minutos < 10){
                            string_minutos = "0" + String.valueOf(minutos);
                        }
                        else{
                            string_minutos = String.valueOf(minutos);
                        }

                        if(segundos < 10){
                            string_segundos = "0" + String.valueOf(segundos);
                        }
                        else{
                            string_segundos = String.valueOf(segundos);
                        }
                        resultados.getLabel_tiempo().setText(string_minutos + ":" + string_segundos);


                        minutos = (int) (tiempo/cantidad)/60;
                        segundos = (int) (tiempo/cantidad)%60;

                        if(minutos < 10){
                            string_minutos = "0" + String.valueOf(minutos);
                        }
                        else{
                            string_minutos = String.valueOf(minutos);
                        }

                        if(segundos < 10){
                            string_segundos = "0" + String.valueOf(segundos);
                        }
                        else{
                            string_segundos = String.valueOf(segundos);
                        }

                        resultados.getLabel_tiempoU().setText(string_minutos + ":" + string_segundos);             
                    }
                    
                } catch (NumberFormatException ev) {
                    JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida");
                }
            }        

        }
    
    }
    
}
