package paquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class VentanaTrabajador extends JFrame{
	
	public PanelTrabajador panel;
	private JScrollPane scrollpane;
	public PanelInsertarTrabajador panelInsertarTrabajador;
	public PanelModificarTrabajador panelModificarTrabajador;
	public PanelEliminarTrabajador panelEliminarTrabajador;
	private PanelConsultarDatos panelConsultarTrabajador;
	private PanelLiquidacionSueldo panelLiquidacionTrabajador;
	public VentanaTrabajador() {
		panel = new PanelTrabajador();
		setSize(780,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(false);
		setLocationRelativeTo(null);
		Inicializar();
		navegacion();
		volver_atras();
	}
	private void Inicializar() {
		 scrollpane = new JScrollPane();
		 scrollpane.setBounds(1,1,779,500);
		 scrollpane.setViewportView(panel);
		 add(scrollpane);
	}
	private void navegacion() {
		//Instancia de paneles 
		panelInsertarTrabajador = new PanelInsertarTrabajador();
		panelModificarTrabajador = new PanelModificarTrabajador();
		panelEliminarTrabajador = new PanelEliminarTrabajador ();
		panelConsultarTrabajador = new PanelConsultarDatos();
		panelLiquidacionTrabajador = new PanelLiquidacionSueldo ();
		//pinchar boton para ingresar un trabajador
		panel.ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panelInsertarTrabajador);
			}
		});
		
		//Pinchar Boton para modificar un trabajador
		panel.modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panelModificarTrabajador);
			}
		});
		//Pinchar Boton para Eliminar un trabajador
		panel.eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panelEliminarTrabajador);
			}
		});
		//Pinchar Boton para Consultar Datos de un trabajador
		panel.consultar_datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panelConsultarTrabajador);
			}
		});
		//Pinchar Boton para Generar Liquidacion de sueldo
		panel.generar_liquidacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panelLiquidacionTrabajador);
			}
		});
	}
	private void volver_atras() {
		panelInsertarTrabajador.cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panel);
			}
		});
		
		panelModificarTrabajador.cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panel);
			}
		});
		
		panelEliminarTrabajador.cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panel);
			}
		});
		panelConsultarTrabajador.volver_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panel);
			}
		});
		panelLiquidacionTrabajador.volver_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panel);
			}
		});
		
	}
}
