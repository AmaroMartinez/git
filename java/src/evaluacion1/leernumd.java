package evaluacion1;

import java.util.Scanner;

public class leernumd {

	public static void main(String[] args) {
		// Pide un número entero por teclado, si el número entero que se pide por
		// teclado es negativo sigue pidiendo números hasta que se introduzca un número
		// positivo que muestra por pantalla (con HACER MIENTRAS).

		int N;

		Scanner teclado = new Scanner(System.in);
		do {
		System.out.println("* Introduce un valor para N *");
		N = teclado.nextInt();
		
		}while (N < 0);
		
		System.out.println("EL NUMERO INTRODUCIDO ES " + N);
		teclado.close();

	}

}
