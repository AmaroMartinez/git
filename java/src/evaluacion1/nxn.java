package evaluacion1;

import java.util.Scanner;

public class nxn {

	public static void main(String[] args) {
		// Lee un número entero por teclado y calcula el cuadrado de ese número. Si el
		// cuadrado es mayor que 100 se le restara 100 y se mostrara por pantalla. Si no
		// es mayor que 100, se mostrara lo que le falta para llegar a 100.

		int n;
		int cuadrado;
		int diferencia;

		Scanner teclado = new Scanner(System.in);

		System.out.println("* Introduce una cantidad *");

		n = teclado.nextInt();
		cuadrado = n * n;
		if (cuadrado > 100) {
			diferencia = cuadrado - 100;
			System.out.println("Pasa " + diferencia + " de 100");

		} else {
			diferencia = 100 - cuadrado;
			System.out.println("Le falta " + diferencia + " para llegar a 100");
		}

		teclado.close();
	}

}
