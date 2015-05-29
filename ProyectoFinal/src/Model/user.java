package Model;

public class user {
	private String pass;
	private String nombre;
	
	public user(){
		
	}
	public user(String Nombre,String Pass){
		this.nombre=Nombre;
		this.pass=Pass;
	}
	
	public String getPass(){return this.pass;}
	public String getNombre(){return this.nombre;}

}
