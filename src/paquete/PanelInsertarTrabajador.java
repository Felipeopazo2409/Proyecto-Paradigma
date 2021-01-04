package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelInsertarTrabajador extends JPanel{
	private JLabel titulo,icono;
	private JLabel nombre,apellidoP,apellidoM,rut,fecha_nacimiento,tipo_contrato,salario;
	private JTextField campo1,campo2,campo3,campo4,campo5,campo6,campo7;
	public JButton guardar,cancelar;
	private JComboBox contrato;
	private String[] contratos = {"Full-time","Part-Time"}; 
	public PanelInsertarTrabajador() {
		setLayout(null);
		setBackground(Color.orange);
		labels();
		campos();
		botones();
	}
	private void labels() {
		titulo = new JLabel("Ingresar datos del nuevo trabajador");
		titulo.setBounds(240,20,420,40);
		titulo.setFont(new Font("serif",Font.PLAIN,25));
		
		nombre = new JLabel("Nombre");
		nombre.setBounds(50,160,100,40);
		nombre.setFont(new Font("serif",Font.PLAIN,20));
		
		apellidoP = new JLabel("Apellido Paterno ");
		apellidoP.setBounds(50,190,150,40);
		apellidoP.setFont(new Font("serif",Font.PLAIN,20));
		
		apellidoM = new JLabel("Apellido Materno ");
		apellidoM.setBounds(50,220,150,40);
		apellidoM.setFont(new Font("serif",Font.PLAIN,20));
		
		rut = new JLabel("Rut");
		rut.setBounds(50,250,80,40);
		rut.setFont(new Font("serif",Font.PLAIN,20));
		
		
		fecha_nacimiento = new JLabel("Fecha de nacimiento ");
		fecha_nacimiento.setBounds(50,280,300,40);
		fecha_nacimiento.setFont(new Font("serif",Font.PLAIN,20));
		
		tipo_contrato = new JLabel("Tipo de contrato ");
		tipo_contrato.setBounds(50,310,300,40);
		tipo_contrato.setFont(new Font("serif",Font.PLAIN,20));
		
		contrato = new JComboBox(contratos);
		contrato.setBounds(200,320,200,25);
		
		salario = new JLabel("Salario por hora ");
		salario.setBounds(50,340,300,40);
		salario.setFont(new Font("serif",Font.PLAIN,20));
		
		icono = new JLabel(new ImageIcon("logo.png"));
		icono.setBounds(1,1,150,150);
		add(titulo);
		add(nombre);
		add(apellidoP);
		add(apellidoM);
		add(rut);
		add(fecha_nacimiento);
		add(tipo_contrato);
		add(salario);
		add(icono);
		add(contrato);
	}
	
	private void campos() {
		
		campo1 = new JTextField();
		campo1.setBounds(125,170,150,20);
		
		campo2 = new JTextField();
		campo2.setBounds(190,200,150,20);
		
		campo3 = new JTextField();
		campo3.setBounds(200,230,150,20);
		
		campo4 = new JTextField();
		campo4.setBounds(90,260,150,20);
		
		campo5 = new JTextField();
		campo5.setBounds(215,290,150,20);
		
		campo6 = new JTextField();
		campo6.setBounds(190,350,150,20);
		add(campo1);
		add(campo2);
		add(campo3);
		add(campo4);
		add(campo5);
		add(campo6);
		
	}
	
	private void botones() {
		guardar = new JButton("Guardar Nuevo Trabajador");
		guardar.setBounds(470,200,200,40);
		
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(470,270,200,40);
		add(guardar);
		add(cancelar);
		
	}
	
}
