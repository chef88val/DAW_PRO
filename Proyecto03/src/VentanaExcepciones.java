
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.JComboBox;


public class VentanaExcepciones extends JFrame {

	private JPanel contentPane;
	private JTextField txtEuros;
	private JTextField txtDolar;
	private JTextField txt_mensaje;
	private JComboBox selectorMoneda;

	/**
	 * Create the frame.
	 */
	public VentanaExcepciones (final float valorConversion)  {
		
		//Definicion de la ventana
		
		setTitle("Proyecto02_Javier Segarra Martinez");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		//Definicion Euros
		
		txtEuros = new JTextField();
		txtEuros.setBounds(6, 109, 134, 28);
		contentPane.add(txtEuros);
		txtEuros.setColumns(10);
		
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setBounds(40, 81, 35, 16);
		contentPane.add(lblEuros);
		
		
		//Definicion Dolar
		
		txtDolar = new JTextField();
		txtDolar.setBounds(299, 109, 134, 28);
		contentPane.add(txtDolar);
		txtDolar.setColumns(10);		
		
		JLabel lblDolares = new JLabel("Dolares");
		lblDolares.setBounds(333, 81, 48, 16);
		contentPane.add(lblDolares);
		
		//Definicion accion boton
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {//INICIO ActionListener
			public void actionPerformed(ActionEvent arg0) {		//INICIO ActionEvent
				
				
				//Inicio excepcion
				
				try{
				float euros;
				euros=Float.parseFloat(txtEuros.getText());
				
			
				
				//Inicio condicion
				
					if(euros>=0 && euros <=500){
					
					txtDolar.setText(String.valueOf(euros*valorConversion));
					txt_mensaje.setText("Numeros correctos");
					txt_mensaje.setForeground(Color.GREEN);					
					
					}else{
					txt_mensaje.setText("Numeros incorrectos");
					txt_mensaje.setForeground(Color.RED);
				
					}//Fin condicion
					
				}catch(Exception e){
				txt_mensaje.setText("Numeros incorrectos");
				txt_mensaje.setForeground(Color.RED);
				}//Fin excepcion
				
			}//FIN ActionEvent
			
		});//FIN ActionListener
		
		btnNewButton.setBounds(163, 166, 117, 29);
		contentPane.add(btnNewButton);
		
		
		//Definicion informacion 
		
		JLabel lbl_info = new JLabel("Introduce un número entre 0-500 ");
		lbl_info.setBounds(14, 23, 300, 16);
		contentPane.add(lbl_info);
		
		
		//Definicion mensaje de control
		
		txt_mensaje = new JTextField();
		
		txt_mensaje.setEditable(false);
		
		txt_mensaje.setBounds(21, 224, 259, 20);
		contentPane.add(txt_mensaje);
		txt_mensaje.setColumns(10);
		
		//Definicion de la etiqueta del cuadro de texto donde aparecerá el mensaje
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setBounds(21, 199, 46, 14);
		contentPane.add(lblMensaje);
		
		//Definicion del JComboBox
		
		 selectorMoneda = new JComboBox();
		 selectorMoneda.setSelectedIndex(-1);
		selectorMoneda.setEditable(true);
		selectorMoneda.setBounds(163, 111, 117, 27);
		contentPane.add(selectorMoneda);
		
		//Inclusion de los elementos o items del JComboBox
		
		String monedas[]={"Seleccione...","Libras","Dolares","Euros","Yen"};
		//INICIO FOR
		for(int i=0;i<monedas.length;i++)
		{
			selectorMoneda.addItem(monedas[i]);
		
		}//FIN FOR
		
		//Item Listener del JCombobox
		
		selectorMoneda.addItemListener(new ItemListener() {//INICIO ItemListener
			public void itemStateChanged(ItemEvent arg0) {//INICIO ItemEvent
				switch((String)selectorMoneda.getSelectedItem())
				{//INICIO Switch
				case"Libras":
					txt_mensaje.setText("Es la moneda de UK ");
					break;
				case "Dolares":
					txt_mensaje.setText("Es la moneda de EEUU ");
					break;
				case "Euros":
					txt_mensaje.setText("Es la moneda de Europa");
					break;
				case "Yen":
					txt_mensaje.setText("Es la moneda de China");
					break;
				
				default:
					txt_mensaje.setText("Es una moneda antigua");
						break;
				}//FIN Switch
				
			}//FIN ItemEvent
			
		});//FIN ItemListener

		
		
		
	}//FIN VentanaExcepcion
}//FIN Clase
