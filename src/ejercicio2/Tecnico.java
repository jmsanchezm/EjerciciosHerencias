package ejercicio2;

public class Tecnico extends Operario {

	/**
	 * Constructor con parámetros
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return super.toString()+"-> Tecnico";
	}

	
}
