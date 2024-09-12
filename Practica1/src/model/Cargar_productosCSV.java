/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**

 @author sebas
 */
public class Cargar_productosCSV {
    
    private String ruta;
    private boolean band = false;
    
    public void elegir_archivo(){
        JFileChooser selArchivo = new JFileChooser("C:\\Users\\sebas\\OneDrive\\Escritorio");
        int val = selArchivo.showOpenDialog(null); //Se muestra la interfaz
        if(val != selArchivo.CANCEL_OPTION){ //Si el usuario no cerró el JFileChooser:
            ruta = selArchivo.getSelectedFile().getAbsolutePath(); //Se guarda la ruta del archivo que el usuario seleccionó
            band = true; //Se cambia la bandera a true
        } 
    }
    
    public void Cargar_productos(){
        
        int contador = 0;
        String linea;
        String partes[];
        BufferedReader br;
        
        try {
            br = new BufferedReader(new FileReader(ruta));
            Producto producto_temporal; //Se crea un producto temporal que almacena los datos de cada fila
            while((linea = br.readLine()) != null){
                if(contador > 0){
                    producto_temporal =  new Producto();
                    partes = linea.split(",");
                
                    //Eliminando espacios
                    for(int i=0; i<partes.length; i++){
                        partes[i] = partes[i].trim();
                    }
                    
                    producto_temporal.setCodigo(partes[0]);
                    producto_temporal.setNombre(partes[1]);
                    producto_temporal.setMaterial(partes[2]);
                    producto_temporal.setColor(partes[3]);
                    
                    Lista_Productos.productos.add(producto_temporal);
                }
                contador++; 
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
}
