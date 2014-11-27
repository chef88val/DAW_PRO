/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import View.*;
import View.Climatizacion;
import View.Comunicaciones;
import View.Control;
import View.Electrodomesticos;
import View.View;
import Model.*;
import View.Persianas;
import Tablas.*;
import java.awt.Color;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Usuario
 */
public class Controller {
private View view;
private Climatizacion cli;
private Alarmas alar;
private Comunicaciones comi;
private Control control;
private Luces luces;
private Persianas persi;
private Electrodomesticos electro;

private Plano plano;
private Bienvenido bienv;
 
private TablaPer t_per;//b1
private TablaCli t_cli;//h1
private TablaElectro t_electro;//c
private TablaCOmi t_comi;//s
private TablaAlar t_al;//tal
private TablaControl t_con;//tcon

private Model_Alar m_alar;private Model_Control m_Control;

private Model_Per m_per;
private Model_Clima m_clima;
private Model_Comi m_comi;private Model_Electro m_electro;

public Controller(View view,Climatizacion cli,Alarmas alar,
        Luces luces,Persianas persi,Electrodomesticos electro
        ,Control control,Comunicaciones comi,Plano plano
        ,TablaElectro c,TablaPer b1,TablaCli h1,TablaCOmi s,TablaAlar tal,
        TablaControl tcon,Model_Control m_Control,
        Model_Alar m_alar,Model_Per m_per,Model_Clima m_clima
        ,Model_Comi m_comi,Model_Electro m_electro,Bienvenido bienv){
    this.view=view;
    this.cli=cli;
    this.alar=alar;    this.comi=comi;   this.control=control; 
    this.luces=luces;  this.persi=persi; this.electro=electro;
   this.plano=plano;this.bienv=bienv;
    this.t_electro=c;    
    this.t_comi=s;    
    this.t_cli=h1;     
    this.t_per=b1;    
    this.t_al=tal;
    this.t_con=tcon;
    this.m_alar=m_alar;this.m_Control=m_Control;
    
   this.m_clima=m_clima;this.m_electro=m_electro;this.m_comi=m_comi;
   this.m_per=m_per;
   
    
/*     view.Departamentos(new ComboDepartamentoView());
     view.Opciones(new ComboOpcionesView());     
     view.Departamentos_Alar(new ComboDepartamento_AlarView()); 
     view.Departamentos_Electro(new Departamentos_ElectroController());
     view.Departamentos_Luces(new Departamentos_LucesController());
     */
     bienv.Iniciar(new BienvenidoController());
      
     view.op_a.setActionListenerView(new ActionListenerView());
     view.op_b.setActionListenerView(new ActionListenerView());
     
      view.barra.ActionListener(new ActionListenerView());
      view.barra.ActionListenerEstados(new EstadosView());
      view.barra.ActionListenerLuces(new AnadirLucesMouseView());
     
      
      
      cli.Slider(new SliderController());
      //cli.re.sl.Slider(new SliderController());
      persi.Slider(new SliderController());
      electro.re.Slider(new SliderController());
      
      cli.re.InsertarValores_Electro(new ClimatizacionController());
      alar.hab.BotonesAlarmas(new AlarmasController());
      persi.re.InsertarValores_Electro(new PersianasController());      
      comi.hab.Comi(new ComiController());
      electro.re.InsertarValores_Electro(new ElectroController());
      electro.re.Departamentos_Luces(new ElectroController());
electro.re.RadioButton(new ElectroController());
      //plano.pd2.AccAct(new PlanoControllerAct() );
      
      ///////////////////
plano.botones.Accion(new ActionListenerView());
      persi.botones.Accion(new ActionListenerView());
       alar.botones.Accion(new ActionListenerView());
       comi.botones.Accion(new ActionListenerView());
   cli.botones.Accion(new ActionListenerView());
   electro.botones.Accion(new ActionListenerView());
   /*botones.setActionListenerView(new ActionListenerView());
   control.botones.Accion(new ActionListenerView());persianas.botones.setActionListenerView(new ActionListenerView());
   clima.botones.setActionListenerView(new ActionListenerView());
   comunica.botones.Accion(new ActionListenerView());
   
   plano.botones.Accion(new ActionListenerView());*/
     alar.hab.Estados(new RadioAlarmasController());
     electro.re.Estados(new RadioElectrodomesticosController());
}
public class RadioElectrodomesticosController implements ItemListener {
int i;
String al1,bl1;
String al2,bl2;
String al3,bl3;
String al4,bl4;
String al5,bl5;
String al6,bl6;
              @Override
        public void itemStateChanged(ItemEvent e) {
               AbstractButton button = (AbstractButton) e.getItemSelectable();
            String command=button.getActionCommand();
            Object source = e.getItemSelectable();
            //int state = e.getStateChange();
            //String label = aButton.getText();
            
            if (e.getItemSelectable()== electro.re.fjr[0] ) {
                  
               al1=electro.re.fjr[0].getText();
                  plano.pd2.cocina[7].setBackground(Color.red); 
                  electro.re.estadoalarma1.setText(al1);//plano.pd2
        }else if (e.getItemSelectable()== electro.re.jr[0] ) {
                 plano.pd2.cocina[7].setBackground(Color.green); 
                   bl1=electro.re.jr[0].getText();
                    electro.re.estadoalarma1.setText(bl1);
                    System.out.println(bl1);
              
                    
        
        }
            
             if (e.getItemSelectable()== electro.re.fjr[1] ) {
                  
               al2=electro.re.fjr[1].getText();
                  plano.pd2.cocina[5].setBackground(Color.red);
                   electro.re.estadoalarma2.setText(al2);//plano.pd2
        }else if (e.getItemSelectable()== electro.re.jr[1] ) {
                 plano.pd2.cocina[5].setBackground(Color.green); 
                   bl2=electro.re.jr[1].getText();
                   electro.re.estadoalarma2.setText(bl2);
                    System.out.println(bl2);
              
                    
        
        }
             
              if (e.getItemSelectable()== electro.re.fjr[2] ) {
                  
               al3=electro.re.fjr[2].getText();
                  plano.pd2.cocina[6].setBackground(Color.red); 
                  electro.re.estadoalarma3.setText(al3);//plano.pd2
        }else if (e.getItemSelectable()== electro.re.jr[2] ) {
                 plano.pd2.cocina[6].setBackground(Color.green); 
                   bl3=electro.re.jr[2].getText();
                    electro.re.estadoalarma3.setText(bl3);
                    System.out.println(bl3);
              
                    
        
        }
              
               if (e.getItemSelectable()== electro.re.fjr[3] ) {
                  
               al4=electro.re.fjr[3].getText();
                  plano.pd2.salon[4].setBackground(Color.red);
                  electro.re.estadoalarma4.setText(al4);//plano.pd2
        }else if (e.getItemSelectable()== electro.re.jr[3] ) {
                 plano.pd2.salon[4].setBackground(Color.green); 
                   bl4=electro.re.jr[3].getText();
                    electro.re.estadoalarma4.setText(bl4);
                    System.out.println(bl4);
              
                    
        
        }
               
                   if (e.getItemSelectable()== electro.re.fjr[4] ) {
                  
               al5=electro.re.fjr[4].getText();
                  plano.pd2.h1[3].setBackground(Color.red);
                  plano.pd2.h2[3].setBackground(Color.red);
                  plano.pd2.b1[3].setBackground(Color.red);
                  plano.pd2.b2[3].setBackground(Color.red);
                  plano.pd2.salon[3].setBackground(Color.red);
                  plano.pd2.cocina[3].setBackground(Color.red);
                   electro.re.estadoalarma5.setText(al5);//plano.pd2
        }else if (e.getItemSelectable()== electro.re.jr[4] ) {
                 plano.pd2.h1[3].setBackground(Color.green);
                  plano.pd2.h2[3].setBackground(Color.green);
                  plano.pd2.b1[3].setBackground(Color.green);
                  plano.pd2.b2[3].setBackground(Color.green);
                  plano.pd2.salon[3].setBackground(Color.green);
                  plano.pd2.cocina[3].setBackground(Color.green); 
                   bl5=electro.re.jr[4].getText();
                   electro.re.estadoalarma5.setText(bl5);
                    
              
                    
        
        }
                   
                       if (e.getItemSelectable()== electro.re.fjr[5] ) {
                  
               al6=electro.re.fjr[5].getText();
                  plano.pd2.cocina[4].setBackground(Color.red);
                   electro.re.estadoalarma6.setText(al6);//plano.pd2
        }else if (e.getItemSelectable()== electro.re.jr[5] ) {
                 plano.pd2.cocina[4].setBackground(Color.green); 
                   bl6=electro.re.jr[5].getText();
                    electro.re.estadoalarma6.setText(bl6);
                  
              
                    
        
        }
        }
    }
public class RadioAlarmasController implements ItemListener {
int i;
String al1,bl1;
String al2,bl2;
String al3,bl3;
String al4,bl4;
              @Override
        public void itemStateChanged(ItemEvent e) {
               AbstractButton button = (AbstractButton) e.getItemSelectable();
            String command=button.getActionCommand();
            Object source = e.getItemSelectable();
            //int state = e.getStateChange();
            //String label = aButton.getText();
            
            if (e.getItemSelectable()== alar.hab.fjr[0] ) {
                  
               al1=alar.hab.fjr[0].getText();
                  plano.pd2.alarmas[0].setBackground(Color.red); 
                  alar.hab.estadoalarma1.setText(al1);//plano.pd2
        }else if (e.getItemSelectable()== alar.hab.jr[0] ) {
                 plano.pd2.alarmas[0].setBackground(Color.green); 
                   bl1=alar.hab.jr[0].getText();
                    alar.hab.estadoalarma1.setText(bl1);
                    System.out.println(bl1);
              
                    
        
        }
            
             if (e.getItemSelectable()== alar.hab.fjr[1] ) {
                  
               al2=alar.hab.fjr[1].getText();
                  plano.pd2.alarmas[1].setBackground(Color.red);
                   alar.hab.estadoalarma2.setText(al2);//plano.pd2
        }else if (e.getItemSelectable()== alar.hab.jr[1] ) {
                 plano.pd2.alarmas[1].setBackground(Color.green); 
                   bl2=alar.hab.jr[1].getText();
                    alar.hab.estadoalarma2.setText(bl2);
                    System.out.println(bl2);
              
                    
        
        }
             
              if (e.getItemSelectable()== alar.hab.fjr[2] ) {
                  
               al3=alar.hab.fjr[2].getText();
                  plano.pd2.alarmas[2].setBackground(Color.red); 
                   alar.hab.estadoalarma3.setText(al3);//plano.pd2
        }else if (e.getItemSelectable()== alar.hab.jr[2] ) {
                 plano.pd2.alarmas[2].setBackground(Color.green); 
                   bl3=alar.hab.jr[2].getText();
                    alar.hab.estadoalarma3.setText(bl3);
                    System.out.println(bl3);
              
                    
        
        }
              
               if (e.getItemSelectable()== alar.hab.fjr[3] ) {
                  
               al4=alar.hab.fjr[3].getText();
                  plano.pd2.alarmas[3].setBackground(Color.red);
                   alar.hab.estadoalarma4.setText(al4);//plano.pd2
        }else if (e.getItemSelectable()== alar.hab.jr[3] ) {
                 plano.pd2.alarmas[3].setBackground(Color.green); 
                   bl4=alar.hab.jr[3].getText();
                    alar.hab.estadoalarma4.setText(bl4);
                    System.out.println(bl4);
              
                    
        
        }
        }
    }
public class AlarmasController implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();

