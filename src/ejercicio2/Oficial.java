package ejercicio2;

public class Oficial extends Operario {

	/**
	 * Constructor con parámetros
	 * @param nombre
	 */
	public Oficial(String nombre) {
		super(nombre);
		
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return super.toString()+"-> Oficial";
	}

	
}
