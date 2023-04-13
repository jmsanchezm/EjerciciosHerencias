package ejercicio2;

public class Directivo extends Empleado {
	
	/**
	 * Constructor con parámetros
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
		
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return super.toString()+"-> Directivo";
	}
	

}
