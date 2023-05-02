package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion = 0;// Se guardará la opcion elegida por el usuario
		double lado1; // Se guardara la longitud del lado1
		double lado2; // Se guardará la longitud del lado2
		double lado3; // Se guardara la longitud del lado3

		// Creamos el array de objetos de tipo poligono
		Poligono[] poligonos = new Poligono[0];

		// Creamos el Scanner
		Scanner read = new Scanner(System.in);

		// Ordenamos que haga
		do {
			// Mostramos el menu
			System.out.println("Introduzca una opción ");
			System.out.println("1. Introducir triangulo");
			System.out.println("2. Introducir rectangulo");
			System.out.println("3. Mostrar el contenido del array");
			// Leemos la opcion
			opcion = read.nextInt();

			// Creamos el switch con el parametro opcion
			switch (opcion) {
			// En el caso 1
			case 1:
				
				// Solicito los lados del triangulo
				System.out.println("Introduzca los lados del triangulo de mayor a menor");
				
				// Leo los datos
				lado1 = read.nextDouble();
				lado2 = read.nextDouble();
				lado3 = read.nextDouble();
				
				// Aumento la longitud del array en 1
				poligonos = Arrays.copyOf(poligonos, poligonos.length + 1);
				
				// Y añado a esa posicion del array un objeto, en este caso, de tipo triangulo
				poligonos[poligonos.length - 1] = new Triangulo(3, lado1, lado2, lado3);
				
				// Salimos del switch
				break;
			case 2:
				
				//Solicito los lados del rectangulo
				System.out.println("Introduzca los lados del rectangulo de mayor a menor");
				lado1 = read.nextDouble();
				lado2 = read.nextDouble();

				//Añado una posicion al array
				poligonos = Arrays.copyOf(poligonos, poligonos.length + 1);

				//Creamos un objeto en dicha posición, en este caso de tipo rectangulo
				poligonos[poligonos.length - 1] = new Rectangulo(2, lado1, lado2);
				break;
				
			//En el tercer caso	
			case 3:
				
				// Recorro el array 
				for (int i = 0; i < poligonos.length; i++) {
					//Muestro el contenido de la posicion i con el metodo toString
					System.out.println(poligonos[i].toString());
				}
				
				break;
			//En el cuarto caso
			case 4: 
				//Mensaje de cerrado
				System.out.println("Se ha cerrado el programa");
			break;
			
			//En cualquier otro caso
			default:
				// Mensaje de error
				System.out.println("Opcion no válida");
			}

		//Mientras que la opcion sea menor que cero
		} while (opcion !=4);

		read.close();
	}

}
