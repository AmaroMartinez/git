package evaluacion1;

import java.util.Scanner;

public class valorabs {

	public static void main(String[] args) {
		//    Lee el valor de un número entero por teclado y
		//		muestra su valor absoluto por pantalla. 
		
		int n;
		int resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("* Introduce una cantidad *");

		n = teclado .nextInt();
		
		if (n>0) {
		resultado = n;
		}
		else {
			resultado = -n;
		}
		
		System.out.println("El valor absoluto de " + n + " es " + resultado);

		teclado.close();
	}

}
