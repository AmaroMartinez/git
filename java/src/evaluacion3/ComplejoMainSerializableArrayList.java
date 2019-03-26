package evaluacion3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ComplejoMainSerializableArrayList {

	// Crea cinco objetos de la clase Complejo y los almacena en un ArrayList.
	// Después recorre el ArrayList guardando los datos de los objetos de tipo
	// Complejo en el fichero alcomplejos.dat. Al finalizar lee los datos desde
	// alcomplejos.dat y los almacena en un nuevo ArrayList. Para terminar recorre
	// el ArrayList mostrando el valor de los objetos de tipo Complejo almacenados
	// en él.

	public static void main(String[] args) {

		// Escribir Complejo
		// Necesidades previas
		FileOutputStream fos;
		ObjectOutputStream oos;
		Complejo c;
		ArrayList<Complejo> alComplejo = new ArrayList<Complejo>();
		int pos = 0;
		int a = 10;
		int b = 5;

		try {
			// grabo los datos en complejos.dat
			fos = new FileOutputStream("alcomplejos.dat");
			oos = new ObjectOutputStream(fos);

			// Crear 5 complejos y los añado al arraylist
			while (pos < 5) {
				c = new Complejo(a, b);
				alComplejo.add(c);
				a++;
				b--;
				pos++;
			}

			// Recoje los datos del arraylist y los escribe en el archivo
			for (int posicion = 0; posicion < alComplejo.size(); posicion++) {
				c = alComplejo.get(posicion);
				oos.writeObject(c);
			}

			// cierro el fichero
			oos.close();
			fos.close();

		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Leer Complejo
		// Necesidades previas
		FileInputStream fis;
		ObjectInputStream ois;
		ArrayList<Complejo> alComplejo2 = new ArrayList<Complejo>();

		try {

			// Abro los datos de complejo.dat
			fis = new FileInputStream("alcomplejos.dat");
			ois = new ObjectInputStream(fis);

			// Convierte los bytes leidos en un objeto de la clase Complejo
			while (fis.available() > 0) {
				c = (Complejo) ois.readObject();
				alComplejo2.add(c);
			}

			// Mostrar arraylist
			for (int posicion = 0; posicion < alComplejo2.size(); posicion++) {
				System.out.println(alComplejo2.get(posicion));
			}

			// Cierro el fichero
			ois.close();
			fis.close();

		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
