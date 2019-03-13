package evaluacion3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Clase que genera un numero aleatorio de 4 cifras que no se repiten y cuando sale un 10 para de generar.

public class RandomMasterMind {

	public static void main(String[] args) {

		// Necesidades previas
		ArrayList<Integer> numerocorrecto = new ArrayList<Integer>();
		int cifra;
		Random rnd = new Random();

		Scanner teclado = new Scanner(System.in);
		String numerostring;
		int nusuario;
		char[] cadena = new char[4];		

		// Generar 4 numeros aleatorios diferentes
		while (numerocorrecto.size() < 4) {
			cifra = ((int) (rnd.nextDouble() * 100000.0)) % 10;
			if (!(numerocorrecto.contains(cifra))) {
				numerocorrecto.add(cifra);
			}
		}

		// Mostrar el arraylist
		System.out.println("Numero Generado " + numerocorrecto);
		/*
		 * for (int i = 0; i < numerocorrecto.size(); i++) {
		 * System.out.println(numerocorrecto.get(i)); }
		 */

		// Pedir un numero de 4 cifras al usuario
		do {
			System.out.println("Adivina el numero");
			System.out.println("-----------------");
			System.out.println("Introduce un numero de 4 cifras");
			numerostring = teclado.nextLine();
			try {
				nusuario = Integer.parseInt(numerostring);
			} catch (NumberFormatException e) {
				try {
				numerostring = numerostring.replaceAll("[^0-9]", "");
				nusuario = Integer.parseInt(numerostring);
				} catch (NumberFormatException e2) {
					numerostring = "";
					nusuario = 0;
				}
			}
		} while (numerostring.length() > 4 || numerostring.length() < 4);
		
		cadena = numerostring.toCharArray();
		
		//Mostrar numero introducido por el usuario
		System.out.println("Numero Introducido: " + nusuario);
		
		//Comparar el numero generado con el numero del usuario
		

		// Cerrar teclado
		teclado.close();
	}

}
