package ejercicio1;

public class HoraExacta extends Hora {

	
	/**
	 * Se guardará la cantidad de segundos
	 */
	int segundo=0;

	/**
	 * Constructor con parámetros
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo=segundo;
	}
	
	/**
	 * Setter de segundo
	 * @param valor
	 */
	void setSegundo (int valor) {
		if (valor>=0 && valor<60) {
			segundo = valor;
		}
	} 
	
	/**
	 * Método que incrementará en uno a segundo
	 */
	void inc() {
		segundo++;
		if (segundo==60) {
			
			super.inc();
			segundo=0;
		}
	}
	/**
	 * Método toString
	 */
	public String toString () {
		String result=super.toString()+":"+segundo;
		if (segundo<10) {
			result=super.toString()+":"+"0"+segundo;
		}
		return result;
	}
	
}
