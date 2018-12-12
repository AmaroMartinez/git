package evaluacion1;

import java.util.Scanner;

public class cubo {

	public static void main(String[] args) {
		//   lee un número por teclado y calcula el cubo de ese número. 
		
		double n;
		double resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("* Introduce un valor entero *");
		
		n = teclado .nextDouble();
		
		resultado = n * n * n;
		
		System.out.println("El valor de la variable es " + resultado);
		System.out.printf("El valor de la variable es %.2f",resultado);
		
		teclado.close();

	}

}
