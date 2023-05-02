package ejercicio4;

public class Electrodoméstico {
	double precioBase = 100;
	Colores color = Colores.blanco;
	ConsEnerg consumo = ConsEnerg.F;
	double peso = 5;

	enum Colores {
		blanco, negro, rojo, azul, gris
	}

	enum ConsEnerg {
		A, B, C, D, E, F
	}

	/**
	 * Constructor por defecto
	 */
	public Electrodoméstico() {
		super();

	}

	/**
	 * Constructor con sólo dos parámetros de entrada
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodoméstico(double precioBase, double peso) {
		super();
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor con todos los parámetros de entrada
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Electrodoméstico(double precioBase, Colores color, ConsEnerg consumo, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return the color
	 */
	public Colores getColor() {
		return color;
	}

	/**
	 * @return the consumo
	 */
	public ConsEnerg getConsumo() {
		return consumo;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Método que comprueba que el consumo se encuentra entre los valores del
	 * enumerado
	 * 
	 * @param letra
	 * @return
	 */
	private boolean comprobarConsumoEnergetico(char letra) {
		boolean result = false;
		if (letra >= 'A' && letra <= 'F') {
			result = true;
		}

		return result;

	}

	/**
	 * Método que comprueba que el color se encuentra en el enumerado Colores
	 * @param color
	 * @return Devuelve true en el caso de que esté en el enumerado, false en caso contrario
	 */
	private boolean comprobarColor(String color) {
		boolean result = false;

		switch (color) {
		case "blanco", "negro", "rojo", "azul", "gris":
			result = true;
		}

		return result;
	}
	
	/**
	 * Método que incrementa el precio en base al consumo y el peso
	 */
	public void precioFinal() {
		
		//Creamos un switch en función del valor del consumo
		switch (consumo) {
		case A: 
			precioBase+=100;
			break;
		case B:
			precioBase+=80;
			break;
		case C:
			precioBase+=60;
			break;
		case D:
			precioBase+=50;
			break;
		case E:
			precioBase+=30;
			break;
		case F:
			precioBase+=10;
			break;
		}
		// Si el precio se encuentra en el intervalo, 
		if (peso>=0 && peso<=19) {
			//Se sumará al precio 10
			precioBase+=10;
		//Si está entre 20 y 49
		}else if (peso>=20 && peso<=49) {
			//Se sumará al precio 50
			precioBase+=50;
		//Si el peso es mayor a 50 y menor a 79
		}else if (peso>=50 && peso<=79) {
			//Se sumará al precio 80
			precioBase+=80;
		//Si el peso es mayor a 80
		}else if (peso<=80){
			//Se sumará 100
			precioBase+=100;
		}
	}
}
