package evaluacion1;

import java.util.Scanner;

public class sumanumw {

	public static void main(String[] args) {
		// Pide un numero entero por teclado y muestra la suma de todos los n�meros
		// desde 1 hasta el inclusive. Con MIENTRAS.

		int POSICION;
		int N;
		int SUMA;

		Scanner teclado = new Scanner(System.in);
		System.out.println("* Introduce un valor para N *");
		N = teclado.nextInt();
		teclado.close();

		SUMA = 0;
		POSICION = 1;

		while (POSICION <= N) {
			SUMA = SUMA + POSICION;
			POSICION = POSICION + 1;
		}
		
		System.out.println(SUMA);

	}

}
