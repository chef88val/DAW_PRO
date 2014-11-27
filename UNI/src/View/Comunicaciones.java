/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.Container;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Comunicaciones extends JFrame{
    
    public Botones botones;
     public Habitaciones hab;
      
     
    public Comunicaciones(){
        
               
        hab=new Habitaciones();
           botones=new Botones();
        add(hab);
        setTitle("Comunicaciones");
        setSize(800, 700);
        setVisible(false); 
    }

    public void setActionListenerView(ActionListener bl) {
         botones.atras_b.addActionListener(bl);
    }


    public class Habitaciones extends JPanel{
        
        public TextField text,text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11;
   public TextField text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23;
        
    public JButton Habitacion_b, Cocina_b, Salon_b, Habitacion2_b, Baño_b, Baño2_b;
     public JButton boton_1,boton_2,boton_3,boton_4,boton_5,boton_6;
     public ImageIcon boton1,boton2,boton3,boton4,boton5,boton6;
    public JPanel Habitacion1,Habitacion2,Salon, Baño2, Baño,Cocina;
    public JPanel panelenc1,panelenc2,panelenc3,panelenc4,panelenc5,panelenc6;
    public JPanel panelapa1,panelapa2,panelapa3,panelapa4,panelapa5,panelapa6;
    public JPanel panel2enc1,panel2enc2,panel2enc3,panel2enc4,panel2enc5,panel2enc6;
    public JPanel panel2apa1,panel2apa2,panel2apa3,panel2apa4,panel2apa5,panel2apa6;
    public JLabel label [] = new JLabel[9];
    public JLabel label2 [] = new JLabel[8];
     public JLabel label3 [] = new JLabel[8];
    public int i=0;
    String vector[]={"Habitacion1:","Habitacion2:","Salon:", "Baño2:", "Baño:","Cocina:"};
    public Habitaciones(){

      
       label2[0]=new JLabel(vector[0]);
       label2[0].setForeground( Color.WHITE );
       label2[0].setFont( new Font( "Serif", Font.BOLD, 25 ) );  
       
       label2[1]=new JLabel(vector[1]);
       label2[1].setForeground( Color.WHITE );
       label2[1].setFont( new Font( "Serif", Font.BOLD, 30 ) );  
       
       label2[2]=new JLabel(vector[2]);
       label2[2].setForeground( Color.WHITE );
       label2[2].setFont( new Font( "Serif", Font.BOLD, 30 ) );  
       
       label2[3]=new JLabel(vector[3]);
       label2[3].setForeground( Color.WHITE );
       label2[3].setFont( new Font( "Serif", Font.BOLD, 30 ) );  
       
       
       label2[4]=new JLabel(vector[4]);
       label2[4].setForeground( Color.WHITE );
       label2[4].setFont( new Font( "Serif", Font.BOLD, 30 ) );  
   
       
       label2[5]=new JLabel(vector[5]);
        label2[5].setForeground( Color.WHITE );
       label2[5].setFont( new Font( "Serif", Font.BOLD, 30 ) );  
       
         for (i=0; i<=6;i++)
        { 
            
            label[i]=  new JLabel("Telefono");
       
            label[i].setForeground( Color.WHITE );
            label[i].setFont( new Font( "Serif", Font.PLAIN, 20 ) );          
        }
         
         for (i=0; i<=6;i++)
        { 
            
            label3[i]=  new JLabel("WIFI");
       
            label3[i].setForeground( Color.WHITE );
            label3[i].setFont( new Font( "Serif", Font.PLAIN, 20 ) );          
        }
         
         Habitacion1 = new JPanel();
        Habitacion1 .setBackground(Color.blue);
        
         Habitacion2 = new JPanel();
        Habitacion2 .setBackground(Color.blue);
        
         Salon  = new JPanel();
        Salon.setBackground(Color.blue);
        
         Baño2 = new JPanel();
        Baño2 .setBackground(Color.blue);
        
         Baño = new JPanel();
        Baño .setBackground(Color.blue);
        
         Cocina = new JPanel();
        Cocina.setBackground(Color.blue);
        
        
        panelenc1= new JPanel();
        panelenc1.setBackground(Color.blue);
         text1= new TextField("1");
        panelenc1.add (text1);
        panelenc1.add(new JLabel("Hora encendido")); 
        
        panelenc2= new JPanel();
        panelenc2.setBackground(Color.blue);
         text2= new TextField("2");
        panelenc2.add (text2);
        panelenc2.add(new JLabel("Hora encendido")); 
        
        panelenc3= new JPanel();
        panelenc3.setBackground(Color.blue);
         text3= new TextField("3");
        panelenc3.add (text3);
        panelenc3.add(new JLabel("Hora encendido")); 
        
        panelenc4= new JPanel();
        panelenc4.setBackground(Color.blue);
         text4= new TextField("4");
        panelenc4.add (text4);
        panelenc4.add(new JLabel("Hora encendido")); 
        
        panelenc5= new JPanel();
        panelenc5.setBackground(Color.blue);
         text5= new TextField("5");
        panelenc5.add (text5);
        panelenc5.add(new JLabel("Hora encendido")); 
        
        panelenc6= new JPanel();
        panelenc6.setBackground(Color.blue);
         text6= new TextField("6");
        panelenc6.add (text6);
        panelenc6.add(new JLabel("Hora encendido")); 
        
        panelapa1= new JPanel();
        panelapa1.setBackground(Color.blue);
         text= new TextField("7");
        panelapa1.add (text);
        panelapa1.add(new JLabel("Hora apagado")); 
        
        panelapa2= new JPanel();
        panelapa2.setBackground(Color.blue);
         text7= new TextField("8");
        panelapa2.add (text7);
        panelapa2.add(new JLabel("Hora apagado"));
        
        panelapa3= new JPanel();
        panelapa3.setBackground(Color.blue);
         text8= new TextField("9");
        panelapa3.add (text8);
        panelapa3.add(new JLabel(" apagado"));
        
       panelapa4= new JPanel();
        panelapa4.setBackground(Color.blue);
         text9= new TextField("10");
        panelapa4.add (text9);
        panelapa4.add(new JLabel("Hora apagado"));
        
        panelapa5= new JPanel();
        panelapa5.setBackground(Color.blue);
         text10= new TextField("11");
        panelapa5.add (text10);
        panelapa5.add(new JLabel("Hora apagado"));
        
        panelapa6= new JPanel();
        panelapa6.setBackground(Color.blue);
         text11= new TextField("12");
        panelapa6.add (text11);
        panelapa6.add(new JLabel("Hora apagado"));
        
                panel2enc1= new JPanel();
        panel2enc1.setBackground(Color.blue);
         text12= new TextField("13");
        panel2enc1.add (text12);
        panel2enc1.add(new JLabel("Hora encendido")); 
        
        panel2enc2= new JPanel();
        panel2enc2.setBackground(Color.blue);
         text13= new TextField("14");
        panel2enc2.add (text13);
        panel2enc2.add(new JLabel("Hora encendido")); 
        
        panel2enc3= new JPanel();
        panel2enc3.setBackground(Color.blue);
         text14= new TextField("15");
        panel2enc3.add (text14);
        panel2enc3.add(new JLabel("Hora encendido")); 
        
        panel2enc4= new JPanel();
        panel2enc4.setBackground(Color.blue);
         text15= new TextField("16");
        panel2enc4.add (text15);
        panel2enc4.add(new JLabel("Hora encendido")); 
        
        panel2enc5= new JPanel();
        panel2enc5.setBackground(Color.blue);
         text16= new TextField("17");
        panel2enc5.add (text16);
        panel2enc5.add(new JLabel("Hora encendido")); 
        
        panel2enc6= new JPanel();
        panel2enc6.setBackground(Color.blue);
         text17= new TextField("18");
        panel2enc6.add (text17);
        panel2enc6.add(new JLabel("Hora encendido")); 
        
        panel2apa1= new JPanel();
        panel2apa1.setBackground(Color.blue);
         text18= new TextField("19");
        panel2apa1.add (text18);
        panel2apa1.add(new JLabel("Hora apagado")); 
        
        panel2apa2= new JPanel();
        panel2apa2.setBackground(Color.blue);
         text19= new TextField("21");
        panel2apa2.add (text19);
        panel2apa2.add(new JLabel("Hora apagado"));
        
        panel2apa3= new JPanel();
        panel2apa3.setBackground(Color.blue);
         text20= new TextField("22");
        panel2apa3.add (text20);
        panel2apa3.add(new JLabel("Hora apagado"));
        
       panel2apa4= new JPanel();
        panel2apa4.setBackground(Color.blue);
         text21= new TextField("23");
        panel2apa4.add (text21);
        panel2apa4.add(new JLabel("Hora apagado"));
        
        panel2apa5= new JPanel();
        panel2apa5.setBackground(Color.blue);
         text22= new TextField("24");
        panel2apa5.add (text22);
        panel2apa5.add(new JLabel("Hora apagado"));
        
        panel2apa6= new JPanel();
        panel2apa6.setBackground(Color.blue);
         text23= new TextField("25");
        panel2apa6.add (text23);
        panel2apa6.add(new JLabel("Hora apagado"));
        
        setLayout(new GridLayout(2,3,2,2));
           Container content = getContentPane();
            
         //boton1 =new ImageIcon ("ww4.GIF");
         boton_1 =new JButton ("Añadir");
         boton_1.setActionCommand("boton1");
         content.add(boton_1);
         
          //boton2 =new ImageIcon ("ww4.GIF");
         boton_2 =new JButton ("Añadir");
         boton_2.setActionCommand("boton2");
         content.add(boton_2);
         
          //boton3 =new ImageIcon ("ww4.GIF");
         boton_3 =new JButton ("Añadir");
         boton_3.setActionCommand("boton3");
         content.add(boton_3);
         
         // boton4 =new ImageIcon ("ww4.GIF");
         boton_4 =new JButton ("Añadir");
         boton_4.setActionCommand("boton4");
         content.add(boton_4);
         
          //boton3 =new ImageIcon ("ww4.GIF");
         boton_5 =new JButton ("Añadir");
         boton_5.setActionCommand("boton5");
         content.add(boton_5);
         
         // boton4 =new ImageIcon ("ww4.GIF");
         boton_6 =new JButton ("Añadir");
         boton_6.setActionCommand("boton6");
         content.add(boton_6);
         /*  
         boton1 =new ImageIcon ("ww4.GIF");
         boton_1 =new JButton (boton1);
         content.add(boton_1);
         
          boton2 =new ImageIcon ("ww4.GIF");
         boton_2 =new JButton (boton2);
         content.add(boton_2);
         
          boton3 =new ImageIcon ("ww4.GIF");
         boton_3 =new JButton (boton3);
         content.add(boton_3);
         
          boton4 =new ImageIcon ("ww4.GIF");
         boton_4 =new JButton (boton4);
         content.add(boton_4);
         
          boton5 =new ImageIcon ("ww4.GIF");
         boton_5 =new JButton (boton5);
         content.add(boton_5);
         
          boton6 =new ImageIcon ("ww4.GIF");
         boton_6 =new JButton (boton6);
         content.add(boton_6);*/
           
        add(Habitacion1);add(Habitacion2);add(Salon);
    add(Baño2);add(Baño);add(Cocina); 
    
      

      Habitacion1.setLayout(new BoxLayout(Habitacion1, BoxLayout.PAGE_AXIS)); ;
      Habitacion2.setLayout(new BoxLayout(Habitacion2, BoxLayout.PAGE_AXIS));
     Salon.setLayout(new BoxLayout(Salon, BoxLayout.PAGE_AXIS));
      Baño2.setLayout(new BoxLayout(Baño2, BoxLayout.PAGE_AXIS));
      Baño.setLayout(new BoxLayout(Baño, BoxLayout.PAGE_AXIS));
      Cocina.setLayout(new BoxLayout(Cocina, BoxLayout.PAGE_AXIS));
      
  
     
   //content.setBackground(Color.white);
   
    
    Habitacion1.add(label2[0]);
    Habitacion2.add(label2[1]);
    Salon.add(label2[2]);
    Baño2.add(label2[3]);
    Baño.add(label2[4]);
    Cocina.add(label2[5]);
    
    Habitacion1.add(label[0]);
    Habitacion2.add(label[1]);
    Salon.add(label[2]);
    Baño2.add(label[3]);
    Baño.add(label[4]);
    Cocina.add(label[5]);
    
     Habitacion1.add( panelenc1 );
    Habitacion2.add( panelenc2 );
    Salon.add( panelenc3 );
    Baño2.add( panelenc4 );
    Baño.add( panelenc5 );
    Cocina.add(  panelenc6);

    Habitacion1.add(  panelapa1);
    Habitacion2.add(  panelapa2);
    Salon.add(  panelapa3);
    Baño2.add(  panelapa4);
    Baño.add(  panelapa5);
    Cocina.add(  panelapa6);    
    
    
    
    
     Habitacion1.add(label3[0]);
    Habitacion2.add(label3[1]);
    Salon.add(label3[2]);
    Baño2.add(label3[3]);
    Baño.add(label3[4]);
    Cocina.add(label3[5]);
    
     Habitacion1.add( panel2enc1 );
    Habitacion2.add( panel2enc2 );
    Salon.add( panel2enc3 );
    Baño2.add( panel2enc4 );
    Baño.add( panel2enc5 );
    Cocina.add(  panel2enc6);

    Habitacion2.add(  panel2apa1);
    Salon.add(  panel2apa2);
    Baño2.add(  panel2apa3);
    Baño.add(  panel2apa4);
    Cocina.add(  panel2apa5);    
    Habitacion1.add(  panel2apa6);
    
    Habitacion1.add(boton_1);
    Habitacion2.add(boton_2);
    Salon.add(boton_3);
    Baño2.add(boton_4);
    Baño.add(boton_5);
    Cocina.add(boton_6);
    setVisible (true);
         
    
  
    }
    public void Comi (ActionListener al){
    boton_1.addActionListener(al);
    boton_2.addActionListener(al);
    boton_3.addActionListener(al);
    boton_4.addActionListener(al);
    boton_5.addActionListener(al);
    boton_6.addActionListener(al);
}
}
	 public class Botones extends JPanel{
        public Estados estatus;
        public JButton atras_b,home_b,plano_b;
        public ActionListener bl;
        public JMenuBar bar,iconos_M;
    public JMenu atras,home,plano;
    public ImageIcon atras_i,home_i,plano_i;
        public Botones(){
           
         atras_i=new ImageIcon("atras.gif");
        home_i=new ImageIcon("find.gif");
        plano_i=new ImageIcon("paste.gif");
        	
        iconos_M=new JMenuBar();
        atras_b=new JButton();
        atras_b.setIcon(atras_i);
        atras_b.setBounds(10,10,4,1);
        home_b=new JButton();
        home_b.setIcon(home_i);
        plano_b=new JButton(); 
        plano_b.setIcon(plano_i);
        iconos_M.add(atras_b);iconos_M.add(home_b);iconos_M.add(plano_b);
        //iconos.add(atras_b);iconos.add(home_b);iconos.add(plano_b);
        //add(iconos);
        setJMenuBar(iconos_M);
        
        atras_b.setActionCommand("atras_comu");
        home_b.setActionCommand("home");
        plano_b.setActionCommand("plano");
        
    }  
        public void Accion(ActionListener bl){
           home_b.addActionListener(bl);
            plano_b.addActionListener(bl);
           atras_b.addActionListener(bl); 
                 
    }      }    
}
