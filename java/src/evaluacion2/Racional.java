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
	
//Getters and Setters
	public int getnumerador() {
		return numerador;
	}

	public void setnumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getdenominador() {
		return denominador;
	}

	public void setdenominador(int denominador) {
		this.denominador = denominador;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(denominador);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(numerador);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	//HashCode and equals
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
		Racional other = (Racional) obj;
		if (this.numerador == other.numerador && this.denominador == other.denominador) {
			// Si los valores de las propiedades son iguales
			return true;
		}
		return false;		
	}
}
