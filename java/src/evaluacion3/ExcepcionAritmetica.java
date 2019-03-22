package evaluacion3;

public class ExcepcionAritmetica {

	// provoca una ArithmeticException realizando la división entre dos números
	// enteros n de valor 1 y d de valor 0. Controla la excepción aritmética para
	// que el resultado sea +Infinito (Double.POSITIVE_INFINITY) o -Infinito
	// (Double.NEGATIVE_INFINITY) cuando d sea 0. Si n y d son los dos 0 el
	// resultado será Indeterminado (Double.NaN).

	public static void main(String[] args) {
		// Necesidades previas
		int n = 0;
		double resultado = 0;

		try {

			// Division entre 0
			resultado = n / 0;

			// Si da una excepcion aritmetica
		} catch (ArithmeticException ae) {

			// si el nominador es mayor a 0
			if (n > 0) {
				resultado = Double.POSITIVE_INFINITY;

				// Si el nominador es menor a 0
			} else if (n < 0) {
				resultado = Double.NEGATIVE_INFINITY;

				// Si el nominador es 0
			} else {
				resultado = Double.NaN;
			}
		}

		// Mostrar resultado
		System.out.println(resultado);

	}

}
