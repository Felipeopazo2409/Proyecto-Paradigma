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
	public JButton eliminar_depto,cancelar;
	public PanelEliminarDepto() {
		setLayout(null);
		setBackground(Color.orange);
		labels();
		textfield();
		textarea();
		botones();
	}
	private void labels() {
		titulo = new JLabel("Eliminar Departamento");
		titulo.setBounds(280,80,400,40);
		titulo.setFont(new Font("serif",Font.PLAIN,25));
	
		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		
		ingresar_n_depto = new JLabel("Ingrese Numero de Depto");
		ingresar_n_depto.setBounds(140,150,250,40);
		ingresar_n_depto.setFont(new Font("serif",Font.PLAIN,22));
		
		nombre = new JLabel("Nombre");
		nombre.setBounds(140,180,150,40);
		nombre.setFont(new Font("serif",Font.PLAIN,22));
		
		numero_trabajadores = new JLabel("Numero de trabajadores");
		numero_trabajadores.setBounds(140,210,250,40);
		numero_trabajadores.setFont(new Font("serif",Font.PLAIN,22));
		
		
		add(titulo);
		add(icon);
		add(ingresar_n_depto);
		add(nombre);
		add(numero_trabajadores);
	}
	private void textarea() {
		campo1 = new JTextArea();
		campo1.setBounds(220,190,200,25);
		
		campo2 = new JTextArea();
		campo2.setBounds(360,220,200,25);
		
		add(campo1);
		add(campo2);
	}
	private void textfield() {
		input = new JTextField();
		input.setBounds(380,160,200,25);
		add(input);
	}
	private void botones() {
		eliminar_depto = new JButton("Eliminar");
		eliminar_depto.setBounds(160,300,250,30);
		
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(450,300,250,30);
		
		add(eliminar_depto);
		add(cancelar);
		
	}
}
