
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Opciones_arriba extends JPanel {
        public JButton cli,per,alar,elec,comu,con;
    public Opciones_arriba(){
      
        
        
        cli= new JButton("Climatizacion");
        per= new JButton("Ctr. de persinanas");
        alar= new JButton("Alarmas");
        
    alar.setActionCommand("alar");
       cli.setActionCommand("cli");
       per.setActionCommand("per");
       
       setLayout(new FlowLayout());
          add(cli);add(per);add(alar);
    }

    
    public void setActionListenerView(ActionListener al){
       
        alar.addActionListener(al);
        cli.addActionListener(al);
        per.addActionListener(al);
        
       
    }

    public void setctionListenerView(ActionListener ml) {
       
    }
}
