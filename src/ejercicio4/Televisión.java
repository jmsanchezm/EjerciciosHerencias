package ejercicio4;

import java.util.function.Consumer;

public class Televisión extends Electrodoméstico {
	/**
	 * Se guardará la resolución de la pantalla
	 */
	private double resolucion = 20;
	/**
	 * Se guardará si la tv contiene tdt
	 */
	private boolean tdt = false;

	/**
	 * Constructor por defecto
	 */
	public Televisión() {
		super();
	}

	/**
	 * Constructor con parametros
	 * @param precioBase
	 * @param peso
	 * @param tdt
	 * @param resolucion
	 */
	public Televisión(double precioBase, double peso, boolean tdt, double resolucion) {
		super(precioBase, peso);
		this.tdt = tdt;
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
	}

	public Televisión(double resolucion, boolean tdt) {
		super();
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	/**
	 * @return the resolucion
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * @return the tdt
	 */
	public boolean isTdt() {
		return tdt;
	}

	/**
	 * Constructor con parámetros
	 * @param precioBase
	 * @param peso
	 * @param color
	 * @param consumo
	 * @param resolucion
	 * @param tdt
	 */
	public Televisión(double precioBase, double peso, String color, char consumo, double resolucion, boolean tdt) {
		super(precioBase, peso, color, consumo);
		if (resolucion >= 0) {
			this.resolucion = resolucion;
		}
		this.tdt = tdt;

	}

}
