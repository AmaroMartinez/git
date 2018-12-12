package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaLeerEntero extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JTextField txtnumero;
	private JLabel lblresultado;
	private JLabel lblnumero;
	private JPanel paneldatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLeerEntero frame = new VentanaLeerEntero();
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
	public VentanaLeerEntero() {
		setTitle("Hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 127);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		paneldatos = new JPanel();
		contentPane.add(paneldatos, BorderLayout.NORTH);
		paneldatos.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		lblnumero = new JLabel("Numero:");
		paneldatos.add(lblnumero);

		lblresultado = new JLabel("No se ha introducido un numero");
		lblresultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblresultado.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblresultado, BorderLayout.SOUTH);

		txtnumero = new JTextField();
		txtnumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnumero.setText("0");
		txtnumero.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtnumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje;
				mensaje = "El numero introducido es el " + txtnumero.getText();
				lblresultado.setText(mensaje);
			}
		});

		paneldatos.add(txtnumero);
		txtnumero.setColumns(10);
	}

}
