package ejercicio4;

import java.util.function.Consumer;

public class Televisión extends Electrodoméstico {
	private double resolucion=20;
	private boolean tdt=false;
	
	public Televisión() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Televisión(double precioBase, Colores color, ConsEnerg consumo, double peso) {
		super(precioBase, color, consumo, peso);
		// TODO Auto-generated constructor stub
	}
	public Televisión(double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}
	public Televisión(double resolucion, boolean tdt,double precio, double peso,Color color, Consumo consumo) {
		super(precio, peso, color, consumo);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	
}
