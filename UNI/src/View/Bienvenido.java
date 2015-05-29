/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Bienvenido extends JFrame{
    public JLabel bienve,pasos1,pasos2,pasos3;
    public JButton iniciar;
    private Pasos pa;
    public Bienvenido(){
        super("Pantalla Inicial");
        setSize(800,500);
        setVisible(true);
        bienve=new JLabel("Bienvenido a la aplicacion de Domotica",JLabel.CENTER);
        iniciar=new JButton("Comenzar");
        iniciar.setActionCommand("iniciar");
        
       
        
        pa=new Pasos();
        
        setLayout(new BorderLayout());
        add(bienve,BorderLayout.NORTH);add(pa,BorderLayout.CENTER);
        add(iniciar,BorderLayout.SOUTH);
    }
    public void Iniciar(ActionListener al){
        iniciar.addActionListener(al);
    }
    public class Pasos extends JPanel{
        public JLabel pasos1,pasos2,pasos3;
        public Pasos(){
         pasos1=new JLabel("1. Selecciona el apartado a configurar");
         pasos2=new JLabel( "2. Selecciona el tipo de alarma, el electodomestico o la habitacion ");
         pasos3=new JLabel("Nota: Asegurate de que las casillas de color blanco esten rellenadas.");
         setLayout(new GridLayout(3,1));
            add(pasos1);add(pasos2);add(pasos3);
        }
    }
}
