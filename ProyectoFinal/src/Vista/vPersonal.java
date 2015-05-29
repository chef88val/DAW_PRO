package Vista;

import javax.swing.JPanel;

import java.awt.ScrollPane;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controller.MainController;
import Model.Trabajador;
import Model.personalModel;

import javax.swing.JScrollPane;
import javax.swing.ListModel;

public class vPersonal extends JPanel {
	public JTextField txtNombreEmpleado;
	public JTextField txtApellidoEmpleado;
	public JTextField txtCargoEmpleado;
	public JTextField txtSueldoEmpleado;
	private personalModel personal;
	private MainController controlador;
	private String nombre,apellidos,cargo,sueldo;
	private DefaultListModel listModel;
	private JList list;

	/**
	 * Create the panel.
	 */
	public vPersonal() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		add(panel);
		
		personal=new personalModel();
		JButton btnGuardarPersonal = new JButton("Guardar");
		btnGuardarPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Guardar1"+txtNombreEmpleado.getText());
				Trabajador trabajador =(Trabajador)listModel.getElementAt(list.getSelectedIndex());
				Trabajador update=new Trabajador(trabajador.getID(),txtNombreEmpleado.getText(), txtApellidoEmpleado.getText(), 
							txtCargoEmpleado.getText(), txtSueldoEmpleado.getText());
				MainController.getInstance().updatePersonal(update);
				//personal.setPersonal(txtNombreEmpleado.getText(), txtApellidoEmpleado.getText(), txtCargoEmpleado.getText(), txtSueldoEmpleado.getText());
				System.out.println("Guardar"+txtNombreEmpleado.getText());
			}
		});
		btnGuardarPersonal.setBounds(327, 265, 117, 29);
		panel.add(btnGuardarPersonal);
		
		JButton btnNuevoPersonal = new JButton("Nuevo Personal");
		btnNuevoPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*setDatos();*/
				System.out.println("Nuevo"+txtNombreEmpleado.getText());
				Trabajador insert=new Trabajador(0,txtNombreEmpleado.getText(), txtApellidoEmpleado.getText(), 
							txtCargoEmpleado.getText(), txtSueldoEmpleado.getText());
				MainController.getInstance().newPersonal(insert); 
				
                 //Coloco los datos en los campos
                 txtNombreEmpleado.setText("");
                 txtApellidoEmpleado.setText("");
                 txtCargoEmpleado.setText("");
                 txtSueldoEmpleado.setText("");
                
				
			}
		});
		btnNuevoPersonal.setBounds(6, 265, 141, 29);
		panel.add(btnNuevoPersonal);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(6, 6, 61, 16);
		panel.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(6, 34, 61, 16);
		panel.add(lblApellidos);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(6, 62, 61, 16);
		panel.add(lblCargo);
		
		JLabel lblSueldo = new JLabel("Sueldo:");
		lblSueldo.setBounds(6, 158, 61, 16);
		panel.add(lblSueldo);
		
		txtNombreEmpleado = new JTextField();
		txtNombreEmpleado.setBounds(74, 0, 134, 28);
		panel.add(txtNombreEmpleado);
		txtNombreEmpleado.setColumns(10);
		
		
		txtApellidoEmpleado = new JTextField();
		txtApellidoEmpleado.setBounds(74, 28, 134, 28);
		panel.add(txtApellidoEmpleado);
		txtApellidoEmpleado.setColumns(10);
		
		
		txtCargoEmpleado = new JTextField();
		txtCargoEmpleado.setBounds(74, 56, 134, 28);
		panel.add(txtCargoEmpleado);
		txtCargoEmpleado.setColumns(10);
		
		
		txtSueldoEmpleado = new JTextField();
		txtSueldoEmpleado.setBounds(74, 152, 134, 28);
		panel.add(txtSueldoEmpleado);
		txtSueldoEmpleado.setColumns(10);
		
		JPanel panelJList = new JPanel();
		panelJList.setBounds(288, 6, 156, 210);
		panel.add(panelJList);
		panelJList.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 144, 202);
		panelJList.add(scrollPane);
		
		listModel = new DefaultListModel();
		 list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		  //Evento para mostrar en los campos los datos
        list.addListSelectionListener(new ListSelectionListener() {
              public void valueChanged(ListSelectionEvent listSelectionEvent) {
            	  System.out.println("Se llama listListener");
            	  if((list!=null)&&(listModel!=null)){
            		  if(list.getSelectedIndex()>=0)
            		  {
            			  //Cojo el juego seleccionado
                  Trabajador trabajador=(Trabajador)listModel.getElementAt(list.getSelectedIndex());
                  //Coloco los datos en los campos
                  txtNombreEmpleado.setText(trabajador.getNombre());
                  txtApellidoEmpleado.setText(trabajador.getApellidos());
                  txtCargoEmpleado.setText(trabajador.getCargo());
                  txtSueldoEmpleado.setText(trabajador.getSueldo());
                  System.out.println("sss"+trabajador.getSueldo());
            		  }
            	  }
                  
              }
        });
	
	}
	
public void putPersonal(ArrayList empledados)
{
	System.out.println("Juegos"+empledados);
	Iterator<Trabajador> it=empledados.iterator();
	listModel.removeAllElements();
	while(it.hasNext())
	{
		
		Trabajador trabajador=(Trabajador)it.next();
		listModel.addElement(trabajador);
		/*listModel.addElement(trabajador.getNombre());
		listModel.addElement(trabajador.getApellidos());
		listModel.addElement(trabajador.getCargo());
		listModel.addElement(trabajador.getSueldo());
		System.out.println("Sueldo trabajador"+trabajador.getSueldo());*/
		
	}
}
}
