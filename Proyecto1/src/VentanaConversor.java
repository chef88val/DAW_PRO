import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class VentanaConversor extends JFrame {

	private JPanel contentPane;
	private JTextField txtEuros;
	private JTextField txtDolar;


	/**
	 * Create the frame.
	 */
	public VentanaConversor(final float valorConversion) {
		
		setTitle("Proyecto01_Javier Segarra Martinez");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		txtEuros = new JTextField();
		txtEuros.setBounds(6, 56, 134, 28);
		contentPane.add(txtEuros);
		txtEuros.setColumns(10);
		
		txtDolar = new JTextField();
		txtDolar.setBounds(6, 191, 134, 28);
		contentPane.add(txtDolar);
		txtDolar.setColumns(10);
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setBounds(40, 28, 35, 16);
		contentPane.add(lblEuros);
		
		JLabel lblDolares = new JLabel("Dolares");
		lblDolares.setBounds(40, 163, 48, 16);
		contentPane.add(lblDolares);
		
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			float euros;
				euros=Float.parseFloat(txtEuros.getText());
				txtDolar.setText(String.valueOf(euros*valorConversion));
			}
		});
		btnNewButton.setBounds(220, 120, 117, 29);
		contentPane.add(btnNewButton);
		
		
	}
}
