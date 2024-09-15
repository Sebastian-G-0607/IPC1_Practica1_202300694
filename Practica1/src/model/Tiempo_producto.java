/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**

 @author sebas
 */
public class Tiempo_producto {
    
    public int tiempo(String descripcion){
        int tiempo = -1;
        
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
        else if(descripcion.equals("verde")){
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
        
        return tiempo;
    }
}
