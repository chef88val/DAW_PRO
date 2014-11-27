/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Opciones_abajo extends JPanel{
    public JButton cli,per,alar,elec,comu,con;
     public Opciones_abajo(){
        elec= new JButton("Electrodomesticos");
        comu= new JButton("Comunicaciones");
        con = new JButton("Panel de control");
        
        
        
       elec.setActionCommand("elec");
       comu.setActionCommand("comu");
       con.setActionCommand("con");
            setLayout(new FlowLayout());
      add(elec);add(comu);add(con);
      
 
    }
    
 public void setActionListenerView(ActionListener al){
      elec.addActionListener(al);
        comu.addActionListener(al);
        con.addActionListener(al);
 }
}
