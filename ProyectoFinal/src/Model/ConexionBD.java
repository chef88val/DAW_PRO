package Model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class ConexionBD {
	// DATOS DE LA CONEXION
	static final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
	
	//DATOS DE LA BBDD
	private String host;
	private String bbdd;
	private String user;
	private String pass;
	private String url;
	//DATOS POR DEFECTO
		private static final String HOST="localhost";
		private static final String BBDD="RestDB";
		private static final String USER="root";
		private static final String PASS="root";
	
	//Conexión
	private static Connection conexion = null;// maneja la conexión
	
	//Instancia unica
	private static ConexionBD instance = null;
	
	public ConexionBD(String HOST,String BBDD,String USER,String PASS) {
		this.host=HOST;
		this.bbdd=BBDD;
		this.user=USER;
		this.pass=PASS;
		this.url="jdbc:mysql://"+this.host+"/"+this.bbdd;
		System.out.println("1");
	}
	//Implementar SingleTon
		public static ConexionBD getInstance(String HOST,String BBDD,String USER,String PASS) {
		      if(instance == null) {
		         instance = new ConexionBD(HOST,BBDD,USER,PASS);
		      }
		      return instance;
		   }
		
		public static ConexionBD getInstance() {
		      if(instance == null) {
		         instance = new ConexionBD(ConexionBD.HOST,ConexionBD.BBDD,ConexionBD.USER,ConexionBD.PASS);
		      }
		      return instance;
		  }
	public boolean connectDB(){
		System.out.println("2");
		try{
			System.out.println("3");
			//Lo primero es cargar el controlador MySQL el cual automáticamente se registra
			Class.forName(CONTROLADOR_MYSQL);
			System.out.println("4");
			//Conectarnos a la BBDD
			conexion = DriverManager.getConnection(this.url,this.user,this.pass);
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return false;
		}
		catch( ClassNotFoundException noEncontroClase)
		{
			noEncontroClase.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static Connection getConexion()
	{
		return conexion;
		
	}

}

