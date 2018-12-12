package evaluacion1;

import java.util.Scanner;

public class retesuel {

	public static void main(String[] args) {
		// Lee el sueldo de un trabajador por teclado y muestra por pantalla la
		// retención que se le aplica sabiendo que si
		// Sueldo < 1000.00 retención 10%
		// Sueldo 1000.00 retención 12%
		// Sueldo > 1000.00 retención 14%

		double sueldo;
		double retencion;

		Scanner teclado = new Scanner(System.in);

		System.out.println("* Introduce una cantidad *");

		sueldo = teclado.nextDouble();

		if (sueldo < 1000) {
			retencion = sueldo * 0.10;

		} else if (sueldo == 1000) {
			retencion = sueldo * 0.12;

		} else {
			retencion = sueldo * 0.14;
		}

		System.out.println("La retencion es " + retencion);

		teclado.close();
	}

}
