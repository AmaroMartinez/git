package evaluacion3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*solicita nombres que va guardando en un fichero de texto de nombre nombres.txt (usando println)
*  hasta que se introduzca una cadena en blanco ("") que no se guarda.
*  Después muestra el contenido del fichero por pantalla.
*  Se deben controlar las posibles excepciones.
*  */

public class FicheroNombres {

	public static void main(String[] args) {

		String nombre = "";
		Scanner teclado = new Scanner(System.in);
		
		FileWriter fichero = null;
		PrintWriter pw = null;
		BufferedWriter bw = null;
		try {
			fichero = new FileWriter("nombres.txt");
			pw = new PrintWriter(fichero);
			bw = new BufferedWriter(pw);
			// Pido nombres hasta que introduzcan una cadena en blanco
			do {
				System.out.println("Introduce un nombre: ");
				nombre = teclado.nextLine();
				bw.write(nombre);
				bw.newLine();
			} while (!nombre.isEmpty());
			
			// Cerrar teclado
			teclado.close();
			
			// Cierro el fichero
			bw.close();
			pw.close();
			fichero.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Leo datos del fichero
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			archivo = new File("nombres.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			System.out.println("Archivo: nombres.txt");
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			// Cierra los recursos utilizados
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
