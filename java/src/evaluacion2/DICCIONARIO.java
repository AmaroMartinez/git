package evaluacion2;

import java.util.Scanner;

public class DICCIONARIO {

	public static void main(String[] args) {
		// Recibe palabras por teclado y las almacena en un array de Strings en orden
		// alfabético ascendente hasta que llega una cadena vacía que no será tenida en
		// cuenta (isEmpty()) o el array esté lleno. Una vez finalizado el proceso
		// muestra el contenido del array por pantalla.

		// Necesidades previas
		int elementos, posicion;
		String C;
		String[] diccionario = new String[5];

		// Definir teclado
		Scanner teclado = new Scanner(System.in);

		// Pide cadena
		System.out.printf("Introduce una cadena: ");
		C = teclado.nextLine();

		//compruebo que no esta el array lleno o la cadena vacia
		elementos = 0;
		while (!(C.isEmpty()) && elementos < 5) {
			
			//añado la cadena al diccionario de manera ordenada
			
			//busacar la posicion
			posicion = 0;
			while (posicion < elementos) {
				
				//compruebo si es la posicion
				if (C.compareTo(diccionario[posicion]) < 0) {
					
					//salgo de la repetitiva
					break;
				}
				
				//incremento posicion
				posicion = posicion + 1;
			}
			
			//desplazo los elementos una posicion a la derecha
			for (int posmov=elementos;posmov>posicion;posmov--) {
				diccionario[posmov] = diccionario[posmov-1];
			}
			
			//inserto la cadena en la posicion
			diccionario[posicion] = C;
			
			//incremento elementos
			elementos = elementos + 1;
			
			//leo otra cadena
			if (elementos < 5) {
				System.out.printf("Introduce una cadena: ");
				C = teclado.nextLine();
			}
		}
		
		//libero memoria signada a teclado
		teclado.close();
		
		//mostrar el contenido de diccionario
		posicion = 0;
		while (posicion < elementos) {
			System.out.printf(diccionario[posicion] + " ");
			posicion = posicion + 1;
		}

	}

}
