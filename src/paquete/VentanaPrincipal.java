package paquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class VentanaPrincipal extends JFrame  {
	private MenuPrincipal menu;
	private AdministracionDepartamentos admin;
	private PanelTrabajador panel_trabajador;
	private JScrollPane scrollPaneles;
	public VentanaPrincipal() {
	
		setSize(780,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);

		cargarComponentes();
	
	}
	public void cargarComponentes() {
		
		menu = new MenuPrincipal();
		admin = new AdministracionDepartamentos();
		panel_trabajador = new PanelTrabajador();
		scrollPaneles = new JScrollPane();
		scrollPaneles.setBounds(1,1,779,500);
		add(scrollPaneles);
		
		scrollPaneles.setViewportView(menu);
		
		menu.boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPaneles.setViewportView(admin);
			}
		});
		
		menu.boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPaneles.setViewportView(panel_trabajador);
			}
		});
		
		
	}
	
	
	
}
