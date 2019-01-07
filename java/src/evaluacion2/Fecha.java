package evaluacion2;

import java.util.Scanner;

public class Fecha implements Comparable<Fecha> {
	// Defino la clase Racional
	// Propiedades
	private int dia;
	private int mes;
	private int a�o;

	// Metodos

	// Constructor por defecto
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.a�o = 2019;
	}

	// Constructor Personalizado
	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.a�o = a;
	}

	// Constructor Copia
	public Fecha(Fecha F) {
		this.dia = F.dia;
		this.mes = F.mes;
		this.a�o = F.a�o;
	}

	// toString
	@Override
	public String toString() {
		return (this.dia + "/" + this.mes + "/" + this.a�o);
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

	public int geta�o() {
		return a�o;
	}

	public void seta�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a�o;
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
		if (a�o != other.a�o)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	@Override
	public int compareTo(Fecha other) {
		if (this.a�o > other.a�o) {
			return 1;
		} else if (this.a�o < other.a�o) {
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
		// Leo a�o
		System.out.println("A�o: ");
		this.a�o = teclado.nextInt();
	}

}
