package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDiccionario {

	public static void main(String[] args) {
		// Recibe palabras por teclado y las almacena en un array de Strings en orden
		// alfabético ascendente hasta que llega una cadena vacía que no será tenida en
		// cuenta (isEmpty()) o el array esté lleno. Una vez finalizado el proceso
		// muestra el contenido del array por pantalla.

		// Necesidades previas
		int n;
		String C;
		ArrayList<String> diccionario = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);

		n = 0;
		System.out.printf(
				"\n DICCIONARIO \n \n Selecciona una opcion (1,2,3,4,5) \n \n 1.- Añadir Palabra \n 2.- Buscar Palabra \n 3.- Borrar Palabra \n 4.- Listar Diccionario \n 5.- Salir \n\n Opcion: ");
		n = teclado.nextInt();
		System.out.printf("\n");
		while (n != 0) {

			switch (n) {

			case 1:

				// Añadir Palabra al diccionario

				//Limpio el buffer (teclado)
				teclado.nextLine();
				
				// Pide cadena
				System.out.printf("Introduce una cadena: ");
				C = teclado.nextLine();
				System.out.printf("\n");

				// compruebo que no esta el array lleno o la cadena vacia
				if (!C.isEmpty()) {

					// añado la cadena al diccionario
					if (!(diccionario.contains(C))) {
						diccionario.add(C);
						System.out.printf("Añadida la palabra: " + C + "\n");
					} else if (diccionario.contains(C)) {
						System.out.printf("Palabra duplicaca, no se añadio: " + C + "\n");

					}
					
				}

				break;

			case 2:

				// Buscar Palabra en el diccionario

				//Limpio el buffer (teclado)
				teclado.nextLine();
				
				// Pide cadena
				System.out.printf("Introduce una cadena: ");
				C = teclado.nextLine();
				System.out.printf("\n");

				// compruebo que no esta el array lleno o la cadena vacia
				if (!C.isEmpty()) {

					// añado la cadena al diccionario
					if (diccionario.contains(C)) {
						System.out.printf("La palabra " + C + " esta en el diccionario\n");
					} else if (!(diccionario.contains(C))) {
						System.out.printf("ERROR. La palabra " + C + " no esta en el diccionario \n");

					}
				
				}

				break;

			case 3:

				// Borrar Palabra del diccionario

				//Limpio el buffer (teclado)
				teclado.nextLine();
				
				// Pide cadena
				System.out.printf("Introduce una cadena: ");
				C = teclado.nextLine();
				System.out.printf("\n");

				// compruebo que no esta el array lleno o la cadena vacia
				if (!C.isEmpty()) {

					// añado la cadena al diccionario
					if (diccionario.contains(C)) {
						diccionario.remove(C);
						System.out.printf("Eliminada la palabra: " + C + "\n");
					} else if (!(diccionario.contains(C))) {
						System.out.printf("La palabra no esta en el diccionario, no se borro: " + C + "\n");

					}

				}

				break;

			case 4:

				// Listar Diccionario
				
				Collections.sort(diccionario);
				
				System.out.printf("Listado del diccionario \n");
				for (int posicion = 0; posicion < diccionario.size(); posicion++) {
					System.out.println(diccionario.get(posicion));
				}

				break;

			case 5:

				// Salir
				System.out.printf("Adios \n");
				System.exit(0);
				break;
			}

			System.out.printf(
					"\n DICCIONARIO \n \n Selecciona una opcion (1,2,3,4,5) \n \n 1.- Añadir Palabra \n 2.- Buscar Palabra \n 3.- Borrar Palabra \n 4.- Listar Diccionario \n 5.- Salir \n\n Opcion: ");
			n = teclado.nextInt();
			System.out.printf("\n");
		}

		teclado.close();


	}

}
