package evaluacion3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListEnterosMenuOrdenado {

	public static void main(String[] args) {
		// Crea la clase ArrayListEnterosMenuOrdenado que muestra un menú por pantalla
		// con las siguientes opciones para manipular datos de tipo Integer

		// Necesidades previas
		int n;
		int E;
		ArrayList<Complejo> Complejos = new ArrayList<Complejo>();
		Scanner teclado = new Scanner(System.in);
		Complejo valor = new Complejo();

		n = 0;
		System.out.printf(
				"\n Enteros \n \n Selecciona una opcion (1,2,3,4,5) \n \n 1.- Añadir Complejo \n 2.- Buscar Complejo \n 3.- Borrar Complejo \n 4.- Listar Complejos \n 5.- Salir \n\n Opcion: ");
		n = teclado.nextInt();
		System.out.printf("\n");
		while (n != 0) {

			switch (n) {

			case 1:

				// Añadir Complejo

				// Pide Complejo
				System.out.printf("Introduce un Complejo: ");
				
				valor.leer(teclado);
				E = teclado.nextInt();
				System.out.printf("\n");

				// compruebo que no esta el array lleno o la cadena vacia
				//if (!E.isEmpty()) {

					// añado la cadena al diccionario
					if (!(Complejos.contains(E))) {
						Complejos.add(E);
						System.out.printf("Añadido el Complejo: " + E + "\n");
					} else if (Complejos.contains(E)) {
						System.out.printf("Complejo duplicado, no se añadio: " + E + "\n");

					}

				//}

				break;

			case 2:

				// Buscar Complejo en el array

				// Pide Complejo
				System.out.printf("Introduce un Complejo: ");
				E = teclado.nextInt();
				System.out.printf("\n");

				// compruebo que no esta el array lleno o la cadena vacia

					// añado la cadena al diccionario
					if (Complejos.contains(E)) {
						System.out.printf("El Complejo " + E + " esta en el diccionario\n");
					} else if (!(Complejos.contains(E))) {
						System.out.printf("ERROR. El Complejo " + E + " no esta en el diccionario \n");

					}


				break;

			case 3:

				// Borrar Complejo

				// Pide Complejo
				System.out.printf("Introduce un Complejo: ");
				E = teclado.nextInt();
				System.out.printf("\n");

				// compruebo que no esta el array lleno o la cadena vacia
				//if (!E.isEmpty()) {

					// Borro el entero si existe
					if (Complejos.contains(E)) {
						Complejos.remove(E);
						System.out.printf("Eliminado el Complejo: " + E + "\n");
					} else if (!(Complejos.contains(E))) {
						System.out.printf("El Complejo no esta en el array, no se borro: " + E + "\n");

					}

				//}

				break;

			case 4:

				// Listar Complejo
				Comparator<Complejo> comparador = Collections.reverseOrder(); 
				Collections.sort(Complejos, comparador);

				System.out.printf("Listado de Enteros \n");
				for (int posicion = 0; posicion < Complejos.size(); posicion++) {
					System.out.println(Complejos.get(posicion));
				}

				break;

			case 5:

				// Salir
				System.out.printf("Adios \n");
				System.exit(0);
				break;
			}

			System.out.printf(
					"\n Complejos \n \n Selecciona una opcion (1,2,3,4,5) \n \n 1.- Añadir Complejo \n 2.- Buscar Complejo \n 3.- Borrar Complejo \n 4.- Listar Complejo \n 5.- Salir \n\n Opcion: ");
			n = teclado.nextInt();
			System.out.printf("\n");
		}

		teclado.close();

	}

}
