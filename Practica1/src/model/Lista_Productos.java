package model;

import java.util.List;
import java.util.ArrayList;

/**

 @author sebas
 */

//Clase modelo que contiene la lista dinámica de productos
public class Lista_Productos {
    //Lista estática
    public static List<Producto> productos = new ArrayList<>();
    
    //Método para buscar el código en el ArrayList
    public int Buscar_producto(String codigo){
        int index = -1;
        for(int i=0; i<productos.size(); i++){
            if(productos.get(i).getCodigo().equals(codigo)){
                index = i;
            }
        }
        return index;
    }
    
}
