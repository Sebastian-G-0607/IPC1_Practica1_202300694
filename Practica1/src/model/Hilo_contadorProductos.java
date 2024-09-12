package model;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**

 @author sebas
 */
public class Hilo_contadorProductos extends Thread{
    
    private boolean band = true;
    private Hilo_barra hilo1 = new Hilo_barra();
    private Hilo_barra hilo2 = new Hilo_barra();
    private Hilo_barra hilo3 = new Hilo_barra();
    private JLabel label_total;
    private JLabel label_contador;
    private int total;
    
    public Hilo_contadorProductos(Hilo_barra hilo1, Hilo_barra hilo2, Hilo_barra hilo3, int totalDeProductos, JLabel label_total, JLabel label_contador){
        this.hilo1 = hilo1;
        this.hilo2 = hilo2;
        this.hilo3 = hilo3;
        this.total = totalDeProductos;
        this.label_contador = label_contador;
        this.label_total = label_total;
    }
    
    @Override
    public void run(){
        
        int numeroDeProductos = 0; //Se define una variable que aumentará cada que finalice la producción de un item
        int tiempoTotal = (hilo1.getTiempo() + hilo2.getTiempo() + hilo3.getTiempo()) * total; //Tiempo total que tomará producir n ítems
        int contador = 0; //Contador de los segundos transcurridos.
        label_total.setText(String.valueOf(total)); //Se le asigna el total de productos al JLabel
        
        //Este hilo aumentará el valor del contador de la cantidad de productos que se están produciendo
        while(numeroDeProductos < total){
            try {
                
                contador++;
                
                //Si se cumple esto, un producto ya fue producido, por lo que se aumenta en 1 el contador
                if( contador == (hilo1.getTiempo() + hilo2.getTiempo() + hilo3.getTiempo()) ){ 
                    numeroDeProductos++;
                    label_contador.setText(String.valueOf(numeroDeProductos));
                    contador = 0; //Se reinicia el contador
                } 
                
                Hilo_contadorProductos.sleep(1000); //Se detiene el hilo por 1 segundo
                
            } catch (InterruptedException ex) {JOptionPane.showMessageDialog(null,ex);
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }
    
}
