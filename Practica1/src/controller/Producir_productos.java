package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
    private EstacionDeResultados resultados;
    
    public Producir_productos(Producir view, EstacionDeCarga estacion, EstacionDeTrabajo trabajo, EstacionDeResultados resultados){
        this.view = view;
        this.view.btn_produce.addActionListener(this);
        this.estacion = estacion;
        this.trabajo = trabajo;
        this.resultados = resultados;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == view.btn_produce){
            String codigo = view.field_cod.getText().toString();
            int cantidad = 0;
            
            Tiempo_producto calculador_tempo = new Tiempo_producto();
            
            if(!view.field_cantidad.getText().equals("")){
                cantidad = Integer.parseInt(view.field_cantidad.getText());
            }        
            
            Lista_Productos buscador = new Lista_Productos();
            int index = buscador.Buscar_producto(codigo);
            
            if(index == -1){
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias", "Error", JOptionPane.ERROR);
            }
            else if(cantidad == 0){
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
                
                int tiempo = (tiempo_material + tiempo_color + 10) * cantidad;
                
                Hilos_serie serie = new Hilos_serie(Lista_Productos.productos.get(index).getMaterial().toLowerCase(), Lista_Productos.productos.get(index).getColor().toLowerCase(), cantidad, trabajo, resultados);
                Hilo_contador timer = new Hilo_contador(tiempo, trabajo.label_sec, trabajo.label_min);
                Hilo_contadorProductos num_productos = new Hilo_contadorProductos(tiempo_material, tiempo_color, 10, cantidad, trabajo.label_total, trabajo.label_contador);
                
                serie.start(); 
                timer.start();
                num_productos.start();
            }
        }
    
    }
    
}
