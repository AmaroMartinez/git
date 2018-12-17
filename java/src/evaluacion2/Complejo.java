package evaluacion2;

public class Complejo {
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

	/*
	 * toString
	 * 
	 * @Override public String toString() { return (this.real + " + " +
	 * this.imaginaria + "i"); }
	 */
	
	void escribir() {
		System.out.println(this.real + " + " + this.imaginaria + "i");
	}
}
