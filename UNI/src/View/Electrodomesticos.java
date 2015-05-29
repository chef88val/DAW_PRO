/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import View.View.Barra.*;


/**
 *
 * @author Usuario
 */
public class Electrodomesticos extends JFrame{
   
    public Botones botones;
    public Relleno re;
    public JSlider consumo;
    public JSlider consumo1;
    public JSlider consumo2;
    public JSlider consumo3;
    public JSlider consumo4;
    public JSlider consumo5;
    
    public JPanel panelconsumo;
    public JPanel panelconsumo1;
    public JPanel panelconsumo2;
    public JPanel panelconsumo3;
    public JPanel panelconsumo4;
    public JPanel panelconsumo5;
     public JPanel panelkw1,panelkw2,panelkw3,panelkw4,panelkw5,panelkw6;
     public JPanel panelflecha,panelflecha1,panelflecha2,panelflecha3,panelflecha4,panelflecha5;
    
    public Electrodomesticos(){
          re =new Relleno();
           botones=new Botones();
add(re);
        setTitle("Electrodomesticos");
        setSize(800, 650);
        setVisible(false); 	
        
      
}

    public void setActionListenerView(ActionListener bl) {
         botones.atras_b.addActionListener(bl);
    }
    public class Relleno extends JPanel{  
         public TextField text,text1,text2,text3,text4,text5;
       public int n=0, b=0;
      public JPanel Lavavajillas, Lavadora, Micro,TV, Musica, Nevera;
      public JLabel label [] = new JLabel[9];
        public JLabel label2 [] = new JLabel[8];
        public int i=0;
       public JButton boton_1,boton_2,boton_3,boton_4,boton_5,boton_6;
      public JCheckBox jr[]=new JCheckBox[7];
public JCheckBox fjr[]=new JCheckBox[7];
         public ImageIcon boton1,boton2,boton3,boton4,boton5,boton6;
      String vector[]={"Lavavajillas:","Lavadora:","Micro:","TV:","Musica:","Nevera:"};
    String estado[]={"On","Off"};
    public ButtonGroup rb1,rb2,rb3,rb4,rb5,rb6;
     public JTextField estadoalarma1,estadoalarma2,estadoalarma3,estadoalarma4,estadoalarma5,estadoalarma6;
      public Relleno(){
           
           estadoalarma1=new JTextField("Off");
        estadoalarma2=new JTextField("Off");
        estadoalarma3=new JTextField("Off");
        estadoalarma4=new JTextField("Off");
         estadoalarma5=new JTextField("Off");
        estadoalarma6=new JTextField("Off");
          
          
      
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
             
            jr[i]=  new JCheckBox(estado[0]);
            
       
           //  label[i]= getE.style.textDecoration="underline"
            jr[i].setForeground( Color.green );
            jr[i].setFont( new Font( "Serif", Font.PLAIN, 20 ) );  
            
        }
         for (i=0; i<=6;i++)
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
        
        rb5=new  ButtonGroup();          
        rb5.add(fjr[4]);
        rb5.add(jr[4]);
        
        rb6=new  ButtonGroup();          
        rb6.add(fjr[5]);
        rb6.add(jr[5]);
        
        
         for (i=0; i<=6;i++)
        { 
            
            label[i]=  new JLabel("Grado de Consumo");
       
           //  label[i]= getE.style.textDecoration="underline"
            label[i].setForeground( Color.WHITE );
            label[i].setFont( new Font( "Serif", Font.PLAIN, 20 ) );          
        }
        
        Lavavajillas = new JPanel();
        Lavavajillas .setBackground(Color.blue);
        
        Lavadora = new JPanel();
        Lavadora .setBackground(Color.blue);
        
        Micro = new JPanel();
        Micro .setBackground(Color.blue);
        
        TV = new JPanel();
        TV .setBackground(Color.blue);
        
       Musica = new JPanel();
         Musica .setBackground(Color.blue);
         
       Nevera = new JPanel();
        Nevera .setBackground(Color.blue);
        
        consumo = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        consumo.setFont(new Font("Serif",Font.BOLD,15));
        consumo.setMajorTickSpacing(20);// Espacio en trelos nomeros
        consumo.setMinorTickSpacing(10);// Espacio entra las separaciones
        consumo.setPaintTicks(true);//Muestra las separacioneshyri
        consumo.setPaintLabels(true);// Muestra los numeros
        setTamaño(consumo,200, 45);
        panelconsumo = new JPanel();
        panelconsumo.setBackground(Color.blue);
        
