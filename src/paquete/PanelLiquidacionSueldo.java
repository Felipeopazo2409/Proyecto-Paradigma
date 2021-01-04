package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelLiquidacionSueldo extends JPanel{
	private JLabel titulo,icon;
	public PanelLiquidacionSueldo() {
		setLayout(null);
		setBackground(Color.orange);
		labels();
	}
	private void labels() {
		titulo = new JLabel("Liquidacion de Suelto");
		titulo.setBounds(250,100,400,40);
		titulo.setFont(new Font("serif",Font.PLAIN,22));

		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		add(titulo);
		add(icon);
	}
}
