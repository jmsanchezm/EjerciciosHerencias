package ejercicio4;

public class Lavadora extends Electrodoméstico {

	double carga=5;

	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lavadora (double precio, double peso) {
		super (precio,peso);
	}
	public Lavadora (double carga, double precio,double peso) {
		super (precio,peso);
		this.carga=carga;
	}

	/**
	 * @return the carga
	 */
	public double getCarga() {
		return carga;
	}

	@Override
	public void precioFinal() {
		if (carga>=30) {
		
		}
	
	}
}
