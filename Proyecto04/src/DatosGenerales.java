
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

import sun.util.logging.resources.logging;


public class DatosGenerales{
	
	final static String MONEDA_DOL="Dolares";
		final static float VALOR_DOL=1.13f;
	final static String MONEDA_EUR="Euros";
		final static float VALOR_EUR=1f;
	final static String MONEDA_LIB="Libras";
		final static float VALOR_LIB=0.75f;
	final static String MONEDA_YEN="yen";
		final static float VALOR_YEN=132.47f;
		
	private String monedas[]={MONEDA_DOL,MONEDA_EUR,MONEDA_LIB,MONEDA_YEN}; 
	private float valoresConversion[]={VALOR_DOL,VALOR_EUR,VALOR_LIB,VALOR_YEN};
	
	
	public DatosGenerales ()  {
		
		
	}
	public String[] getMonedas()
	{
		return monedas;
	}
	public float[] getValor()
	{
		return valoresConversion;
	}
		
		

}//FIN Clase
