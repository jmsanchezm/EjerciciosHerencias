package ejercicio4;

public class Television extends Electrodomestico {

	/**
	 * Se guardara la resolucion de la pantalla
	 */
	double resolucion = 20;

	/**
	 * Se guardara si la tv tiene tdt
	 */
	boolean tdt = false;

	/**
	 * Constructor por defecto
	 */
	public Television() {
		super();
	}

	/**
	 * Constructor con el precio y el peso
	 * 
	 * @param precioBase
	 * @param peso
	 * @param resolucion
	 * @param tdt
	 */
	public Television(double precioBase, double peso, double resolucion, boolean tdt) {
		super(precioBase, peso);
		// Si la resolucion es mayor a 0
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.tdt = tdt;
	}

	/**
	 * Constructor con todos los parametros
	 * @param precioBase
	 * @param consumo
	 * @param color
	 * @param peso
	 * @param resolucion
	 * @param tdt
	 */
	public Television(double precioBase, ConsumoEnergetico consumo, Colores color, double peso, double resolucion, boolean tdt) {
		super(precioBase, consumo, color, peso);
		// Si la resolucion es mayor a 0
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.tdt = tdt;
	}

	/**
	 * @return the resolucion
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * @return the tdt
	 */
	public boolean isTdt() {
		return tdt;
	}

	/**
	 * Método que incrementara el precio
	 */
	public double precioFinal () {
		double precio= super.precioFinal();
		if (resolucion>=40) {
			precio+= (precio*30/100);
		}
		if (tdt) {
			precio+=50;
		}
		
		return precio;
	}
	
	
	
}
