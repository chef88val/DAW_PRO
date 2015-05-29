package Controller;

import java.awt.CardLayout;
import java.util.ArrayList;

import Model.ConexionBD;
import Model.UsuariosModel;
import Model.user;
import Vista.Vista;


public class MainController {
	
	//Instancia unica
	private static MainController instance = null;
	//Atributos de bases de datos
	ConexionBD gamesDB;
	
	//VentanaPrincipal
	private Vista vMain;
	
	//Autenticador
	private Autenticar auth;
	private user usuarioRegistrado=null;

	private MainController() {
		//Creamos la conexion con la base de datos
		gamesDB=ConexionBD.getInstance("localhost","GamesDB","root","root");
		if(gamesDB.connectDB()==true) {
			System.out.println("CONECTADOS CON EXITO");
		}else{
			System.out.println("ERROR EN LA CONEXION");
		}
		//Creamos el objeto de autenticacion
		auth=new Autenticar();
		
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
		//Consultamos los usuarios
		UsuariosModel uModel=new UsuariosModel();
		ArrayList<String> usuarios=uModel.getUsuarios();
		//Lanzamos la ventana principal
		vMain = new Vista();
		//Cargamos datos de Usuarios
		vMain.showPrincipal(usuarios);
		//Hacemos visible la pantalla inicial
		vMain.setVisible(true);	
	}
	
	//Lanzar corredores
	public void showCorredores(){
		if(usuarioRegistrado==null){
			System.out.println("No se ha iniciado con usuario");
		}else{
			vMain.showPerfil();
		}
	}
	
	//Lanzar Inicio
	public void showInicio(){
		vMain.showPrincipal();
	}
	
	//Comprobar usuarios
	public void checkUser(String usuario,char[] pass){
		//Aquí comprobaríamos el usuario
		usuarioRegistrado=new user();
		vMain.showPerfil();
	}
}
