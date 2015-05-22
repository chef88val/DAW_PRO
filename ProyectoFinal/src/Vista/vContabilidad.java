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
import javax.swing.JList;

public class vContabilidad extends JPanel {
	private JTextField txtDiaContabilidad;
	private JTextField txtMesContabilidad;
	private JTextField txtAnoContabilidad;
	private JTextField txtIngresoContabilidad;
	private JTextField txtGastosContabilidad;
	private JTextField txtResultadoContabilidad;


	/**
	 * Create the panel.
	 */
	public vContabilidad() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		add(panel);
		
		JButton btnGuardarContabilidad = new JButton("Guardar");
		btnGuardarContabilidad.setBounds(327, 265, 117, 29);
		panel.add(btnGuardarContabilidad);
		
		JButton btnNuevoContabilidad = new JButton("Nuevo Día");
		btnNuevoContabilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevoContabilidad.setBounds(6, 265, 144, 29);
		panel.add(btnNuevoContabilidad);
		
		JLabel lblDiaContabilidad = new JLabel("Dia");
		lblDiaContabilidad.setBounds(6, 10, 61, 16);
		panel.add(lblDiaContabilidad);
		
		JLabel lblAnoContabilidad = new JLabel("Año");
		lblAnoContabilidad.setBounds(6, 84, 61, 16);
		panel.add(lblAnoContabilidad);
		
		JLabel lblMesContabilidad = new JLabel("Mes");
		lblMesContabilidad.setBounds(6, 44, 61, 16);
		panel.add(lblMesContabilidad);
		
		JLabel lblIngresoContabilidad = new JLabel("Ingresos");
		lblIngresoContabilidad.setBounds(6, 124, 61, 16);
		panel.add(lblIngresoContabilidad);
		
		JList list = new JList();
		list.setBounds(288, 6, 156, 222);
		panel.add(list);
		
		JLabel lblGastosContabilidad = new JLabel("Gastos");
		lblGastosContabilidad.setBounds(6, 152, 61, 16);
		panel.add(lblGastosContabilidad);
		
		txtDiaContabilidad = new JTextField();
		txtDiaContabilidad.setBounds(42, 6, 52, 28);
		panel.add(txtDiaContabilidad);
		txtDiaContabilidad.setColumns(4);
		
		txtMesContabilidad = new JTextField();
		txtMesContabilidad.setBounds(42, 44, 52, 28);
		panel.add(txtMesContabilidad);
		txtMesContabilidad.setColumns(4);
		
		txtAnoContabilidad = new JTextField();
		txtAnoContabilidad.setBounds(42, 78, 52, 28);
		panel.add(txtAnoContabilidad);
		txtAnoContabilidad.setColumns(4);
		
		txtIngresoContabilidad = new JTextField();
		txtIngresoContabilidad.setForeground(Color.GREEN);
		txtIngresoContabilidad.setBounds(72, 118, 134, 28);
		panel.add(txtIngresoContabilidad);
		txtIngresoContabilidad.setColumns(4);
		
		txtGastosContabilidad = new JTextField();
		txtGastosContabilidad.setForeground(Color.RED);
		txtGastosContabilidad.setBounds(72, 146, 134, 28);
		panel.add(txtGastosContabilidad);
		txtGastosContabilidad.setColumns(4);
		
		JLabel lblResultadoDelDia = new JLabel("Resultado del dia");
		lblResultadoDelDia.setBounds(6, 201, 124, 16);
		panel.add(lblResultadoDelDia);
		
		txtResultadoContabilidad = new JTextField();
		txtResultadoContabilidad.setBounds(137, 195, 134, 28);
		panel.add(txtResultadoContabilidad);
		txtResultadoContabilidad.setColumns(10);
		

	}
}
