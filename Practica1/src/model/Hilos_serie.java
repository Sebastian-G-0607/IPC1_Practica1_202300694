package model;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import view.EstacionDeResultados;
import view.EstacionDeTrabajo;

/**

 @author sebas
 */
public class Hilos_serie extends Thread{
    
    private String material;
    private String color;
//    private Hilo_barra hilo3;
    
    
    int cantidadDeProductos;
    private EstacionDeTrabajo trabajo;
    private EstacionDeResultados resultados;
    
    public Hilos_serie(String material, String color, int cantidadDeProductos, EstacionDeTrabajo trabajo, EstacionDeResultados resultados){
        this.material = material;
        this.color = color;
//        this.hilo3 = hilo3;
        this.cantidadDeProductos = cantidadDeProductos;
        this.trabajo = trabajo;
        this.resultados = resultados;
    }
    
    public void run(){
        int contador = 0;
        try {
            Hilos_serie.sleep(1000);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        for(int i=0; i<cantidadDeProductos; i++){
            try {
                
                Hilo_barra hilo1 = new Hilo_barra(trabajo.jProgressBar1, material, trabajo.label_1);
                Hilo_barra hilo2 = new Hilo_barra(trabajo.jProgressBar2,  color, trabajo.label_2);
                Hilo_barra hilo3 = new Hilo_barra(trabajo.jProgressBar3, trabajo.label_3);
                

                hilo1.start();
                hilo1.join();
                
                hilo2.start();
                hilo2.join();
                
                hilo3.start();
                hilo3.join();
                
                    
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            if(contador != cantidadDeProductos-1){
              SwingUtilities.invokeLater(() -> trabajo.jProgressBar1.setValue(0));
                SwingUtilities.invokeLater(() -> trabajo.jProgressBar2.setValue(0));  
                SwingUtilities.invokeLater(() -> trabajo.jProgressBar3.setValue(0));  

                trabajo.label_1.setText("0");
                trabajo.label_2.setText("0");
                trabajo.label_3.setText("0");  
            }

            contador++;
        }
        try {
            Hilos_serie.sleep(5000);
            this.trabajo.dispose();
            this.resultados.setVisible(true);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
