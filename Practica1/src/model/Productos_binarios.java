package model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
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
        } catch (EOFException e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    public static void leer_productosBinario() throws ClassNotFoundException{
        
        String nombreArchivo = "productos.bin";
        File archivo = new File(nombreArchivo);
        
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
        
        while (fis.available()>0) {
            Lista_Productos.productos = (List<Producto>) ois.readObject();
        }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El sistema almacena los datos en " + e.getMessage() + ". Se creará un archivo para almacenar los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch(EOFException e){
            JOptionPane.showMessageDialog(null, "El sistema no encontró datos de Investigadores", "Error", JOptionPane.ERROR_MESSAGE);
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
