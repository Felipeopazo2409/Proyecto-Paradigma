package paquete;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInsertarDepto extends JPanel{
	private JLabel titulo,n_depto,nombre,numero,trabajadores,icon,mensaje;
	private JTextField campo1,campo2,campo3,campo4;
	public JButton mostrar_informacion,guardar;
	public PanelInsertarDepto() {
		setLayout(null);
		setBackground(Color.orange);
		cargarComponentesLabel();
		cargarComponentesText();
		cargarComponentesButton();
	}
	private void cargarComponentesLabel() {
		titulo = new JLabel("Inserte datos del departamento nuevo");
		titulo.setBounds(250,100,400,40);
		titulo.setFont(new Font("Helvetica",Font.BOLD,22));
	
		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		
		n_depto = new JLabel("N Depto");
		n_depto.setBounds(190,150,150,40);
		n_depto.setFont(new Font("Helvetica",Font.PLAIN,16));
		
		nombre = new JLabel("Nombre");
		nombre.setBounds(190,200,150,40);
		nombre.setFont(new Font("Helvetica",Font.PLAIN,16));
		
		numero = new JLabel("Numero de trabajadores");
		numero.setBounds(190,250,250,40);
		numero.setFont(new Font("Helvetica",Font.PLAIN,16));
		
		mensaje = new JLabel("Se ha guardado la información exitosamente");
		mensaje.setBounds(220,10,400,40);
		mensaje.setFont(new Font("Helvetica",Font.PLAIN,16));
		add(titulo);
		add(icon);
		add(n_depto);
		add(nombre);
		add(numero);
	}
	
	private void cargarComponentesText() {
		campo1 = new JTextField();
		campo1.setBounds(390,160,200,25);
		
		campo2 = new JTextField();
		campo2.setBounds(390,208,200,25);
		
		campo3 = new JTextField();
		campo3.setBounds(390,260,200,25);
		add(campo1);
		add(campo2);
		add(campo3);
	}
	private void cargarComponentesButton() {
		mostrar_informacion = new JButton("Mostrar Lista de trabajadores");
		mostrar_informacion.setBounds(240,320,250,35);
		
		guardar = new JButton("Guardar Informacion");
		guardar.setBounds(240,375,250,35);
		
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionalidades();
			}
		});
		
	    add(mostrar_informacion);
		add(guardar);
	
	}
	
	public void funcionalidades() {
		mensaje.setText("Se ha guardado la informaci�n exitosamente");
		
	}
}
