package ejercicio3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Productos[] producto = new Productos[3];

		producto [0] = new Perecedero("Mantequilla", 1.5, 20);
		producto [1] = new NoPerecederos("Aceite", 2.3,"Semilla");
		producto [2] = new Perecedero ("Pan Bimbo",1,2);
		
		
		
		for (Productos valores : producto) {
			System.out.println(valores);
		}
	}

}
