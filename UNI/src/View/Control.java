/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Control extends JPanel{
    public JButton Habitacion_1, Cocina_b, Salon_b, Habitacion2_b, Baño_b, Baño2_b;
       public ImageIcon Habitacion2, Baño, Salon, Cocina, Habitacion1, Baño2 ;
    
    public Control(){
    setBackground(Color.white);
    setLayout(new GridLayout(2,3));
         
         Habitacion1 =new ImageIcon ("Habitacion1.GIF");
         Habitacion_1 =new JButton( Habitacion1);
         add(Habitacion_1);
      //  Habitacion1.setBackground( SystemColor.BLUE );
      // Habitacion1.setLocation(400, 800);
       
        Habitacion2 =new ImageIcon("Habitacion2.GIF");
         Habitacion2_b =new JButton ( Habitacion2);
        add(Habitacion2_b);
        
        Salon= new ImageIcon ("Salon.GIF");
        Salon_b =new JButton(Salon);
        add(Salon_b);
        
        Baño =new ImageIcon("Baño.GIF");
        Baño_b =new JButton (Baño);
        add(Baño_b);
        Cocina =new ImageIcon ("Cocina.GIF");
        Cocina_b =new JButton(Cocina);
        add(Cocina_b);
        
         Baño2 =new ImageIcon("Baño2.GIF");
        Baño2_b =new JButton (Baño2);
        add(Baño2_b);
                  
     
   
    }
}
