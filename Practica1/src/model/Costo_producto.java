/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**

 @author sebas
 */
public class Costo_producto {
    
    public int costo(String descripcion){
        int costo = -1;
        
        if(descripcion.equals("metal")){
            costo = 3;
        }
        else if(descripcion.equals("madera")){
            costo = 1;
        }
        else if(descripcion.equals("vidrio")){
            costo = 6;
        } 
        else if(descripcion.equals("nylon")){
            costo = 2;
        } 
        else if(descripcion.equals("hule")){
            costo = 5;
        } 
        else if(descripcion.equals("poliester")){
            costo = 4;
        } 
        
        //Validando el color
        else if(descripcion.equals("verde")){
            costo = 3;
        }
        else if(descripcion.equals("negro")){
            costo = 1;
        }
        else if(descripcion.equals("na")){
            costo = 0;
        }
        else if(descripcion.equals("azul")){
            costo = 2;
        }
        else if(descripcion.equals("rojo")){
            costo = 5;
        }
        else if(descripcion.equals("amarillo")){
            costo = 4;
        }
        
        return costo;
    }
}
