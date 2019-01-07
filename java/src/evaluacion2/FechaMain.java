package evaluacion2;

import java.util.Scanner;

public class FechaMain {

	public static void main(String[] args) {
		// Clase para probar la clase Racional
		Fecha F1 = new Fecha();
		System.out.println(F1);
		Fecha F2 = new Fecha(7,1,2019);
		System.out.println(F2);
		Fecha F3 = new Fecha(F2);
		System.out.println(F3);
		
	// Probar el Getter and Setters
				int d;
				d = F2.getdia(); // 
				F3.setdia(9); // 
				int m;
				m = F2.getmes(); // 
				F3.setmes(10); // 
				int a;
				a = F2.getaño();
				F3.setaño(1998);
				System.out.println(F3);

			//Probar Hash and equals
				if (F3.equals(F2)) {
					System.out.println("Son iguales");
				}
				else {
					System.out.println("No son iguales");
				}
				
			// CompareTo
				if (F3.compareTo(F2)>0) {
					System.out.println(F3 + " es mayor que " + F2);
				}
				else if (F3.compareTo(F2)<0) {
					System.out.println(F3 + " es menor que " + F2);
				}
				else {
					System.out.println(F3 + " es igual que " + F2);
				}
				
			// Leer
				Scanner teclado = new Scanner(System.in);
				F1.leer(teclado);
				teclado.close();
				System.out.println("F1 tiene el nuevo valor de: " + F1);
	}

}
