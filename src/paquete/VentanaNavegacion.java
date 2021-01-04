package paquete;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class VentanaNavegacion extends JFrame{
	public JPanel panel_añadir;
	private JLabel titulo,n_depto,nombre,numero,trabajadores,icon,mensaje;
	private JTextField campo1,campo2,campo3,campo4;
	public JButton mostrar_informacion,guardar;
	private JScrollPane scrollpane;
	public VentanaNavegacion() {
		setSize(780,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(false);
		Crear_Panel_añadir();
	}
	private void crear_scrollpane() {
		scrollpane = new JScrollPane();
		scrollpane.setBounds(1,1,779,499);
	
	}
	
	
	private void Crear_Panel_añadir() {
		panel_añadir = new JPanel();
		panel_añadir.setLayout(null);
		
		titulo = new JLabel("Inserte Datos del departamento nuevo");
		titulo.setBounds(250,100,400,40);
		titulo.setFont(new Font("serif",Font.PLAIN,22));
	
		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		
		n_depto = new JLabel("N° Depto");
		n_depto.setBounds(190,150,150,40);
		n_depto.setFont(new Font("serif",Font.PLAIN,20));
		
		nombre = new JLabel("Nombre");
		nombre.setBounds(190,200,150,40);
		nombre.setFont(new Font("serif",Font.PLAIN,20));
		
		numero = new JLabel("Numero de trabajadores");
		numero.setBounds(190,250,250,40);
		numero.setFont(new Font("serif",Font.PLAIN,20));
		
		mensaje = new JLabel("Se ha guardado la informaci�n exitosamente");
		mensaje.setBounds(220,10,400,40);
		mensaje.setFont(new Font("serif",Font.PLAIN,20));
		
		panel_añadir.add(titulo);
		panel_añadir.add(icon);
		panel_añadir.add(n_depto);
		panel_añadir.add(nombre);
		panel_añadir.add(numero);
		
		campo1 = new JTextField();
		campo1.setBounds(280,160,200,25);
		
		campo2 = new JTextField();
		campo2.setBounds(270,208,200,25);
		
		campo3 = new JTextField();
		campo3.setBounds(390,260,200,25);
		
		panel_añadir.add(campo1);
		panel_añadir.add(campo2);
		panel_añadir.add(campo3);
		
		
		mostrar_informacion = new JButton("Mostrar Lista de trabajadores");
		mostrar_informacion.setBounds(240,320,250,35);
		
		guardar = new JButton("Guardar Informacion");
		guardar.setBounds(240,375,250,35);
		
		panel_añadir.add(mostrar_informacion);
		panel_añadir.add(guardar);
		
	}
	
		
}
