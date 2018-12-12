package evaluacion1;

import java.util.Scanner;

public class leercaracter {

	public static void main(String[] args) {
		//   lee un String por teclado y muestra por pantalla el mensaje
		//	"El valor de la variable introducida es ".
		
		char n;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("* Introduce un caracter *");
		
		n = teclado .nextLine().charAt(0);
		
		System.out.println("El valor de la variable es " + n);
		System.out.printf("El valor de la variable es %s",n);
		
		teclado.close();

	}

}
