/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import Model.Model_Alar;

/**
 *
 * @author Usuario
 */
public class TablaAlar extends JFrame{
    private JTable tabla;
    public JScrollPane jsp;
    public Container cp;
    public TablaCPanel tcp;
    public JLabel Nom;
    
    //public TablaC(){}
    public TablaAlar(Model_Alar alar){
     super("Estado de las A L A R M A S");
            setSize(500,500);
            setLocation(850, 60);
            setVisible(false);
            Nom= new JLabel("A L A R M A S");
            tcp=new TablaCPanel(alar);
            add(Nom,BorderLayout.NORTH);
        add(tcp,BorderLayout.CENTER);

       
}
    public class TablaCPanel extends JPanel {

    private JTable tabla;
    public JScrollPane jsp;
    public TablaCPanel(Model_Alar alar) {
     /* if (col % 2 != 0) {
setBackground(new Color(189, 214, 231));
} else {
setBackground(Color.white);
} */

        tabla = new JTable(alar);
        tabla.setVisible(true);
      
        tabla.setBackground(Color.WHITE);
     
        jsp = new JScrollPane(tabla);
        add(jsp);
        

    }
}
    
}