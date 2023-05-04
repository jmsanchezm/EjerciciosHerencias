package ejercicio4;

public class Lavadora extends Electrodomestico {

	/**
	 * Se guardara el valor de la carga de la lavadora
	 */
	double carga = 5;

	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		super();
	}

	/**
	 * Constructor con dos parametros: precio y pes
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param precioBase
	 * @param consumo
	 * @param color
	 * @param peso
	 * @param carga
	 */
	public Lavadora(double precioBase, ConsumoEnergetico consumo, Colores color, double peso, double carga) {
		super(precioBase, consumo, color, peso);
		// Si la carga es mayor de cero
		if (carga > 0) {
			// Tomara el valor
			this.carga = carga;
		}
	}

	/**
	 * @return the carga
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * Método que añade mas dinero si la carga es mayor a 30
	 */
	@Override
	public double precioFinal() {
	double precio =	super.precioFinal();
		if (carga >= 30) {
			precio+= 50;
		}
		return precio;
	}
	
}
