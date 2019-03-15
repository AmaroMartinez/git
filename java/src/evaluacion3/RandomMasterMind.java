package evaluacion3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Clase que genera un numero aleatorio de 4 cifras que no se repiten y cuando sale un 10 para de generar.

public class RandomMasterMind {

	public static void main(String[] args) {

		// Necesidades previas
		ArrayList<Integer> numerocorrecto = new ArrayList<Integer>();
		int cifra;
		Random rnd = new Random();

		Scanner teclado = new Scanner(System.in);
		String numero;

		int cifrascorrecta = 0;
		int posicionescorrectas = 0;
		int posicioncorrecta;

		// Generar 4 numeros aleatorios diferentes
		while (numerocorrecto.size() < 4) {
			cifra = ((int) (rnd.nextDouble() * 100000.0)) % 10;
			if (!(numerocorrecto.contains(cifra))) {
				numerocorrecto.add(cifra);
			}
		}

		// Mostrar el arraylist
		// System.out.println("Numero Generado " + numerocorrecto);
		/*
		 * for (int i = 0; i < numerocorrecto.size(); i++) {
		 * System.out.println(numerocorrecto.get(i)); }
		 */
		System.out.println("Adivina el numero");
		System.out.println("-----------------");
		do {
			// Pedir un numero de 4 cifras al usuario

			System.out.println("Introduce un numero de 4 cifras");
			numero = teclado.nextLine();
			cifrascorrecta = 0;
			posicionescorrectas = 0;
			// Si el numero tiene 4 cifras
			if (numero.length() == 4) {
				// Por cada cifra indico si coincide la posicion
				for (int posicion = 0; posicion < 4; posicion++) {
					cifra = numero.charAt(posicion) - '0';
					// Mostrar la cifra
					// System.out.println("Cifra: " + cifra);
					// Compruebo si hay alguna cfra en el numero correcto
					posicioncorrecta = numerocorrecto.indexOf(cifra); // Devuelve la posicion o -1 si no lo encuentra
					if (posicioncorrecta != -1) {
						// Si la cifra esta en el numero correcto
						cifrascorrecta = cifrascorrecta + 1;
						// Compruebo si coincide la posicion
						if (posicion == posicioncorrecta) {
							// Si la cifra esta en la misma posicion
							posicionescorrectas = posicionescorrectas + 1;
						}
					}
				}
			}

			// Muestro cuantas cifras y posiciones correctas hay
			if (posicionescorrectas != 4) {
				System.out.println("Cifras correctas: " + cifrascorrecta + " || Posiciones correctas: " + posicionescorrectas);
				System.out.println();
			}

			// Cuando las posiciones correctas son 4 sale de la repetitiva
		} while (posicionescorrectas != 4);

		// Muestro mensaje cuandos e ha adivinado el numero
		System.out.println("Enhorabuena has acertado el numero, era el: " + numero);

		// Cerrar teclado
		teclado.close();
	}

}
