package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PersonaMenu {

	public static void main(String[] args) {
		// Crea la clase ArrayListEnterosMenuOrdenado que muestra un menú por pantalla
		// con las siguientes opciones para manipular datos de tipo Integer

		// Necesidades previas
		int n;
		Persona P = new Persona();
		ArrayList<Persona> Persona = new ArrayList<Persona>();
		Scanner teclado = new Scanner(System.in);

		n = 0;
		System.out.printf(
				"\n Persona \n \n Selecciona una opcion (1,2,3,4,5) \n \n 1.- Añadir Persona \n 2.- Buscar Persona \n 3.- Borrar Persona \n 4.- Listar Persona \n 5.- Salir \n\n Opcion: ");
		n = teclado.nextInt();
		System.out.printf("\n");
		while (n != 0) {

			switch (n) {

			case 1:

				// Añadir Entero

				// Limpio el buffer (teclado)
				teclado.nextLine();

				// Pide Persona
				P.leer(teclado);
				System.out.println(P);

				// compruebo que no esta el array lleno o la cadena vacia
				//if (!E.isEmpty()) {

					// añado la cadena al diccionario
					if (!(Persona.contains(P))) {
						Persona.add(P);
						System.out.printf("Añadida la persona: " + P + "\n");
					} else if (Persona.contains(P)) {
						System.out.printf("Persona duplicada, no se añadio: " + P + "\n");

					}

				//}

				break;

			case 2:

				// Buscar Palabra en el diccionario

				// Limpio el buffer (teclado)
				teclado.nextLine();

				// Pide Persona
				P.leer(teclado);
				System.out.println(P);

				// compruebo que no esta el array lleno o la cadena vacia
				//if (!E.isEmpty()) {

					// añado la cadena al diccionario
					if (Persona.contains(P)) {
						System.out.printf("El entero " + P + " esta en el diccionario\n");
					} else if (!(Persona.contains(P))) {
						System.out.printf("ERROR. El entero " + P + " no esta en el diccionario \n");

					}

				//}

				break;

			case 3:

				// Borrar Entero

				// Limpio el buffer (teclado)
				teclado.nextLine();

				// Pide Entero
				P.leer(teclado);
				System.out.println(P);

				// compruebo que no esta el array lleno o la cadena vacia
				//if (!E.isEmpty()) {

					// Borro el entero si existe
					if (Persona.contains(P)) {
						Persona.remove(P);
						System.out.printf("Eliminado el Entero: " + P + "\n");
					} else if (!(Persona.contains(P))) {
						System.out.printf("El Entero no esta en el array, no se borro: " + P + "\n");

					}

				//}

				break;

			case 4:

				// Listar Enteros
				Collections.sort(Persona);

				System.out.printf("Listado de Personas \n");
				for (int posicion = 0; posicion < Persona.size(); posicion++) {
					System.out.println(Persona.get(posicion));
				}

				break;

			case 5:

				// Salir
				System.out.printf("Adios \n");
				System.exit(0);
				break;
			}

			System.out.printf(
					"Persona \n \n Selecciona una opcion (1,2,3,4,5) \n \n 1.- Añadir Persona \n 2.- Buscar Persona \n 3.- Borrar Persona \n 4.- Listar Persona \n 5.- Salir \n\n Opcion: ");
			n = teclado.nextInt();
			System.out.printf("\n");
		}

		teclado.close();

	}

}
