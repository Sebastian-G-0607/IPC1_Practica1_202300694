/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Producir;

/**

 @author sebas
 */
public class Producir_productos implements ActionListener{
    
    private Producir view;
    
    public Producir_productos(Producir view){
        this.view = view;
        this.view.btn_produce.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == view.btn_produce){
            String codigo = view.field_cod.getText().toString();
            int cantidad =  Integer.parseInt(view.field_cantidad.getText());
        }
    
    }
    
}
