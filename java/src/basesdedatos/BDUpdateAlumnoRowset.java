package basesdedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class BDUpdateAlumnoRowset {

	public static void main(String[] args) {

		boolean modificado = false;
		try {
			// me conecto usando una conexion
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdalumnos", "root", "");
			// desactivo la actualizacion automatica de datos
			conexion.setAutoCommit(false);
			// creo el CachedRowSet
			CachedRowSet crs;
			RowSetFactory myRowSetFactory = null;
			myRowSetFactory = RowSetProvider.newFactory();
			crs = myRowSetFactory.createCachedRowSet();
			// selecciono todos los alumnos
			// usando la conexion anterior
			crs.setCommand("SELECT * FROM alumnos");
			crs.execute(conexion);
			// cierro la conexion con la base de datos
			conexion.close();

			String valor = "2DW3";
			// actualizo en el crs el valor del grupo que está en la columna 4
			// del registro que está en la primera posicion
			crs.absolute(1);
			crs.updateString(4, valor);
			crs.updateRow();
			// actualizo el valor de modificado
			modificado = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
