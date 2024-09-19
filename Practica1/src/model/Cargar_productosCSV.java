package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**

 @author sebas
 */
public class Cargar_productosCSV {
    
    private String ruta;
    private boolean band = false;
    
    public void elegir_archivo(){
        String extension;
        JFileChooser selArchivo = new JFileChooser("C:\\Users\\sebas\\OneDrive\\Escritorio");
        int val = selArchivo.showOpenDialog(null); //Se muestra la interfaz
        if(val != selArchivo.CANCEL_OPTION){ //Si el usuario no cerró el JFileChooser:
            ruta = selArchivo.getSelectedFile().getAbsolutePath(); //Se guarda la ruta del archivo que el usuario seleccionó
            if((extension = ruta.substring(ruta.lastIndexOf(".") + 1)).equals("csv")){
                band = true; //Se cambia la bandera a true
            }
            else{
                JOptionPane.showMessageDialog(null, "Tipo de archivo no válido");
                band = false;
            }
        } 
    }
    
    public void Cargar_productos(){
        
        int contador = 0;
        String linea;
        String partes[];
        BufferedReader br;
        
        try {
            br = new BufferedReader(new FileReader(getRuta()));
            Producto producto_temporal; //Se crea un producto temporal que almacena los datos de cada fila
            int pr = 1;
            while((linea = br.readLine()) != null){
                if(contador > 0){
                    producto_temporal =  new Producto();
                    partes = linea.split(",");
                
                    //Eliminando espacios y convirtiendo a minusculas las propiedades
                    for(int i=0; i<partes.length; i++){
                        partes[i] = partes[i].trim();
                    }
                    if(comparar_codigo(Lista_Productos.productos, partes[0]) == true){
                        JOptionPane.showMessageDialog(null, "El código del elemento " + contador + " ya fue ingresado en el sistema");
                    }
                    else{
                        producto_temporal.setCodigo(partes[0]);
                        producto_temporal.setNombre(partes[1]);
                        producto_temporal.setMaterial(partes[2]);
                        producto_temporal.setColor(partes[3]);

                        Lista_Productos.productos.add(producto_temporal);
                    } 
                }
                contador++; 
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e);
        } 
    }
    
    public boolean comparar_codigo(List<Producto> productos, String codigo){
        boolean band = false;
        for(int i=0; i<productos.size(); i++){
            if(productos.get(i).getCodigo().equals(codigo)){
                band = true;
            }
        }
        return band;
    }

    public String getRuta() {
        return ruta;
    }

    public boolean isBand() {
        return band;
    }
    
    
    
}
