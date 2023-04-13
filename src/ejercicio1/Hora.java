package ejercicio1;

public class Hora {
	/**
	 * Se guardara una cantidad de horas
	 */
	protected int hora = 0;
	/**
	 * Se guardara una cantidad de minutos
	 */
	protected int minuto = 0;

	/**
	 * Constructor con parámetros
	 * 
	 * @param hora
	 * @param minuto
	 */
	public Hora(int hora, int minuto) {
		super();
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto <= 59)
			this.minuto = minuto;
	}

	/**
	 * Metodo que incrementa en un minuto
	 */
	void inc() {
		minuto++;
		if (minuto == 60) {
			hora++;
			minuto = 0;
			if (hora >= 24) {
				hora = 0;
			}
		}
	}

	/**
	 * Método que comprueba que los minutos son correctos
	 * 
	 * @param valor
	 * @return Devuelve true en caso de que se encuentreen el rango 0 y 60
	 */
	boolean setMinutos(int valor) {
		boolean result = false;
		if (valor >= 0 && valor < 60) {
			minuto = valor;
			result = true;
		}
		return result;
	}

	/**
	 * Método que comprueba que la hora es correcta
	 * 
	 * @param valor
	 * @return Devuelve true en caso de que se encuentre en el rango de 0 y 24
	 */
	boolean setHora(int valor) {
		boolean result = false;
		if (valor >= 0 && valor < 24) {
			hora = valor;
			result = true;
		}
		return result;
	}

	/**
	 * Método que muestra la información
	 */
	public String toString() {
		String result = "";
		if (hora < 10) {
			result += "0";
		}
		result += hora + ":";

		if (minuto < 10) {
			result += "0";
		}
		result += minuto+":";

		return result;

	}

}
