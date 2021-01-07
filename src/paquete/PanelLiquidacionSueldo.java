package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelLiquidacionSueldo extends JPanel{
	private JLabel titulo,icon,rut;
	public JButton volver_menu;
	private JTextField campo_rut;
	public PanelLiquidacionSueldo() {
		setLayout(null);
		setBackground(Color.orange);
		labels();
		campos();
		botones();
	}
	private void labels() {
		titulo = new JLabel("Liquidacion de Sueldo");
		titulo.setBounds(300,80,400,40);
		titulo.setFont(new Font("Helvetica",Font.PLAIN,22));

		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		
		rut = new JLabel("Ingrese Rut para buscar Trabajador");
		rut.setBounds(250,150,350,40);
		rut.setFont(new Font("Helvetica",Font.PLAIN,20));
		
		
		
		add(titulo);
		add(icon);
		add(rut);
	}
	private void campos() {
		campo_rut = new JTextField();
		campo_rut.setBounds(350,175,200,25);
		
		add(campo_rut);
	}
	private void botones() {
		volver_menu = new JButton("Volver al Menú");
		volver_menu.setBounds(400,250,200,25);
		add(volver_menu);
		
	}
}