            if (cmd.equals("boton1")) {
                System.out.println("Estoy en AlarmasController");
                String t1, t2,t3,t4;
           /*
                t1=alar.direc_txt.getText();
               t2=alar.tele_txt.getText();
               t3=view.tf3.getText();*/
                t1=alar.hab.text.getText();
                t2=alar.hab.text12.getText();
                t4=alar.hab.estadoalarma1.getText();
                    System.out.println("activa boton 1");
                     t3=alar.hab.label2[0].getText();
                  int a = 0;
                //String b;
 
                try {
                    a = Integer.valueOf(t2);
                    //b= Integer.parseInt(t2);
                  
                   m_alar.nuevaFila(t1,a,t3,t4);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(alar, "El año tiene que ser un campo numérico.");
                 
                }
                

                
               alar.hab.text.setText("");
               alar.hab.text12.setText("");
             
            } 
        
         if (cmd.equals("boton2")) {
                System.out.println("Estoy en AlarmasController");
                String t1, t2,t3,t4;
           /*
                t1=alar.direc_txt.getText();
               t2=alar.tele_txt.getText();
               t3=view.tf3.getText();*/
                t1=alar.hab.text1.getText();
                t2=alar.hab.text13.getText();
                t4=alar.hab.estadoalarma2.getText();
                    System.out.println("activa boton 1");
                     t3=alar.hab.label2[1].getText();
                  int a = 0;
                //String b;
 
                try {
                    a = Integer.valueOf(t2);
                    //b= Integer.parseInt(t2);
                  
                   m_alar.nuevaFila(t1,a,t3,t4);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(alar, "El año tiene que ser un campo numérico.");
                 
                }
                

                
               alar.hab.text1.setText("");
               alar.hab.text13.setText("");
             
            } 
        
