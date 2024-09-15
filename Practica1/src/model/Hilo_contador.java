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
        try {
            Hilo_contador.sleep(1000);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        int total = 0;
        int segundos = 0;
        int minutos = 0;
        while(total < getTiempo()){
            try {      
                total++;
                segundos++;
                if(segundos>59){
                    minutos++;
                    
                    if(minutos < 10 && minutos != 0){
                        label_min.setText("0" + String.valueOf(minutos));
                    }
                    else{
                        label_min.setText(String.valueOf(minutos));   
                    }
                    
                    segundos = 0;
                }
                if(segundos == 0){
                    label_sec.setText(String.valueOf(segundos) + "0");
                }
                else if(segundos < 10 && segundos != 0){
                    label_sec.setText("0" + String.valueOf(segundos));
                }
                else{
                    label_sec.setText(String.valueOf(segundos));   
                }
                Hilo_contador.sleep(1000);
                
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        try {
            Hilo_contador.sleep(5000);
            this.tiempo += 5;
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo_contador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getTiempo() {
        return tiempo;
    }
    
}
