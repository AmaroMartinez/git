package evaluacion2;

public class RacionalMain {

	public static void main(String[] args) {
		// Clase para probar la clase Racional
		Racional r1 = new Racional();
		System.out.println(r1); // 0/1
		Racional r2 = new Racional(5,7); // 5/7
		System.out.println(r2); // 0/1
		Racional r3 = new Racional(3); // 3/1
		System.out.println(r3); // 0/1
		Racional r4 = new Racional(r2); // 5/7
		System.out.println(r4); // 0/1
		
	}

}
