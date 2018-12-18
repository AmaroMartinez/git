package evaluacion2;

import java.util.Scanner;

public class RacionalMain {

	public static void main(String[] args) {
		// Clase para probar la clase Racional
		Racional r1 = new Racional();
		System.out.println(r1); // 0/1
		Racional r2 = new Racional(4,6);
		System.out.println(r2); // 4/6
		Racional r3 = new Racional(3);
		System.out.println(r3); // 3/1
		Racional r4 = new Racional(r2);
		System.out.println(r4); // 5/7
		
	// Probar el Getter and Setters
				int n;
				n = r2.getnumerador(); // 
				r4.setnumerador(8); // 
				int d;
				d = r2.getdenominador(); // 
				r4.setdenominador(12); // 
				System.out.println(r4);
		
	//Probar Hash and equals
		if (r4.equals(r2)) {
			System.out.println(r4 + " y " + r2 + " Son iguales");
		}
		else {
			System.out.println(r4 + " y " + r2 + " No son iguales");
		}
		
	// CompareTo
				if (r4.compareTo(r2)>0) {
					System.out.println(r4 + " es mayor que " + r2);
				}
				else if (r4.compareTo(r2)<0) {
					System.out.println(r4 + " es menor que " + r2);
				}
				else {
					System.out.println(r4 + " es igual que " + r2);
				}
		
			// Leer
				Scanner teclado = new Scanner(System.in);
				r1.leer(teclado);
				teclado.close();
				System.out.println(r1);
	}

}
