package evaluacion3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RacionalMainSerializableArrayList {

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
		Racional r;
		ArrayList<Racional> alRacional = new ArrayList<Racional>();
		int pos = 0;
		int a = 10;
		int b = 5;

		try {
			// grabo los datos en complejos.dat
			fos = new FileOutputStream("alcomplejos.dat");
			oos = new ObjectOutputStream(fos);

			// Crear 5 complejos y los añado al arraylist
			while (pos < 5) {
				r = new Racional(a, b);
				alRacional.add(r);
				a++;
				b--;
				pos++;
			}

			// Recoje los datos del arraylist y los escribe en el archivo
			for (int posicion = 0; posicion < alRacional.size(); posicion++) {
				r = alRacional.get(posicion);
				oos.writeObject(r);
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
		ArrayList<Racional> alRacional2 = new ArrayList<Racional>();

		try {

			// Abro los datos de complejo.dat
			fis = new FileInputStream("alcomplejos.dat");
			ois = new ObjectInputStream(fis);

			// Convierte los bytes leidos en un objeto de la clase Complejo
			while (fis.available() > 0) {
				r = (Racional) ois.readObject();
				alRacional2.add(r);
			}

			// Mostrar arraylist
			for (int posicion = 0; posicion < alRacional2.size(); posicion++) {
				System.out.println(alRacional2.get(posicion));
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
