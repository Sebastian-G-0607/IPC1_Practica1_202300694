package model;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**

 @author sebas
 */
public class Actualizar_tabla {
    
    public void agregar_productos(DefaultTableModel dtm, List<Producto> productos){
        int filas = dtm.getRowCount();
        
        for(int i=filas; i<productos.size(); i++){
            dtm.addRow(new Object[]{productos.get(i).getCodigo(),productos.get(i).getNombre(), productos.get(i).getMaterial(), productos.get(i).getColor()});
        }
    }
    
}
