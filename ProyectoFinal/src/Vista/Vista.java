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

import Model.Trabajador;
import Model.personalModel;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JMenu;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private vPersonal vpersonal;
	private vPrincipal vprincipal;
	private vStock vstock;
	private vContabilidad vcontabilidad;
	
	private final JPanel ventanas = new JPanel();
	private JMenuItem menuPrincipal;
	
	

	/**
	 * Create the frame.
	 */
	public Vista() {
		
		//Definimos las caracterisitcas de nuestro JFrame
		super("Gestion Restauracion");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Añadimos el menu
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		 
		 menuPrincipal = new JMenuItem("Inicio");
		
		 menuPrincipal.setSelected(true);
		 menuBar.add(menuPrincipal);
		 JMenuItem menuPersonal = new JMenuItem("Personal");
		menuBar.add(menuPersonal);
		 JMenuItem menuStock = new JMenuItem("Stock");
		menuBar.add(menuStock);
		 JMenuItem menuContabilidad = new JMenuItem("Contabilidad");
		menuBar.add(menuContabilidad);
		
		contentPane.add(ventanas, BorderLayout.CENTER);
		ventanas.setLayout(new CardLayout(0, 0));
		
		vprincipal=new vPrincipal();
		vpersonal =new vPersonal();
		vstock=new vStock();
		vcontabilidad = new vContabilidad();
		
		ventanas.add(vprincipal, "principal");
		ventanas.add(vpersonal,"personal");
		ventanas.add(vstock,"stock");
		ventanas.add(vcontabilidad,"contabilidad");
	
		 menuPrincipal.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		CardLayout c= (CardLayout) ventanas.getLayout();
					c.show(ventanas, "principal");
			 	}
			 });
		
		menuPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambio a personal");
				//ventanas.add(vperfil);
				CardLayout c= (CardLayout) ventanas.getLayout();
				c.show(ventanas, "personal");
				
			}
		});
		
		menuStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambio a stock");
				//ventanas.add(vperfil);
				CardLayout c= (CardLayout) ventanas.getLayout();
				c.show(ventanas, "stock");
				
				
			}
		});
		menuContabilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambio a contabilidad");
				
				//ventanas.add(vperfil);
				CardLayout c= (CardLayout) ventanas.getLayout();
				c.show(ventanas, "contabilidad");
				
			}
		});
	}
	public void showPrincipal()
	{
		CardLayout c= (CardLayout) ventanas.getLayout();
		c.show(ventanas, "principal");
		
	}
	
	/*public void showPrincipal(ArrayList<String> usuarios)
	{
		vprincipal.putUsuarios(usuarios);
	}
	*/
	public void showPersonal()
	{
		CardLayout c= (CardLayout) ventanas.getLayout();
		c.show(ventanas, "personal");
		
		
	}
	
	public void showStock()
	{
		CardLayout c= (CardLayout) ventanas.getLayout();
		c.show(ventanas, "stock");
	}
	
	public void showContabilidad()
	{
		CardLayout c= (CardLayout) ventanas.getLayout();
		c.show(ventanas, "contabilidad");
	}
	
	public void putPersonal(ArrayList trabajador)
	{
		vpersonal.putPersonal(trabajador); 
	}
	
}
