package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumveces {

	public static void main(String[] args) {

		/*
		 * Pide números del 0 al 9 por pantalla y calcula el número de veces que han
		 * sido introducidos utilizando un ArrayList.
		 */

		// Necesidades previas
		int n, valor;
		
		//Creo el arraylist
		ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
		//lo inicializo con 10 elementos
		for (int posicion=0; posicion < 10; posicion++) {
			arrayListInteger.add(0);
		}

		// Definir teclado
		Scanner teclado = new Scanner(System.in);

		// Pide numero
		System.out.printf("Introduce un valor real: ");
		n = teclado.nextInt();
		
		
		while (n >= 0 && n <= 9) {
			valor = arrayListInteger.get(n);
			valor = valor+1;
			arrayListInteger.set(n, valor);
			
			// Pide otro numero
			System.out.printf("Introduce un valor real: ");
			n = teclado.nextInt();
		}
		
		for (int posicion=0; posicion < arrayListInteger.size(); posicion++) {
			valor = arrayListInteger.get(posicion);
			System.out.println(posicion + " : " + valor + " veces ");
		}

		// Cierra teclado
		teclado.close();


	}

}
