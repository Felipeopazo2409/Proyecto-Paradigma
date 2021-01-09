package paquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;


public class VentanaTrabajador extends JFrame{
	
	public PanelTrabajador panel;
	private JScrollPane scrollpane;
	public PanelInsertarTrabajador panelInsertarTrabajador;
	public PanelValidarTrabajador panelValidarTrabajador;
	public PanelModificarTrabajador panelModificarTrabajador;
	public PanelEliminarTrabajador panelEliminarTrabajador;
	private PanelConsultarDatos panelConsultarTrabajador;
	private PanelLiquidacionSueldo panelLiquidacionTrabajador;
	public JSONObject trabajador = new JSONObject();
	
	public VentanaTrabajador() {
		panel = new PanelTrabajador();
		setSize(780,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(false);
		setLocationRelativeTo(null);
		Inicializar();
		navegacion();
		volver_atras();
		insertarDatos();
		leer_datos();
	}
	private void Inicializar() {
		 scrollpane = new JScrollPane();
		 scrollpane.setBounds(1,1,779,500);
		 scrollpane.setViewportView(panel);
		 add(scrollpane);
	}
	private void navegacion() {
		//Instancia de paneles 
		panelInsertarTrabajador = new PanelInsertarTrabajador();
		panelModificarTrabajador = new PanelModificarTrabajador();
		panelEliminarTrabajador = new PanelEliminarTrabajador ();
		panelConsultarTrabajador = new PanelConsultarDatos();
		panelLiquidacionTrabajador = new PanelLiquidacionSueldo ();
		panelValidarTrabajador = new PanelValidarTrabajador();
		//pinchar boton para ingresar un trabajador
		panel.ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panelInsertarTrabajador);
			}
		});
		
		//Pinchar Boton para modificar un trabajador
		panel.modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panelValidarTrabajador);
				
			}
		});
		

		//Pinchar Boton para Eliminar un trabajador
		panel.eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panelEliminarTrabajador);
			}
		});
		//Pinchar Boton para Consultar Datos de un trabajador
		panel.consultar_datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panelConsultarTrabajador);
			}
		});
		//Pinchar Boton para Generar Liquidacion de sueldo
		panel.generar_liquidacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panelLiquidacionTrabajador);
			}
		});
	}
	private void volver_atras() {
		panelInsertarTrabajador.cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panel);
			}
		});
		
		panelModificarTrabajador.cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panel);
			}
		});
		
		//panelValidarTrabajador.buscar.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//		scrollpane.setViewportView(panelModificarTrabajador);
		//	}
		//});
		
		panelEliminarTrabajador.cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panel);
			}
		});
		panelConsultarTrabajador.volver_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panel);
			}
		});
		panelLiquidacionTrabajador.volver_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollpane.setViewportView(panel);
			}
		});
		
	}
	
	public void insertarDatos() {

		
		panelInsertarTrabajador.guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				crear_json();
				
			}
		});
		
	}
	private void crear_json() {
		JSONArray jsonArray = new JSONArray();
		JSONObject trabajador;
		trabajador = new JSONObject();
		String nombre = panelInsertarTrabajador.campoNombre.getText();
		String apellidoP = panelInsertarTrabajador.campoApellidoPaterno.getText();
		String apellidoM = panelInsertarTrabajador.campoApellidoMaterno.getText();
		String obtener_rut = panelInsertarTrabajador.campoRut.getText();
		String fecha = panelInsertarTrabajador.campoNacimiento.getText();
		String tipo_contrato = panelInsertarTrabajador.contrato.getSelectedItem().toString();
		String obtener_salario = panelInsertarTrabajador.campoSalario.getText();
		String departamento = panelInsertarTrabajador.campoDepartamento.getText();
		int rut = Integer.parseInt(obtener_rut);
		int salario = Integer.parseInt(obtener_salario);
		
		trabajador.put("Nombre",nombre);
		trabajador.put("Apellido Paterno", apellidoP);
		trabajador.put("Apellido Materno",apellidoM);
		trabajador.put("Rut", rut);
		trabajador.put("Fecha de nacimiento",fecha);
		trabajador.put("Tipo Contrato", tipo_contrato);
		trabajador.put("Salario", salario);
		trabajador.put("Departamento", departamento);
		jsonArray.put(trabajador);
		
		JSONObject lista = new JSONObject();
		lista.put("Trabajador", jsonArray);
		
	
	}
	
	
	private void leer_datos() {
		JSONParser parser = new JSONParser();
		
		panelConsultarTrabajador.buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Reader myReader = Files.newBufferedReader(Paths.get("Trabajadores.json"));
					Gson gson= new Gson();
					Map <?,?> MapTrabajadores = gson.fromJson(myReader, Map.class);
					System.out.println(MapTrabajadores.get("Nombre"));
				}catch(IOException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
	
		
		
	
	}

}