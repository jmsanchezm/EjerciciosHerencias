package ejercicio1;

public class Hora {
	/**
	 * Se guardara una cantidad de horas
	 */
	int hora=0;
	/**
	 * Se guardara una cantidad de minutos
	 */
	int minuto=0;

	/**
	 * Constructor con parámetros
	 * 
	 * @param hora
	 * @param minuto
	 */
	public Hora(int hora, int minuto) {
		super();
		this.hora = hora;
		this.minuto = minuto;
	}

	/**
	 * Metodo que incrementa en un minuto
	 */
	void inc() {
		minuto++;
		if (minuto==60) {
			hora++;
			minuto=0;
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
			result = true;
		}
		return result;
	}

	/**
	 * Método que muestra la información
	 */
	public String toString() {
		String result = "";

		if (hora <= 9 && minuto >= 10) {
			result = "0" + hora + ":" + minuto;

		} else if (minuto < 10 && hora > 10) {
			result = hora + ":" + "0" + minuto;

		} else if (minuto < 10 && hora < 10) {
			result = "0" + hora + ":" + "0" + minuto;

		} else {
			result = hora + ":" + minuto;
		}

		return result;

	}

}
