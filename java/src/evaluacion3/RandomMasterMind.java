package evaluacion3;

import java.util.Random;
import java.util.Scanner;

// Clase que genera un numero aleatorio de 4 cifras que no se repiten y cuando sale un 10 para de generar.

public class RandomMasterMind {

	public static void main(String[] args) {
		
		// Necesidades previas
		int numero1, numero2, numero3, numero4;
		String numerousuariostring;
		int numerousuario;
		Random rnd = new Random();
		Scanner teclado = new Scanner(System.in);
		
		// Generar 4 numeros aleatorios diferentes
		numero1 = ((int) (rnd.nextDouble() * 100000.0)) % 10;
		do {
		numero2 = ((int) (rnd.nextDouble() * 100000.0)) % 10;
		} while (numero2 == numero1);
		do {
		numero3 = ((int) (rnd.nextDouble() * 100000.0)) % 10;
		} while (numero3 == numero2 || numero3 == numero1);
		do {
		numero4 = ((int) (rnd.nextDouble() * 100000.0)) % 10;
		} while (numero4 == numero3 || numero4 == numero2 || numero4 == numero1);
		
		System.out.println(numero1+""+numero2+""+numero3+""+numero4);

		do {
			System.out.println("Numero: ");
			numerousuariostring = teclado.nextLine();
			numerousuario = Integer.parseInt(numerousuariostring);
			char array [];
			array = numerousuariostring.toCharArray();
			
			if (numerousuario > numero) {
				System.out.println("El numero secreto es menor");
			} else if (numerousuario < numero) {
				System.out.println("El numero secreto es mayor");
			}

		} while (numerousuario != numero);
		
		teclado.close();
		
	}

}
