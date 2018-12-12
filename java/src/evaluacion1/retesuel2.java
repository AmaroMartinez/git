package evaluacion1;

import java.util.Scanner;

public class retesuel2 {

	public static void main(String[] args) {
		// Lee el sueldo de un trabajador por teclado y muestra por pantalla la
		// retención que se le aplica sabiendo que si
		// sueldo < 1000.00 retencion 10%
		// sueldo 1000.00 retencion 12%
		// sueldo < 2000.00 retencion 14%
		// sueldo 2000.00 retencion 16%
		// sueldo > 2000.00 retencion 18%

		double sueldo;
		double retencion;

		Scanner teclado = new Scanner(System.in);

		System.out.println("* Introduce una cantidad *");

		sueldo = teclado.nextDouble();

		if (sueldo < 1000) {
			retencion = sueldo * 0.10;

		} else if (sueldo == 1000) {
			retencion = sueldo * 0.12;

		} else if (sueldo < 2000) {
			retencion = sueldo * 0.14;

		} else if (sueldo == 2000) {
			retencion = sueldo * 0.16;

		} else {
			retencion = sueldo * 0.18;
		}
		System.out.println("La retencion es " + retencion);

		teclado.close();
	}

}
