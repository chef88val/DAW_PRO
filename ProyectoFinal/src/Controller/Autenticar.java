package Controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import Model.personalModel;
import Model.user;

public class Autenticar {
	private boolean isAuth=false;
	private personalModel personalM;
	private ArrayList<user> jefe;
	

	public Autenticar() {
		personalM=new personalModel();
		jefe=new ArrayList<user>();
	}
	public boolean estaLogado()
	{
		System.out.println("auth1"+isAuth);
		return this.isAuth;
	}
	
	public boolean comprobarUser(String pass)
	{
		/*if(jefe.getPass()==pass)
		this.isAuth=true;
		else this.isAuth=false;*/
		
		
		ArrayList<user> jefe=personalM.getJefe();
		System.out.println("aut2"+jefe.get(0));
		 for(user s:jefe){
		    	s.getPass();
		   
		if(pass.equals(s.getPass())) {System.out.println("authif"+pass);isAuth=true;}
		else{ System.out.println("authelse"+pass);isAuth=false;}
		 }
		 return this.isAuth; 
	}
	
	//Método privado para la conversión tras el uso de MD5 
	private static String convertToHex(byte[] data) { 
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) { 
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do { 
                if ((0 <= halfbyte) && (halfbyte <= 9)) 
                    buf.append((char) ('0' + halfbyte));
                else 
                    buf.append((char) ('a' + (halfbyte - 10)));
                halfbyte = data[i] & 0x0F;
            } while(two_halfs++ < 1);
        } 
        return buf.toString();
    } 
	
	//Metodo estático para la comprobación del MD5
    public String MD5(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException  { 
        MessageDigest md;
        md = MessageDigest.getInstance("MD5");
        byte[] md5hash = new byte[32];
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        md5hash = md.digest();
        return convertToHex(md5hash);
    } 
    
   
}
