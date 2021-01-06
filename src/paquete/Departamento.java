package paquete;

public class Departamento extends Empresa{
	private int numero_depto;
	public Departamento(int numero_depto,String nombre,int cantidad_trabajadores) {
		super(nombre,cantidad_trabajadores);
		this.numero_depto = numero_depto;
	}
	public void setNumero_depto(int numero_depto) {
		this.numero_depto = numero_depto;
	}
	public int getNumero_depto() {
		return numero_depto;
	}
	
}
