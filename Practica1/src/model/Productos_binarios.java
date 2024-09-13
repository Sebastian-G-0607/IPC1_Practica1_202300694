package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**

 @author sebas
 */
public class Productos_binarios {
    
    public static void escribir_productosBinario(){
        
        String nombreArchivo = "productos.bin"; //Nombre del archivo
        File archivo = new File(nombreArchivo); //Se crea un objeto de tipo archivo con el nombre del string definido arriba
        
        try {
            FileOutputStream fos = new FileOutputStream(archivo); 
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //Se escribe el ArrayList de productos en el archivo binario.
            oos.writeObject(Lista_Productos.productos);
            
            //Se cierra el flujo de datos
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
