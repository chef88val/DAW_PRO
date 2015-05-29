/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Tablas.*;

import Tablas.TablaElectro;
import Tablas.TablaCli;

import View.Alarmas;
import View.Climatizacion;
import View.Comunicaciones;
import View.Control;
import View.Electrodomesticos;
import View.*;
import View.Persianas;
import Controller.Controller;
import Model.*;
//import pruebacombox.model.Model_Alar;

import View.Plano;

import View.View;



/**
 *
 * @author Usuario
 */
public class Domotica {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PruebaComboBox pbx=new Domotica();
     
        
       
        View viw=new View();
        Climatizacion cli=new Climatizacion();
        Alarmas alarmas=new Alarmas();
        Luces luces=new Luces();
        Persianas persianas=new Persianas();
        Electrodomesticos electro=new Electrodomesticos();
        Control control=new Control();
        Comunicaciones comunicaciones=new Comunicaciones();
        
        Plano plano=new Plano();
        Bienvenido bienv=new Bienvenido();
        
        Model_Alar m_alar=new Model_Alar();Model_Control m_con=new Model_Control();
        
        Model_Clima m_cli=new Model_Clima();
        Model_Per m_per=new Model_Per();
        Model_Comi m_comi=new Model_Comi();Model_Electro m_electro=new Model_Electro();
        
         
        TablaPer t_per=new TablaPer(m_per);
        
        TablaCli t_cli=new TablaCli(m_cli);
        
        TablaElectro t_electro=new TablaElectro(m_electro);
        TablaCOmi t_comi=new TablaCOmi(m_comi);
        TablaAlar t_alar=new TablaAlar(m_alar);
        TablaControl t_control=new TablaControl(m_con);
        
        
        Controller c=new Controller(
                viw,
                cli,
                alarmas,luces,persianas,
                electro,control,comunicaciones,plano,
                t_electro,t_per,t_cli,t_comi,t_alar,t_control,m_con,m_alar,
                m_per,m_cli,m_comi,m_electro,bienv);
       
       
        
        // TODO code application logic here
    }
 
}
