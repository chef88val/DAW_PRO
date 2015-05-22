package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.MainController;
import Model.personalModel;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vPrincipal extends JPanel {
	personalModel usuarios ;
	/**
	 * Create the panel.
	 */
	public vPrincipal() {
	
		setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		panel.setLayout(null);
		add(panel);
		
		JButton btnPersonal = new JButton("Personal");
		btnPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showPersonal();
			}
		});
		btnPersonal.setBounds(165, 41, 117, 29);
		panel.add(btnPersonal);
		
		JButton btnStock = new JButton("Stock");
		btnStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showStock();
			}
		});
		btnStock.setBounds(165, 106, 117, 29);
		panel.add(btnStock);
		
		JButton btnContabilidad = new JButton("Contabilidad");
		btnContabilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showContabilidad();
			}
		});
		btnContabilidad.setBounds(165, 180, 117, 29);
		panel.add(btnContabilidad);
	
	}}
