package ejercicio2;

public class Operario extends Empleado {

	/**
	 * Constructor con parámetros
	 * @param nombre
	 */
	public Operario(String nombre) {
		super(nombre);
		
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return super.toString()+"-> Operario";
	}
	
}
