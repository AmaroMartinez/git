package evaluacion2;

import java.util.Scanner;

public class NUMVECES {

	public static void main(String[] args) {

		/*
		 * Pide números de 0 a 9 por pantalla y calcula el número de veces que han sido
		 * introducidos utilizando un array. Finaliza la introducción de datos cuando se
		 * introduce un valor negativo o mayor que 9. Al finalizar la introducción de
		 * datos muestra por pantalla el número de veces que se ha introducido cada
		 * número.
		 */
		
		//Necesidades previas
		int n, posicion;
		int[] arrayenteros = new int[10];

		//Definir teclado
		Scanner teclado = new Scanner(System.in);
		
		//Pide numero
		System.out.printf("Introduce un valor real: ");
		n = teclado.nextInt();

		//Comprueba que n es mayor o igual que 0 y menor o igual que 9.
		//comprueba el numero de veces que se ha introducido un numero.
		while (n >= 0 && n <= 9) {
			arrayenteros[n] = arrayenteros[n] + 1;
			//Pide otro numero
			System.out.printf("Introduce un valor real: ");
			n = teclado.nextInt();
		}

		//Cierra teclado
		teclado.close();

		//Inicializar posicion
		posicion = 0;

		//comprueba que posicion es menor que 10
		while (posicion < 10) {
			//saca por pantalla las veces que se ha introducido un numero
			System.out.printf(posicion + " : " + arrayenteros[posicion] + " Veces | ");
			//Actualizar la posicion
			posicion = posicion + 1;
		}

	}

}
