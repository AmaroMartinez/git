package evaluacion2;

import java.util.Scanner;

public class Fecha implements Comparable<Fecha> {
	// Defino la clase Racional
	// Propiedades
	private int dia;
	private int mes;
	private int año;

	// Metodos

	// Constructor por defecto
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.año = 2019;
	}

	// Constructor Personalizado
	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.año = a;
	}

	// Constructor Copia
	public Fecha(Fecha F) {
		this.dia = F.dia;
		this.mes = F.mes;
		this.año = F.año;
	}

	// toString
	@Override
	public String toString() {
		return (this.dia + "/" + this.mes + "/" + this.año);
	}

//Getters and Setters
	public int getdia() {
		return dia;
	}

	public void setdia(int dia) {
		this.dia = dia;
	}

	public int getmes() {
		return mes;
	}

	public void setmes(int mes) {
		this.mes = mes;
	}

	public int getaño() {
		return año;
	}

	public void setaño(int año) {
		this.año = año;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + año;
		result = prime * result + dia;
		result = prime * result + mes;
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
		Fecha other = (Fecha) obj;
		if (año != other.año)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	@Override
	public int compareTo(Fecha other) {
		if (this.año > other.año) {
			return 1;
		} else if (this.año < other.año) {
			return -1;
		} else if (this.mes > other.mes) {
			return 1;
		} else if (this.mes < other.mes) {
			return -1;
		} else if (this.dia > other.dia) {
			return 1;
		} else if (this.dia < other.dia) {
			return -1;
		} else {
			return 0;
		}
	}

	// Leer
	public void leer(Scanner teclado) {
		// Lee por teclado las propiedades
		// Leo dia
		System.out.println("Dia: ");
		this.dia = teclado.nextInt();
		// Leo mes
		System.out.println("Mes: ");
		this.mes = teclado.nextInt();
		// Leo año
		System.out.println("Año: ");
		this.año = teclado.nextInt();
	}

}
