package ejercicio2;

public class Main {

	public static void main(String[] args) {
		//Creamos los objetos
		Empleado E1 = new Empleado ("Rafa");
		Directivo D1 = new Directivo ("Mario");
		Operario Op1=new Operario ("Alfonso");
		Oficial Of1= new Oficial ("Luis");
		Tecnico T1 = new Tecnico ("Pablo");
		
		//Mostramos por pantalla
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(Op1);
		System.out.println(Of1);
		System.out.println(T1);
		

	}

}
