package Controller;

import java.awt.CardLayout;
import java.util.ArrayList;

import Model.ConexionBD;
import Model.Trabajador;
import Model.personalModel;
import Model.user;
import Vista.Vista;
import Vista.vPersonal;


public class MainController {
	
	//Instancia unica
	private static MainController instance = null;
	//Atributos de bases de datos
	ConexionBD gamesDB;
	
	//VentanaPrincipal
	private Vista vMain;
	private vPersonal vpersonal;
	
	private personalModel personalM;
	private ArrayList<Trabajador> empleados;

	private MainController() {
		//Creamos la conexion con la base de datos
		gamesDB=ConexionBD.getInstance("localhost","RestDB","root","root");
		if(gamesDB.connectDB()==true) {
			System.out.println("CONECTADOS CON EXITO");
		}else{
			System.out.println("ERROR EN LA CONEXION");
		}
		personalM= new personalModel();
		vpersonal=new vPersonal();
		empleados=new ArrayList<Trabajador>();
		this.showMain();
	}
	
	
	//Implementar SingleTon
	public static MainController getInstance() {
	      if(instance == null) {
	         instance = new MainController();
	      }
	      return instance;
	}
	
	//Lanzar vista Inicial
	public void showMain(){
		//Lanzamos la ventana principal
		vMain = new Vista();		
		vMain.setVisible(true);	
	}
	
	//Lanzar Inicio
	public void showPrincipal(){
		vMain.showPrincipal();
	}
	
	public void showPersonal(){
		
		vMain.showPersonal();
		empleados=personalM.getPersonal();
		vpersonal.putPersonal(empleados);
		System.out.println("xxx"+personalM.getPersonal());
		
		
		
	}
	
	public void showStock(){
		vMain.showStock();
	}
	
	public void showContabilidad(){
		vMain.showContabilidad();
	}
	
	
	public void botonesPersonal()
	{
		
		
	}
	
	public void botonesStock()
	{
		
	}
	
	public void botonesContabilidad()
	{
		
	}
}
