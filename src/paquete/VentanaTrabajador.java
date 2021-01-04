package paquete;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class VentanaTrabajador extends JFrame{
	public PanelTrabajador panel;
	private JScrollPane scrollpane;
	public VentanaTrabajador() {
		panel = new PanelTrabajador();
		setSize(780,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(false);
		 scrollpane = new JScrollPane();
		 scrollpane.setBounds(1,1,779,500);
		 scrollpane.setViewportView(panel);
		 add(scrollpane);
		 
	}
}