        consumo1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        consumo1.setFont(new Font("Serif",Font.BOLD,15));
        consumo1.setMajorTickSpacing(20);// Espacio en trelos nomeros
        consumo1.setMinorTickSpacing(10);// Espacio entra las separaciones
        consumo1.setPaintTicks(true);//Muestra las separacioneshyri
        consumo1.setPaintLabels(true);// Muestra los numeros
        setTamaño(consumo1,200, 45);
        panelconsumo1 = new JPanel();
        panelconsumo1.setBackground(Color.blue);
        
        consumo2 = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        consumo2.setFont(new Font("Serif",Font.BOLD,15));
        consumo2.setMajorTickSpacing(20);// Espacio en trelos nomeros
        consumo2.setMinorTickSpacing(10);// Espacio entra las separaciones
        consumo2.setPaintTicks(true);//Muestra las separacioneshyri
        consumo2.setPaintLabels(true);// Muestra los numeros
        setTamaño(consumo2,200, 45);
        panelconsumo2 = new JPanel();
        panelconsumo2.setBackground(Color.blue);
        
        consumo3 = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        consumo3.setFont(new Font("Serif",Font.BOLD,15));
        consumo3.setMajorTickSpacing(20);// Espacio en trelos nomeros
        consumo3.setMinorTickSpacing(10);// Espacio entra las separaciones
        consumo3.setPaintTicks(true);//Muestra las separacioneshyri
        consumo3.setPaintLabels(true);// Muestra los numeros
        setTamaño(consumo3,200, 45);
        panelconsumo3 = new JPanel();
        panelconsumo3.setBackground(Color.blue);
        
        consumo4 = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        consumo4.setFont(new Font("Serif",Font.BOLD,15));
        consumo4.setMajorTickSpacing(20);// Espacio en trelos nomeros
        consumo4.setMinorTickSpacing(10);// Espacio entra las separaciones
        consumo4.setPaintTicks(true);//Muestra las separacioneshyri
        consumo4.setPaintLabels(true);// Muestra los numeros
        setTamaño(consumo4,200, 45);
        panelconsumo4 = new JPanel();
        panelconsumo4.setBackground(Color.blue);
        
        consumo5 = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        consumo5.setFont(new Font("Serif",Font.BOLD,15));
        consumo5.setMajorTickSpacing(20);// Espacio en trelos nomeros
        consumo5.setMinorTickSpacing(10);// Espacio entra las separaciones
        consumo5.setPaintTicks(true);//Muestra las separacioneshyri
        consumo5.setPaintLabels(true);// Muestra los numeros
        setTamaño(consumo5,200, 45);
        panelconsumo5 = new JPanel();
        panelconsumo5.setBackground(Color.blue);
        
        ImageIcon image= new ImageIcon("flecha.gif");
    JButton boton = new JButton(image );
    boton.setBackground( Color.red );
        
    setLayout(new GridLayout(2,3,2,2));
   Container content = getContentPane();
   for (i=0; i<=6;i++)
        { 
  content.add(jr[i]);content.add(fjr[i]);
        }
/*    flechatop1 =new ImageIcon ("ww.GIF");
    flechatop_0 =new JButton (flechatop1);
    
    

    flechabot1 =new ImageIcon ("ww1.GIF");
    flechabot_0 =new JButton (flechabot1);
    content.add(flechabot_0);*/
    
