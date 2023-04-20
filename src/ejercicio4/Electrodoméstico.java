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

	private boolean comprobarColor(String color) {
		boolean result = false;

		switch (color) {
		case "blanco", "negro", "rojo", "azul", "gris":
			result = true;
		}

		return result;
	}
	
	public void precioFinal() {
		
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
		
		if (peso>=0 && peso<=19) {
			precioBase+=10;
		}else if (peso>=20 && peso<=49) {
			precioBase+=50;
		}else if (peso>=50 && peso<=79) {
			precioBase+=80;
		}else if (peso<=80){
			precioBase+=100;
		}
	}
}
