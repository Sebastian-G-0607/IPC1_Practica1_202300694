package model;

import javax.swing.JLabel;
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
    private JLabel label;
    
    
    //Constructor para los hilos de material y color
    public Hilo_barra(JProgressBar barra, String descripcion, JLabel label){
        
        this.barra = barra;
        this.label = label;
        
        //Validando el material del producto
        if(descripcion.equals("metal")){
            this.tiempo = 15;
        }
        else if(descripcion.equals("madera")){
            this.tiempo = 25;
        }
        else if(descripcion.equals("vidrio")){
            this.tiempo = 10;
        } 
        else if(descripcion.equals("nylon")){
            this.tiempo = 20;
        } 
        else if(descripcion.equals("hule")){
            this.tiempo = 10;
        } 
        else if(descripcion.equals("poliester")){
            this.tiempo = 5;
        } 
        
        //Validando el color
        else if(descripcion.equals("verde")){
            this.tiempo = 15;
        }
        else if(descripcion.equals("negro")){
            this.tiempo = 25;
        }
        else if(descripcion.equals("na")){
            this.tiempo = 0;
        }
        else if(descripcion.equals("azul")){
            this.tiempo = 20;
        }
        else if(descripcion.equals("rojo")){
            this.tiempo = 10;
        }
        else if(descripcion.equals("amarillo")){
            this.tiempo = 5;
        }
    }
       
    //Constructor para los hilos de empaquetado
    public Hilo_barra(JProgressBar barra, JLabel label){
        this.barra = barra;
        this.tiempo = 10;
        this.label = label;
    }
    
    @Override
    public void run(){
        
        double aumento;
        
        int segundos = 0;
        if(this.tiempo != 0){
            aumento = 100/this.tiempo;
        } else{
            aumento = 100;
        }
        
        while(band){
            try {
                segundos++;
                progress += aumento;
                if(segundos >= this.tiempo || progress >= 100){
                    band = false;
                }
                if(segundos == this.tiempo){
                   SwingUtilities.invokeLater(() -> barra.setValue(100)); 
                    getLabel().setText("100");
                }
                else{
                  SwingUtilities.invokeLater(() -> barra.setValue((int) progress));  
                    getLabel().setText(String.valueOf(progress));
                }
                if(aumento != 100){
                    Hilo_barra.sleep(1000);
                }
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public int getTiempo() {
        return tiempo;
    }

    public JLabel getLabel() {
        return label;
    }
    
    
    
}
