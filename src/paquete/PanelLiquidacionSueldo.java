package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelLiquidacionSueldo extends JPanel{
	private JLabel titulo,icon;
	public JButton volver_menu;
	public PanelLiquidacionSueldo() {
		setLayout(null);
		setBackground(Color.orange);
		labels();
	}
	private void labels() {
		titulo = new JLabel("Liquidacion de Sueldo");
		titulo.setBounds(300,80,400,40);
		titulo.setFont(new Font("Helvetica",Font.PLAIN,22));

		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		add(titulo);
		add(icon);
	}
}
