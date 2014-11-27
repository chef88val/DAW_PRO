/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.*;
import java.awt.Font;
import javax.swing.*;
/**
 *
 * @author Usuario
 */public class Opciones_centro extends JPanel{
      public ImageIcon casa=new ImageIcon("casa.gif");
    
    public JLabel ima=new JLabel(),a=new JLabel(casa);   
      public Opciones_centro(){
        JLabel titulo = new JLabel("Casa JAlex");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));/*
        setLayout(new GridLayout());
       a.setHorizontalAlignment(JLabel.CENTER);

a.setVerticalAlignment(JLabel.CENTER);*/

     add(titulo);add(ima);
}
      public void paintComponent (Graphics g){
       Dimension tam = getSize();
      ImageIcon casa2=new ImageIcon("casa.gif");
      g.drawImage(casa2.getImage(),0, 0, tam.width, tam.height, null);
      setOpaque (false);
          
      super.paintComponent(g);
      }
}
