/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import javax.swing.*;



/**
 *
 * @author alumno
 */
public class Plano extends JFrame{ 
      
    public JLabel l1;
    public JToolBar iconos;
   View v;
   public Botones botones;
     public PanelDibujos pd2;
     //public Botones botones;
    // public Estados estados;
     public ActionListener al,el;
     public JFrame esta=new JFrame();
     Plano estat;
    public Plano(){
         super("Plano");
        //JFrame l1 = new JFrame();
       // add(l1);

       botones=new Botones();
       pd2=new PanelDibujos();
        add(pd2);
        setSize(650, 700);
        setVisible(false);
        //setResizable(false);
       
           // botones=new Botones();
       // add(botones);
           //Labels habitaciones=new Labels();
        //add(habitaciones);
         //pd=new PanelDibujos();
       //add(pd);
        
       // pd2.setBounds(40, 50, 100, 100);
        /* prueba=new Pruebamodel(); 
         prueba1=new Pruebamodel();
        prueba2=new Pruebamodel();
       setLayout(new GridBagLayout());
      */
      /* prueba.setBounds(100, 100, 200, 200);
       add(prueba); add(prueba2);
        //prueba1.setBounds(100, 100, 200, 200);
       add(prueba1);*/
       //estados=new Estados();
       //botones.Accion(new AccionListener());
    }
     
 
   
    public class PanelDibujos extends JPanel{
        public JTextField h1[]=new JTextField[20];
        public JTextField h2[]=new JTextField[20];
        public JTextField b1[]=new JTextField[20];
        public JTextField b2[]=new JTextField[20];
        public JTextField salon[]=new JTextField[20];
        public JTextField cocina[]=new JTextField[20];
        public JTextField alarmas[]=new JTextField[20];
        public JLabel titulo1[]=new JLabel[20];
        public JLabel titulo2[]=new JLabel[20];
        public JLabel titulo3[]=new JLabel[20];
        public JLabel titulo4[]=new JLabel[20];
        public JLabel titulo5[]=new JLabel[20];
        public JLabel titulo6[]=new JLabel[20];
        public JLabel alarma[]=new JLabel[20];
      
        String s_h1[]={"Temperatura","Persiana 1","Persiana 2","Musica"};
        String s_h2[]={"Temperatura","Persiana 1","Persiana ","Musica"};
        String s_b1[]={"Temperatura","Persiana 1","Persiana ","Musica"};
        String s_b2[]={"Temperatura","Persiana 1","Persiana 2","Musica"};
        String s_salon[]={"Temperatura"," Persiana 1","Persiana 2","Musica","TV"};
        String s_cocina[]={"Temperatura"," Persiana 1"," Persiana 2","Musica","Nevera","Lavadora","Microondas","Lavavajillas"};
        String s_alarmas[]={"Robo","Fuego"," Gas","Agua","Wifi"};
        
        // public Pruebamodel prueba,prueba1,prueba2;
         public JButton h1_b,h2_b;
         public  JPopupMenu jpopup;
         public JMenuItem javaCupMI;
         
