package evaluacion1;

import java.util.Scanner;

public class signonum {

	public static void main(String[] args) {
		//  lee un número entero por teclado, le cambia el signo y lo muestra por pantalla
		
		int n;
		int resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("* Introduce un valor entero *");
		
		n = teclado .nextInt();
		
		resultado = -n;
		
		System.out.println("El valor de la variable es " + resultado);
		
		teclado.close();

	}

}
