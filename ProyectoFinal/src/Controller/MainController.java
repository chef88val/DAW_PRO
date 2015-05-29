package Controller;

import java.awt.CardLayout;
import java.util.ArrayList;

import Model.ConexionBD;
import Model.Trabajador;
import Model.personalModel;
import Model.user;
import Vista.Vista;
import Vista.vLogin;
import Vista.vPersonal;


public class MainController {
	
	//Instancia unica
	private static MainController instance = null;
	//Atributos de bases de datos
	ConexionBD gamesDB;
	
	//VentanaPrincipal
	private Vista vMain;
	private vPersonal vpersonal;
	private vLogin vlogin;
	private Autenticar auth;
	
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
		vlogin=new vLogin();
		auth=new Autenticar();
		this.showLogin();
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
	public void showLogin()
	{
		vlogin.setVisible(true);
		ArrayList<user> jefe=personalM.getJefe();
		System.out.println("jefe"+jefe);
		vlogin.putUsuarios(jefe);
	
	}
	
	//Lanzar Inicio
	public void showPrincipal(){
		vMain.showPrincipal();
	}
	
	public void showPersonal(){
		
		vMain.showPersonal();
		empleados=personalM.getPersonal();
		vMain.putPersonal(empleados);
		System.out.println("xxx"+personalM.getPersonal());
		
		
		
	}
	
	public void showStock(){
		vMain.showStock();
	}
	
	public void showContabilidad(){
		vMain.showContabilidad();
	}
	
	
	public void newPersonal(Trabajador insert)
	{
		System.out.println("newPersonal");
		personalM.setPersonal(insert);
	}
	public void updatePersonal(Trabajador update)
	{
		System.out.println("updatePersonal");
		personalM.updatePersonal(update);
	}
	
	public void botonesStock()
	{
		
	}
	
	public void botonesContabilidad()
	{
		
	}
	
	public void lograr(String passTxt)
	{
		System.out.println("PSS"+passTxt);
		boolean userOK= this.auth.comprobarUser(passTxt);
		System.out.println("userOK"+userOK);
		if(userOK==true)
		{
		showMain();
		}else{System.out.println("error logeando");}
		//this.showMain();
	}
}
