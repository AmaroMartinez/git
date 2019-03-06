package evaluacion3;

import java.util.InputMismatchException;
import java.util.Scanner;

//Realiza la clase Java LeerEnteroException que lee un número entero por teclado. Si todo va bien lo muestra por pantalla y si se produce una excepción muestra un mensaje de error por pantalla. Comprueba el ejercicio con los valores l y 1. 

public class LeerEnteroException {

	public static void main(String[] args) {

		// Necesidades previas
		int n = 0;
		
		// Definir teclado
		Scanner teclado = new Scanner(System.in);

		// Controlamos si meten algo que no sea un numero
		try {

			// Pide numero
			System.out.printf("Introduce un valor entero: ");
			n = teclado.nextInt();
			
			//Mostrar por pantalla
			System.out.print(n);
			
			// Si se introduce algo que no sea, en vez de mostrar el error
			// InputMismatchException se mostrara un mensaje.
		} catch (InputMismatchException e) {

			// Mensaje de error
			System.out.printf("Debes introducir un numero entero");

		}

		// Mensaje de despedida
		System.out.printf("\nAdios");

		// Cerrar el teclado
		teclado.close();

	}

}
