package evaluacion1;

import java.util.Scanner;

public class calcuiva {

	public static void main(String[] args) {
		// Lee una cantidad en euros por teclado y muestra por pantalla su IVA
		// sabiendo que si la cantidad es menor que 20000 el IVA es el 10% y sino del
		// 21%.

		double cantidad;
		double iva;

		Scanner teclado = new Scanner(System.in);

		System.out.println("* Introduce una cantidad *");

		cantidad = teclado.nextInt();

		if (cantidad < 20000) {
			iva = cantidad * 0.1;
		} else {
			iva = cantidad * 0.21;
		}
		System.out.println("El iva es " + iva);
		teclado.close();
	}

}
