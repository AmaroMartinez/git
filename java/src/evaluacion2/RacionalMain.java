package evaluacion2;

public class RacionalMain {

	public static void main(String[] args) {
		// Clase para probar la clase Racional
		Racional r1 = new Racional();
		System.out.println(r1); // 0/1
		Racional r2 = new Racional(5,7);
		System.out.println(r2); // 5/7
		Racional r3 = new Racional(3);
		System.out.println(r3); // 3/1
		Racional r4 = new Racional(r2);
		System.out.println(r4); // 5/7
		
	// Probar el Getter and Setters
				double n;
				n = r2.getnumerador(); // 
				r4.setnumerador(4); // 
				double d;
				d = r2.getdenominador(); // 
				r4.setdenominador(44); // 
				System.out.println(r4);
		
	//Probar Hash and equals
		if (r4.equals(r2)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
		
	}

}
