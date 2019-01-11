package evaluacion2;

import java.util.Scanner;

public class EmpleadoMain {

	public static void main(String[] args) {
		// Clase para probar la clase Racional
		Empleado E1 = new Empleado();
		System.out.println(E1);
		Empleado E2 = new Empleado("depar","pue",5.5);
		System.out.println(E2);
		Empleado E3 = new Empleado("11111111A","Amaro","Martinez Angulo",new Fecha(),"Ventas","Subnormal",1.5);
		System.out.println(E3);
		Empleado E4 = new Empleado(E3);
		System.out.println(E4);
		/*
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
		
	// CompareTo
				if (P3.compareTo(P2)>0) {
					System.out.println(P3 + " es mayor que " + P2);
				}
				else if (P3.compareTo(P2)<0) {
					System.out.println(P3 + " es menor que " + P2);
				}
				else {
					System.out.println(P3 + " es igual que " + P2);
				}
		
			// Leer
				Scanner teclado = new Scanner(System.in);
				P1.leer(teclado);
				teclado.close();
				System.out.println(P1);
				*/
	}

}
