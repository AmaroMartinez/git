package evaluacion2;

public class Racional {
	// Defino la clase Racional
	// Propiedades
	private int numerador;
	private int denominador;
	
	// Metodos
	
	//Constructor por defecto
	public Racional(){
		this.numerador = 0;
		this.denominador = 1;
	}

	//Constructor Personalizado
	public Racional(int n, int d) {
		this.numerador = n;
		this.denominador = d;
	}

	//Constructor Personalizado
	public Racional(int n) {
		this.numerador = n;
		this.denominador = 1;
	}
	
	//Constructor Copia
	public Racional(Racional r) {
		this.numerador = r.numerador;
		this.denominador = r.denominador;
	}
	
	// toString
	@Override
	public String toString() {
		return (this.numerador + "/" + this.denominador);
	}
}
