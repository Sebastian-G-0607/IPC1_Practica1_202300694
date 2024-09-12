package model;

import javax.swing.JOptionPane;

/**

 @author sebas
 */
public class Hilos_serie extends Thread{
    
    private Hilo_barra hilo1;
    private Hilo_barra hilo2;
    private Hilo_barra hilo3;
    int cantidadDeProductos;
    
    public Hilos_serie(Hilo_barra hilo1, Hilo_barra hilo2, Hilo_barra hilo3, int cantidadDeProductos){
        this.hilo1 = hilo1;
        this.hilo2 = hilo2;
        this.hilo3 = hilo3;
        this.cantidadDeProductos = cantidadDeProductos;
    }
    
    public void run(){
        for(int i=0; i < cantidadDeProductos; i++){
            
//            hilo1 = new Hilo_barra();
//            hilo2 = new Hilo_barra();
//            hilo3 = new Hilo_barra();
            
            try {
                hilo1.start();
                hilo1.join();
                
                hilo2.start();
                hilo2.join();
                
                hilo3.start();
                hilo3.join();
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
}
