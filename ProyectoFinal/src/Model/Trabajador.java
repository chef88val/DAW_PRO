package Model;

public class Trabajador {
	private String nombre="",apellidos="",cargo="",sueldo="";
	
	
	public Trabajador(String a,String b,String c,String d) {
		// TODO Auto-generated constructor stub
		this.nombre=a;	this.apellidos=b;	this.cargo=c;	this.sueldo=d;
	}

	public void setNombre(String Nombre){ this.nombre=Nombre;System.out.println("xxx"+nombre);}
	public String getNombre(){return this.nombre;}
	
	public void setApellidos(String Apellidos){ this.apellidos=Apellidos;}
	public String getApellidos(){return this.apellidos;}
	
	public void setCargo(String Cargo){ this.cargo=Cargo;}
	public String getCargo(){return this.cargo;}
	
	public void setSueldo(String Sueldo){ this.sueldo=Sueldo;}
	public String getSueldo(){return this.sueldo;}

}
