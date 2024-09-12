package model;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**

 @author sebas
 */
public class Hilo_contador extends Thread{
    
    private int tiempo;
    private JLabel label_sec;
    private JLabel label_min;
    
    //Contador para 
    public Hilo_contador(int tiempo, JLabel label_sec, JLabel label_min){
        this.label_sec = label_sec;
        this.label_min = label_min;
        this.tiempo = tiempo;
    }
    
    @Override
    public void run(){
        int total = 0;
        int segundos = 0;
        int minutos = 0;
        while(total < tiempo){
            try { 
                
                total++;
                segundos++;
                if(total>59){
                    minutos++;
                    label_min.setText(String.valueOf(minutos));
                    segundos = 0;
                }
                
                label_sec.setText(String.valueOf(segundos));
                Hilo_contador.sleep(1000);
                
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }
}