 if (cmd.equals("boton3")) {
                System.out.println("Estoy en AlarmasController");
                String t1, t2,t3,t4;
           /*
                t1=alar.direc_txt.getText();
               t2=alar.tele_txt.getText();
               t3=view.tf3.getText();*/
                t1=alar.hab.text2.getText();
                t2=alar.hab.text14.getText();
                t4=alar.hab.estadoalarma3.getText();
                    System.out.println("activa boton 1");
                     t3=alar.hab.label2[2].getText();
                  int a = 0;
                //String b;
                  /*if(alar.hab.fjr[3].getState()){
                      
                  }*/
                try {
                    a = Integer.valueOf(t2);
                    //b= Integer.parseInt(t2);
                  
                   m_alar.nuevaFila(t1,a,t3,t4);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(alar, "El año tiene que ser un campo numérico.");
                 
                }
                

                
               alar.hab.text2.setText("");
               alar.hab.text14.setText("");
             
            
        
    } if (cmd.equals("boton4")) {
                System.out.println("Estoy en AlarmasController");
                String t1, t2,t3,t4;
           /*
                t1=alar.direc_txt.getText();
               t2=alar.tele_txt.getText();
               t3=view.tf3.getText();*/
                t1=alar.hab.text3.getText();
                t2=alar.hab.text15.getText();
                t4=alar.hab.estadoalarma4.getText();
                    System.out.println("activa boton 1");
                     t3=alar.hab.label2[3].getText();
                  int a = 0;
                //String b;
 
                try {
                    a = Integer.valueOf(t2);
                    //b= Integer.parseInt(t2);
                  
                   m_alar.nuevaFila(t1,a,t3,t4);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(alar, "El año tiene que ser un campo numérico.");
                 
                }
                

                
               alar.hab.text3.setText("");
               alar.hab.text15.setText("");
             
            } 
        
}
}
/*public class PlanoControllerAct implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();

            if (cmd.equals("h1_b")) {
                System.out.println("asdf");
               } else if (cmd.equals("h2_b")) {
                    System.out.println("123");
                
            }
        }
    
}*/
public class PlanoController implements MouseListener{//,ActionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
           
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           System.out.print("s");if(e.isPopupTrigger()){
               plano.pd2.jpopup.show(e.getComponent(),e.getX(),e.getY());
        }
        }
        
        @Override
        public void mouseEntered(MouseEvent e) {
           
               
           
               
               
          

        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }

      

    

}
public class SliderController implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
           
        //  cli.r.txt[2].setText(Integer.toString(cli.sl.js1.getValue()));
         persi.re.text_p1[0].setText(Integer.toString(persi.consumo.getValue()));
         persi.re.text_p2[0].setText(Integer.toString(persi.consumo20.getValue()));
         
         persi.re.text_p1[1].setText(Integer.toString(persi.consumo1.getValue()));
         persi.re.text_p2[1].setText(Integer.toString(persi.consumo21.getValue()));
         
         persi.re.text_p1[2].setText(Integer.toString(persi.consumo2.getValue()));
         persi.re.text_p2[2].setText(Integer.toString(persi.consumo22.getValue()));
         
         persi.re.text_p1[3].setText(Integer.toString(persi.consumo3.getValue()));
         persi.re.text_p2[3].setText(Integer.toString(persi.consumo23.getValue()));
         
         persi.re.text_p1[4].setText(Integer.toString(persi.consumo4.getValue()));
         persi.re.text_p2[4].setText(Integer.toString(persi.consumo24.getValue()));
        
         persi.re.text_p1[5].setText(Integer.toString(persi.consumo5.getValue()));
         persi.re.text_p2[5].setText(Integer.toString(persi.consumo25.getValue()));
         
         
          electro.re.text.setText(Integer.toString(electro.consumo.getValue()));
          electro.re.text1.setText(Integer.toString(electro.consumo1.getValue()));
          electro.re.text2.setText(Integer.toString(electro.consumo2.getValue()));
          electro.re.text3.setText(Integer.toString(electro.consumo3.getValue()));
          electro.re.text4.setText(Integer.toString(electro.consumo4.getValue()));
          electro.re.text5.setText(Integer.toString(electro.consumo5.getValue()));
        
        
          cli.re.text.setText(Integer.toString(cli.consumo.getValue()));
          cli.re.text1.setText(Integer.toString(cli.consumo1.getValue()));
          cli.re.text2.setText(Integer.toString(cli.consumo2.getValue()));
          cli.re.text3.setText(Integer.toString(cli.consumo3.getValue()));
          cli.re.text4.setText(Integer.toString(cli.consumo4.getValue()));
          cli.re.text5.setText(Integer.toString(cli.consumo5.getValue()));
        }
        
    }


