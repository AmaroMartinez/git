package basesdedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class BDUpdateAlumnoRowset {

	public static void main(String[] args) {

		try {
		// me conecto usando una conexion
			Class.forName("com.mysql.jdbc.Driver");
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
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
