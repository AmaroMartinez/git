package evaluacion2;

import java.util.Scanner;

public class Empleado extends Persona {
	// Defino la clase Racional
	// Propiedades
	private String departamento;
	private String puesto;
	private Double salario;

	// Metodos

	// Constructor por defecto
	public Empleado() {
		this.departamento = "**";
		this.puesto = "**";
		this.salario = 0.0;
	}

	// Constructor Personalizado
	public Empleado(String de, String p, Double s) {
		this.departamento = de;
		this.puesto = p;
		this.salario = s;
	}
	
	// Constructor Personalizado
	public Empleado(String d, String n, String a, Fecha F, String de, String p, Double s) {
		super(d,n,a,F);
		this.departamento = de;
		this.puesto = p;
		this.salario = s;
	}

	// Constructor Copia
	public Empleado(Empleado E) {
		//con set y get coger los datos del otro constructor
		this.departamento = E.departamento;
		this.puesto = E.puesto;
		this.salario = E.salario;
	}

	// toString
	@Override
	public String toString() {
		return (getdni() + " " + getnombre() + " " + getapellidos() + " " + getfechanacimiento() + " " + departamento + " " + puesto + " " + salario);
	}
/*
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
		Empleado other = (Empleado) obj;
		if (this.dni == other.dni) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Empleado other) {
		return (this.dni.compareTo(other.dni));
	}

//Leer
	public void leer(Scanner teclado) {
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
		
		//System.out.println("Fecha de nacimiento");
		//System.out.println("Dia: ");
		//dia = teclado.nextInt();
		//System.out.println("Mes: ");
		//mes = teclado.nextInt();
		//System.out.println("Año: ");
		//año = teclado.nextInt();
		//this.fechanacimiento = new Fecha(dia, mes, año);
		
		System.out.println("Fecha de nacimiento: ");
		this.fechanacimiento.leer(teclado);

	}*/
}
