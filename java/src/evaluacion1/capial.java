package evaluacion1;

import java.util.Scanner;

public class capial {

	public static void main(String[] args) {
		// pide una cantidad en euros, un tipo de interés (ej: 5,5%), y un período
		// de tiempo expresado en días por pantalla y calcula el interés producido en ese
		// tiempo en base a la fórmula Interes=(Cantidad*TipoInteres*Tiempo)/(360*100)
		// Nota: Para mostrar el carácter ‘%’ dentro de printf debemos escribir ‘%%’.
		// Sino mostrará una excepción.  
		
		double cantidad;
		double tipointeres;
		int tiempo;
		double interes;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("* Introduce cantidad *");
		cantidad = teclado .nextDouble();

		
		System.out.println("* Introduce tipo de interes *");
		tipointeres = teclado .nextDouble();

		System.out.println("* Introduce tiempo *");
		tiempo = teclado .nextInt();
		
		interes = (cantidad*tipointeres*tiempo)/(360*100);
		
		System.out.println("El valor de la variable es " + interes + " %");
		System.out.printf("El valor de la variable es %.2f %%",interes);
		
		teclado.close();

	}

}
