package Model;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class personalModel {
	
	//Definimos la sentencia de inserción de datos
	 
	private final static String PERSONAL_COL_ID="idempleado";
	private final static String PERSONAL_COL_Nombre="Nombre";
	private final static String PERSONAL_COL_Apellidos="Apellidos";
	private final static String PERSONAL_COL_Cargo="Cargo";
	private final static String PERSONAL_COL_Sueldo="Sueldo";
	private final static String JEFE_COL_NOMBRE="Nombre";
	private final static String JEFE_COL_Pass="password";
	
	//Definimos la sentencia de consulta para el JList
	private final static String PERSONAL_SELECT="select * from empleado";
	private final static String JEFE_SELECT="select * from jefes";
	
	//Definimos los valores de la conexión
	private Connection conexion ;
	private Statement sql =null;
	private ResultSet rs =null;
	
	//Definimos el Array List de personal
	private ArrayList<Trabajador> personal = null;
	private ArrayList<user> listjefe = null;
	
	//Definimos los valores que devuelve la pantalla
	private String nombre,apellidos,cargo,sueldo;
	
	private final static String personal_update="update empleado set "+PERSONAL_COL_Nombre+"=?,"+PERSONAL_COL_Apellidos+"=?,"+PERSONAL_COL_Cargo+"=?,"+PERSONAL_COL_Sueldo+"=? "
			+ "where idempleado"+"=?";
	private final static String personal_insert="insert into empleado (Nombre, Apellidos, Cargo, Sueldo)"+ "values (?, ?, ?, ?)";
	
	public personalModel()
	{
		/*this.nombre="";
		this.apellidos="";
		this.cargo="";
		this.sueldo="";*/
		conexion = ConexionBD.getConexion();
		personal = new ArrayList<Trabajador>();
		listjefe = new ArrayList<user>();
	}
	
	//public ArrayList setPersonal(String a,String b,String c,String d)
	public ArrayList setPersonal(Trabajador trabajador)
	{
	
		try
	    {
			System.out.println("Nombre:"+nombre+"/Apellido:"+apellidos+"/Cargo:"+cargo+"/Sueldo:"+sueldo);
			
	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = (PreparedStatement) conexion.prepareStatement(personal_insert);
	      preparedStmt.setString (1, trabajador.getNombre());
	      preparedStmt.setString (2,  trabajador.getApellidos());
	      preparedStmt.setString (3,  trabajador.getCargo());
	      preparedStmt.setString (4,  trabajador.getSueldo());
	     
	 
	      // execute the preparedstatement
	      preparedStmt.execute();
	       System.out.println("Se añade correctamente");
	      //conexion.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
		return personal;
		
	}

	public ArrayList updatePersonal(Trabajador trabajador)
	{
	
		try
	    {
			System.out.println("Nombre:"+nombre+"/Apellido:"+apellidos+"/Cargo:"+cargo+"/Sueldo:"+sueldo);
			
	      // create the mysql insert preparedstatement
	      PreparedStatement updateStament =  (PreparedStatement) this.conexion.prepareStatement(personal_update);
	      updateStament.setString (1, trabajador.getNombre());
	      updateStament.setString (2,  trabajador.getApellidos());
	      updateStament.setString (3,  trabajador.getCargo());
	      updateStament.setString (4,  trabajador.getSueldo());
	      updateStament.setInt (5, trabajador.getID());
	     
	 
	      // execute the preparedstatement
	      updateStament.executeUpdate();
	       System.out.println("Se añade correctamente");
	      //conexion.close();
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
						 rs.getInt(PERSONAL_COL_ID),
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
	public ArrayList getJefe()
	{
		try{
			sql = this.conexion.createStatement();
			rs = sql.executeQuery(JEFE_SELECT);
			
			while(rs.next())
			{
				user jefe=new user(
						rs.getString(JEFE_COL_NOMBRE),rs.getString(JEFE_COL_Pass)
						);
				listjefe.add(jefe);
			}
			
			System.out.println("jefepm"+listjefe);
			return listjefe;
		}catch(SQLException excepcionSQL)
		{
			 excepcionSQL.printStackTrace();
			 return listjefe;
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
