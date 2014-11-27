/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import Model.Model_Clima;


/**
 *
 * @author Usuario
 */
public class TablaCli extends JFrame{
    private JTable tabla;
    public JScrollPane jsp;
    public Container cp;
    public TablaCPanel tcp;
    public JLabel Nom;
    
    //public TablaC(){}
    public TablaCli(Model_Clima model_Clima){
     super("Estado de la C L I M A T I Z A C I O N");
            setSize(500,500);
            setLocation(850, 60);
            setVisible(false);
            Nom= new JLabel("C L I M A T I Z A C I O N");
            tcp=new TablaCPanel(model_Clima);
            add(Nom,BorderLayout.NORTH);
        add(tcp,BorderLayout.CENTER);

       
}
    public class TablaCPanel extends JPanel {

    private JTable tabla;
    public JScrollPane jsp;
    public TablaCPanel(Model_Clima h1) {
     /* if (col % 2 != 0) {
setBackground(new Color(189, 214, 231));
} else {
setBackground(Color.white);
} */

        tabla = new JTable(h1);
        tabla.setVisible(true);
      
        tabla.setBackground(Color.WHITE);
     
        jsp = new JScrollPane(tabla);
        add(jsp);
        

    }
}
    
}