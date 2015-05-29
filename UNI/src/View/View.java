/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



/**
 *
 * @author Usuario
 */
public class View extends JFrame {
    /*String opciones[]={"","Persianas","Climatizacion",
                "Electrodomesticos","Control","Comunicaciones","Alarmas","Prueba"};
     String departamentos[]={"","Habitacion 1","Habitacion 2",
                "Cocina","Salon-despacho","Baño 1","Baño 2"};
     String departamentos_alar[]={"","Robo","Fuego","Agua","Gas"};
      String estados_luz[]={"","Off","On"};
     String electrodomesticos[]={"","Lavadora","Lavavajillas",
         "Cadena de Musica","Nevera","Television","Microondas"};
     
     */
     //public JComboBox depart,opc,depart_alarm,luces,electro;
    // public JLabel d,o,o2,o_luz,o_electro;
     public JPanel a,b;
     public Barra barra;
     public ActionListener cl;
     public JTextField tf,tf2,tf3,tf4,tf5;
     public JPanel Relleno;
     public JPanel prueba_model;
     
    //private PeliculaModel PeliculaModel;
    
    
     public ImageIcon casa=new ImageIcon("casa.gif");
    
    public JLabel ima=new JLabel(casa);
            
    public ActionListener bl;
      public JButton cli,per,alar,elec,comu,con; 

   public Alarmas alarmas;
  // public AlarmasCOCINA alarmaco;
   
    public Opciones_abajo op_b;
    public Opciones_centro op_c;
    public Opciones_arriba op_a;
    public Plano estatus;
   
        
    
public View(){
    
    super("Casa Inteligente JAlex"); 
     
       setSize(800,650);
   //setVisible(false);
   
        
        
        
       
        barra = new Barra();
         setJMenuBar(barra);
     
         op_b= new Opciones_abajo();
     op_c= new Opciones_centro();
     op_a= new Opciones_arriba();
        
        //add(op_a);
        //add(op_b);
        //add(op_c);
       add(op_a,BorderLayout.NORTH);
      add(op_c,BorderLayout.CENTER);
      add(op_b,BorderLayout.SOUTH);
     
       ima.setLocation(400, 400);
       //boton.setIcon(casa);
        //container
        Container cp = getContentPane();
   
   
   
   
   
   
   
    /*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    tf=new JTextField();tf2=new JTextField();tf2.setVisible(false);
                        tf3=new JTextField();tf3.setVisible(false);
                        tf4=new JTextField();tf4.setVisible(false);
                        tf5=new JTextField();tf5.setVisible(false);
    a=new JPanel();b=new JPanel();
    Relleno=new JPanel();//Relleno.setLayout(new CardLayout());
    d=new JLabel("1. Opciones:");
    o=new JLabel("2. Departamentos:");
    o2=new JLabel("2. Tipo de alarmas:");
    o_luz=new JLabel("3. Posicion de la luz:");
    o_electro=new JLabel("2. Electrodomestico:");
    
    opc=new JComboBox(departamentos);
     opc.setSelectedIndex(0);
    opc.setVisible(false);
   
    depart=new JComboBox(opciones); 
    depart.setSelectedIndex(0);
    
     luces=new JComboBox(estados_luz);
      luces.setSelectedIndex(0);
     electro=new JComboBox(electrodomesticos);
      electro.setSelectedIndex(0);
    
    o.setVisible(false); o2.setVisible(false);
    o_luz.setVisible(false); o_electro.setVisible(false); 
    luces.setVisible(false); electro.setVisible(false);
    depart_alarm=new JComboBox(departamentos_alar);
    depart_alarm.setSelectedIndex(0);
    depart_alarm.setVisible(false);
     
    barra=new Barra(); setJMenuBar(barra);*/
    /*b.setLayout(new GridLayout(4,3,3,3));
    
    b.add(o2);b.add(depart_alarm);b.add(tf3);
    b.add(o);b.add(opc);b.add(tf2);
    
    b.add(o_electro);b.add(electro);b.add(tf5);
    b.add(o_luz);b.add(luces);b.add(tf4);
    
    a.setLayout(new GridLayout(0,3,3,3));
    a.add(d);a.add(depart);a.add(tf);
    
    prueba_model=new JPanel();
    setLayout(new BorderLayout());
    add(b,BorderLayout.SOUTH);*/
    //add(prueba_model,BorderLayout.CENTER);
    /*add(Relleno,BorderLayout.CENTER);
    add(a,BorderLayout.NORTH); //depart.addActionListener(cl);
    add(depart, BorderLayout.BEFORE_LINE_BEGINS);
        add(opc, BorderLayout.BEFORE_LINE_BEGINS);*/

}
/*
public void Departamentos(ItemListener de){
      
     depart.addItemListener(de);
   depart_alarm.addItemListener(de);
}
public void Departamentos_Alar(ItemListener d_ae){
      
     
   depart_alarm.addItemListener(d_ae);
}
public void Departamentos_Luces(ItemListener d_le){
      
     
   luces.addItemListener(d_le);
}
public void Departamentos_Electro(ItemListener d_ee){
      
     
   electro.addItemListener(d_ee);
}
public void Opciones(ItemListener d_oe){
    opc.addItemListener(d_oe);       

}*/

