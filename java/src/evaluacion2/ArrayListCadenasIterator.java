package evaluacion2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListCadenasIterator {

	public static void main(String[] args) {
		// recibe Strings por teclado hasta que se introduce un String en blanco y los
		// va almacenando en un ArrayList. Cuando finaliza la introducci�n muestra el
		// contenido del array por pantalla. iterator

		// Necesidades previas
		String C;
		ArrayList<String> arrayListString = new ArrayList<String>();

		// Definir teclado
		Scanner teclado = new Scanner(System.in);

		// Pide cadena
		System.out.printf("Introduce una cadena: ");
		C = teclado.nextLine();

		// compruebo que no esta el array lleno o la cadena vacia
		while (!C.isEmpty()) {

			// a�ado la cadena al diccionario
			arrayListString.add(C);

			// leo otra cadena
			System.out.printf("Introduce una cadena: ");
			C = teclado.nextLine();
		}
			// desplazo los elementos una posicion a la derecha
			Iterator<String> it = arrayListString.iterator();
			String valor = "";
			while (it.hasNext()) {
				valor = it.next();
				System.out.println(valor);
			}
		

		// libero memoria signada a teclado
		teclado.close();

	}

}
