package evaluacion2;

import java.util.Scanner;

public class Persona implements Comparable<Persona> {
	// Defino la clase Racional
	// Propiedades
	private String dni;
	private String nombre;
	private String apellidos;
	private Fecha fechanacimiento;

	// Metodos

	// Constructor por defecto
	public Persona() {
		this.dni = "**";
		this.nombre = "**";
		this.apellidos = "**";
		this.fechanacimiento = new Fecha();
	}

	// Constructor Personalizado
	public Persona(String d, String n, String a, Fecha F) {
		this.dni = d;
		this.nombre = n;
		this.apellidos = a;
		this.fechanacimiento = new Fecha(F);
	}

	// Constructor Copia
	public Persona(Persona P) {
		this.dni = P.dni;
		this.nombre = P.nombre;
		this.apellidos = P.apellidos;
		this.fechanacimiento = new Fecha(P.fechanacimiento);
	}

	// toString
	@Override
	public String toString() {
		return (this.dni + " " + this.nombre + " " + this.apellidos + " " + this.fechanacimiento);
	}

//Getters and Setters
	public String getdni() {
		return dni;
	}

	public void setdni(String dni) {
		this.dni = dni;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getapellidos() {
		return apellidos;
	}

	public void setapellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public Fecha getfechanacimiento() {
		return fechanacimiento;
	}

	public void setfechanacimiento(Fecha fechanacimiento) {
		this.fechanacimiento = new Fecha(fechanacimiento);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((fechanacimiento == null) ? 0 : fechanacimiento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (this.dni == other.dni) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Persona other) {
		int resultado = (this.dni.compareTo(other.dni));
		if (resultado>0) {
		return 1;
		} else if (resultado<0) {
			return -1;
		} else {
			return 0;
		}
		
	}

//Leer
	public void leer(Scanner teclado) {
		int dia, mes, año;
		// Lee por teclado las propiedades
		// Leo nombre
		System.out.println("Nombre: ");
		this.nombre = teclado.nextLine();
		// Leo apellidos
		System.out.println("Apellidos: ");
		this.apellidos = teclado.nextLine();
		// Leo dni
		System.out.println("DNI: ");
		this.dni = teclado.nextLine();
		// Leo fecha
		System.out.println("Fecha de nacimiento");
		System.out.println("Dia: ");
		dia = teclado.nextInt();
		System.out.println("Mes: ");
		mes = teclado.nextInt();
		System.out.println("Año: ");
		año = teclado.nextInt();
		this.fechanacimiento = new Fecha(dia,mes,año);
		
	}
}
