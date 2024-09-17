package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EstacionDeCarga;
import model.Cargar_productosCSV;
import model.Actualizar_tabla;
import model.Lista_Productos;
import model.Productos_binarios;
import view.EstacionDeResultados;
import view.EstacionDeTrabajo;
import view.Producir;

/**

 @author sebas
 */
public class Cargar_productos implements ActionListener{
    
    private EstacionDeCarga view;
    
    public Cargar_productos(EstacionDeCarga view){
        this.view = view;
        this.view.btn_load.addActionListener(this);
        this.view.btn_produce.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == view.btn_load){
            Cargar_productosCSV csv = new Cargar_productosCSV();
            csv.elegir_archivo();
            if(csv.getRuta() != null){
                csv.Cargar_productos();
                
                Productos_binarios.escribir_productosBinario();
                
                Actualizar_tabla tabla = new Actualizar_tabla();
                tabla.agregar_productos(view.dtm_product, Lista_Productos.productos);
            }
        }
        if(e.getSource() == view.btn_produce){
            Producir producir = new Producir();
            producir.setVisible(true);
            EstacionDeTrabajo trabajo = new EstacionDeTrabajo();
            EstacionDeResultados resultados = new EstacionDeResultados();
            
            Producir_productos producir_control = new Producir_productos(producir, view, trabajo);
        }
    }
}
