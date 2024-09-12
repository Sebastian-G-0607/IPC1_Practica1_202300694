package model;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

/**

 @author sebas
 */
public class Hilo_barra extends Thread{
    
    private boolean band = true;
    private JProgressBar barra;
    private int tiempo;
    private double progress;
    
    public Hilo_barra(){
    }
    
    //Constructor para los hilos de material y color
    public Hilo_barra(JProgressBar barra, String descripcion){

        //Validando el material del producto
        if(descripcion.equals("metal")){
            tiempo = 15;
        }
        else if(descripcion.equals("madera")){
            tiempo = 25;
        }
        else if(descripcion.equals("vidrio")){
            tiempo = 10;
        } 
        else if(descripcion.equals("nylon")){
            tiempo = 20;
        } 
        else if(descripcion.equals("hule")){
            tiempo = 10;
        } 
        else if(descripcion.equals("poliester")){
            tiempo = 5;
        } 
        
        //Validando el color
        if(descripcion.equals("verde")){
            tiempo = 15;
        }
        else if(descripcion.equals("negro")){
            tiempo = 25;
        }
        else if(descripcion.equals("na")){
            tiempo = 0;
        }
        else if(descripcion.equals("azul")){
            tiempo = 20;
        }
        else if(descripcion.equals("rojo")){
            tiempo = 10;
        }
        else if(descripcion.equals("amarillo")){
            tiempo = 5;
        }
    }
       
    //Constructor para los hilos de empaquetado
    public Hilo_barra(JProgressBar barra){
        this.barra = barra;
        this.tiempo = 10;
    }
    
    @Override
    public void run(){
        
        int segundos = 0;
        double aumento = 100/getTiempo();
        
        while(band){
            try {
                segundos++;
                progress += aumento;
                if(segundos >= getTiempo() || progress >= 100){
                    band = false;
                }
                SwingUtilities.invokeLater(() -> barra.setValue((int) progress));
                Hilo_barra.sleep(1000);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public int getTiempo() {
        return tiempo;
    }
    
    
    
}
