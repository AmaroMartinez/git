package evaluacion1;

import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
		//    Lee el valor de un número entero por teclado y
		//		muestra por pantalla si es par o impar. 
		
		int n;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("* Introduce una cantidad *");

		n = teclado .nextInt();
		
		if ((n % 2)==0) {
		System.out.println("El valor " + n + " es par");
		}
		else {
		System.out.println("El valor " + n + " es impar");
		}

		teclado.close();
	}

}
