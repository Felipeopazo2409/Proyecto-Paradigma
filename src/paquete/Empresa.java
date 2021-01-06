package paquete;

public class Empresa {
	private String nombre;
	private int cant_trabajadores;
	public Empresa(String nombre,int cant_trabajadores) {
		this.nombre = nombre;
		this.cant_trabajadores = cant_trabajadores;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setTrabajadores(int cantidad) {
		this.cant_trabajadores = cantidad;
	}
	public int getTrabajadores() {
		return cant_trabajadores;
	}
	
}
