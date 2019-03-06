package evaluacion2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class JFArrayPerson extends JFrame {

	// MAIN DE INICIO DE LA APLICACION
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFArrayPerson frame = new JFArrayPerson();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// OBJETOS/ELEMENTOS Y SERIAL
	private static final long serialVersionUID = -1547704899295089470L;
	private JPanel pnlPrincipal;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtApellido;	
	private JTextField txtFechan;
	private JLabel lblDni;
	private JLabel lblNombre;
	private JLabel lblApellido;	
	private JLabel lblFechan;
	private JButton btnInsertar;
	private JButton btnEliminar;
	private JButton btnMostrar;
	private JButton btnBuscar;
	private JScrollPane scpPrincipal;
	private JTable tblArray;
	
	// Definir un modelo de tabla
	static DefaultTableModel tblar = new DefaultTableModel();
	
	// Insertar arraylist personas
	// Persona valor = new Persona();
	ArrayList<Persona> personas = new ArrayList<Persona>();

	// CLASE PUBLICA CON LOS COMPONENTES
	public JFArrayPerson() {
		setResizable(false);
		setTitle("JFrameArray_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 400);
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBorder(new EmptyBorder(3, 3, 3, 3));
		setContentPane(pnlPrincipal);
		pnlPrincipal.setLayout(null);
		
		lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Arial", Font.BOLD, 18));
		lblDni.setBounds(10, 23, 88, 22);
		pnlPrincipal.add(lblDni);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 18));
		lblNombre.setBounds(10, 52, 88, 22);
		pnlPrincipal.add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.BOLD, 18));
		lblApellido.setBounds(10, 84, 88, 22);
		pnlPrincipal.add(lblApellido);
		
		lblFechan = new JLabel("FechaN");
		lblFechan.setFont(new Font("Arial", Font.BOLD, 18));
		lblFechan.setBounds(10, 118, 88, 22);
		pnlPrincipal.add(lblFechan);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDni.setBounds(128, 23, 86, 20);
		pnlPrincipal.add(txtDni);
		txtDni.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		txtApellido.setBounds(128, 87, 86, 20);
		pnlPrincipal.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNombre.setBounds(128, 55, 86, 20);
		pnlPrincipal.add(txtNombre);
		txtNombre.setColumns(10);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BtnInsertar();
			}
		});
		btnInsertar.setFont(new Font("Arial", Font.BOLD, 11));
		btnInsertar.setBounds(10, 167, 89, 23);
		pnlPrincipal.add(btnInsertar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BtnEliminar();
			}
		});
		btnEliminar.setFont(new Font("Arial", Font.BOLD, 11));
		btnEliminar.setBounds(109, 167, 89, 23);
		pnlPrincipal.add(btnEliminar);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BtnMostrar();
			}
		});
		btnMostrar.setFont(new Font("Arial", Font.BOLD, 11));
		btnMostrar.setBounds(208, 167, 89, 23);
		pnlPrincipal.add(btnMostrar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Arial", Font.BOLD, 11));
		btnBuscar.setBounds(307, 167, 89, 23);
		pnlPrincipal.add(btnBuscar);
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BtnBuscar();
			}
		});
		
		scpPrincipal = new JScrollPane();
		scpPrincipal.setBounds(10, 218, 386, 142);
		pnlPrincipal.add(scpPrincipal);
		
		tblArray = new JTable();
		tblArray.setFont(new Font("Arial", Font.PLAIN, 12));
		tblArray.setShowVerticalLines(false);
		tblar.addColumn("DNI");
		tblar.addColumn("NOMBRE");
		tblar.addColumn("APELLIDO");
		tblar.addColumn("FECHANac");
		tblArray.setModel(tblar);
		scpPrincipal.setViewportView(tblArray);
		
		txtFechan = new JTextField();
		txtFechan.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFechan.setBounds(128, 121, 86, 20);
		pnlPrincipal.add(txtFechan);
		txtFechan.setColumns(10);
		
		
	}
		
	private void BtnEliminar() {
		// Recoger los datos de los campos a eliminar
		int eli = tblArray.getSelectedRow();
		Persona valor = new Persona();
		// Recoger lo datos de los campos de texto	
		valor.setdni(txtDni.getText());
		valor.setnombre(txtNombre.getText());
		valor.setapellido(txtApellido.getText());
		valor.setfechanacimiento(txtFechan.getText());
		
		if (personas.contains(valor)) {
			System.out.println("La persona ( "+valor+ " ) ha sido borrada.");
			// BORRAR LA PALABRA BUSACADA
			personas.remove(valor);
		}
		else if (!personas.contains(valor)){
			System.out.println("Esa persona( "+valor+" ) no existe.");
		}
		
		
		else if (eli >= 0) {
			tblar.removeRow(eli);
		}
		else {
			JOptionPane.showMessageDialog(null,"No hay datos a eliminar");
		}
		
		// Limpiar campos de texto
		clearField();
	}
	
	private void BtnInsertar() {
		Persona valor = new Persona();
		// Recoger lo datos de los campos de texto		
		valor.setDni(txtDni.getText());
		valor.setNombre(txtNombre.getText());
		valor.setApellido(txtApellido.getText());
		valor.setFechanacimiento(txtFechan.getText());
		
				
		// Comprobar si la persona existe e insertarla
		if (!personas.contains(valor)) {
			// A�ADIR LA CADENA AL ARRAYLIST
			
			personas.add(valor);
			
			System.out.println("La persona ( "+valor+" ) se ha a�adido.");
			
		}
		
		else {
			
			System.out.println("Esa persona ya existe.");
		}
		
		// Limpiar campos de texto
		clearField();
		
	}
	
	private void BtnMostrar() {
		
		// Poner el contador de filas a 0
		tblar.setRowCount(0);
				
		// Menor a mayor
		Collections.sort(personas);
		
		// Mostrar arraylist ordenado
		for (int i=0; i < personas.size(); i++) {
			
			// A�adir los objetos a la tabla
			Object[] per = {personas.get(i).getDni(), personas.get(i).getNombre(), personas.get(i).getApellido(), personas.get(i).getFechanacimiento()};
			tblar.addRow(per);
			
			// Salida de texto por consola
			System.out.println(personas.get(i));
		}
	}
	
private void BtnBuscar() {
		
	
		// Poner el contador de filas a 0
			tblar.setRowCount(0);
			Persona valor = new Persona();		
			// Menor a mayor
			Collections.sort(personas);
			
			// Recoger lo datos de los campos de texto		
			valor.setDni(txtDni.getText());
			valor.setNombre(txtNombre.getText());
			valor.setApellido(txtApellido.getText());
			valor.setFechanacimiento(txtFechan.getText());
			
		// Limpiar los campos de texto
	for (int i=0; i < personas.size(); i++) {
		
		if (personas.contains(valor)) {
			// A�ADIR LA CADENA AL ARRAYLIST
			
			// Object[] per = {personas.get(i).getDni(), personas.get(i).getNombre(), personas.get(i).getApellido(), personas.get(i).getFechanacimiento()};
			// tblar.addRow(per);
			
			System.out.println(personas.get(i));
			
		}
		
		else {
			System.out.println("No hay datos");
		}
		
		}
	}
	
	private void clearField() {
		
		// Limpiar los campos de texto
		txtDni.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtFechan.setText("");
	}
	
}