package main;

import view.EstacionDeCarga;
import model.Cargar_productosCSV;
import model.Productos_binarios;
import controller.Cargar_productos;
import model.Actualizar_tabla;
import model.Lista_Productos;
import model.Productos_binarios;
import view.EstacionDeResultados;

/**

 @author sebas
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        
        Productos_binarios.leer_productosBinario();
        
        EstacionDeCarga view = new EstacionDeCarga();

        Cargar_productos cargar = new Cargar_productos(view);
        view.setVisible(true);

    }
}
