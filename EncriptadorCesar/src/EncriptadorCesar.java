import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JLabel;

public class EncriptadorCesar {

	    public static void main(String[] args) throws IOException{
	        Cifrar c1 = new Cifrar();
	        Cifrar c2 = new Cifrar();
	        BufferedReader br = null;
			String sTexto = null;
			Panel panel= new Panel();
			
			panel.setVisible(true);
			
			
			
				//sTexto=br.readLine();
			
				 sTexto = panel.getText();
				 sTexto.replace("", "");
				  System.out.println(sTexto);
			//panel.setText(c2.descifrarMensaje(sTexto, 19));

	       
	    }
	}