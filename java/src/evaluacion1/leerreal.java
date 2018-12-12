package evaluacion1;

import java.util.Scanner;

public class leerreal {

	public static void main(String[] args) {
		//  lee un número real por teclado y 
		// muestra por pantalla el mensaje "El valor de la variable introducida es ".
		
		double n;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("* Introduce un valor real *");
		
		n = teclado .nextDouble();
		
		System.out.println("El valor de la variable es " + n);
		System.out.printf("El valor de la variable es %.2f",n);
		
		teclado.close();

	}

}
