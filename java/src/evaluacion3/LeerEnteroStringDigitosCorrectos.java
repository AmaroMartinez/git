package evaluacion3;

import java.util.Scanner;

//Realiza la clase Java LeerEnteroException que lee un n�mero entero por teclado. Si todo va bien lo muestra por pantalla y si se produce una excepci�n muestra un mensaje de error por pantalla. Comprueba el ejercicio con los valores l y 1. 

public class LeerEnteroStringDigitosCorrectos {

	public static void main(String[] args) {

		// Necesidades previas
		String numero = "";
		int n;

		// Definir teclado
		Scanner teclado = new Scanner(System.in);

		// Controlamos si meten algo que no sea un numero
		try {

			// Pide numero
			System.out.printf("Introduce un valor entero: ");
			numero = teclado.nextLine();

			// Lo convierte a int
			n = Integer.parseInt(numero);

			// Si se introduce algo que no sea, en vez de mostrar el error
			// InputMismatchException se mostrara un mensaje.
		} catch (NumberFormatException e) {

			// Quitar todo lo que no sean numeros
			numero=numero.replaceAll("[^0-9]", "");
			n = Integer.parseInt(numero);

		}

		// Mostrar por pantalla
		System.out.print(n);

		// Mensaje de despedida
		System.out.printf("\nAdios");

		// Cerrar el teclado
		teclado.close();

	}

}
