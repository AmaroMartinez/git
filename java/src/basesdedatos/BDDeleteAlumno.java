package basesdedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDDeleteAlumno {

	public static void main(String[] args) {

		try {
			// Abro la conexion
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdalumnos", "root", "");
			System.out.println("Conexion Correcta.");

			// Creo un Statement
			Statement st1 = conexion.createStatement();

			// Borro el alumno con dni '12345678A'
			st1.executeUpdate("Delete from alumnos WHERE dni='12345678A'");

			// cierro el Statement despues de realizar la consulta
			st1.close();

			// Creo un Statement
			Statement st = conexion.createStatement();

			// Preparo la consulta
			String consulta = "SELECT * FROM alumnos";

			// Ejecuto la consulta
			ResultSet rs = st.executeQuery(consulta);

			while (rs.next()) {
				System.out.println("DNI: " + rs.getObject("dni") + ", nombre: " + rs.getObject("nombre") + ", Apellidos: "
						+ rs.getObject("apellidos") + ", Grupo: " + rs.getObject("grupo"));
			}

			// cierro el ResultSet
			rs.close();

			// cierro el Statement despues de realizar la consulta
			st.close();

			// Cierro la conexion
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error");
		}
	}

}
