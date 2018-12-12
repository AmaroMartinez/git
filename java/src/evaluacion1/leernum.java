package evaluacion1;

import java.util.Scanner;

public class leernum {

	public static void main(String[] args) {
		//  lee un número entero por teclado y lo muestra por pantalla
		
		int n;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("* Introduce un valor entero *");
		
		n = teclado .nextInt();
		
		System.out.println("El valor de la variable es " + n);
		System.out.printf("El valor de la variable es %d",n);
		
		teclado.close();

	}

}
