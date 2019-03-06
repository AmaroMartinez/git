package evaluacion3;

import java.util.InputMismatchException;
import java.util.Scanner;

//Programa que pide un numero entero por pantalla, lo mete en un array y muestra los numeros de uno en uno.

public class array {

	public static void main(String[] args) {

		// Necesidades previas
		int n = 0;
		char[] cadena;
		String numero;

		// Definir teclado
		Scanner teclado = new Scanner(System.in);

		// Controlamos si meten algo que no sea un numero
		try {

			// Pide numero
			System.out.printf("Introduce un valor entero: ");
			n = teclado.nextInt();

			// Convertir el int n a un string llamado numero
			numero = Integer.toString(n);

			// Convertir el string numero a un array de tipo char llamado cadena
			cadena = numero.toCharArray();

			// Enseñar por pantalla los datos del array
			for (int posicion = 0; posicion < cadena.length; posicion++)
				System.out.println(cadena[posicion]);

			// Si se introduce algo que no sea, en vez de mostrar el error
			// InputMismatchException se mostrara un mensaje.
		} catch (InputMismatchException e) {

			// Mensaje de error
			System.out.printf("Debes introducir un numero entero \n");

		}

		// Mensaje de despedida
		System.out.printf("Adios");

		// Cerrar el teclado
		teclado.close();

	}

}