public class ComiController implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();

            if (cmd.equals("boton1")) {
                   System.out.println("Estoy en PersianasController");
                String t1, t2,t3,t5 ,t4;
           
                t1=comi.hab.text1.getText();
               t2=comi.hab.text.getText();
               t3=comi.hab.text12.getText();
               t4=comi.hab.text23.getText();
               System.out.println("activa boton tarari");
               t5=comi.hab.label2[0].getText();
                
                int a = 0,c=0,d=0;
                int b = 0;
                
                
 
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   c=Integer.valueOf(t3);
                   d=Integer.valueOf(t4);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_comi.nuevaFila(a,b,c,d,t5);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(comi, "El año tiene que ser un campo numérico.");
                }                
               comi.hab.text1.setText(""); 
               comi.hab.text.setText("");
                comi.hab.text12.setText("");
                comi.hab.text23.setText(""); 
            } 
            if (cmd.equals("boton2")) {
                   System.out.println("Estoy en PersianasController");
                String t1, t2,t3,t5 ,t4;
           
                t1=comi.hab.text2.getText();
               t2=comi.hab.text7.getText();
               t3=comi.hab.text13.getText();
               t4=comi.hab.text18.getText();
               System.out.println("activa boton tarari");
               t5=comi.hab.label2[1].getText();
                
                int a = 0,c=0,d=0;
                int b = 0;
                
                
 
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   c=Integer.valueOf(t3);
                   d=Integer.valueOf(t4);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_comi.nuevaFila(a,b,c,d,t5);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(comi, "El año tiene que ser un campo numérico.");
                }                
               comi.hab.text2.setText(""); 
               comi.hab.text7.setText("");
                comi.hab.text13.setText("");
                comi.hab.text18.setText(""); 
            } 
        
             if (cmd.equals("boton3")) {
                   System.out.println("Estoy en PersianasController");
                String t1, t2,t3,t5 ,t4;
           
                t1=comi.hab.text3.getText();
               t2=comi.hab.text8.getText();
               t3=comi.hab.text14.getText();
               t4=comi.hab.text19.getText();
               System.out.println("activa boton tarari");
               t5=comi.hab.label2[2].getText();
                
                int a = 0,c=0,d=0;
                int b = 0;
                
                
 
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   c=Integer.valueOf(t3);
                   d=Integer.valueOf(t4);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_comi.nuevaFila(a,b,c,d,t5);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(comi, "El año tiene que ser un campo numérico.");
                }                
               comi.hab.text3.setText(""); 
               comi.hab.text8.setText("");
                comi.hab.text14.setText("");
                comi.hab.text19.setText(""); 
            }  if (cmd.equals("boton4")) {
                   System.out.println("Estoy en PersianasController");
                String t1, t2,t3,t5 ,t4;
           
                t1=comi.hab.text4.getText();
               t2=comi.hab.text9.getText();
               t3=comi.hab.text15.getText();
               t4=comi.hab.text20.getText();
               System.out.println("activa boton tarari");
               t5=comi.hab.label2[3].getText();
                
                int a = 0,c=0,d=0;
                int b = 0;
                
                
 
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   c=Integer.valueOf(t3);
                   d=Integer.valueOf(t4);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_comi.nuevaFila(a,b,c,d,t5);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(comi, "El año tiene que ser un campo numérico.");
                }                
               comi.hab.text4.setText(""); 
               comi.hab.text9.setText("");
                comi.hab.text15.setText("");
                comi.hab.text20.setText(""); 
            }  if (cmd.equals("boton5")) {
                   System.out.println("Estoy en PersianasController");
                String t1, t2,t3,t5 ,t4;
           
                t1=comi.hab.text5.getText();
               t2=comi.hab.text10.getText();
               t3=comi.hab.text16.getText();
               t4=comi.hab.text21.getText();
               System.out.println("activa boton tarari");
               t5=comi.hab.label2[4].getText();
                
                int a = 0,c=0,d=0;
                int b = 0;
                
                
 
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   c=Integer.valueOf(t3);
                   d=Integer.valueOf(t4);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_comi.nuevaFila(a,b,c,d,t5);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(comi, "El año tiene que ser un campo numérico.");
                }                
               comi.hab.text5.setText(""); 
               comi.hab.text10.setText("");
                comi.hab.text16.setText("");
                comi.hab.text21.setText("");
                
            }  if (cmd.equals("boton6")) {
                   System.out.println("Estoy en PersianasController");
                String t1, t2,t3,t5 ,t4;
           
                t1=comi.hab.text6.getText();
               t2=comi.hab.text11.getText();
               t3=comi.hab.text17.getText();
               t4=comi.hab.text22.getText();
               System.out.println("activa boton tarari");
               t5=comi.hab.label2[5].getText();
                
                int a = 0,c=0,d=0;
                int b = 0;
                
                
 
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   c=Integer.valueOf(t3);
                   d=Integer.valueOf(t4);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_comi.nuevaFila(a,b,c,d,t5);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(comi, "El año tiene que ser un campo numérico.");
                }                
               comi.hab.text6.setText(""); 
               comi.hab.text11.setText("");
                comi.hab.text17.setText("");
                comi.hab.text22.setText(""); 
            } if (cmd.equals("boton1")) {
                   System.out.println("Estoy en PersianasController");
                String t1, t2,t3,t5 ,t4;
           
                t1=comi.hab.text1.getText();
               t2=comi.hab.text.getText();
               t3=comi.hab.text12.getText();
               t4=comi.hab.text23.getText();
               System.out.println("activa boton tarari");
               t5=comi.hab.label2[0].getText();
                
                int a = 0,c=0,d=0;
                int b = 0;
                
                
 
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   c=Integer.valueOf(t3);
                   d=Integer.valueOf(t4);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_comi.nuevaFila(a,b,c,d,t5);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(comi, "El año tiene que ser un campo numérico.");
                }                
               comi.hab.text1.setText(""); 
               comi.hab.text.setText("");
                comi.hab.text12.setText("");
                comi.hab.text23.setText(""); 
            } 
        
        }
}


