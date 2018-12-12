package evaluacion1;

import java.util.Scanner;

public class tabnotas {

	public static void main(String[] args) {
		// Lee la nota de un alumno por teclado y muestra por pantalla la calificación
		// que le corresponde sabiendo que si

		int nota;

		Scanner teclado = new Scanner(System.in);

		System.out.println("* Introduce una nota *");

		nota = teclado.nextInt();
		
		teclado.close();

		if (nota >= 0) {
				if (nota < 3) {
					System.out.println("MD");
				}
				else if (nota < 5) {
					System.out.println("INS");
				}
				else if (nota < 6) {
					System.out.println("SUF");
				}
				else if (nota < 7) {
					System.out.println("BIEN");
				}
				else if (nota < 9) {
					System.out.println("NOT");
				}
				else if (nota <= 10) {
					System.out.println("SOBRE");
				}
		}

		}

	}
