package evaluacion1;

import java.util.Scanner;

public class doblenum {

	public static void main(String[] args) {
		//  lee un número entero por teclado, calcula su doble y lo muestra por pantalla
		
		int n;
		int resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("* Introduce un valor entero *");
		
		n = teclado .nextInt();
		
		resultado = n * 2;
		
		System.out.println("El valor de la variable es " + resultado);
		
		teclado.close();

	}

}
