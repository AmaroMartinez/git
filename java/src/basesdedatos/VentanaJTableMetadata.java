package basesdedatos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaJTableMetadata extends JFrame {

	private static final long serialVersionUID = 7446438336543391859L;
	private JPanel contenedor;
	private JLabel lblTexto;
	private JTable tabla;
	private DefaultTableModel dtmTabla;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJTableMetadata frame = new VentanaJTableMetadata();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaJTableMetadata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contenedor = new JPanel();
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenedor.setLayout(new BorderLayout(0, 0));
		setContentPane(contenedor);

		// Texto superior
		lblTexto = new JLabel("Datos de los Alumnos");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		contenedor.add(lblTexto, BorderLayout.NORTH);

		try {
			// Conexion a la base de datos
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdalumnos", "root", "");

			// Creo un statement
			Statement st = conexion.createStatement();

			// Escribo la consulta
			String consulta = "SELECT * FROM alumnos";

			// Realizo la consulta
			ResultSet rs = st.executeQuery(consulta);

			// Cabecera de la tabla
			ResultSetMetaData metaDatos = rs.getMetaData();
			
			// Se obtiene el número de columnas.
			int numeroColumnas = metaDatos.getColumnCount();

			Vector<String> columnas = new Vector<String>();
			// Se obtiene cada una de las etiquetas para cada columna
			for (int i = 0; i < numeroColumnas; i++) {
				// cojo el valor de la etiqueta de la columna
				// los índices del rs empiezan en 1 pero los índices de las columnas empiezan en
				// 0
				columnas.add(metaDatos.getColumnLabel(i + 1));
			}

			// Coge los datos de la tabla por filas
			Vector<Vector<String>> datosTabla = new Vector<Vector<String>>();
			while (rs.next()) {
				// Crea un vector por fila y recoge los campos de la base de datos
				Vector<String> fila = new Vector<String>();
				fila.add(rs.getString("dni"));
				fila.add(rs.getString("nombre"));
				fila.add(rs.getString("apellidos"));
				fila.add(rs.getString("grupo"));
				fila.add("\n\n\n\n\n\n\n");
				// Los añade al vector de vectores
				datosTabla.add(fila);
			}

			// Cerrar la conexion
			rs.close();
			st.close();
			conexion.close();

			// TableModel
			dtmTabla = new DefaultTableModel(datosTabla, columnas);

			// Tabla
			tabla = new JTable(dtmTabla);

			// Crep un scrollpane y le añado a la tabla
			JScrollPane scrollPane = new JScrollPane(tabla);
			contenedor.add(scrollPane, BorderLayout.CENTER);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Boton Salir
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contenedor.add(btnSalir, BorderLayout.SOUTH);

	}

}
