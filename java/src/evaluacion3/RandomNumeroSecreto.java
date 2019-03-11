package evaluacion3;

import java.util.Random;
import java.util.Scanner;

// Clase que genera un numero aleatorio de 1 a 10 y pide que adivines cual es el numero, sino lo adivinas te da la pista de si es mayor o menor.

public class RandomNumeroSecreto {

	public static void main(String[] args) {

		// Necesidades previas
		int numero, numerousuario;
		Random rnd = new Random();
		Scanner teclado = new Scanner(System.in);

		// Generar un numero aleatorio
		numero = ((int) (rnd.nextDouble() * 100000.0)) % 10 + 1;
		// System.out.println(numero);

		// Repetitiva para adivinar el numero
		do {
			System.out.println("Numero: ");
			numerousuario = teclado.nextInt();
			if (numerousuario > numero) {
				System.out.println("El numero secreto es menor");
			} else if (numerousuario < numero) {
				System.out.println("El numero secreto es mayor");
			}

		} while (numerousuario != numero);

		// Cerrar teclado
		teclado.close();

		// Mensaje de final
		System.out.println("Has acertado, el numero secreto era: " + numero + "\nFin");
	}

}
