package evaluacion1;

import java.util.Scanner;

public class sumanumf {

	public static void main(String[] args) {
		// Pide un numero entero por teclado y muestra la suma de todos los números
		// desde 1 hasta el inclusive. Con PARA.

		int POSICION;
		int N;
		int SUMA;

		Scanner teclado = new Scanner(System.in);
		System.out.println("* Introduce un valor para N *");
		N = teclado.nextInt();
		teclado.close();

		SUMA = 0;

		for (POSICION = 1; POSICION <= N; POSICION = POSICION + 1) {
			SUMA = SUMA + POSICION;
		}
		
		System.out.println(SUMA);
	}

}
