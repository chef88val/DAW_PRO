import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncriptadorCesar {

	    public static void main(String[] args){
	        Cifrar c1 = new Cifrar();
	        Cifrar c2 = new Cifrar();
	        BufferedReader br = null;
			String sTexto = "";
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			try {
				
				  sTexto = br.readLine();
				  System.out.println(sTexto);
				
			} catch (IOException io){
				io.printStackTrace();
			}

	        System.out.println(sTexto+"=" + c2.descifrarMensaje(sTexto, 19));
	    }
	}