public class PersianasController implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();

            if (cmd.equals("boton_1")) {
                System.out.println("Estoy en PersianasController");
                String t1, t2,t4;
           
                t1=persi.re.text_p1[0].getText();
               t2=persi.re.text_p2[0].getText();               
               t4=persi.re.label2[0].getText();
               
                System.out.println("Estoy en PersianasController 1");
                
                int a = 0;
                int b = 0;
                
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_per.nuevaFila(a,b,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                } 
                plano.pd2.h1[1].setText(t1);
                plano.pd2.h1[2].setText(t2);
               persi.re.text_p1[0].setText("");
               persi.re.text_p2[0].setText("");  
            } 
             if (cmd.equals("boton_2")) {
                System.out.println("Estoy en PersianasController");
                String t1, t2,t4;
           
                t1=persi.re.text_p1[1].getText();
               t2=persi.re.text_p2[1].getText();               
               t4=persi.re.label2[1].getText();
               
                System.out.println("Estoy en PersianasController 1");
                
                int a = 0;
                int b = 0;
                
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_per.nuevaFila(a,b,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                } 
                 plano.pd2.h2[1].setText(t1);
                plano.pd2.h2[2].setText(t2);
               persi.re.text_p1[1].setText("");
               persi.re.text_p2[1].setText("");  
            }
              if (cmd.equals("boton_3")) {
                System.out.println("Estoy en PersianasController");
                String t1, t2,t4;
           
                t1=persi.re.text_p1[2].getText();
               t2=persi.re.text_p2[2].getText();               
               t4=persi.re.label2[2].getText();
               
                System.out.println("Estoy en PersianasController 1");
                
                int a = 0;
                int b = 0;
                
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_per.nuevaFila(a,b,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                } 
                 plano.pd2.b1[1].setText(t1);
                plano.pd2.b1[2].setText(t2);
               persi.re.text_p1[2].setText("");
               persi.re.text_p2[2].setText("");  
            }
               if (cmd.equals("boton_4")) {
                System.out.println("Estoy en PersianasController");
                String t1, t2,t4;
           
                t1=persi.re.text_p1[3].getText();
               t2=persi.re.text_p2[3].getText();               
               t4=persi.re.label2[3].getText();
               
                System.out.println("Estoy en PersianasController 1");
                
                int a = 0;
                int b = 0;
                
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_per.nuevaFila(a,b,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                }  plano.pd2.b2[1].setText(t1);
                     plano.pd2.b2[2].setText(t2);
               persi.re.text_p1[3].setText("");
               persi.re.text_p2[3].setText("");  
            }
                if (cmd.equals("boton_5")) {
                System.out.println("Estoy en PersianasController");
                String t1, t2,t4;
           
                t1=persi.re.text_p1[4].getText();
               t2=persi.re.text_p2[4].getText();               
               t4=persi.re.label2[4].getText();
               
                System.out.println("Estoy en PersianasController 1");
                
                int a = 0;
                int b = 0;
                
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_per.nuevaFila(a,b,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                } 
                 plano.pd2.salon[1].setText(t1);
                plano.pd2.salon[2].setText(t2);
               persi.re.text_p1[4].setText("");
               persi.re.text_p2[4].setText("");  
            }
                 if (cmd.equals("boton_6")) {
                System.out.println("Estoy en PersianasController");
                String t1, t2,t4;
           
                t1=persi.re.text_p1[5].getText();
               t2=persi.re.text_p2[5].getText();               
               t4=persi.re.label2[5].getText();
               
                System.out.println("Estoy en PersianasController 1");
                
                int a = 0;
                int b = 0;
                
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                   
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_per.nuevaFila(a,b,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                } 
                 plano.pd2.cocina[1].setText(t1);
                plano.pd2.cocina[2].setText(t2);
               persi.re.text_p1[5].setText("");
               persi.re.text_p2[5].setText("");  
            }
        }
    }
