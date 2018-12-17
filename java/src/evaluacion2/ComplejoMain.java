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
	}

}
