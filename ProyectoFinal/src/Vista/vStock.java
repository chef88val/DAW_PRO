package Vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

public class vStock extends JPanel {
	private JTextField txtNombreStock;
	private JTextField txtProveedorStock;
	private JTextField txtCantidadStock;
	private JTextField txtPrecioStock;

	/**
	 * Create the panel.
	 */
	public vStock() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnGuardarStock = new JButton("Guardar");
		btnGuardarStock.setBounds(351, 265, 93, 29);
		panel.add(btnGuardarStock);
		
		JLabel lblNombreStock = new JLabel("Nombre:");
		lblNombreStock.setBounds(19, 11, 54, 16);
		panel.add(lblNombreStock);
		
		JLabel lblProveedorStock = new JLabel("Proveedor");
		lblProveedorStock.setBounds(19, 58, 62, 16);
		panel.add(lblProveedorStock);
		
		JLabel lblCantidadStock = new JLabel("Cantidad:");
		lblCantidadStock.setBounds(19, 112, 60, 16);
		panel.add(lblCantidadStock);
		
		JLabel lblPrecioStock = new JLabel("Precio:");
		lblPrecioStock.setBounds(19, 175, 42, 16);
		panel.add(lblPrecioStock);
		
		txtNombreStock = new JTextField();
		txtNombreStock.setBounds(93, 5, 134, 28);
		txtNombreStock.setColumns(10);
		panel.add(txtNombreStock);
		
		txtProveedorStock = new JTextField();
		txtProveedorStock.setBounds(93, 52, 134, 28);
		txtProveedorStock.setColumns(10);
		panel.add(txtProveedorStock);
		
		txtCantidadStock = new JTextField();
		txtCantidadStock.setBounds(93, 106, 134, 28);
		txtCantidadStock.setColumns(10);
		panel.add(txtCantidadStock);
		
		txtPrecioStock = new JTextField();
		txtPrecioStock.setBounds(93, 169, 134, 28);
		txtPrecioStock.setColumns(10);
		panel.add(txtPrecioStock);
		
		JList list = new JList();
		list.setBounds(288, 5, 156, 222);
		panel.add(list);
		
		JButton btnNuevoProductoStock = new JButton("Nuevo Producto");
		btnNuevoProductoStock.setBounds(6, 265, 144, 29);
		panel.add(btnNuevoProductoStock);
		

	}

}
