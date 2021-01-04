package paquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class VentanaAdministrador extends JFrame {
	private JScrollPane scrollpane;
	public PanelAdministracion admin;
	public MenuPrincipal menu;
	public PanelInsertarDepto insertar;
	public PanelEliminarDepto eliminar;
	public VentanaAdministrador() {
		setSize(780,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(false);
		 admin = new PanelAdministracion();
		 scrollpane = new JScrollPane();
		 scrollpane.setBounds(1,1,779,500);
		 scrollpane.setViewportView(admin);
		 add(scrollpane);
		 navegacion();
		 
	}
	public void navegacion() {
		insertar = new PanelInsertarDepto();
		eliminar = new PanelEliminarDepto();
		//Pincho oton para insertar un nuevo departamento
		admin.ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(insertar);
			}
		});
		
		//Pincho boton para eliminar Departamento
		
		admin.eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(eliminar);
			}
		});
		

		
		//Pincho Boton para volver al menu admin
		insertar.guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(admin);
			}
		});
	}
	
	
}
