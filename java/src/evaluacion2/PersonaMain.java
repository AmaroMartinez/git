package evaluacion2;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		// Clase para probar la clase Racional
		Persona P1 = new Persona();
		System.out.println(P1);
		Persona P2 = new Persona("11111111A","Amaro","Martinez Angulo",new Fecha());
		System.out.println(P2);
		Persona P3 = new Persona(P2);
		System.out.println(P3);
		
	// Probar el Getter and Setters
				P2.setnombre("A"); // 
				P2.setapellidos("A"); // 
				P3.setdni("A"); //  
				Fecha F1 = new Fecha (1,1,1);
				P3.setfechanacimiento(F1); // 
				System.out.println("Modificado: " + P2);
				System.out.println("Modificado: " + P3);
		
	//Probar Hash and equals
		if (P3.equals(P2)) {
			System.out.println(P3 + " y " + P2 + " Son iguales");
		}
		else {
			System.out.println(P3 + " y " + P2 + " No son iguales");
		}
		/*
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
				*/
	}

}
