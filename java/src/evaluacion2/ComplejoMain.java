package evaluacion2;

public class ComplejoMain {

	public static void main(String[] args) {
		// Clase para probar la clase Complejo
			Complejo c1 = new Complejo();
			//System.out.println(c1); // 0.0 + 0.0i
			c1.escribir();
			Complejo c2 = new Complejo(5.0,7.0);
			//System.out.println(c2); // 5.0 + 7.0i
			c2.escribir();
			Complejo c3 = new Complejo(3.0);
			//System.out.println(c3); // 3.0 + 0.0i
			c3.escribir();
			Complejo c4 = new Complejo(c2);
			//System.out.println(c4); // 5.0 + 7.0i
			c4.escribir();
			
			// Probar el Getter and Setters
			double r;
			r = c2.getReal(); // r = 2.0
			c4.setReal(4.0); // 4.0 + 3.0i
			double i;
			i = c2.getImaginaria(); // i = 3.0
			c4.setImaginaria(44.0); // 4.0 + 44.0i
			c4.escribir();
			
			//Probar Hash and equals
			if (c4.equals(c2)) {
				System.out.println("Son iguales");
			}
			else {
				System.out.println("No son iguales");
			}
	}

}
