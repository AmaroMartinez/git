package evaluacion3;

import java.util.Random;

// Clase que genera un numero aleatorio de 1 a 10

public class Random110 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int numero = (int)((rnd.nextDouble()*10.0)+1);
		System.out.println(numero);
		
	}

}
