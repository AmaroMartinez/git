package evaluacion1;

import java.util.Scanner;

public class leernumd {

	public static void main(String[] args) {
		// Pide un n�mero entero por teclado, si el n�mero entero que se pide por
		// teclado es negativo sigue pidiendo n�meros hasta que se introduzca un n�mero
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
