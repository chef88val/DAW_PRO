/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import View.Plano;

/**
 *
 * @author Usuario
 */
public class Alarmas extends JFrame{
    
    public Botones botones;
     public Habitaciones hab;
    
     
    public Alarmas(){
        
               
        hab=new Habitaciones();
           botones=new Botones();
  
           
        add(hab);
       
        setTitle("Alarmas");
        setSize(800, 650);
        setVisible(false); 
    }

    public void setActionListenerView(ActionListener bl) {
         botones.atras_b.addActionListener(bl);
    }


    public class Habitaciones extends JPanel{
        public Plano plano;
   public TextField text1,text2,text3,text4,text;
   public TextField text12,text13,text14,text15;
   public JTextField estadoalarma1,estadoalarma2,estadoalarma3,estadoalarma4;
     public JButton boton_1,boton_2,boton_3,boton_4;
     public ImageIcon boton1,boton2,boton3,boton4;
    public JPanel Habitacion1,Habitacion2,Salon, Baño2;
    public JPanel panelenc1,panelenc2,panelenc3,panelenc4;
    public JPanel panelapa1,panelapa2,panelapa3,panelapa4;
    public JPanel panel2enc1,panel2enc2,panel2enc3,panel2enc4;
    public JPanel panel2apa1,panel2apa2,panel2apa3,panel2apa4;
    public JLabel label [] = new JLabel[9];
    public JLabel label2 [] = new JLabel[8];
     public JLabel label3 [] = new JLabel[8];
    public int i=0;
    String vector[]={"Robo:","Fuego:","Agua:", "GAs:"};
    public JCheckBox jr[]=new JCheckBox[7];
public JCheckBox fjr[]=new JCheckBox[7];
 public ButtonGroup rb1,rb2,rb3,rb4;
  String estado[]={"On","Off"};
    public Habitaciones(){

        estadoalarma1=new JTextField("Off");
        estadoalarma2=new JTextField("Off");
        estadoalarma3=new JTextField("Off");
        estadoalarma4=new JTextField("Off");
      
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
       
       
       
       
       /* 
       
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
        }*/
         
         
         for (i=0; i<=3;i++)
        { 
             
            jr[i]=  new JCheckBox(estado[0]);
            
       
           //  label[i]= getE.style.textDecoration="underline"
            jr[i].setForeground( Color.green );
            jr[i].setFont( new Font( "Serif", Font.PLAIN, 20 ) );  
            
        }
         for (i=0; i<=3;i++)
        { 
             
            
            fjr[i]=  new JCheckBox(estado[1],true);
       //fjr[i].setSelected(true);
           //  label[i]= getE.style.textDecoration="underline"
            fjr[i].setForeground( Color.red );
            fjr[i].setFont( new Font( "Serif", Font.PLAIN, 20 ) );  
            
        }
        rb1=new  ButtonGroup();          
        rb1.add(fjr[0]);
        rb1.add(jr[0]);
        
        rb2=new  ButtonGroup();          
        rb2.add(fjr[1]);
        rb2.add(jr[1]);
        
        rb3=new  ButtonGroup();          
        rb3.add(fjr[2]);
        rb3.add(jr[2]);
        
        rb4=new  ButtonGroup();          
        rb4.add(fjr[3]);
        rb4.add(jr[3]);
        
       
        
        
         Habitacion1 = new JPanel();
        Habitacion1 .setBackground(Color.blue);
        
         Habitacion2 = new JPanel();
        Habitacion2 .setBackground(Color.blue);
        
         Salon  = new JPanel();
        Salon.setBackground(Color.blue);
        
         Baño2 = new JPanel();
        Baño2 .setBackground(Color.blue);
        
      
        
        
        panelenc1= new JPanel();
        panelenc1.setBackground(Color.blue);
         text= new TextField(20);
        panelenc1.add (text);
        panelenc1.add(new JLabel("DIRECCION DE CORREO")); 
        
        panelenc2= new JPanel();
        panelenc2.setBackground(Color.blue);
         text1= new TextField(20);
        panelenc2.add (text1);
        panelenc2.add(new JLabel("DIRECCION E CORREO")); 
        
        panelenc3= new JPanel();
        panelenc3.setBackground(Color.blue);
         text2= new TextField(20);
        panelenc3.add (text2);
        panelenc3.add(new JLabel("DIRECCION DE CORREO")); 
        
        panelenc4= new JPanel();
        panelenc4.setBackground(Color.blue);
         text3= new TextField(20);
        panelenc4.add (text3);
        panelenc4.add(new JLabel("DIRECCION DE CORREO")); 
        
       
        
        
        panel2enc1= new JPanel();
        panel2enc1.setBackground(Color.blue);
         text12= new TextField(20);
        panel2enc1.add (text12);
        panel2enc1.add(new JLabel("TELEFONO")); 
        
        panel2enc2= new JPanel();
        panel2enc2.setBackground(Color.blue);
         text13= new TextField(20);
        panel2enc2.add (text13);
        panel2enc2.add(new JLabel("TELEFONO")); 
        
        panel2enc3= new JPanel();
        panel2enc3.setBackground(Color.blue);
         text14= new TextField(20);
        panel2enc3.add (text14);
        panel2enc3.add(new JLabel("TELEFONO")); 
        
        panel2enc4= new JPanel();
        panel2enc4.setBackground(Color.blue);
         text15= new TextField(20);
        panel2enc4.add (text15);
        panel2enc4.add(new JLabel("TELEFONO")); 
        
       
        
        
        
       
        
        setLayout(new GridLayout(2,3,2,2));
           Container content = getContentPane();
             for (i=0; i<=3;i++)
        { 
  content.add(jr[i]);content.add(fjr[i]);
        }
           
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
         
         
           
        add(Habitacion1);add(Habitacion2);add(Salon);
    add(Baño2);
    
      

      Habitacion1.setLayout(new BoxLayout(Habitacion1, BoxLayout.PAGE_AXIS)); ;
      Habitacion2.setLayout(new BoxLayout(Habitacion2, BoxLayout.PAGE_AXIS));
     Salon.setLayout(new BoxLayout(Salon, BoxLayout.PAGE_AXIS));
      Baño2.setLayout(new BoxLayout(Baño2, BoxLayout.PAGE_AXIS));
      
      
  
     
   //content.setBackground(Color.white);
   
    
    Habitacion1.add(label2[0]);
    Habitacion2.add(label2[1]);
    Salon.add(label2[2]);
    Baño2.add(label2[3]);
    
   /* Habitacion1.add(label[0]);
    Habitacion2.add(label[1]);
    Salon.add(label[2]);
    Baño2.add(label[3]);*/
   
    Habitacion1.add(   panelenc1);
    Habitacion2.add( panelenc2);
    Salon.add(  panelenc3);
    Baño2.add(  panelenc4);
   

    
    Habitacion1.add( panel2enc1 );
    Habitacion2.add(panel2enc2  );
    Salon.add( panel2enc3 );
    Baño2.add( panel2enc4 );
       
    
    
    Habitacion1.add(boton_1);
    Habitacion2.add(boton_2);
    Salon.add(boton_3);
    Baño2.add(boton_4);
    
    Habitacion1.add(jr[0]);
    Habitacion1.add(fjr[0]);
    
    Habitacion2.add(jr[1]);
    Habitacion2.add(fjr[1]);
    
    Salon.add(jr[2]);
    Salon.add(fjr[2]);
    
    Baño2.add(jr[3]);
    Baño2.add(fjr[3]);
    /*
    
     Habitacion1.add(label3[0]);
    Habitacion2.add(label3[1]);
    Salon.add(label3[2]);
    Baño2.add(label3[3]);*/
   
    
    
    

  
    
  
    
    setVisible (true);
         
    
  
    }
    public void BotonesAlarmas(ActionListener al){
        boton_1.addActionListener(al);
        boton_2.addActionListener(al);
        boton_3.addActionListener(al);
        boton_4.addActionListener(al);
        
    }
    public void Estados(ItemListener il){
        for(int i=0;i<=3;i++){
        fjr[i].addItemListener(il);
        jr[i].addItemListener(il);
        }
    
        
    }
    /*public void Estados(ActionListener el){
      
        for(int i=0;i<=3;i++){
            fjr[i].add(el);
            jr[i].addActionListener(el);
        }
    }*/
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
        
        atras_b.setActionCommand("atras_alar");
        home_b.setActionCommand("home");
        plano_b.setActionCommand("plano");
        
    }  
        public void Accion(ActionListener bl){
           home_b.addActionListener(bl);
            plano_b.addActionListener(bl);
           atras_b.addActionListener(bl); 
                 
    }      }    
}
    

