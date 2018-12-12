package evaluacion1;

import java.util.Scanner;

public class leernum1 {

	public static void main(String[] args) {
		//  lee un número entero por teclado, le suma 1 y lo muestra por pantalla
		
		int n;
		int resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("* Introduce un valor entero *");
		
		n = teclado .nextInt();
		
		resultado = n + 1;
		
		System.out.println("El valor de la variable es " + resultado);
		System.out.printf("El valor de la variable es %d",resultado);
		
		teclado.close();

	}

}
