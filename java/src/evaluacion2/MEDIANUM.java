package evaluacion2;

import java.util.Scanner;

public class MEDIANUM {

	public static void main(String[] args) {
		/*
		 * Pide números de 0 a 9 por pantalla y calcula el número de veces que han sido
		 * introducidos utilizando un array. Finaliza la introducción de datos cuando se
		 * introduce un valor negativo o mayor que 9. Al finalizar la introducción de
		 * datos muestra por pantalla el número de veces que se ha introducido cada
		 * número.
		 */
		
		//Necesidades previas
		int n, posicion, elementos;
		int [] arrayenteros = new int [5];
		double media;
		
		//Definir teclado
		Scanner teclado = new Scanner (System.in);
		
		//Pide numero
		System.out.printf("Introduce un valor real: ");
		n = teclado.nextInt();
		
		//Inicializar elementos
		elementos = 0;
		
		//Comprueba que n es mayor o igual que 0 y elementos menor que 5
		//recoge de 0 a 5 numeros y actualiza elementos
		while (n >= 0 && elementos < 5) {
			arrayenteros[elementos] = n;
			elementos = elementos +1;
			//Si elementos es menor que 5 pide numero
			if (elementos < 5) {
			System.out.printf("Introduce un valor real: ");
			n = teclado .nextInt();
			}
		}
		
		//Cierra teclado
		teclado.close();
		
		//Inicializar variables
		posicion = 0;
		media = 0.0;
		
		//Comprueba que posicion es menor que elementos y realiza la suma de los numeros.
		while (posicion < elementos) {
			media = media + arrayenteros[posicion];
			posicion = posicion +1;
		}
		
		//realiza la media y la muestra por pantalla
		media = media / elementos;
		System.out.printf("La media es: " + media);
		
	}

}
