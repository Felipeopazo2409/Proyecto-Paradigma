package paquete;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPrincipal extends JPanel implements ActionListener{
	private JLabel titulo,descripcion,icono;
	public JButton boton1,boton2,boton3;
	
	public MenuPrincipal() {
		setLayout(null);
		setBackground(Color.orange);
		cargarComponentesLabel();
		cargarBotones();
	}
	
	private void cargarComponentesLabel() {
		titulo = new JLabel("Men� Principal");
		titulo.setBounds(300,70,200,40);
		titulo.setFont(new Font("serif",Font.PLAIN,27));
		
		descripcion = new JLabel("''Bienvenido al software de la Choza de concreto''");
		descripcion.setBounds(220,150,400,40);
		descripcion.setFont(new Font("serif",Font.BOLD,18));
		
		icono = new JLabel(new ImageIcon("logo.png"));
		icono.setBounds(5,0,150,150);
		add(titulo);
		add(descripcion);
		add(icono);
	}
	private void cargarBotones() {
		boton1 = new JButton("Administrador de departamentos");
		boton1.setBounds(270,220,270,25);
		
		boton2 = new JButton("Administrador de trabajadores");
		boton2.setBounds(270,260,270,25);
		boton3 = new JButton("Informaci�n general de la empresa");
		boton3.setBounds(270,300,270,25);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
