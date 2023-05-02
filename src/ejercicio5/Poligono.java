package ejercicio5;

public abstract class Poligono {
	/**
	 * Se guardará el número de lados Se inicaliza a 3 El motivo es porque no hay un
	 * polígono con un numero de lados menor a 3
	 */
	protected int numeroLados = 3;

	/**
	 * Creamos el método abstracto area
	 */
	abstract public double area();

	/**
	 * Contructor con parámetros
	 * 
	 * @param numeroLados
	 */
	public Poligono(int numeroLados) {
		super();
		// Si el numero de lados es mayor o igual a 3
		if (numeroLados >= 3)
			this.numeroLados = numeroLados;
	}

	/**
	 * @return the numeroLados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}
	
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Numero de lados: " + numeroLados;
	}
}
