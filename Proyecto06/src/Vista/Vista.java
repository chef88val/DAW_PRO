package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import Model.UsuariosModel;

import java.awt.Color;
import java.awt.SystemColor;
import java.util.Iterator;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	UsuariosModel usuarios ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPerfil = new JButton("Perfil >");
		btnPerfil.setBounds(393, 67, 117, 29);
		contentPane.add(btnPerfil);
		
		JButton btnJuegos = new JButton("Juegos >");
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJuegos.setBounds(393, 26, 117, 29);
		contentPane.add(btnJuegos);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(62, 160, 113, 27);
		contentPane.add(comboBox);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(62, 132, 61, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblPass = new JLabel("Contraseña");
		lblPass.setBounds(62, 199, 113, 16);
		contentPane.add(lblPass);
		
		passwordField = new JPasswordField();
		passwordField.setEnabled(false);
		passwordField.setBounds(62, 227, 113, 28);
		contentPane.add(passwordField);
		
		JButton btnInicioSesion = new JButton("Inicio sesion");
		btnInicioSesion.setEnabled(false);
		btnInicioSesion.setBounds(58, 267, 117, 29);
		contentPane.add(btnInicioSesion);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setEnabled(false);
		btnRegistro.setBounds(58, 308, 117, 29);
		contentPane.add(btnRegistro);
		
		JLabel lblAvatar = new JLabel("");
		lblAvatar.setEnabled(false);
		lblAvatar.setBackground(Color.red);
		lblAvatar.setBounds(58, 6, 117, 129);
		contentPane.add(lblAvatar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(58, 6, 117, 114);
		contentPane.add(panel);
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu1 = new JMenu("Principal");
		menuBar.add(menu1);
		
		JMenuItem menu1_item1 = new JMenuItem("Principal");
		menu1.add(menu1_item1);
		
		JMenu menu2 = new JMenu("Juegos");
		menuBar.add(menu2);
		
		JMenuItem menu2_item1 = new JMenuItem("Juegos");
		menu2.add(menu2_item1);
		JMenu menu3 = new JMenu("Perfil");
		JMenuItem menu3_item1 = new JMenuItem("Perfil");
		menu3.add(menu3_item1);
		menuBar.add(menu3);
		setJMenuBar(menuBar);
		
		//Creamos el objeto de tipo UsuariosModel
		 usuarios = new UsuariosModel();
		
		Iterator<String> it= usuarios.getUsuarios().iterator();
		
		while(it.hasNext())
		{
			comboBox.addItem((String)it.next());
		}//Fin del While que recorre toda la lista de filas devueltas
	}
}
