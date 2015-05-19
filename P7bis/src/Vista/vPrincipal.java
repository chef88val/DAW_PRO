package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Model.UsuariosModel;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;

public class vPrincipal extends JPanel {
	
	public JComboBox comboUser;
	UsuariosModel usuarios ;
	/**
	 * Create the panel.
	 */
	public vPrincipal(int X, int Y) {
		setSize(X,Y);
		setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		panel.setLayout(null);
		add(panel);
		
		JLabel lblAvatar = new JLabel();
		lblAvatar.setVerticalAlignment(SwingConstants.TOP);
		lblAvatar.setBounds(292, 6, 152, 107);
		lblAvatar.setBackground(Color.red);
		panel.add(lblAvatar);
		lblAvatar.setBackground(new Color(127, 255, 0));
		
	
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(6, 71, 61, 16);
		panel.add(lblUsuario);
		
		JLabel lblPass = new JLabel("Contraseña");
		lblPass.setBounds(6, 112, 80, 16);
		panel.add(lblPass);
		
		 comboUser = new JComboBox();
		comboUser.setBounds(77, 67, 134, 27);
		panel.add(comboUser);
		
		JButton btnLogin = new JButton("Iniciar sesion");
		btnLogin.setBounds(6, 166, 117, 29);
		panel.add(btnLogin);
		
		JButton btnReg = new JButton("Registrar");
		btnReg.setBounds(327, 166, 117, 29);
		panel.add(btnReg);
		
		JPasswordField txtPass = new JPasswordField();
		txtPass.setBounds(78, 106, 133, 28);
		panel.add(txtPass);
		

		//Creamos el objeto de tipo UsuariosModel
		 usuarios = new UsuariosModel();
		
		Iterator<String> it= usuarios.getUsuarios().iterator();
		while(it.hasNext())
		{
			comboUser.addItem((String)it.next());
		}//Fin del While que recorre toda la lista de filas devueltas
	}
	
	//A�adir Usuarios
		public void putUsuarios(ArrayList<String> usuarios){
			comboUser.removeAllItems();
		    for(String s:usuarios){
		    	comboUser.addItem(s);
		    }
		    this.repaint();
		}
}
