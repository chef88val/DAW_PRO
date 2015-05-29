package Model;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuariosModel {
	
	//Definimos la sentencia para extraer los nombres de usuarios
	private final static String USUARIO_SEL = "Select * from usuarios";
	private final static String USUARIO_COL= "nick";
	
	//Definimos los valores de la conexión
	private Connection conexion =null;
	private Statement sql =null;
	private ResultSet rs =null;
	
	//Definimos el ArrayList de usuarios
	private ArrayList<String> usuarios = null;
	
	public UsuariosModel()//Constructor de la clase
	{
		conexion=ConexionBD.getConexion();
		usuarios= new ArrayList<String>();
	}

	//Definimos el método para buscar los usuarios
	public ArrayList getUsuarios()
	{
		try{
			sql = this.conexion.createStatement();
			rs = sql.executeQuery(USUARIO_SEL);
			
			while(rs.next())
			{
				usuarios.add(rs.getString(USUARIO_COL));
			}
			return usuarios;
		}catch(SQLException excepcionSQL)
		{
			 excepcionSQL.printStackTrace();
			 return usuarios;
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
