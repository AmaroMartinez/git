package evaluacion3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ComplejoMainSerializable {

	// crea un objeto de la clase Complejo y lo guarda en el fichero complejos.dat.
	// Después lee los datos del complejo desde complejos.dat y muestra el valor del
	// complejo leído por pantalla.

	public static void main(String[] args) {
		// Escribir Complejo
		// Necesidades previas
		FileOutputStream fos;
		ObjectOutputStream oos;
		Complejo c;
		try {
			// grabo los datos en complejos.dat
			fos = new FileOutputStream("complejos.dat");
			oos = new ObjectOutputStream(fos);

			// Crear complejo
			c = new Complejo(2, 3);

			// lo grabo
			oos.writeObject(c);

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
			fis = new FileInputStream("complejos.dat");
			ois = new ObjectInputStream(fis);
			
			// Convierte los bytes leidos en un objeto de la clase Complejo
			c = (Complejo) ois.readObject();
			System.out.println(c);
			
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