public class ClimatizacionController implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();

            if (cmd.equals("boton_1")) {
                System.out.println("Estoy en ClimatizacionController");
                String t1, t2,t3,t4;
           
                t1=cli.re.text_ini[0].getText();
               t2=cli.re.text_fin[0].getText(); System.out.println("Estoy en ClimatizacionController 1");
               t3=cli.re.text.getText();
               t4=cli.re.label2[0].getText();
               
                int a = 0;
                int b = 0;
                int c = 0;
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                    c= Integer.valueOf(t3);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_clima.nuevaFila(a,b,c,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                }

                plano.pd2.h1[0].setText(t3);
               cli.re.text_ini[0].setText("");
               cli.re.text_fin[0].setText("");
               cli.re.text.setText("");
              
             
            } 
            if (cmd.equals("boton_2")) {
                System.out.println("Estoy en ClimatizacionController");
                String t1, t2,t3,t4;
           
                t1=cli.re.text_ini[1].getText();
               t2=cli.re.text_fin[1].getText(); System.out.println("Estoy en ClimatizacionController 1");
               t3=cli.re.text1.getText();
               t4=cli.re.label2[1].getText();
               
                int a = 0;
                int b = 0;
                int c = 0;
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                    c= Integer.valueOf(t3);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_clima.nuevaFila(a,b,c,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                }

                plano.pd2.h2[0].setText(t3);
               cli.re.text_ini[1].setText("");
               cli.re.text_fin[1].setText("");
               cli.re.text1.setText("");
              
             
            }
            if (cmd.equals("boton_3")) {
                System.out.println("Estoy en ClimatizacionController");
                String t1, t2,t3,t4;
           
                t1=cli.re.text_ini[2].getText();
               t2=cli.re.text_fin[2].getText(); System.out.println("Estoy en ClimatizacionController 1");
               t3=cli.re.text2.getText();
               t4=cli.re.label2[2].getText();
               
                int a = 0;
                int b = 0;
                int c = 0;
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                    c= Integer.valueOf(t3);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_clima.nuevaFila(a,b,c,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                }

                plano.pd2.b1[0].setText(t3);
               cli.re.text_ini[2].setText("");
               cli.re.text_fin[2].setText("");
               cli.re.text2.setText("");
              
             
            }
            if (cmd.equals("boton_4")) {
                System.out.println("Estoy en ClimatizacionController");
                String t1, t2,t3,t4;
           
                t1=cli.re.text_ini[3].getText();
               t2=cli.re.text_fin[3].getText(); System.out.println("Estoy en ClimatizacionController 1");
               t3=cli.re.text3.getText();
               t4=cli.re.label2[3].getText();
               
                int a = 0;
                int b = 0;
                int c = 0;
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                    c= Integer.valueOf(t3);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_clima.nuevaFila(a,b,c,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                }

                plano.pd2.b2[0].setText(t3);
               cli.re.text_ini[3].setText("");
               cli.re.text_fin[3].setText("");
               cli.re.text3.setText("");
              
             
            }
            if (cmd.equals("boton_5")) {
                System.out.println("Estoy en ClimatizacionController");
                String t1, t2,t3,t4;
           
                t1=cli.re.text_ini[4].getText();
               t2=cli.re.text_fin[4].getText(); System.out.println("Estoy en ClimatizacionController 1");
               t3=cli.re.text4.getText();
               t4=cli.re.label2[4].getText();
               
                int a = 0;
                int b = 0;
                int c = 0;
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                    c= Integer.valueOf(t3);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_clima.nuevaFila(a,b,c,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                }

                plano.pd2.salon[0].setText(t3);
               cli.re.text_ini[4].setText("");
               cli.re.text_fin[4].setText("");
               cli.re.text4.setText("");
              
             
            }
            if (cmd.equals("boton_6")) {
                System.out.println("Estoy en ClimatizacionController");
                String t1, t2,t3,t4;
           
                t1=cli.re.text_ini[5].getText();
               t2=cli.re.text_fin[5].getText(); System.out.println("Estoy en ClimatizacionController 1");
               t3=cli.re.text5.getText();
               t4=cli.re.label2[5].getText();
               
                int a = 0;
                int b = 0;
                int c = 0;
                try {
                   a = Integer.valueOf(t1);
                   b= Integer.valueOf(t2);
                    c= Integer.valueOf(t3);
                   System.out.println("Estoy en ClimatizacionController 2"); 
                   m_clima.nuevaFila(a,b,c,t4);
                   
                } catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(cli, "El año tiene que ser un campo numérico.");
                }

                plano.pd2.cocina[0].setText(t3);
               cli.re.text_ini[5].setText("");
               cli.re.text_fin[5].setText("");
               cli.re.text5.setText("");
              
             
            }

             

        }
    }





