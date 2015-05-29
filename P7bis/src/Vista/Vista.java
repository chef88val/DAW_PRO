package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import Model.UsuariosModel;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JMenu;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private vPerfil vperfil;
	private vPrincipal vprincipal;
	private vJuegos vjuegos;
	
	private final JPanel ventanas = new JPanel();
	
	

	/**
	 * Create the frame.
	 */
	public Vista() {
		
		//Definimos las caracterisitcas de nuestro JFrame
		super("GamesDB");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Añadimos el menu
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		 JMenuItem menuPrincipal = new JMenuItem("Principal");
		menuBar.add(menuPrincipal);
		 JMenuItem menuJuegos = new JMenuItem("Juegos");
		menuBar.add(menuJuegos);
		 JMenuItem menuPerfil = new JMenuItem("Perfil");
		menuBar.add(menuPerfil);
		
		contentPane.add(ventanas, BorderLayout.CENTER);
		ventanas.setLayout(new CardLayout(0, 0));
		
		vprincipal=new vPrincipal(getHeight(),getWidth());
		vperfil =new vPerfil(getHeight(),getWidth());
		vjuegos=new vJuegos(getHeight(),getWidth());
		
		ventanas.add(vprincipal, "principal");
		ventanas.add(vperfil,"perfil");
		ventanas.add(vjuegos,"juegos");
		
		
		menuPrincipal.setSelected(true);
		menuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambio a principal");
				//ventanas.add(vperfil);
				CardLayout c= (CardLayout) ventanas.getLayout();
				c.show(ventanas, "principal");
				
			}
		});
		
		menuJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambio a juegos");
				//ventanas.add(vperfil);
				CardLayout c= (CardLayout) ventanas.getLayout();
				c.show(ventanas, "juegos");
				
				
			}
		});
		menuPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambio a perfil");
				
				//ventanas.add(vperfil);
				CardLayout c= (CardLayout) ventanas.getLayout();
				c.show(ventanas, "perfil");
				
			}
		});
	}
	public void showPrincipal()
	{
		CardLayout c= (CardLayout) ventanas.getLayout();
		c.show(ventanas, "principal");
	}
	
	public void showPrincipal(ArrayList<String> usuarios)
	{
		vprincipal.putUsuarios(usuarios);
	}
	
	public void showPerfil()
	{
		CardLayout c= (CardLayout) ventanas.getLayout();
		c.show(ventanas, "perfil");
		
	}
	
	public void showJuegos()
	{
		CardLayout c= (CardLayout) ventanas.getLayout();
		c.show(ventanas, "juegos");
	}
	
	
}
