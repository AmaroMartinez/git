package evaluacion1;

import java.util.Scanner;

public class capial {

	public static void main(String[] args) {
		// pide una cantidad en euros, un tipo de inter�s (ej: 5,5%), y un per�odo
		// de tiempo expresado en d�as por pantalla y calcula el inter�s producido en ese
		// tiempo en base a la f�rmula Interes=(Cantidad*TipoInteres*Tiempo)/(360*100)
		// Nota: Para mostrar el car�cter �%� dentro de printf debemos escribir �%%�.
		// Sino mostrar� una excepci�n.  
		
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
