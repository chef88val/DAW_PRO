package Model;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class personalModel {
	
	//Definimos la sentencia de inserción de datos
	 
	private final static String PERSONAL_COL_Nombre="Nombre";
	private final static String PERSONAL_COL_Apellidos="Apellidos";
	private final static String PERSONAL_COL_Cargo="Cargo";
	private final static String PERSONAL_COL_Sueldo="Sueldo";
	
	//Definimos la sentencia de consulta para el JList
	private final static String PERSONAL_SELECT="select * from empleado";
	
	//Definimos los valores de la conexión
	private Connection conexion ;
	private Statement sql =null;
	private ResultSet rs =null;
	
	//Definimos el Array List de personal
	private ArrayList<Trabajador> personal = null;
	
	//Definimos los valores que devuelve la pantalla
	private String nombre,apellidos,cargo,sueldo;
	
	public personalModel()
	{
		/*this.nombre="";
		this.apellidos="";
		this.cargo="";
		this.sueldo="";*/
		conexion = ConexionBD.getConexion();
		personal = new ArrayList<Trabajador>();
	}
	
	public ArrayList setPersonal(String a,String b,String c,String d)
	{
	nombre=a;	apellidos=b;	cargo=c;	sueldo=d;
		try
	    {
			System.out.println("Nombre:"+nombre+"/Apellido:"+apellidos+"/Cargo:"+cargo+"/Sueldo:"+sueldo);
			String personal_insert="insert into empleado (Nombre, Apellidos, Cargo, Sueldo)"+ "values (?, ?, ?, ?)";
	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = (PreparedStatement) conexion.prepareStatement(personal_insert);
	      preparedStmt.setString (1, nombre);
	      preparedStmt.setString (2, apellidos);
	      preparedStmt.setString (3, cargo);
	      preparedStmt.setString (4, sueldo);
	     
	 
	      // execute the preparedstatement
	      preparedStmt.execute();
	       System.out.println("Se añade correctamente");
	      conexion.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
		return personal;
		
	}
	
	public ArrayList getPersonal()
	{
		try{
			sql = this.conexion.createStatement();
			rs = sql.executeQuery(PERSONAL_SELECT);
			
			while(rs.next())
			{
				 Trabajador trabajador =new Trabajador(
						 rs.getString(PERSONAL_COL_Nombre),
						 rs.getString(PERSONAL_COL_Apellidos),
						 rs.getString(PERSONAL_COL_Cargo),
						 rs.getString(PERSONAL_COL_Sueldo)
												 
						 );
				personal.add(trabajador);
				System.out.println("Se genera la consulta");
			}
			
			return personal;
		}catch(SQLException excepcionSQL)
		{
			 excepcionSQL.printStackTrace();
			 return personal;
		}finally
		{
			try{
				rs.close();
				sql.close();
			}catch(SQLException excepcionSQL)
			{
				excepcionSQL.printStackTrace();
			}
		}
	}

}
