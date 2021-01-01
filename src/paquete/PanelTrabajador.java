package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanelTrabajador extends JPanel {
	 private JLabel titulo,icon;
	 public JButton ingresar,modificar,eliminar,volver_menu,consultar_datos,generar_liquidacion;
	 private JScrollPane scrollpane;
	 public PanelTrabajador() {
		 setLayout(null);
		 setBackground(Color.orange);
		 
		 scrollpane = new JScrollPane();
		 scrollpane.setBounds(1,1,779,500);
		 
		 cargarComponentesLabel();
		 CargarBotones();
		 
		 add(scrollpane);
	 }
	 public void cargarComponentesLabel() {
		titulo = new JLabel("Administrador Trabajadores");
		titulo.setBounds(280,80,300,40);
		titulo.setFont(new Font("serif",Font.PLAIN,22));
		
		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		add(titulo);
		add(icon);
	 }
	 private void CargarBotones() {
			ingresar = new JButton("Añadir Trabajador");
			ingresar.setBounds(280,170,250,25);
			
			modificar = new JButton("Modificar Trabajador");
			modificar.setBounds(280,220,250,25);
			
			eliminar = new JButton("Eliminar Trabajador");
			eliminar.setBounds(280,270,250,25);
			
			consultar_datos = new JButton("Consultar Datos de trabajadores");
			consultar_datos.setBounds(280,320,250,25);
			
			generar_liquidacion = new JButton("Generar Liquidacion de sueldo");
			generar_liquidacion.setBounds(280,370,250,25);
			volver_menu = new JButton("Volver al menú principal");
			volver_menu.setBounds(280,420,250,25);
			add(ingresar);
			add(eliminar);
			add(modificar);
			add(consultar_datos);
			add(generar_liquidacion);
			add(volver_menu);
		}
}
