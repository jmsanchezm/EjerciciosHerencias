package ejercicio5;

public class Triangulo extends Poligono {

	/**
	 * Se guardará la longitud del lado 1
	 */
	private double lado1 = 1;
	/**
	 * Se guardara la longitud del lado 2
	 */
	private double lado2 = 1;
	/**
	 * Se guardara la longitud del lado 3
	 */
	private double lado3 = 1;

	/**
	 * Constructor por defecto
	 * 
	 * @param numeroLados
	 */
	public Triangulo(int numeroLados) {
		super(numeroLados);
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		//Si el lado1 es mayor a 0
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		// Si el lado2 es mayor a 0
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		//Si el lado3 es mayor a 0
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	/**
	 * @return the lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * @param lado1 the lado1 to set
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * @return the lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * @param lado2 the lado2 to set
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * @return the lado3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * @param lado3 the lado3 to set
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	/**
	 * Método que calcula el area del triangulo
	 */
	@Override
	public double area() {
		double result=(lado1 + lado2 + lado3) / 2;
		result=((result-lado1)*(result-lado2)*(result-lado3));
		return Math.sqrt(result*result);
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Triangulo: " + lado1 +" ,"+ lado2+", "+  lado3+ " -->"+area()+"\n";
	}
	
	
	
}
