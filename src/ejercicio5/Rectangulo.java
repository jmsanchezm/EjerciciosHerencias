package ejercicio5;

public class Rectangulo extends Poligono {

	/**
	 * Se guardará la longitud del lado 1
	 */
	private double lado1 = 1;
	/**
	 * Se guardará la longitud del lado 2
	 */
	private double lado2 = 1;

	/**
	 * Constructor por defecto
	 * 
	 * @param numeroLados
	 */
	public Rectangulo(int numeroLados) {
		super(numeroLados);
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 */
	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		// Si el lado1 es mayor a 0
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		// Si el lado2 es mayor a 0
		if (lado2 > 0) {
			this.lado2 = lado2;
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
	 * Método que calcula el area del rectangulo
	 */
	@Override
	public double area() {
		return lado1 * lado2;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Rectángulo: " + lado1 + "," + lado2 + "--> "+area()+"\n" ;
	}

}
