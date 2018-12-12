package evaluacion1;

import java.util.Scanner;

public class centimoseuro {

	public static void main(String[] args) {
		//    lee una cantidad en euros por teclado y 
		//		muestra por separado el número de euros y el número de céntimos de euro 
		
		double dinero;
		int euros;
		int centimos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("* Introduce una cantidad *");

		dinero = teclado .nextDouble();
		
		euros = (int)dinero;
		centimos = (int)((dinero - euros)*100);
		
		System.out.println("Euros:  " + euros);
		System.out.println("Centimos: " + centimos);
		
		teclado.close();
	}

}
