package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEnterosMenuOrdenadoDescendente {

	public static void main(String[] args) {
		// Crea la clase ArrayListEnterosMenuOrdenado que muestra un menú por pantalla
		// con las siguientes opciones para manipular datos de tipo Integer

		// Necesidades previas
		int n;
		int E;
		ArrayList<Integer> Enteros = new ArrayList<Integer>();
		Scanner teclado = new Scanner(System.in);

		n = 0;
		System.out.printf(
				"\n Enteros \n \n Selecciona una opcion (1,2,3,4,5) \n \n 1.- Añadir Entero \n 2.- Buscar Entero \n 3.- Borrar Entero \n 4.- Listar Enteros \n 5.- Salir \n\n Opcion: ");
		n = teclado.nextInt();
		System.out.printf("\n");
		while (n != 0) {

			switch (n) {

			case 1:

				// Añadir Entero

				// Limpio el buffer (teclado)
				//teclado.nextInt();

				// Pide Entero
				System.out.printf("Introduce un entero: ");
				E = teclado.nextInt();
				System.out.printf("\n");

				// compruebo que no esta el array lleno o la cadena vacia
				//if (!E.isEmpty()) {

					// añado la cadena al diccionario
					if (!(Enteros.contains(E))) {
						Enteros.add(E);
						System.out.printf("Añadido el Entero: " + E + "\n");
					} else if (Enteros.contains(E)) {
						System.out.printf("Entero duplicado, no se añadio: " + E + "\n");

					}

				//}

				break;

			case 2:

				// Buscar Palabra en el diccionario

				// Limpio el buffer (teclado)
				//teclado.nextInt();

				// Pide cadena
				System.out.printf("Introduce un Entero: ");
				E = teclado.nextInt();
				System.out.printf("\n");

				// compruebo que no esta el array lleno o la cadena vacia
				//if (!E.isEmpty()) {

					// añado la cadena al diccionario
					if (Enteros.contains(E)) {
						System.out.printf("El entero " + E + " esta en el diccionario\n");
					} else if (!(Enteros.contains(E))) {
						System.out.printf("ERROR. El entero " + E + " no esta en el diccionario \n");

					}

				//}

				break;

			case 3:

				// Borrar Entero

				// Limpio el buffer (teclado)
				//teclado.nextInt();

				// Pide Entero
				System.out.printf("Introduce un Entero: ");
				E = teclado.nextInt();
				System.out.printf("\n");

				// compruebo que no esta el array lleno o la cadena vacia
				//if (!E.isEmpty()) {

					// Borro el entero si existe
					if (Enteros.contains(E)) {
						Enteros.remove(E);
						System.out.printf("Eliminado el Entero: " + E + "\n");
					} else if (!(Enteros.contains(E))) {
						System.out.printf("El Entero no esta en el array, no se borro: " + E + "\n");

					}

				//}

				break;

			case 4:

				// Listar Enteros

				Collections.sort(Enteros);

				System.out.printf("Listado de Enteros \n");
				for (int posicion = 0; posicion < Enteros.size(); posicion++) {
					System.out.println(Enteros.get(posicion));
				}

				break;

			case 5:

				// Salir
				System.out.printf("Adios \n");
				System.exit(0);
				break;
			}

			System.out.printf(
					"\n Enteros \n \n Selecciona una opcion (1,2,3,4,5) \n \n 1.- Añadir Entero \n 2.- Buscar Entero \n 3.- Borrar Entero \n 4.- Listar Enteros \n 5.- Salir \n\n Opcion: ");
			n = teclado.nextInt();
			System.out.printf("\n");
		}

		teclado.close();

	}

}
