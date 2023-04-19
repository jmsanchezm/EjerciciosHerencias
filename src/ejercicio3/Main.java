package ejercicio3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int cant = 5;
		double sumaProductos = 0;
		double sumaPrecio = 0;
		double sumaPrecio2 = 0;

		Productos[] producto = new Productos[10];

		producto[0] = new NoPerecederos("Galletas", 2.15, "Maria");
		producto[1] = new NoPerecederos("Café", 4.5, "Mocca");
		producto[2] = new NoPerecederos("Aceite", 5.99, "Girasol");
		producto[3] = new NoPerecederos("Leche", 2.99, "Entera");
		producto[4] = new NoPerecederos("Cacao", 6.99, "En Polvo");
		producto[5] = new Perecedero("Yogur", 0.99, 2);
		producto[6] = new Perecedero("Mantequilla", 2.99, 1);
		producto[7] = new Perecedero("Tomate", 1.99, 2);
		producto[8] = new Perecedero("Mermelada", 2.99, 3);
		producto[9] = new Perecedero("Sopa", 0.95, 3);

		for (int i = 0; i < producto.length; i++) {

			sumaPrecio = producto[i].calcular(cant);
			sumaProductos += sumaPrecio;
			System.out.println(producto[i]);
			System.out.println();
			System.out.println("Precio total de cada producto: " + sumaPrecio);
			System.out.println("-----------------------------");
		}

		System.out.println("La suma total de precios es de " + sumaProductos);
	}

}