   /* public void setActionListener(ActionListener al) {
      //  peliculapanel.setActionListener(al);
        //smenu.setActionListener(al);
    }*/
   public class Barra extends JMenuBar{
        public ImageIcon atras_i;
         public JMenu luces,inicio,Limpiarpanel,estado;
         public JMenu plano;
    public JMenuItem salir,plano_i;
    public JMenuItem save_mi,load_mi;
    public JMenuItem clima,persi,control,comuni,electro,alar;
        public Barra(){
            inicio=new JMenu("Inicio");
            estado=new JMenu("Estado");
            plano=new JMenu("Plano");
            plano_i=new JMenuItem("Plano");
            Limpiarpanel=new JMenu("Limpiar Pantalla");
             luces=new JMenu("Luces");luces.setBackground(Color.yellow);
             
            salir=new JMenuItem("Salir");
            save_mi=new JMenuItem("Guardar datos");
                save_mi.setActionCommand("save");
            load_mi=new JMenuItem("Cargar datos");
                load_mi.setActionCommand("load");
            
        //atras.setIcon(atras_i);
       // atras.setBounds(10,10,4,1);
             atras_i=new ImageIcon("atras.gif");
             
             alar=new JMenuItem("Alarmas");
             
           clima=new JMenuItem("Climatizacion");
            
            persi=new JMenuItem("Persianas");
            
            comuni=new JMenuItem("Comunicaciones");
            electro=new JMenuItem("Electrodomesticos");
            control=new JMenuItem("Control de Dispositivos");
            
            inicio.add(save_mi);
            inicio.add(load_mi);
            inicio.add(salir);
            plano.add(plano_i);
            estado.add(alar);
            estado.add(clima);estado.add(comuni);
           estado.add(persi);estado.add(electro);estado.add(control);
            
            add(inicio);
            //add(alar);
            add(luces);add(Limpiarpanel);add(estado);add(plano);
            
             salir.setActionCommand("atras");
             //estado.setActionCommand("estado");
             plano_i.setActionCommand("plano");
             luces.setActionCommand("luces");
             alar.setActionCommand("alar");
             
             clima.setActionCommand("Climatizacion");
            
            electro.setActionCommand("Electrodomesticos");
            control.setActionCommand("Control");
            comuni.setActionCommand("Salon-despacho");
            persi.setActionCommand("Persiana");
            
        }
        public void ActionListener(ActionListener bl){
       
         salir.addActionListener(bl);
         estado.addActionListener(bl); 
         plano_i.addActionListener(bl); 
        
       
    }
        public void CargaGuarda (ActionListener al){
            save_mi.addActionListener(al);
           load_mi.addActionListener(al);
        }
        public void ActionListenerLuces(MouseListener ml){
           
             luces.addMouseListener(ml);
        }
          public void ActionListenerEstados(ActionListener bl){
       
         clima.addActionListener(bl);
         electro.addActionListener(bl);           
         persi.addActionListener(bl);         comuni.addActionListener(bl); 
         alar.addActionListener(bl);     control.addActionListener(bl); 
       
    }
    }
}