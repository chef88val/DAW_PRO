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


/**
 *
 * @author Usuario
 */
public class Climatizacion extends JFrame{
   
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
    
    public Climatizacion(){
          re =new Relleno();
           botones=new Botones();
add(re);
        setTitle("Climatizacion");
        setSize(800, 650);
        setVisible(false); 	
        
      
}

    public void setActionListenerView(ActionListener bl) {
         botones.atras_b.addActionListener(bl);
    }
    public class Relleno extends JPanel{  
        public GridLayout ly;
         public TextField text,text1,text2,text3,text4,text5;
         public JTextField text_ini[]=new JTextField[7];
         public JTextField text_fin[]=new JTextField[7];
       public int n=0, b=0;
      public JPanel Lavavajillas, Lavadora, Micro,TV, Musica, Nevera;
      public JLabel label [] = new JLabel[9];
        public JLabel label2 [] = new JLabel[8];
        public JLabel label3[]=new JLabel[16];
        public int i=0;
       public JButton boton_1,boton_2,boton_3,boton_4,boton_5,boton_6;
      public JButton flechatop_0, flechatop_1, flechatop_2,flechatop_3,flechatop_4,flechatop_5;
      public JButton flechabot_0, flechabot_1, flechabot_2,flechabot_3,flechabot_4,flechabot_5;
        /*public ImageIcon flechatop1,flechatop2,flechatop3,flechatop4,flechatop5,flechatop6;
        public ImageIcon flechabot1,flechabot2,flechabot3,flechabot4,flechabot5,flechabot6;
*/
         public ImageIcon boton1,boton2,boton3,boton4,boton5,boton6;
      String vector[]={"Habitacion 1","Habitacion 2",
                "Cocina","Salon-despacho","Baño 1"," Baño 2",""};
    String estado[]={"Hora inicio","Hora fin"};
    public ButtonGroup rb;
      public Relleno(){
           
   /*   
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
       */
         for (i=0; i<=6;i++)
        { label2[i]=new JLabel(vector[i]);
       label2[i].setForeground( Color.WHITE );
       label2[i].setFont( new Font( "Serif", Font.BOLD, 25 ) ); 
             text_ini[i]=new JTextField(5);
             text_fin[i]=new JTextField(5);
             label3[i]=new JLabel(estado[0]);
              
/*             */
        }
        
        
        
         for (i=0; i<=6;i++)
        { 
            
            label[i]=  new JLabel("Temperatura");
       
           //  label[i]= getE.style.textDecoration="underline"
            label[i].setForeground( Color.WHITE );
            label[i].setFont( new Font( "Serif", Font.PLAIN, 20 ) );  
            // label3[i]=new JLabel(estado[1]);
        }
          for (i=5; i<=12;i++)
        { 
            
            
             label3[i]=new JLabel(estado[1]);
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
        
    setLayout(new GridLayout(2,2,2,2));
   Container content = getContentPane();
   /*for (i=0; i<=6;i++)
        { 
  content.add(text_ini[i]);content.add(text_fin[i]);
  content.add(label3[i]);//content.add(label3[i+1]);
        }*/
/*    flechatop1 =new ImageIcon ("ww.GIF");
    flechatop_0 =new JButton (flechatop1);
    
    

    flechabot1 =new ImageIcon ("ww1.GIF");
    flechabot_0 =new JButton (flechabot1);
    content.add(flechabot_0);*/
    
 //boton1 =new ImageIcon ("ww2.GIF");
    boton_1 =new JButton (boton1);
    boton_1 =new JButton ("Añadir");
    //content.add(boton_1);
    /*
     flechatop2 =new ImageIcon ("ww.GIF");
    flechatop_1 =new JButton (flechatop2);
    content.add(flechatop_1);
    

    flechabot2 =new ImageIcon ("ww1.GIF");
    flechabot_1 =new JButton (flechabot2);
    content.add(flechabot_1);
    */
 //boton2 =new ImageIcon ("ww2.GIF");
    boton_2 =new JButton ("Añadir");
    //content.add(boton_2);
    /*
     flechatop3 =new ImageIcon ("ww.GIF");
    flechatop_2 =new JButton (flechatop3);
    content.add(flechatop_2);
    

    flechabot3 =new ImageIcon ("ww1.GIF");
    flechabot_2 =new JButton (flechabot3);
    content.add(flechabot_2);
    */
 //boton3 =new ImageIcon ("ww2.GIF");
    boton_3 =new JButton ("Añadir");
    //content.add(boton_3);
    /*
     flechatop4 =new ImageIcon ("ww.GIF");
    flechatop_3 =new JButton (flechatop4);
    content.add(flechatop_3);
    

    flechabot4 =new ImageIcon ("ww1.GIF");
    flechabot_3 =new JButton (flechabot4);
    content.add(flechabot_3);
    */
// boton4 =new ImageIcon ("ww2.GIF");
    boton_4 =new JButton ("Añadir");
    //content.add(boton_4);
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
    //content.add(boton_5);
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
   // content.add(boton_6);
    
    
    panelkw1= new JPanel();
    panelkw1.setBackground(Color.blue);
     text= new TextField("8090");
    panelkw1.add (text);
    panelkw1.add(new JLabel("ºC")); 
    
    panelkw2= new JPanel();
    panelkw2.setBackground(Color.blue);
     text1= new TextField();
    panelkw2.add (text1);
    panelkw2.add(new JLabel("ºC")); 
    
    panelkw3= new JPanel();
    panelkw3.setBackground(Color.blue);
     text2= new TextField();
    panelkw3.add (text2);
    panelkw3.add(new JLabel("ºC")); 
    
    panelkw4= new JPanel();
    panelkw4.setBackground(Color.blue);
     text3= new TextField();
    panelkw4.add (text3);
    panelkw4.add(new JLabel("ºC")); 
    
    panelkw5= new JPanel();
    panelkw5.setBackground(Color.blue);
     text4= new TextField();
    panelkw5.add (text4);
    panelkw5.add(new JLabel("ºC")); 
    
    panelkw6= new JPanel();
    panelkw6.setBackground(Color.blue);
     text5= new TextField();
    panelkw6.add (text5);
    panelkw6.add(new JLabel("ºC")); 
    
    
    
    panelflecha = new JPanel();
    
    panelflecha.setBackground(Color.blue);
     panelflecha.add(label3[0]);
     panelflecha.add(text_ini[0]);   
    panelflecha.add(text_fin[0]);
    panelflecha.add(label3[6]);
    //panelflecha.setLayout( new GridLayout(2,2));
    panelflecha1 = new JPanel();
    panelflecha1.setBackground(Color.blue);
     panelflecha1.add(label3[1]);
     panelflecha1.add(text_ini[1]);   
    panelflecha1.add(text_fin[1]);
    panelflecha1.add(label3[7]);
    
    panelflecha2 = new JPanel();
    panelflecha2.setBackground(Color.blue);
     panelflecha2.add(label3[2]);
     panelflecha2.add(text_ini[2]);   
    panelflecha2.add(text_fin[2]);
    panelflecha2.add(label3[8]);
    
    panelflecha3 = new JPanel();
    panelflecha3.setBackground(Color.blue);
     panelflecha3.add(label3[3]);
     panelflecha3.add(text_ini[3]);   
    panelflecha3.add(text_fin[3]);
    panelflecha3.add(label3[9]);
    
    panelflecha4 = new JPanel();
    panelflecha4.setBackground(Color.blue);
     panelflecha4.add(label3[4]);
     panelflecha4.add(text_ini[4]);   
    panelflecha4.add(text_fin[4]);
    panelflecha4.add(label3[10]);
    
    panelflecha5 = new JPanel();
    panelflecha5.setBackground(Color.blue);
     panelflecha5.add(label3[5]);
     panelflecha5.add(text_ini[5]);   
    panelflecha5.add(text_fin[5]);
    panelflecha5.add(label3[11]);
        
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
     
     
    public void InsertarValores_Electro(ActionListener al){
         boton_1.addActionListener(al);
          boton_2.addActionListener(al);
           boton_3.addActionListener(al);
            boton_4.addActionListener(al);
             boton_5.addActionListener(al);
              boton_6.addActionListener(al);
             
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
    
     
   private void setTamaño (JComponent comp, int x, int y){
  Dimension tam = new Dimension (x, y);
  comp.setMaximumSize(tam);
  comp.setPreferredSize(tam);
  }
   
 public class Botones extends JPanel{
        
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
        
        setJMenuBar(iconos_M);
        
        atras_b.setActionCommand("atras_cli");
        home_b.setActionCommand("home");
        plano_b.setActionCommand("plano");
        
    }  
        public void Accion(ActionListener bl){
           home_b.addActionListener(bl);
            plano_b.addActionListener(bl);
        atras_b.addActionListener(bl);         
    }
    
}
}