 boton1 =new ImageIcon ("ww2.GIF");
    boton_1 =new JButton ("Añadir");
    content.add(boton_1);
    /*
     flechatop2 =new ImageIcon ("ww.GIF");
    flechatop_1 =new JButton (flechatop2);
    content.add(flechatop_1);
    

    flechabot2 =new ImageIcon ("ww1.GIF");
    flechabot_1 =new JButton (flechabot2);
    content.add(flechabot_1);
    */
 boton2 =new ImageIcon ("ww2.GIF");
    boton_2 =new JButton ("Añadir");
    content.add(boton_2);
    /*
     flechatop3 =new ImageIcon ("ww.GIF");
    flechatop_2 =new JButton (flechatop3);
    content.add(flechatop_2);
    

    flechabot3 =new ImageIcon ("ww1.GIF");
    flechabot_2 =new JButton (flechabot3);
    content.add(flechabot_2);
    */
 boton3 =new ImageIcon ("ww2.GIF");
    boton_3 =new JButton ("Añadir");
    content.add(boton_3);
    /*
     flechatop4 =new ImageIcon ("ww.GIF");
    flechatop_3 =new JButton (flechatop4);
    content.add(flechatop_3);
    

    flechabot4 =new ImageIcon ("ww1.GIF");
    flechabot_3 =new JButton (flechabot4);
    content.add(flechabot_3);
    */
 //boton4 =new ImageIcon ("ww2.GIF");
    boton_4 =new JButton ("Añadir");
    content.add(boton_4);
    /*
     flechatop5 =new ImageIcon ("ww.GIF");
    flechatop_4 =new JButton (flechatop5);
    content.add(flechatop_4);
    

    flechabot5 =new ImageIcon ("ww1.GIF");
    flechabot_4 =new JButton (flechabot5);
    content.add(flechabot_4);
    */
 //boton5 =new ImageIcon ("ww2.GIF");
    boton_5 =new JButton ("Añadir");
    content.add(boton_5);
    /*
     flechatop6 =new ImageIcon ("ww.GIF");
    flechatop_5 =new JButton (flechatop6);
    content.add(flechatop_5);
    

    flechabot6 =new ImageIcon ("ww1.GIF");
    flechabot_5 =new JButton (flechabot6);
    content.add(flechabot_5);
    */
 //boton6 =new ImageIcon ("ww2.GIF");
    boton_6 =new JButton ("Añadir");
    content.add(boton_6);
    
    
    panelkw1= new JPanel();
    panelkw1.setBackground(Color.blue);
     text= new TextField();
    panelkw1.add (text);
    panelkw1.add(new JLabel("KW/h")); 
    
    panelkw2= new JPanel();
    panelkw2.setBackground(Color.blue);
     text1= new TextField();
    panelkw2.add (text1);
    panelkw2.add(new JLabel("KW/h")); 
    
    panelkw3= new JPanel();
    panelkw3.setBackground(Color.blue);
     text2= new TextField();
    panelkw3.add (text2);
    panelkw3.add(new JLabel("KW/h")); 
    
    panelkw4= new JPanel();
    panelkw4.setBackground(Color.blue);
     text3= new TextField();
    panelkw4.add (text3);
    panelkw4.add(new JLabel("KW/h")); 
    
    panelkw5= new JPanel();
    panelkw5.setBackground(Color.blue);
     text4= new TextField();
    panelkw5.add (text4);
    panelkw5.add(new JLabel("KW/h")); 
    
    panelkw6= new JPanel();
    panelkw6.setBackground(Color.blue);
     text5= new TextField();
    panelkw6.add (text5);
    panelkw6.add(new JLabel("Volumen")); 
    
     
    panelflecha = new JPanel();
    panelflecha.setBackground(Color.blue);
    panelflecha.add(jr[0]);
    panelflecha.add(fjr[0]);
    
    panelflecha1 = new JPanel();
    panelflecha1.setBackground(Color.blue);
    panelflecha1.add(jr[1]);
    panelflecha1.add(fjr[1]);
    
    panelflecha2 = new JPanel();
    panelflecha2.setBackground(Color.blue);
    panelflecha2.add(jr[2]);
    panelflecha2.add(fjr[2]);
    
    panelflecha3 = new JPanel();
    panelflecha3.setBackground(Color.blue);
    panelflecha3.add(jr[3]);
    panelflecha3.add(fjr[3]);
    
    panelflecha4 = new JPanel();
    panelflecha4.setBackground(Color.blue);
    panelflecha4.add(jr[4]);
    panelflecha4.add(fjr[4]);
    
    panelflecha5 = new JPanel();
    panelflecha5.setBackground(Color.blue);
    panelflecha5.add(jr[5]);
    panelflecha5.add(fjr[5]);
        
    add(Lavavajillas);add(Lavadora);add(Micro);
    add(TV);add(Musica);add(Nevera);    
     
      Lavavajillas.setLayout(new BoxLayout(Lavavajillas, BoxLayout.PAGE_AXIS)); ;
      Lavadora.setLayout(new BoxLayout(Lavadora, BoxLayout.PAGE_AXIS));
      Micro.setLayout(new BoxLayout(Micro, BoxLayout.PAGE_AXIS));
      TV.setLayout(new BoxLayout(TV, BoxLayout.PAGE_AXIS));
      Musica.setLayout(new BoxLayout(Musica, BoxLayout.PAGE_AXIS));
      Nevera.setLayout(new BoxLayout(Nevera, BoxLayout.PAGE_AXIS));
      

      
      Lavavajillas.add (label2[0]); 
      Lavadora.add (label2[1]); 
      Micro.add (label2[2]);
      TV.add (label2[3]); 
      Musica .add (label2[4]);
      Nevera.add (label2[5]);
      
