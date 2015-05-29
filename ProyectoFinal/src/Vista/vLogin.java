package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import Controller.MainController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Model.user;

public class vLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	public JComboBox comboUser;
	public boolean user =false;
	public String userpass="jefe";
	private JButton button;
	


	/**
	 * Create the frame.
	 */
	public vLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 154);
		getContentPane().setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JLabel label_1 = new JLabel("Usuario");
		label_1.setBounds(6, 51, 61, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Contraseña");
		label_2.setBounds(6, 92, 80, 16);
		panel.add(label_2);

		 comboUser = new JComboBox();
		comboUser.setBounds(86, 47, 134, 27);
		panel.add(comboUser);

		passwordField = new JPasswordField();
		passwordField.setBounds(87, 86, 133, 28);
		panel.add(passwordField);
		
		
		 button = new JButton("Iniciar sesion");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainController .getInstance().lograr(passwordField.getText());
				
			}
		});
		button.setBounds(291, 51, 117, 29);
		panel.add(button);
		
	}

	//A�adir Usuarios
		public void putUsuarios(ArrayList<user> jefe){
			
			comboUser.removeAllItems();
		    for(user s:jefe){
		    	comboUser.addItem(s.getNombre());
		    }
		    this.repaint();
		}
		public String getContentPass()
		{
			
			return passwordField.getText();

		}
	
}
