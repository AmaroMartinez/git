package evaluacion3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroCopia {

	public static void main(String[] args) {

		// copia el fichero origen de nombre logo.png en el fichero destino de nombre
		// logocopia.png. Para ello usa un array de tipo byte con 512 posiciones. Una
		// vez copiado, abre el fichero de imagen logocopia.png con el Explorador de
		// Windows para comprobar que la copia se ha realizado correctamente. Se deben
		// controlar las posibles excepciones. Para que funcione la imagen logo.png debe
		// de estar dentro del proyecto (en nuestro caso la ruta de nuestro proyecto es
		// D:\PROG\eclipse\Java)

		// Necesidades previas
		FileInputStream fis;
		BufferedInputStream bis;
		FileOutputStream fos;
		BufferedOutputStream bos;
		byte[] datos;
		int bytesleidos;

		try {
			// Abro el fichero binario en modo lectura
			fis = new FileInputStream("logo.png");
			bis = new BufferedInputStream(fis);

			// Abro el fichero binario en modo escritura
			fos = new FileOutputStream("logocopia.png");
			bos = new BufferedOutputStream(fos);

			// Defino el tamaño de los paquetes
			datos = new byte[512];

			// Leo todo el contenido del fichero paquete a paquete

			// Lee el primer paquete de datos
			bytesleidos = bis.read(datos);

			while (bytesleidos != -1) {
				// Si no es el fin de fichero
				// Escribo los datos
				bos.write(datos, 0, bytesleidos);
				// Leo otro paqiete de datos
				bytesleidos = bis.read(datos);
			}

			// Cerrar todos los procesos de lectura y escritura
			bis.close();
			fis.close();
			bos.close();
			fos.close();

		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
