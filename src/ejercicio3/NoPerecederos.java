package ejercicio3;

public class NoPerecederos extends Productos {

	/**
	 * Se guardará el tipo del producto
	 */
	protected String tipo;

	/**
	 * Constructor por defecto
	 */
	public NoPerecederos() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con los parámetros de la clase padre
	 * 
	 * @param nombre
	 * @param precio
	 */
	public NoPerecederos(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;

	}

	public NoPerecederos(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}

	@Override
	public String toString() {
		return super.toString() + ", " + tipo;
	}
}
