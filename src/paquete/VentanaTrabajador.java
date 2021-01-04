package paquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class VentanaTrabajador extends JFrame{
	public PanelTrabajador panel;
	private JScrollPane scrollpane;
	private PanelInsertarTrabajador insertar;
	private PanelModificarTrabajador modificar;
	private PanelEliminarTrabajador eliminar;
	private PanelConsultarDatos consultar;
	private PanelLiquidacionSueldo liquidacion;
	public VentanaTrabajador() {
		panel = new PanelTrabajador();
		setSize(780,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(false);
		Inicializar();
		navegacion();
	}
	private void Inicializar() {
		 scrollpane = new JScrollPane();
		 scrollpane.setBounds(1,1,779,500);
		 scrollpane.setViewportView(panel);
		 add(scrollpane);
	}
	private void navegacion() {
		//Instancia de paneles 
		insertar = new PanelInsertarTrabajador();
		modificar = new PanelModificarTrabajador();
		eliminar = new PanelEliminarTrabajador ();
		consultar = new PanelConsultarDatos();
		liquidacion = new PanelLiquidacionSueldo ();
		//pinchar boton para ingresar un trabajador
		panel.ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(insertar);
			}
		});
		
		//Pinchar Boton para modificar un trabajador
		panel.modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(modificar);
			}
		});
		//Pinchar Boton para Eliminar un trabajador
		panel.eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(eliminar);
			}
		});
		//Pinchar Boton para Consultar Datos de un trabajador
		panel.consultar_datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(consultar);
			}
		});
		//Pinchar Boton para Generar Liquidacion de sueldo
		panel.generar_liquidacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(liquidacion);
			}
		});
	}
}
