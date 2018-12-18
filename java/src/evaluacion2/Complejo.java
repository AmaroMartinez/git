package evaluacion2;

import java.util.Scanner;

public class Complejo implements Comparable<Complejo> {
	// Defino la clase Complejo
	// Propiedades
	private double real;
	private double imaginaria;

	// Metodos
	// Constructor por defecto
	public Complejo() {

	}

	// Constructor Personalizado
	public Complejo(double n, double d) {
		this.real = n;
		this.imaginaria = d;
	}

	// Constructor Personalizado
	public Complejo(double n) {
		this.real = n;
	}

	// Constructor Copia
	public Complejo(Complejo c) {
		this.real = c.real;
		this.imaginaria = c.imaginaria;
	}

	// toString

	@Override
	public String toString() {
		return (this.real + " + " + this.imaginaria + "i");
	}

	void escribir() {
		System.out.println(this.real + " + " + this.imaginaria + "i");
	}

	// Getters and Setters
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imaginaria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	// HashCode and equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			// Si es el mismo objeto devuelve true
			return true;
		if (obj == null)
			// Si el objeto que recibo NO existe devuelve falso
			return false;
		if (getClass() != obj.getClass())
			// Si los objetos no son de la misma clase devuelve falso
			return false;
		// Comparo las propiedades de los objetos
		// Convierte el objeto a la clase a comparar
		Complejo other = (Complejo) obj;
		if (this.real == other.real && this.imaginaria == other.imaginaria) {
			// Si los valores de las propiedades son iguales
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Complejo other) {
		if (this.real > other.real) {
			return 1;

		} else if (this.real < other.real) {
			return -1;

		} else {
			if (this.imaginaria > other.imaginaria) {
				return 1;

			} else if (this.imaginaria < other.imaginaria) {
				return -1;
			}
		}
		return 0;

	}

	//Leer
	public void leer(Scanner teclado) {
		// Lee por teclado las propiedades
		// Leo real
		System.out.println("Real: ");
		this.real = teclado.nextDouble();
		// Leo imaginaria
		System.out.println("Imaginaria: ");
		this.imaginaria = teclado.nextDouble();
	}

}
