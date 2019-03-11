package evaluacion3;

import java.util.Random;

// Clase que genera numeros aleatorios de 0 a 10 y cuando sale un 10 para de generar.

public class Random110Fin10 {

	public static void main(String[] args) {

		// Necesidades previas
		int numero;
		Random rnd = new Random();

		// Repetitiva para generar numeros hasta que salga un 10
		do {
			numero = ((int)(rnd.nextDouble()*100000.0))%10 + 1;
			System.out.println(numero);
		} while (numero != 10);
	}

}
