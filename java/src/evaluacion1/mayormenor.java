package evaluacion1;

import java.util.Scanner;

public class mayormenor {

	public static void main(String[] args) {
		// Lee dos números enteros por teclado a y b y muestra por pantalla si el
		// primero es mayor que el segundo, si el segundo es mayor que el primero o si
		// son iguales.

		int A;
		int B;

		Scanner teclado = new Scanner(System.in);

		System.out.println("* Introduce una cantidad para A*");

		A = teclado.nextInt();

		System.out.println("* Introduce una cantidad para B*");

		B = teclado.nextInt();

		if (A > B) {
			System.out.println(A + "(A) Es mayor que " + B + "(B)");

		} else if (B > A) {
			System.out.println(A + "(A) Es menor que " + B + "(B)");
		} else {
			System.out.println(A + "(A) Es igual que " + B + "(B)");
		}
		teclado.close();
	}

}