     Lavavajillas.add (label[0]); 
     Lavadora.add (label[1]); 
     Micro.add (label[2]);
     TV.add (label[3]);
     Musica .add (label[4]);
     Nevera.add (label[5]);
     
 
    panelconsumo.add(consumo);// añadimos el slider a un panel para cambiar el tamaño
    Lavavajillas.add(panelconsumo); 
    Lavavajillas.add(panelflecha); 
    
    Lavavajillas.add(panelkw1); 
 Lavavajillas.add(boton_1);
   
    
     panelconsumo1.add(consumo1);
     Lavadora.add(panelconsumo1); 
     Lavadora.add(panelflecha1);
     
     Lavadora.add(panelkw2); 
     Lavadora.add(boton_2);
     
      panelconsumo2.add(consumo2);
     Micro.add(panelconsumo2); 
     Micro.add(panelflecha2);
     Micro.add(panelkw3); 
     Micro.add(boton_3);
     
      panelconsumo3.add(consumo3);
      TV.add(panelconsumo3); 
     TV.add(panelflecha3);
     
     TV.add(panelkw4); 
     TV.add(boton_4);
     
      panelconsumo4.add(consumo4);
      Musica.add(panelconsumo4); 
     Musica.add(panelflecha4);
     
     Musica.add(panelkw5);
     Musica.add(boton_5);
     
      panelconsumo5.add(consumo5);
      Nevera.add(panelconsumo5); 
      Nevera.add(panelflecha5);
      
     Nevera.add(panelkw6); 
     Nevera.add(boton_6);
              
    setVisible(true);
    
    boton_1.setActionCommand("boton_1");
    boton_2.setActionCommand("boton_2");
    boton_3.setActionCommand("boton_3");
    boton_4.setActionCommand("boton_4");
    boton_5.setActionCommand("boton_5");
    boton_6.setActionCommand("boton_6");
    }
     public void Accion(MouseListener bl){
    boton_1.addMouseListener(bl);
    boton_2.addMouseListener(bl);
    boton_3.addMouseListener(bl);
    boton_4.addMouseListener(bl);
    boton_5.addMouseListener(bl);
    boton_6.addMouseListener(bl);
               
  
    }
      public void RadioButton(ItemListener bl){
          for(int i=0;i<=6;i++){
            jr[i].addItemListener(bl);  
            fjr[i].addItemListener(bl);  
          }
    
   
               
  
    }
     public void Departamentos_Luces(ItemListener d_le){
      for(i=0;i<=6;i++){
        jr[i].addItemListener(d_le);  
        fjr[i].addItemListener(d_le);  
      }
     
   
}
     public void Slider(ChangeListener cl){
         consumo.addChangeListener(cl);
         consumo1.addChangeListener(cl);
         consumo2.addChangeListener(cl);
         consumo3.addChangeListener(cl);
         consumo4.addChangeListener(cl);
         consumo5.addChangeListener(cl);
         
     }
     public void InsertarValores_Electro(ActionListener al){
         boton_1.addActionListener(al);
          boton_2.addActionListener(al);
           boton_3.addActionListener(al);
            boton_4.addActionListener(al);
             boton_5.addActionListener(al);
              boton_6.addActionListener(al);
             
     }
       public void Estados(ItemListener il){
        for(int i=0;i<=5;i++){
        fjr[i].addItemListener(il);
        jr[i].addItemListener(il);
        }
    
        
    }
   private void setTamaño (JComponent comp, int x, int y){
  Dimension tam = new Dimension (x, y);
  comp.setMaximumSize(tam);
  comp.setPreferredSize(tam);
  }
   
} public class Botones extends JPanel{
        public View.Barra view;
        public JButton atras_b,home_b,plano_b;
        public ActionListener bl;
        public JMenuBar bar,iconos_M;
    public JMenu atras,home,plano,estado;
    public ImageIcon atras_i,home_i,plano_i;
        public Botones(){
           
         atras_i=new ImageIcon("atras.gif");
        estado=new JMenu();
       
        plano_i=new ImageIcon("paste.gif");
        	
        iconos_M=new JMenuBar();
        atras_b=new JButton();
        atras_b.setIcon(atras_i);
        atras_b.setBounds(10,10,4,1);
       
        plano_b=new JButton(); 
        plano_b.setIcon(plano_i);
        
        iconos_M.add(atras_b);
        
        iconos_M.add(plano_b);
        
        setJMenuBar(iconos_M);
        
        atras_b.setActionCommand("atras_elec");
       
        plano_b.setActionCommand("plano");
        
    }  
        public void Accion(ActionListener bl){
       
            plano_b.addActionListener(bl);
        atras_b.addActionListener(bl);         
    }
    
}
}

