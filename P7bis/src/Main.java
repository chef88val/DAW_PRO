import Controller.MainController;
import Model.ConexionBD;
import Vista.Vista;


public class Main {

	public static void main(String[] args) {
		/*
		//Incluyendo la conexion a la BD
		ConexionBD gameBD;
		
		//Incluyendo el objeto
		gameBD= new ConexionBD("localhost", "GamesDB", "root", "root");
		if(gameBD.connectDB()==true) System.out.println("OK");
		else System.out.println("FAIL");
		
		// Incluyendo las clases pertenecientes a la Vista
		Vista vista= new Vista();
		vista.setVisible(true);*/
		MainController controlador = MainController.getInstance();
		
	}

}
