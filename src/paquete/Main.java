package paquete;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		Home inicio = new Home();
		Panel panel = new Panel();
		ventana.setSize(780,500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(true);
		ventana.add(inicio);

		
		ventana.setVisible(true);
	}

}
