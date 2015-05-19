package Vista;

import javax.swing.JPanel;
import java.awt.ScrollPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vPerfil extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public vPerfil(int X, int Y) {
		setLayout(new BorderLayout(0, 0));
		setSize(X,Y);
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		add(panel);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(234, 10, 61, 16);
		panel.add(lblGenero);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(350, 10, 78, 16);
		panel.add(lblPlataforma);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(21, 10, 61, 16);
		panel.add(lblNombre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(331, 38, 101, 27);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(212, 38, 84, 27);
		panel.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 134, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Genero");
		label.setBounds(331, 82, 61, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Plataforma");
		label_1.setBounds(315, 149, 78, 16);
		panel.add(label_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(305, 177, 101, 27);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(309, 110, 84, 27);
		panel.add(comboBox_3);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setBounds(77, 216, 117, 29);
		panel.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(288, 216, 117, 29);
		panel.add(btnEditar);

	}
}
