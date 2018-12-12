package evaluacion1;

import java.util.Scanner;

public class enteroreal {

	public static void main(String[] args) {
		//   lee un número real por teclado y muestra 
		//   por separado su parte entera y su parte real. 
		
		double n;
		int entera;
		double decimal;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("* Introduce un valor entero *");
		
		n = teclado .nextDouble();
		
		entera = (int)n;
		decimal = n - entera;
		
		System.out.println("El valor de la parte entera es " + entera);
		System.out.printf("El valor de la parte decimal es %.2f",decimal);
		
		teclado.close();

	}

}
