package paquete;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.json.JSONArray;
import org.json.JSONObject;

public class PanelInsertarTrabajador extends JPanel{
	private JLabel titulo,icono;
	private JLabel nombre,apellidoP,apellidoM,rut,fecha_nacimiento,tipo_contrato,salario,departamento;
	private JTextField campoNombre,campoApellidoMaterno,campoApellidoPaterno,campoRut,campoNacimiento,campoSalario,campoDepartamento;
	public JButton guardar,cancelar;
	private JComboBox contrato;
	private String[] contratos = {"Full-time","Part-Time"}; 
	public static int cantidadTrabajadores;
	public PanelInsertarTrabajador() {
		setLayout(null);
		setBackground(Color.orange);
		labels();
		campos();
	
	}
	private void labels() {
		titulo = new JLabel("Ingresar datos del nuevo trabajador");
		titulo.setBounds(240,20,420,40);
		titulo.setFont(new Font("Helvetica",Font.PLAIN,25));
		
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
		
		departamento = new JLabel();
		departamento.setBounds(50,340,300,40);
		departamento.setFont(new Font("serif",Font.PLAIN,20));
		
		fecha_nacimiento = new JLabel("Fecha de nacimiento ");
		fecha_nacimiento.setBounds(50,280,300,40);
		fecha_nacimiento.setFont(new Font("serif",Font.PLAIN,20));
		
		tipo_contrato = new JLabel("Tipo de contrato ");
		tipo_contrato.setBounds(50,310,300,40);
		tipo_contrato.setFont(new Font("serif",Font.PLAIN,20));
		
		JComboBox comboContrato= new JComboBox(contratos);
		contrato = comboContrato;
		contrato.setBounds(215,320,150,25);
	
	
		
		salario = new JLabel("Salario por hora ");
		salario.setBounds(50,340,300,40);
		salario.setFont(new Font("serif",Font.PLAIN,20));
		
		departamento = new JLabel("Departamento ");
		departamento.setBounds(50,370,300,40);
		departamento.setFont(new Font("serif",Font.PLAIN,20));
		
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
		add(departamento);
	}
	
	private void campos() {
		
		campoNombre = new JTextField();
		campoNombre.setBounds(215,170,150,20);
		
		campoApellidoMaterno = new JTextField();
		campoApellidoMaterno.setBounds(215,200,150,20);
		
		campoApellidoPaterno = new JTextField();
		campoApellidoPaterno.setBounds(215,230,150,20);
		
		campoRut = new JTextField();
		campoRut.setBounds(215,260,150,20);
		
		campoNacimiento = new JTextField();
		campoNacimiento.setBounds(215,290,150,20);
		
		campoSalario = new JTextField();
		campoSalario.setBounds(215,350,150,20);
		
		campoDepartamento = new JTextField();
		campoDepartamento.setBounds(215,380,150,20);
		guardar = new JButton("Guardar Nuevo Trabajador");
		guardar.setBounds(470,200,200,40);
		
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(470,270,200,40);
		
		
		
		add(guardar);
		add(cancelar);
		add(campoNombre);
		add(campoApellidoMaterno);
		add(campoApellidoPaterno);
		add(campoRut);
		add(campoNacimiento);
		add(campoSalario);
		add(campoDepartamento);
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent A) {
				JSONObject trabajador = new JSONObject();
				trabajador.put("Nombre",campoNombre.getText());
				trabajador.put("Apellido Materno",campoApellidoMaterno.getText());
				trabajador.put("Apellido Paterno",campoApellidoPaterno.getText());
				trabajador.put("Rut",campoRut.getText());
				trabajador.put("Nacimiento",campoNacimiento.getText());
				trabajador.put("Salario",campoSalario.getText());
				//trabajador.put("Departamento",campoDepartamento);
				JSONArray myList = new JSONArray();
		        myList.put(trabajador);
		        
		        JSONObject listaTrabajador = new JSONObject();
		        listaTrabajador.put("trabajadores",trabajador);
		        cantidadTrabajadores = listaTrabajador.length();
		        System.out.println(cantidadTrabajadores);
		        FileWriter file;
		        try {
		            file = new FileWriter("Trabajadores.json",true);
		            file.write(listaTrabajador.toString(4));
		            file.flush();
		            file.close();
		 
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			}
		});
		
		
		
	}

	public static int numeroTrabajadores() {
		return cantidadTrabajadores;
	}
}
