package ejercicio3;

public class Productos {

	protected String nombre;
	protected double precio;

	public Productos() {
		super();

	}

	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Método que calculará el importe total de los productos
	 * 
	 * @param cantidad
	 * @return
	 */
	public double calcular(int cantidad) {
		return cantidad * precio;
	}

	@Override
	public String toString() {
		return nombre + ", " + precio;
	}

}
