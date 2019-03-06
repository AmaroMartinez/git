package evaluacion3;

import java.util.Scanner;

//Realiza la clase Java LeerEnteroException que lee un número entero por teclado. Si todo va bien lo muestra por pantalla y si se produce una excepción muestra un mensaje de error por pantalla. Comprueba el ejercicio con los valores l y 1. 

public class LeerEnteroString {

	public static void main(String[] args) {

		// Necesidades previas
		String numero;
		int n = 0;

		// Definir teclado
		Scanner teclado = new Scanner(System.in);

		// Pide numero
		System.out.printf("Introduce un valor entero: ");
		numero = teclado.nextLine();

		// Lo convierte a int
		n = Integer.parseInt(numero);

		// Mostrar por pantalla
		System.out.print(n);

		// Mensaje de despedida
		System.out.printf("\nAdios");

		// Cerrar el teclado
		teclado.close();

	}

}
