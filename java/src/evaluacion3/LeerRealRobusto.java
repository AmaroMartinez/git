package evaluacion3;

import java.util.Scanner;

//Realiza la clase Java LeerEnteroException que lee un n�mero entero por teclado. Si todo va bien lo muestra por pantalla y si se produce una excepci�n muestra un mensaje de error por pantalla. Comprueba el ejercicio con los valores l y 1. 

public class LeerRealRobusto {

	public static void main(String[] args) {

		// Necesidades previas
		String numero = "";
		double n = 0;

		// Definir teclado
		Scanner teclado = new Scanner(System.in);

		// Controlamos si meten algo que no sea un numero
		try {

			// Pide numero
			System.out.printf("Introduce un valor real: ");
			numero = teclado.nextLine();

			// Lo convierte a int
			n = Double.parseDouble(numero);

			// Si se introduce algo que no sea, en vez de mostrar el error
			// InputMismatchException se mostrara un mensaje.
		} catch (NumberFormatException e) {
			// System.out.println("Numero Incorrecto: "+numero);
			String valorcorrecto = "";
			char caracter;
			boolean separador = false;

			// Repetitiva que recorre todos los caracteres del string numero
			for (int posicion = 0; posicion < numero.length(); posicion++) {
				// Asignamos el caracter de la posicion actual al char caracter
				caracter = numero.charAt(posicion);
				// System.out.println("Caracter: "+caracter);
				// Si el caracter es un digito a�ade al string valorcorrecto el caracter
				if (Character.isDigit(caracter)) {
					valorcorrecto += caracter;
				}
				// Si el caracter es una l a�ade al string valorcorrecto el caracter 1
				else if (caracter == 'l') {
					valorcorrecto += '1';
				}
				// Si el caracter es una o mayyuscula o minuscula a�ade al string valorcorrecto
				// el 0
				else if (caracter == 'o' || caracter == 'O') {
					valorcorrecto += '0';
				}
				// Si el caracter es una coma o un punto y es el primer separador decimal a�ade
				// al string valorcorrecto un punto (separador decimal)
				else if ((caracter == ',' || caracter == '.') && separador == false) {
					valorcorrecto += '.';
					separador = true;
				}
			}

			if (valorcorrecto.length() > 0) {
				n = Double.parseDouble(valorcorrecto);
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