       // setLayout(null);
        public PanelDibujos(){
            for(int i=0;i<=10;i++){
                h1[i]=new JTextField();
                h1[i].setEditable(false);
                
                h2[i]=new JTextField(5);
                h2[i].setEditable(false);
                
                b1[i]=new JTextField(5);
                b1[i].setEditable(false);
                
                b2[i]=new JTextField(5);
                b2[i].setEditable(false);
                
                salon[i]=new JTextField(5);                
                salon[i].setEditable(false);
                
                cocina[i]=new JTextField(5);
                cocina[i].setEditable(false);
                
                alarmas[i]=new JTextField(5);
                alarmas[i].setBackground(Color.red);
                alarmas[i].setEditable(false);
                
                              
                
            }
            setLayout(null);
            /* for(int i=0;i<=4;i++){
               
                
                    
                    
            
           
            }*/
            for(int j=0;j<=4;j++){
                int h=30;
                alarma[j]=new JLabel(s_alarmas[j]);
                alarma[j].setBackground(Color.blue);
               /* alarma[j].setBounds(630,90+(j*h),80, 20); 
                alarmas[j].setBounds(710,90+(j*h),80, 20);*/
                
                 alarma[j].setBounds(620,200+(j*h),80, 20); 
                alarmas[j].setBounds(700,200+(j*h),80, 20);
                
              add(alarma[j]);
              add(alarmas[j]);
            }
            for(int j=0;j<=3;j++){
                int h=30;
              //for(int h=0;h<120;h+=30){
                 
                titulo1[j]=new JLabel(s_h1[j]);
                titulo2[j]=new JLabel(s_h2[j]); 
                
                h1[j].setBounds(110,90+(j*h),80, 20); 
                titulo1[j].setBounds(30,90+(j*h),80, 20);
                  
                h2[j].setBounds(300,90+(j*h),80, 20);
                titulo2[j].setBounds(220,90+(j*h),80, 20); 
                  add(titulo1[j]);add(h1[j]);
                 add(titulo2[j]);add(h2[j]); 
                    }
            for(int j=0;j<=7;j++){ 
                 int h=30;
               cocina[j].setBounds(530,350+(j*h),80, 20);
               
                  
               titulo6[j]=new JLabel(s_cocina[j]);
               titulo6[j].setBounds(450,350+(j*h),80, 20);
                add(titulo6[j]);add(cocina[j]);
            }
            for(int j=0;j<=4;j++){
                int h=30;
                titulo5[j]=new JLabel(s_salon[j]);
                  salon[j].setBounds(300,350+(j*h),120, 20);
                  titulo5[j].setBounds(220,350+(j*h),120, 20);
                 
                 add(titulo5[j]);add(salon[j]);
            }
            for(int j=3;j<=7;j++){
                  salon[j].setBackground(Color.red);
                  cocina[j].setBackground(Color.red);
                   h1[j].setBackground(Color.red);
                  h2[j].setBackground(Color.red);
                   b1[j].setBackground(Color.red);
                  b2[j].setBackground(Color.red);
            }
            for(int j=0;j<=3;j++){
                int h=30;
            titulo3[j]=new JLabel(s_b1[j]);
                titulo4[j]=new JLabel(s_b2[j]);
                b1[j].setBounds(530,90+(j*h),80, 20);
                  titulo3[j].setBounds(450,90+(j*h),80, 20);
                  
                  b2[j].setBounds(110,350+(j*h),80, 20);
                  titulo4[j].setBounds(30,350+(j*h),80, 20);
                
             add(titulo3[j]);add(b1[j]);
                  add(titulo4[j]);add(b2[j]);
            }
           
            for(int j=0;j<=3;j++){
                int h=30;
              //for(int h=0;h<120;h+=30){
                 /*h1[j].setBounds(110,90+(j*h),80, 20); 
                 titulo1[j].setBounds(30,90+(j*h),80, 20);
                  
                       h2[j].setBounds(300,90+(j*h),80, 20);
                  titulo2[j].setBounds(220,90+(j*h),80, 20);
                  */
                 
                  
                
                  
                  
                 
                }
            
                  /*
                  h2[j].setBounds(300,120,80, 20);
                  titulo2[j].setBounds(220,120,80, 20);
                  
                  b1[j].setBounds(530,120,80, 20);
                  titulo3[j].setBounds(450,120,80, 20);
                  
                  b2[j].setBounds(110,350,80, 20);
                  titulo4[j].setBounds(30,350,80, 20);
                  
                  salon[j].setBounds(300,350,120, 20);
                  titulo5[j].setBounds(220,350,120, 20);
                  
                  cocina[j].setBounds(530,350,80, 20);
                  titulo6[j].setBounds(450,350,80, 20);*/
                  /* for(int i=2;i<=2;i++){
                        h1[i].setBounds(110,150,80, 20);  
                  titulo1[i].setBounds(30,150,80, 20);
                       }*/
                
            
          
          
//             add(pd2);
        jpopup = new JPopupMenu();

     javaCupMI = new JMenuItem("Example");
    jpopup.add(javaCupMI);
    jpopup.addSeparator();
            /*setLayout(null);
            for(int i=0;i<=4;i++){
                add(titulo1[i]);add(h1[i]);
                 add(titulo2[i]);add(h2[i]);
                  add(titulo3[i]);add(b1[i]);
                  add(titulo4[i]);add(b2[i]);
                    add(titulo5[i]);add(salon[i]);
                     add(titulo6[i]);add(cocina[i]);
            
           
            }*/
        
          // Container cp = getContentPane();
           // setLayout(new GridLayout(2,4,5,10));
            JLabel e1=new JLabel(" ");
            JLabel e2=new JLabel(" ");
          JLabel h1=new JLabel("Habitacion 1");
            JLabel h2=new JLabel("Habitacion 2");
            JLabel h3=new JLabel("Baño 1");
            JLabel h4=new JLabel("Baño2");
            JLabel h5=new JLabel("Salon-Comedor");
            JLabel h6=new JLabel("Cocina");
           //add(e1);
           h1.setBounds(50,50,80, 20);
           h2.setBounds(300,50,80, 20);
           h3.setBounds(500,50,80, 20);
           h4.setBounds(50,300,80, 20);
           h5.setBounds(300,300,120, 20);
           h6.setBounds(500,300,80, 20);
           add(h1);add(h2);add(h3);
           
           // add(e2); prueba.setBounds(100, 100, 200, 200);
       
            add(h4);add(h5);add(h6);
        }
        
      /*  public void AccAct(ActionListener al){
            h1_b.addActionListener(al);
             h2_b.addActionListener(al);
        }*/
        }
      /* @Override
        public void paint(Graphics g) {
            int x = this.getSize().width,y = this.getSize().height;
           
            super.paint(g);
            
            
            g.setColor(Color.blue);
            g.drawRect(300,445,670,480);
            g.setColor(Color.orange);
            g.drawRect(310, 455, 650, 460);
             
            g.setColor(Color.red);
            g.drawRect(20,65,670,480);
            g.setColor(Color.BLACK);
            g.drawRect(30, 75, 650, 460);
            
            g.setColor(Color.yellow);
            g.drawLine(220, 75, 220, 490);
            
            g.setColor(Color.yellow);
            g.drawLine(450, 75, 450, 490);
            
            g.setColor(Color.yellow);
            g.drawLine(30, 240, 600, 240);
           /* g.setColor(Color.red);
            g.drawOval(100,100,50,50);
            g.setColor(Color.blue);
            
            g.fillOval((getSize().width/2)-25,(getSize().height/2)-25,50,50);
            
     } */
        
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
        
        atras_b.setActionCommand("atras_plano");
        home_b.setActionCommand("home");
        plano_b.setActionCommand("plano");
        
    }  
        public void Accion(ActionListener bl){
           home_b.addActionListener(bl);
            plano_b.addActionListener(bl);
           atras_b.addActionListener(bl); 
                 
    }      } 
       
    }
     
    

