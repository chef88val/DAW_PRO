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
import java.awt.CardLayout;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private vPerfil vperfil;
	private vPrincipal vprincipal;
	private vJuegos vjuegos;
	public JMenuItem menuPrincipal = new JMenuItem("Principal");
	public JMenuItem menuJuegos = new JMenuItem("Juegos");
	public JMenuItem menuPerfil = new JMenuItem("Perfil");
	private final JPanel ventanas = new JPanel();


	/**
	 * Create the frame.
	 */
	public Vista() {
		
		//Definimos las caracterisitcas de nuestro JFrame
		super("GamesDB");
		setResizable(true);
	
		setVisible(true);
		
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuPrincipal.setSelected(true);
		menuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambio a principal");
				
				contentPane.removeAll();
				contentPane.add(vprincipal);
				//contentPane.setBackground(Color.blue);
				contentPane.repaint();
				
			}
		});
		menuBar.add(menuPrincipal);
		
		contentPane.add(ventanas, BorderLayout.CENTER);
		ventanas.setLayout(new CardLayout(0, 0));
		
		vprincipal=new vPrincipal();
		ventanas.add(vprincipal, "name_21827529942569");
		
		vjuegos=new vJuegos();
		menuJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambio a juegos");
				contentPane.removeAll();
				contentPane.add(vjuegos);
				//contentPane.setBackground(Color.red);
				contentPane.repaint();
				
				
			}
		});
		menuBar.add(menuJuegos);
		
		//contentPane.add(vjuegos);
		vperfil =new vPerfil();
		menuPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambio a perfil");
				
				contentPane.removeAll();
				contentPane.add(vperfil);
				//contentPane.setBackground(Color.green);
				contentPane.repaint();
			}
		});
		menuBar.add(menuPerfil);
		//contentPane.add(vperfil);
	}
	
}
