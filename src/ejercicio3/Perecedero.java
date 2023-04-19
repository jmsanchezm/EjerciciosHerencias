package ejercicio3;

public class Perecedero extends Productos {

	/**
	 * Se guardarán los días que falta para que un producto caduque
	 */
	private int diasCaduca = 0;

	/**
	 * Constructor por defecto
	 */
	public Perecedero() {
		super();
	}

	/**
	 * Constructor con parámetros de la clase padre
	 * 
	 * @param nombre
	 * @param precio
	 * @param diasCaduca
	 */
	public Perecedero(String nombre, double precio, int diasCaduca) {
		super(nombre, precio);
		if (diasCaduca > 0) {
			this.diasCaduca = diasCaduca;
		}

	}

	/**
	 * Constructor con parámetro de la misma clase
	 * 
	 * @param diasCaduca
	 */
	public Perecedero(int diasCaduca) {
		super();
		this.diasCaduca = diasCaduca;
	}

	/**
	 * Getter
	 * 
	 * @return
	 */
	public int getDiasCaduca() {
		return diasCaduca;
	}

	/**
	 * Setter
	 * 
	 * @param diasCaduca
	 */
	public void setDiasCaduca(int diasCaduca) {
		this.diasCaduca = diasCaduca;
	}

	@Override
	public double calcular(int cantidad) {
		double result = super.calcular(cantidad);

		if (diasCaduca == 1) {
			result /= 4;
		} else if (diasCaduca == 2) {
			result /= 3;
		} else if (diasCaduca == 3) {
			result /= 2;
		}

		return result;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + diasCaduca;
	}

}
