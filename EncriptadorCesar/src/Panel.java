import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Panel extends JFrame {

	private JPanel contentPane;
	private JTextField txtFin;
	private JLabel lblTextoCodificado;
	private JTextField txtOrigen;
	private JButton btnCodificar;
private Cifrar cifrar = new Cifrar();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel frame = new Panel();
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
	public Panel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroducirTexto = new JLabel("Introducir texto");
		lblIntroducirTexto.setBounds(68, 49, 124, 16);
		contentPane.add(lblIntroducirTexto);
		
		txtOrigen = new JTextField();
		txtOrigen.setText("ADIOS");
		txtOrigen.setForeground(Color.RED);
		txtOrigen.setToolTipText("holass");
		txtOrigen.setBounds(78, 77, 134, 28);
		contentPane.add(txtOrigen);
		txtOrigen.setColumns(10);
		
		
		txtFin = new JTextField();
		txtFin.setToolTipText("");
		txtFin.setForeground(Color.BLACK);
		txtFin.setColumns(10);
		txtFin.setBounds(78, 158, 134, 28);
		contentPane.add(txtFin);
		
		lblTextoCodificado = new JLabel("Texto codificado");
		lblTextoCodificado.setBounds(68, 130, 124, 16);
		contentPane.add(lblTextoCodificado);
		
		btnCodificar = new JButton("Codificar");
		btnCodificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				setText(cifrar.descifrarMensaje(getText().toUpperCase(), 19));
				
				
			}
		});
		btnCodificar.setBounds(75, 226, 117, 29);
		contentPane.add(btnCodificar);
	}
	public String getText()
	{
		System.out.println(txtOrigen.getText());
		return txtOrigen.getText();
	}
	public void setText( String texto)
	{
		txtFin.setText(texto);
	}

}
