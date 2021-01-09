package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelLiquidacionSueldo extends JPanel{
	private JLabel titulo,icon,salario_por_hora,sueldo;
	public JButton volver_menu,calcular_salario;
	private JTextField campo_rut,campo_salario;
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
		
		salario_por_hora = new JLabel("Ingrese Salario Para calcular Liquidacion de sueldo");
		salario_por_hora.setBounds(200,140,520,40);
		salario_por_hora.setFont(new Font("Helvetica",Font.PLAIN,20));
		
		
		add(titulo);
		add(icon);
		add(salario_por_hora);
	}
	private void campos() {
		campo_salario = new JTextField();
		campo_salario.setBounds(310,185,200,25);
		
		add(campo_salario);
	}
	private void botones() {
		volver_menu = new JButton("Volver al Menú principal");
		volver_menu.setBounds(400,250,200,30);
		
		calcular_salario = new JButton("Calcular Sueldo");
		calcular_salario.setBounds(200,250,200,30);
		add(volver_menu);
		add(calcular_salario);
		
	}
}
