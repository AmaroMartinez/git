package evaluacion1;

import java.util.Scanner;

public class areacirc {

	public static void main(String[] args) {
		//  lee el valor del radio por teclado y muestra
		// 	el valor del area de la circunferencia de ese radio 
		//	por pantalla con dos decimales.
		// 	Para el cálculo podemos usar la constante Java Math.PI.
		
		double radio;
		double resultado;
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("* Introduce un valor entero *");
		
		radio = teclado .nextDouble();
		
		resultado = (Math.PI) * (radio * radio);
		
		System.out.println("El valor de la variable es " + resultado);
		System.out.printf("El valor de la variable es %.2f",resultado);
		
		teclado.close();

	}

}
