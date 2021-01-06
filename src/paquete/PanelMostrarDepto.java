package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMostrarDepto extends JPanel{
	private JLabel titulo,icon;
	public JButton volver_menu,mostrar_lista;
	public PanelMostrarDepto() {
		setLayout(null);
		setBackground(Color.orange);
		labels();
		botones();
	}
	private void labels() {
		titulo = new JLabel("Mostrar Informacion de los departamentos");
		titulo.setBounds(250,100,400,40);
		titulo.setFont(new Font("serif",Font.PLAIN,22));
	
		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		
		add(titulo);
		add(icon);
	}
	private void botones() {
		mostrar_lista = new JButton("Mostrar Lista de departamentos");
		mostrar_lista.setBounds(250,250,250,30);
		
		volver_menu = new JButton("Volver al menu Principal");
		volver_menu.setBounds(250,285,250,30);
		
		
		add(volver_menu);
		add(mostrar_lista);
		
	}
}
