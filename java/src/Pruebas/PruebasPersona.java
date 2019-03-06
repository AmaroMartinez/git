package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Reto2.Persona;

class PruebasPersona {
	
	
	@Test
	void testNotEqualsPersona() {
		Persona p1 = new Persona();
		p1.setNombre("Jessica");
		p1.setApellidos("Rubio");
		p1.setDNI("a1");
		Persona p2 = new Persona();
		p2.setNombre("Jessica");
		p2.setApellidos("Marroqui");
		p2.setDNI("a2");
		// Comprobamos que hace bien la igualdad y devuelve que no son iguales
		assertNotEquals(p1,p2);
	}
	
	@Test
	void testEqualsPersona() {
		Persona p1 = new Persona();
		p1.setNombre("Jessica");
		p1.setApellidos("Rubio");
		p1.setDNI("a1");
		Persona p2 = new Persona();
		p2.setNombre("Jessica");
		p2.setApellidos("Marroqui");
		p2.setDNI("a1");
		// Comprobamos que hace bien la igualdad y devuelve que son iguales
		assertEquals(p1, p2);
	}
	
	@Test
	void testMenorPersona() {
		Persona p1 = new Persona();
		p1.setNombre("Jessica");
		p1.setApellidos("Rubio");
		p1.setDNI("a1");
		Persona p2 = new Persona();
		p2.setNombre("Jessica");
		p2.setApellidos("Marroqui");
		p2.setDNI("a2");
		// Comprobamos que hace bien la comparacion y p1 es menor que p2
		assertTrue(p1.compareTo(p2) == -1);
	}
	
	@Test
	void testMayorPersona() {
		Persona p1 = new Persona();
		p1.setNombre("Jessica");
		p1.setApellidos("Rubio");
		p1.setDNI("a1");
		Persona p2 = new Persona();
		p2.setNombre("Jessica");
		p2.setApellidos("Marroqui");
		p2.setDNI("a2");
		// Comprobamos que hace bien la comparacion y p2 es menor que p1
		assertTrue(p2.compareTo(p1) == 1);
	}
	
	@Test
	void testIgualPersona() {
		Persona p1 = new Persona();
		p1.setNombre("Jessica");
		p1.setApellidos("Rubio");
		p1.setDNI("a1");
		// Comprobamos que hace bien la comparacion y devuelve que no son iguales
		assertTrue(p1.compareTo(p1) == 0);
	}

}