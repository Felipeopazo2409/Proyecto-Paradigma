package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelEliminarDepto extends JPanel{
	private JLabel titulo,icon,nombre,ingresar_n_depto,numero_trabajadores;
	private JTextField input;
	private JTextArea campo1,campo2;
	private JButton eliminar_depto,cancelar;
	public PanelEliminarDepto() {
		setLayout(null);
		setBackground(Color.orange);
		labels();
		textarea();
	}
	private void labels() {
		titulo = new JLabel("Eliminar Departamento");
		titulo.setBounds(280,80,400,40);
		titulo.setFont(new Font("serif",Font.PLAIN,25));
	
		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		
		ingresar_n_depto = new JLabel("Ingrese Numero de Depto");
		
		
		add(titulo);
		add(icon);
	}
	private void textarea() {
		
	}
}
