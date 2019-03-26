package evaluacion3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RacionalMainSerializable {

	// crea un objeto de la clase Complejo y lo guarda en el fichero complejos.dat.
	// Después lee los datos del complejo desde complejos.dat y muestra el valor del
	// complejo leído por pantalla.

	public static void main(String[] args) {
		// Escribir Complejo
		// Necesidades previas
		FileOutputStream fos;
		ObjectOutputStream oos;
		Racional r;
		try {
			// grabo los datos en complejos.dat
			fos = new FileOutputStream("racionales.dat");
			oos = new ObjectOutputStream(fos);

			// Crear complejo
			r = new Racional(2, 3);

			// lo grabo
			oos.writeObject(r);

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
		try {
			
			// Abro los datos de complejo.dat
			fis = new FileInputStream("racionales.dat");
			ois = new ObjectInputStream(fis);
			
			// Convierte los bytes leidos en un objeto de la clase Complejo
			r = (Racional) ois.readObject();
			System.out.println(r);
			
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
