package main;

import view.EstacionDeCarga;
import model.Cargar_productosCSV;
import model.Productos_binarios;
import controller.Cargar_productos;

/**

 @author sebas
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("hh");
        EstacionDeCarga view = new EstacionDeCarga();
        Cargar_productos cargar = new Cargar_productos(view);
        view.setVisible(true);
    }
}
