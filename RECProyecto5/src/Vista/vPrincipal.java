package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class vPrincipal extends JPanel {

	/**
	 * Create the panel.
	 */
	public vPrincipal() {
		setSize(430,300);
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
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(6, 112, 80, 16);
		panel.add(lblContrasea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(77, 67, 134, 27);
		panel.add(comboBox);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.setBounds(6, 166, 117, 29);
		panel.add(btnIniciarSesion);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(327, 166, 117, 29);
		panel.add(btnRegistrar);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(78, 106, 133, 28);
		panel.add(passwordField);
		

	}
}
