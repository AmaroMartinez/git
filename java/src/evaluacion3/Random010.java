package evaluacion3;

import java.util.Random;

// Clase que genera un numero aleatorio de 0 a 10

public class Random010 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int numero = (int)(rnd.nextDouble()*11.0);
		System.out.println(numero);
		
	}

}
