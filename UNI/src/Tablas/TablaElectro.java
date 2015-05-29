/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import Model.Model_Electro;


/**
 *
 * @author Usuario
 */
public class TablaElectro extends JFrame{
    private JTable tabla;
    public JScrollPane jsp;
    public Container cp;
    public TablaCPanel tcp;
    public JLabel Nom;
    
    //public TablaElectro(){}
    public TablaElectro(Model_Electro modelo){
    super("Estado de los E L E C T R O D O M E S T I C O S");
            setSize(500,500);
            setLocation(850, 60);
            setVisible(false);
            Nom= new JLabel("E L E C T R O D O M E S T I C O S");
            tcp=new TablaCPanel(modelo);
            add(Nom,BorderLayout.NORTH);
        add(tcp,BorderLayout.CENTER);

       
}
    public class TablaCPanel extends JPanel {

    private JTable tabla;
    public JScrollPane jsp;
    public TablaCPanel(Model_Electro modelo) {
     /* if (col % 2 != 0) {
setBackground(new Color(189, 214, 231));
} else {
setBackground(Color.white);
} */

        tabla = new JTable(modelo);
        tabla.setVisible(true);
      
        tabla.setBackground(Color.WHITE);
     
        jsp = new JScrollPane(tabla);
        add(jsp);
        

    }
}
    
}