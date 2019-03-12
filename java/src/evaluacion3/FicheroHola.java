package evaluacion3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* escribe el mensaje “Hola Mundo” en un fichero de texto de nombre prueba.txt.
 * Después muestra el contenido del fichero por pantalla.
 * Se deben controlar las posibles excepciones.
*/
public class FicheroHola {

	public static void main(String[] args) {

		FileWriter fichero = null;
		PrintWriter pw = null;
		BufferedWriter bw = null;
		try {
			fichero = new FileWriter("prueba.txt");
			pw = new PrintWriter(fichero);
			bw = new BufferedWriter(pw);
			// Escribo unas lineas
			bw.write("Hola Mundo");
			bw.newLine();
			bw.write("¿Que tal?");
			bw.newLine();
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
			archivo = new File("prueba.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
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
