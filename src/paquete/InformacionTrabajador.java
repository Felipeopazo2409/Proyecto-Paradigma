package paquete;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InformacionTrabajador extends JPanel{
	private JLabel titulo,icono;
	private JLabel nombre,apellidoP,apellidoM,rut,fecha_nacimiento,tipo_contrato,salario;
	private JTextArea campo1,campo2,campo3,campo4,campo5,campo6,campo7;
	private JButton boton;
	public InformacionTrabajador() {
		setLayout(null);
		setBackground(Color.orange);
		cargarComponentesLabel();
		cargarComponentesText();
		cargarComponentesButton();
	}
	private void cargarComponentesLabel() {
		//Titulo de Interfaz
		titulo = new JLabel("Información del Trabajador");
		titulo.setBounds(240,20,300,40);
		titulo.setFont(new Font("serif",Font.PLAIN,25));
		
		nombre = new JLabel("Nombre");
		nombre.setBounds(20,80,100,40);
		nombre.setFont(new Font("serif",Font.PLAIN,20));
		
		apellidoP = new JLabel("Apellido Paterno ");
		apellidoP.setBounds(20,110,150,40);
		apellidoP.setFont(new Font("serif",Font.PLAIN,20));
		
		apellidoM = new JLabel("Apellido Materno ");
		apellidoM.setBounds(20,140,150,40);
		apellidoM.setFont(new Font("serif",Font.PLAIN,20));
		
		rut = new JLabel("Rut");
		rut.setBounds(20,170,80,40);
		rut.setFont(new Font("serif",Font.PLAIN,20));
		
		
		fecha_nacimiento = new JLabel("Fecha de nacimiento ");
		fecha_nacimiento.setBounds(20,200,300,40);
		fecha_nacimiento.setFont(new Font("serif",Font.PLAIN,20));
		
		tipo_contrato = new JLabel("Tipo de contrato ");
		tipo_contrato.setBounds(20,230,300,40);
		tipo_contrato.setFont(new Font("serif",Font.PLAIN,20));
		
		salario = new JLabel("Salario por hora ");
		salario.setBounds(20,260,300,40);
		salario.setFont(new Font("serif",Font.PLAIN,20));
		
		icono = new JLabel(new ImageIcon("construccion.png"));
		icono.setBounds(370,120,256,166);
		add(titulo);
		add(nombre);
		add(apellidoP);
		add(apellidoM);
		add(rut);
		add(fecha_nacimiento);
		add(tipo_contrato);
		add(salario);
		add(icono);
	}
	
	private void cargarComponentesText() {
		campo1 = new JTextArea();
		campo1.setBounds(100,90,120,20);
		campo1.setText("Felipe");
		campo1.setFont(new Font("serif",Font.PLAIN,15));
		
		campo2 = new JTextArea();
		campo2.setBounds(170,120,120,20);
		campo2.setFont(new Font("serif",Font.PLAIN,15));
		campo2.setText("Opazo");
		
		
		campo3 = new JTextArea();
		campo3.setBounds(170,150,120,20);
		campo3.setFont(new Font("serif",Font.PLAIN,15));
		campo3.setText("Córdova");
		
		campo4 = new JTextArea();
		campo4.setBounds(60,180,120,20);
		campo4.setFont(new Font("serif",Font.PLAIN,15));
		campo4.setText("20.088.014-5");
		
		campo5 = new JTextArea();
		campo5.setBounds(190,210,120,20);
		campo5.setFont(new Font("serif",Font.PLAIN,15));
		campo5.setText("24/09/1999");
		
		campo6 = new JTextArea();
		campo6.setBounds(160,240,120,20);
		campo6.setFont(new Font("serif",Font.PLAIN,15));
		campo6.setText("Full-time");
		
		campo7 = new JTextArea();
		campo7.setBounds(160,270,120,20);
		campo7.setFont(new Font("serif",Font.PLAIN,15));
		campo7.setText("15 mil pesos");
		
		add(campo1);
		add(campo2);
		add(campo3);
		add(campo4);
		add(campo5);
		add(campo6);
		add(campo7);
	}
	
	public void cargarComponentesButton() {
		boton = new JButton("Volver al menu principal");
		boton.setBounds(370,350,200,40);
		add(boton);
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("has dado click");
			}
		});
		
		
	}
	
}
