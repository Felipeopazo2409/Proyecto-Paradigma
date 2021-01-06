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
import javax.swing.SwingConstants;

public class PanelEliminarTrabajador extends JPanel{
	private JLabel titulo,icono;
	private JLabel nombre,apellidoP,apellidoM,rut,fecha_nacimiento,tipo_contrato,salario,departamento;
	private JTextField campoNombre,campoApellidoMaterno,campoApellidoPaterno,campoRut,campoNacimiento,campoSalario,campoDepartamento;
	public JButton eliminar,cancelar;

	public PanelEliminarTrabajador() {
		setLayout(null);
		setBackground(Color.orange);
		labels();
		
		textarea();
		botones();
	}
	private void labels() {
		titulo = new JLabel("Eiminar Trabajador");
		titulo.setBounds(240,20,420,40);
		titulo.setFont(new Font("serif",Font.PLAIN,25));
		
		rut = new JLabel("Ingrese Rut");
		rut.setBounds(50,160,200,40);
		rut.setFont(new Font("serif",Font.PLAIN,20));
		
		nombre = new JLabel("Nombre");
		nombre.setBounds(50,190,100,40);
		nombre.setFont(new Font("serif",Font.PLAIN,20));
		
		apellidoP = new JLabel("Apellido Paterno ");
		apellidoP.setBounds(50,220,150,40);
		apellidoP.setFont(new Font("serif",Font.PLAIN,20));
		
		
		apellidoM = new JLabel("Apellido Materno ");
		apellidoM.setBounds(50,250,150,40);
		apellidoM.setFont(new Font("serif",Font.PLAIN,20));
		
		
		fecha_nacimiento = new JLabel("Fecha de nacimiento ");
		fecha_nacimiento.setBounds(50,280,300,40);
		fecha_nacimiento.setFont(new Font("serif",Font.PLAIN,20));
		
		
		tipo_contrato = new JLabel("Tipo de contrato ");
		tipo_contrato.setBounds(50,310,300,40);
		tipo_contrato.setFont(new Font("serif",Font.PLAIN,20));
	
		
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
		add(departamento);
	}
	private void textarea() {
		
	}

	private void botones() {
		eliminar= new JButton("Eliminar Trabajador");
		eliminar.setBounds(160,300,250,30);
		
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(450,300,250,30);
		
		add(eliminar);
		add(cancelar);
		
	}
}
