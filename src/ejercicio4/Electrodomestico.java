package ejercicio4;

public class Electrodomestico {

	/**
	 * Se guardara el precio de del articulo
	 */
	double precioBase = 100;
	/**
	 * Se guardara el consumo del articulo
	 */
	ConsumoEnergetico consumo = ConsumoEnergetico.F;
	/**
	 * Se guardara el color del articulo
	 */
	Colores color = Colores.Blanco;
	/**
	 * Se guaradara el peso del articulo
	 */
	double peso = 5;

	/**
	 * Enum donde se guardan los colores disponibles
	 * 
	 * @author sanch
	 *
	 */
	enum Colores {
		Blanco, Negro, Rojo, Azul, Gris
	}

	/**
	 * Enum donde se guardan los diferentes consumos energeticos
	 * 
	 * @author sanch
	 *
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	/**
	 * Contructor por defecto
	 */
	public Electrodomestico() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		super();
		// Si el precio es mayor a 0
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		// Si el peso es mayor a 0
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase
	 * @param consumo
	 * @param color
	 * @param peso
	 */
	public Electrodomestico(double precioBase, ConsumoEnergetico consumo, Colores color, double peso) {
		super();
		this.precioBase = precioBase;
		this.consumo = consumo;
		this.color = color;
		this.peso = peso;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return the consumo
	 */
	public ConsumoEnergetico getConsumo() {
		return consumo;
	}

	/**
	 * @return the color
	 */
	public Colores getColor() {
		return color;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Método que comprueba si la letra es correcta
	 * 
	 * @param letra
	 * @return
	 */
	private boolean comprobarConsumoEnergetico(char letra) {
		boolean result = false;
		// Si la letra se encuentra en este rango alfabetico
		if (letra >= 'A' && letra <= 'F') {
			// result sera true
			result = true;
		}
		// Devolvemos el resultado
		return result;

	}

	/**
	 * Método que comprueba el color del electrodomestico
	 * 
	 * @param color
	 * @return
	 */
	private boolean comprobarColor(String color) {
		boolean result = false;
		// Creamos un switch
		switch (color) {
		// En el caso de que el color tenga alguno de estos valores
		case "blanco", "negro", "rojo", "azul", "gris":
			// result sera true
			result = true;
		}
		// Devolvemos el resultado
		return result;
	}

	/**
	 * Método que incrementa el precio en base al consumo y peso
	 */
	public double precioFinal() {
		double precio=this.precioBase;
		// Creamos un switch en función del valor del consumo
		switch (consumo) {
		case A:
			precio += 100;
			break;
		case B:
			precio += 80;
			break;
		case C:
			precio += 60;
			break;
		case D:
			precio += 50;
			break;
		case E:
			precio+= 30;
			break;
		case F:
			precio+= 10;
			break;
		}
		// Si el precio se encuentra en el intervalo,
		if (peso >= 0 && peso <= 19) {
			// Se sumará al precio 10
			precio += 10;
			// Si está entre 20 y 49
		} else if (peso >= 20 && peso <= 49) {
			// Se sumará al precio 50
			precio+= 50;
			// Si el peso es mayor a 50 y menor a 79
		} else if (peso >= 50 && peso <= 79) {
			// Se sumará al precio 80
			precio += 80;
			// Si el peso es mayor a 80
		} else if (peso <= 80) {
			// Se sumará 100
			precio += 100;
		}
		return precio;
	}

}
