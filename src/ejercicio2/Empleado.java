package ejercicio2;

public class Empleado {
	/**
	 * Se guardará el nombre del empleado
	 */
	private String nombre;

	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		super();
		
	}
	
	/**
	 * Constructor con parámetros
	 * @param nombre
	 */
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	/**
	 * Getter 
	 * @return Devuelve el nombre del empleado
	 */
	public String getNombre() {
		return nombre="";
	}

	/**
	 * Setter
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método toString que mostrará el nombre del empleado
	 */
	public String toString() {
		return "Empleado "+ nombre;
	}
	
	
	
}