public class ElectroController implements ActionListener,ItemListener {
String t1, t2,t3 ;
 @Override
        public void itemStateChanged(ItemEvent e) {
           if ( e.getItem().equals("On") )
             {
                 System.out.println("on");
               /* view.o2.setVisible(false); view.depart_alarm.setVisible(false);view.tf3.setVisible(false);
              view.opc.setVisible(false);view.o.setVisible(false);view.tf2.setVisible(false);
               view.o_luz.setVisible(true); view.luces.setVisible(true);view.tf4.setVisible(false);
             */
             
            t2=electro.re.jr[0].getText();
              //pbc.Relleno.add(re);
              //pbc.Relleno.add(re);
             //pbc.Relleno.setVisible(true);
             
             }else t2=electro.re.fjr[0].getText();
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();

            if (cmd.equals("boton_1")) {
                System.out.println("Estoy en AlarmasController");
                
           
                t1=electro.re.text.getText();
               //if(electro.re.jr[0].getItemListeners().equals("On"))
               t2=electro.re.estadoalarma1.getText();
                 
               t3=electro.re.label2[0].getText();
               //t3=view.tf4.getBackground();
                int a = 0;
                Color b;
                //String b;
 //if(cmd.equals("On")) t3=view.tf4.getBackground();
                try {
                    a = Integer.valueOf(t1);
                   // b=Color.getColor(view.tf4.getBackground());
                    //b= Integer.parseInt(t2);
                  
                   m_electro.nuevaFila(t3,a,t2);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(alar, "El año tiene que ser un campo numérico.");
                }

                
               electro.re.text.setText("");
           
             
            } 
            
             if (cmd.equals("boton_2")) {
                System.out.println("Estoy en AlarmasController");
                
           
                t1=electro.re.text1.getText();
               //if(electro.re.jr[0].getItemListeners().equals("On"))
               t2=electro.re.estadoalarma2.getText();
                 
               t3=electro.re.label2[1].getText();
               //t3=view.tf4.getBackground();
                int a = 0;
                Color b;
                //String b;
 //if(cmd.equals("On")) t3=view.tf4.getBackground();
                try {
                    a = Integer.valueOf(t1);
                   // b=Color.getColor(view.tf4.getBackground());
                    //b= Integer.parseInt(t2);
                  
                   m_electro.nuevaFila(t3,a,t2);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(alar, "El año tiene que ser un campo numérico.");
                }

                
               electro.re.text.setText("");
           
             
            }
             
              if (cmd.equals("boton_3")) {
                System.out.println("Estoy en AlarmasController");
                
           
                t1=electro.re.text2.getText();
               //if(electro.re.jr[0].getItemListeners().equals("On"))
               t2=electro.re.estadoalarma3.getText();
                 
               t3=electro.re.label2[2].getText();
               //t3=view.tf4.getBackground();
                int a = 0;
                Color b;
                //String b;
 //if(cmd.equals("On")) t3=view.tf4.getBackground();
                try {
                    a = Integer.valueOf(t1);
                   // b=Color.getColor(view.tf4.getBackground());
                    //b= Integer.parseInt(t2);
                  
                   m_electro.nuevaFila(t3,a,t2);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(alar, "El año tiene que ser un campo numérico.");
                }

                
               electro.re.text.setText("");
           
             
            }
              
               if (cmd.equals("boton_4")) {
                System.out.println("Estoy en AlarmasController");
                
           
                t1=electro.re.text3.getText();
               //if(electro.re.jr[0].getItemListeners().equals("On"))
               t2=electro.re.estadoalarma4.getText();
                 
               t3=electro.re.label2[3].getText();
               //t3=view.tf4.getBackground();
                int a = 0;
                Color b;
                //String b;
 //if(cmd.equals("On")) t3=view.tf4.getBackground();
                try {
                    a = Integer.valueOf(t1);
                   // b=Color.getColor(view.tf4.getBackground());
                    //b= Integer.parseInt(t2);
                  
                   m_electro.nuevaFila(t3,a,t2);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(alar, "El año tiene que ser un campo numérico.");
                }

                
               electro.re.text.setText("");
           
             
            }
               
                if (cmd.equals("boton_5")) {
                System.out.println("Estoy en AlarmasController");
                
           
                t1=electro.re.text4.getText();
               //if(electro.re.jr[0].getItemListeners().equals("On"))
               t2=electro.re.estadoalarma5.getText();
                 
               t3=electro.re.label2[4].getText();
               //t3=view.tf4.getBackground();
                int a = 0;
                Color b;
                //String b;
 //if(cmd.equals("On")) t3=view.tf4.getBackground();
                try {
                    a = Integer.valueOf(t1);
                   // b=Color.getColor(view.tf4.getBackground());
                    //b= Integer.parseInt(t2);
                  
                   m_electro.nuevaFila(t3,a,t2);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(alar, "El año tiene que ser un campo numérico.");
                }

                
               electro.re.text.setText("");
           
             
            }
                
                 if (cmd.equals("boton_6")) {
                System.out.println("Estoy en AlarmasController");
                
           
                t1=electro.re.text5.getText();
               //if(electro.re.jr[0].getItemListeners().equals("On"))
               t2=electro.re.estadoalarma6.getText();
                 
               t3=electro.re.label2[5].getText();
               //t3=view.tf4.getBackground();
                int a = 0;
                Color b;
                //String b;
 //if(cmd.equals("On")) t3=view.tf4.getBackground();
                try {
                    a = Integer.valueOf(t1);
                   // b=Color.getColor(view.tf4.getBackground());
                    //b= Integer.parseInt(t2);
                  
                   m_electro.nuevaFila(t3,a,t2);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(alar, "El año tiene que ser un campo numérico.");
                }

                
               electro.re.text.setText("");
           
             
            }
        }

       
    }







 


public class AnadirLucesMouseView implements MouseListener{
String colores[]= {"rojo","verde"};
public Color color[]=new Color[2];
public MouseEvent e;

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Fila añadid");
            color[0]=Color.BLACK;
            color[1]=Color.yellow;
            if(e.getClickCount()==1){
                view.barra.luces.setBackground(Color.YELLOW);
            view.barra.luces.setOpaque(true);
            }else if(e.getClickCount()==2)
               view.barra.luces.setBackground(Color.RED);
        }
        
       

        @Override
        public void mousePressed(MouseEvent e) { }

        @Override
        public void mouseReleased(MouseEvent e) {   }      


        @Override
        public void mouseEntered(MouseEvent e) {}

        

        @Override
        public void mouseExited(MouseEvent e) {}
           
        
        
    }
public class BienvenidoController  implements ActionListener {
    @Override
        public void actionPerformed(ActionEvent e) {
           
     String command = e.getActionCommand(); 
     if ( command.equals("iniciar") ) {
                 System.out.println("Estoy en listener");
                // pbc.r;
              //   view.Relleno.
                 bienv.setVisible(false);
                view.setVisible(true);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                } else if ( command.equals("plano") ) {
                 System.out.println("Estoy en listener");
                // pbc.r;
                 plano.setVisible(true);
                 //plano.setSize(view.getSize());
                 plano.setLocation(300,100);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                }
}
}

/*public class ActionListenerView  implements ActionListener {
    @Override
        public void actionPerformed(ActionEvent e) {
            Point ejex=view.getLocation();
     String command = e.getActionCommand(); 
     if ( command.equals("atras") ) {
                 System.out.println("Estoy en listener");
                // pbc.r;
              //   view.Relleno.
                view.setVisible(true);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                } else if ( command.equals("plano") ) {
                 System.out.println("Estoy en listener");
                // pbc.r;
                 plano.setVisible(true);
                 //plano.setSize(view.getSize());
                 plano.setLocation(300,100);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                }
}
}*/
public class EstadosView  implements ActionListener {
   
