package pruebass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {

	public static void main (String []args) {
		
		float op1 = 0, operando2 = 0;
		double resultado = 0;
		String operacion="";
		
		Calculadora calc = new Calculadora();
			
		try{
			
			//Definicion de bufer de entrada
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			
			//primer operando
	        System.out.println("Inserta el primer operando por teclado");
	        op1 = Float.parseFloat(bufferRead.readLine());
	        
	        //segundo operando
	        System.out.println("Inserta el segundo operando por teclado");
	        operando2 = Float.parseFloat(bufferRead.readLine());
	        
	        //operacion
	        System.out.println("Inserta la operacion (+, -, /, *) por teclado");
	        operacion = bufferRead.readLine();

	    }
	    catch(IOException e)
	    {
	        e.printStackTrace();
	    }
		
		//hacemos la operacion correspondiente
		switch(operacion) {
		case "+":
			resultado = calc.suma (op1, operando2);
			break;
		case "-":
			resultado = calc.resta(op1, operando2);
			break;
		case "/":
			resultado = calc.division(op1, operando2);
			break;
		case "*":
			resultado = calc.multiplicacion(op1, operando2);
			break;
			default:
		}
		
		escribirResultado(resultado);
		
		
	}

	private static void escribirResultado(double resultado) {
		System.out.println("El resultado es: " + resultado);
	}

	public double suma (float num1, float num2) {
		return num1 + num2;
	}
	
	public double resta (float num1, float num2) {
		return num1 - num2;
	}
	
	public double division (float num1, float num2) {
		return num1 / num2;
	}
	
	public double multiplicacion (float num1, float num2) {
		return num1 * num2;
	}
	
}






