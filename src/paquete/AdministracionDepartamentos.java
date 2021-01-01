package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdministracionDepartamentos extends JPanel{
	private JLabel titulo,icon;
	public JButton ingresar,eliminar,mostrarInformacion,volver_menu;
	public AdministracionDepartamentos() {
		setLayout(null);
		setBackground(Color.orange);
		CargarComponentesLabel();
		CargarBotones();
	}
	private void CargarComponentesLabel() {
		titulo = new JLabel("Administrador de departamentos");
		titulo.setBounds(250,80,360,40);
		titulo.setFont(new Font("serif",Font.PLAIN,23));
		
		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		
		add(titulo);
		add(icon);
	}
	private void CargarBotones() {
		ingresar = new JButton("A�adir Departamento");
		ingresar.setBounds(280,170,250,25);
		
		eliminar = new JButton("Eliminar Departamento");
		eliminar.setBounds(280,220,250,25);
		
		mostrarInformacion = new JButton("Mostrar Informaci�n");
		mostrarInformacion.setBounds(280,270,250,25);
		
		volver_menu = new JButton("Volver al men� principal");
		volver_menu.setBounds(280,320,250,25);
		
		

		add(ingresar);
		add(eliminar);
		add(mostrarInformacion);
		add(volver_menu);
	}
	
	
}

