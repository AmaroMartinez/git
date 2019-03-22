package evaluacion3;

import java.util.Scanner;

//Realiza la clase Java LeerEnteroException que lee un número entero por teclado. Si todo va bien lo muestra por pantalla y si se produce una excepción muestra un mensaje de error por pantalla. Comprueba el ejercicio con los valores l y 1. 

public class LeerEnteroRobustoTxema {

	public static void main(String[] args) {

		// Necesidades previas
		String numero = "";
		int n = 0;

		// Definir teclado
		Scanner teclado = new Scanner(System.in);

		// Controlamos si meten algo que no sea un numero
		try {

			// Pide numero
			System.out.printf("Introduce un valor real: ");
			numero = teclado.nextLine();

			// Lo convierte a int
			n = Integer.parseInt(numero);

			// Si se introduce algo que no sea, en vez de mostrar el error
			// InputMismatchException se mostrara un mensaje.
		} catch (NumberFormatException e) {
			// System.out.println("Numero Incorrecto: "+numero);
			String valorcorrecto = "";
			char caracter;

			for (int posicion = 0; posicion < numero.length(); posicion++) {
				caracter = numero.charAt(posicion);
				// System.out.println("Caracter: "+caracter);
				if (Character.isDigit(caracter)) {
					valorcorrecto += caracter;
				} else if (caracter == 'l') {
					valorcorrecto += '1';
				} else if (caracter == 'o' || caracter == 'O') {
					valorcorrecto += '0';
				}
			}

			if (valorcorrecto.length() > 0) {
				n = Integer.parseInt(valorcorrecto);
			}
		}

		// Mostrar por pantalla
		System.out.print(n);

		// Mensaje de despedida
		System.out.printf("\nAdios");

		// Cerrar el teclado
		teclado.close();

	}

}
