package basesdedatos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaJTableRowSet extends JFrame {

	// contiene un panel de nombre contenedor en el que hay una etiqueta de nombre
	// lblTexto con el valor "Datos de los Alumnos" en la parte superior, una JTable
	// de nombre tabla con los datos de la tabla alumnos de la base de datos MySQL
	// bdalumnos y una cabecera con los valores "DNI", "Nombre","Apellidos","Grupo",
	// en el centro, y un botón de nombre btnSalir en la parte inferior. Al pulsar
	// el botón Salir se saldrá de la aplicación. Para el proceso usa ResultSet.

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
					VentanaJTableRowSet frame = new VentanaJTableRowSet();
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
	public VentanaJTableRowSet() {
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

		// Cabecera de la tabla
		Vector<String> columnas = new Vector<String>();
		columnas.add("DNI");
		columnas.add("Nombre");
		columnas.add("Apellidos");
		columnas.add("Grupo");

		try {
			// Conexion a la base de datos
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdalumnos", "root", "");
			
			// desactivo la actualizacion automatica de datos
			conexion.setAutoCommit(false);
			
			// creo el CachedRowSet
			CachedRowSet crs;
			RowSetFactory myRowSetFactory = null;
			myRowSetFactory = RowSetProvider.newFactory();
			crs = myRowSetFactory.createCachedRowSet();
			
			// selecciono todos los alumnos
			crs.setCommand("SELECT * FROM alumnos");
			crs.execute(conexion);
			

			// Coge los datos de la tabla por filas
			Vector<Vector<String>> datosTabla = new Vector<Vector<String>>();
			while (crs.next()) {
				// Crea un vector por fila y recoge los campos de la base de datos
				Vector<String> fila = new Vector<String>();
				fila.add(crs.getString("dni"));
				fila.add(crs.getString("nombre"));
				fila.add(crs.getString("apellidos"));
				fila.add(crs.getString("grupo"));
				fila.add("\n\n\n\n\n\n\n");
				// Los añade al vector de vectores
				datosTabla.add(fila);
			}

			// Cerrar la conexion
			crs.close();
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
