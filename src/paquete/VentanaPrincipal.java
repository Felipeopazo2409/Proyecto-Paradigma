package paquete;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class VentanaPrincipal extends JFrame{
	private Home inicio;
	private JScrollPane scrollPaneles;
	public VentanaPrincipal() {
		inicio = new Home();
		setSize(780,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
		//inicio.setVisible(true);
		//add(inicio);
		//add(panel);
		cargarComponentes();
		InformacionTrabajador mostrarTrabajador = new InformacionTrabajador();
		MenuPrincipal menu = new MenuPrincipal();
		 AdministracionDepartamentos administrador = new AdministracionDepartamentos();
		 InsertarDepartamento insertarDepto = new InsertarDepartamento();
		 
		add(insertarDepto);
	}
	public void cargarComponentes() {
		scrollPaneles = new JScrollPane();
		scrollPaneles.setBounds(1,1,779,500);
		
		//add(scrollPaneles);
	}
}
