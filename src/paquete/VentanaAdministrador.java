package paquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VentanaAdministrador extends JFrame {
	private JScrollPane scrollpane;
	public PanelAdministracion admin;
	public MenuPrincipal menu;
	public PanelInsertarDepto insertar;
	public PanelEliminarDepto eliminar;
	public PanelMostrarDepto mostrar_info;
	public ArrayList<Departamento> lista_departamentos = new ArrayList();
	public Departamento departamento;
	public JSONArray arreglo_departamentos = new JSONArray();
	public int id_depto=0;
	public VentanaAdministrador() {
		setSize(780,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(false);
		setLocationRelativeTo(null);
		 admin = new PanelAdministracion();
		 scrollpane = new JScrollPane();
		 scrollpane.setBounds(1,1,779,500);
		 scrollpane.setViewportView(admin);
		 add(scrollpane);
		 navegacion();
		 volver_atras();
		 insertar_datos();
		 
	}
	public void navegacion() {
		insertar = new PanelInsertarDepto();
		eliminar = new PanelEliminarDepto();
		mostrar_info = new PanelMostrarDepto();
		//Pincho oton para insertar un nuevo departamento
		admin.ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(insertar);
			}
		});
		
		//Pincho boton para eliminar Departamento
		
		admin.eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(eliminar);
			}
		});
		
		//pincho boton para mostrar informacion de todos los departamentos
		
		admin.mostrarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(mostrar_info);
			}
		});

	}
	
	private void volver_atras() {
		insertar.volver_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(admin);
			}
		});
		eliminar.cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(admin);
			}
		});
		
		mostrar_info.volver_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(admin);
			}
		});
	}
	
	private void insertar_datos() {
		insertar.guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crear_json();
			}
		});
	}
	private void crear_json() {
		//Obtenemos informacion desde los campos textField, para poder instanciar un objeto de 
		//Departamento
		String n_depto = insertar.campo1.getText();
		String nombre = insertar.campo2.getText();
		String numero_trabajadores= insertar.campo3.getText();
		int numero_depto = Integer.parseInt(n_depto);
		int n_trabajadores = Integer.parseInt(numero_trabajadores);
		
		departamento = new Departamento(numero_depto,nombre,n_trabajadores);
			JSONObject lista = new JSONObject();
		   lista_departamentos.add(departamento);
			JSONObject Departamentos = new JSONObject();
			Departamentos.put("N_depto",departamento.getNumero_depto());
			Departamentos.put("Nombre",departamento.getNombre());
			Departamentos.put("Cantidad Trabajadores",departamento.getCantidad_trabajadores());
		//	arreglo_departamentos.put(Departamentos);
			id_depto++;
			lista.put("Trabajador"+(id_depto+1), Departamentos);
     	  Gson gson = new GsonBuilder().setPrettyPrinting().create();
     	  String json = gson.toJson(lista);
	
     	  FileWriter file;
		try {
			file = new FileWriter("Departamentos.json");
			file.write(json.toString());
			file.flush();
			file.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
