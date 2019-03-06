package Reto2;

public class Persona {
	protected String Nombre;
	protected String Apellidos;
	protected String DNI;
	
	public Persona() {
		this.Nombre = "";
		this.Apellidos = "";
		this.DNI = "";
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombreCliente) {
		Nombre = nombreCliente;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidosCliente) {
		Apellidos = apellidosCliente;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNICliente) {
		DNI = dNICliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Persona p = (Persona)obj;
		if(this.DNI.equals(p.DNI)) {
			iguales = true;
		}
		return iguales;
	}
	
	public int compareTo(Persona other) {
		int comparacion = this.DNI.compareTo(other.DNI); 
		return comparacion;
	}
	
}