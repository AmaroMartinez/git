package evaluacion1;

import java.util.Scanner;

public class sacanumw {

	public static void main(String[] args) {
		// Pide un numero entero por teclado y muestra la suma de todos los números
		// desde 1 hasta el inclusive. Con MIENTRAS.

		int POSICION;
		int N;

		Scanner teclado = new Scanner(System.in);
		System.out.println("* Introduce un valor para N *");
		N = teclado.nextInt();
		teclado.close();

		POSICION = 1;

		while (POSICION <= N) {
			System.out.println(POSICION);
			POSICION = POSICION + 1;
		}

	}

}
