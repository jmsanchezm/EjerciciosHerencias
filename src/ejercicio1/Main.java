package ejercicio1;

public class Main {

	public static void main(String[] args) {
		HoraExacta hora =new HoraExacta (23,59,6);
		hora.setHora(54);
		hora.setMinutos(5);
		hora.setSegundo(45);
		hora.inc();
		System.out.println(hora);
		
	}

}