    @Override
        public void actionPerformed(ActionEvent e) {
           
     String command = e.getActionCommand(); 
     if ( command.equals("Climatizacion") ) {
                 System.out.println("Estoy en listener");
                 //view.barra.h1.setVisible(true);/*
                // pbc.r;
               //  view.Relleno.setVisible(false);
                view.setVisible(true);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());*/
                /*  view.setVisible(false);
                comunica.setVisible(true);
                comunica.setLocation(view.getLocation());
                comunica.setSize(view.getSize());*/
                t_per.setVisible(false);t_cli.setVisible(true);t_comi.setVisible(false);
                t_con.setVisible(false);
                 t_electro.setVisible(false);t_al.setVisible(false);
                
                }else if ( command.equals("Electrodomesticos") ) {
                 System.out.println("Estoy en listener");
                // pbc.r;
                // view.Relleno.setVisible(false);
                view.setVisible(true);
                t_con.setVisible(false);t_cli.setVisible(false);t_comi.setVisible(false);
                t_con.setVisible(false);
                 t_electro.setVisible(true );t_al.setVisible(false);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                }  else if ( command.equals("Persiana") ) {
                 System.out.println("Estoy en listener");
                // pbc.r;
                // view.Relleno.setVisible(false);
                view.setVisible(true);
                t_per.setVisible(true);t_cli.setVisible(false);t_comi.setVisible(false);
               t_con.setVisible(false);
                 t_electro.setVisible(false);t_al.setVisible(false);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                } else if ( command.equals("alar") ){
                 System.out.println("Estoy en listener");
                // pbc.r;
                 //view.Relleno.setVisible(false);
                view.setVisible(true);
                t_per.setVisible(false);t_cli.setVisible(false);t_comi.setVisible(false);
                t_con.setVisible(false);
                t_al.setVisible(true);
                t_con.setVisible(false);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                } else if ( command.equals("Control") ){
                 System.out.println("Estoy en listener");
                // pbc.r;
                 //view.Relleno.setVisible(false);
                view.setVisible(true);
                t_per.setVisible(false);t_cli.setVisible(false);t_comi.setVisible(false);
                t_electro.setVisible(false);
                t_al.setVisible(false);
                t_con.setVisible(true);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                }else {
                 System.out.println("Estoy en listener");
                // pbc.r;
                 //view.Relleno.setVisible(false);
                view.setVisible(true);
                t_per.setVisible(false);t_cli.setVisible(false);t_comi.setVisible(true);
                t_con.setVisible(false);
                 t_electro.setVisible(false);t_al.setVisible(false);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                }
}
}
public class ActionListenerView  implements ActionListener {

        

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Estoy en listener");
     String command = e.getActionCommand();   
     
             if(command.equals("elec")){
            view.setVisible(false);
                electro.setVisible(true);
                electro.setLocation(view.getLocation());
                electro.setSize(view.getSize());
            
        }if(command.equals("comu")){
             System.out.println("se cambia a comunicaciones");
            view.setVisible(false);
                comi.setVisible(true);
                comi.setLocation(view.getLocation());
                //comi.setSize(view.getSize());
           
        } if(command.equals("con")){
            view.setVisible(false);
            control.setVisible(true);
            control.setLocation(view.getLocation());
            control.setSize(view.getSize());
            
        }  if ( command.equals("atras_comu") ) {
                comi.setVisible(false);
                view.setVisible(true);
                view.setLocation(comi.getLocation());
                view.setSize(comi.getSize());
                }
         if ( command.equals("atras_cli") ) {
               cli.setVisible(false);
                view.setVisible(true);
                view.setLocation(cli.getLocation());
                view.setSize(cli.getSize());
        }
         if ( command.equals("atras_alar") ) {
                alar.setVisible(false);
                System.out.println("se PULSO ATRAS alarmas");
                view.setVisible(true);
                view.setLocation(alar.getLocation());
                view.setSize(alar.getSize());
        }
         if ( command.equals("atras_control") ) {
                control.setVisible(false);
                view.setVisible(true);
                view.setLocation(control.getLocation());
                view.setSize(control.getSize());
        }
         if ( command.equals("atras_elec") ) {
                electro.setVisible(false);
                view.setVisible(true);
                view.setLocation(electro.getLocation());
                view.setSize(electro.getSize());
        }
         if ( command.equals("atras_per") ) {
              persi.setVisible(false);
                view.setVisible(true);
                view.setLocation(persi.getLocation());
                view.setSize(persi.getSize());
        }
         if (command.equals("alar")){
           System.out.println("se cambia a alarmas");
            view.setVisible(false);
            alar.setVisible(true);
            alar.setLocation(view.getLocation());
            alar.setSize(view.getSize());
            
            
        } if(command.equals("cli")){
                view.setVisible(false);
                cli.setVisible(true);
                cli.setLocation(view.getLocation());
                cli.setSize(view.getSize());
                
        } if(command.equals("per")){
             view.setVisible(false);
                persi.setVisible(true);
                persi.setLocation(view.getLocation());
                //persi.setSize(view.getSize());
            
        }
         if(command.equals("plano")){
                
                view.setVisible(false);
                plano.setVisible(true);
                plano.setLocation(alar.getLocation());
                plano.setSize(alar.getSize());
               
            
        }
         if ( command.equals("atras_plano") ) {
              plano.setVisible(false);
                view.setVisible(true);
                view.setLocation(plano.getLocation());
                view.setSize(plano.getSize());
         
         if ( command.equals("atras") ) {
                 System.out.println("Estoy en listener");
                // pbc.r;
              //   view.Relleno.
                view.setVisible(true);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                } 
         if ( command.equals("plano") ) {
                 System.out.println("Estoy en listener");
                // pbc.r;
                 plano.setVisible(true);
                 //plano.setSize(view.getSize());
                 plano.setLocation(300,100);
               // pbc.setLocation(pbc.getLocation());
               // pbc.setSize(pbc.getSize());
                
                }
}
        }
    
        }
}



