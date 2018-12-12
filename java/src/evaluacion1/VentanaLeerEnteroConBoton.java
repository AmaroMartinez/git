package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLeerEnteroConBoton extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnumero;
	private JLabel lblnumero;
	private JButton btnokey;
	private JLabel lblresultado;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLeerEnteroConBoton frame = new VentanaLeerEnteroConBoton();
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
	public VentanaLeerEnteroConBoton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 127);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblnumero = new JLabel("Numero:");
		panel.add(lblnumero);
		
		textnumero = new JTextField();
		textnumero.setHorizontalAlignment(SwingConstants.RIGHT);
		textnumero.setText("0");
		panel.add(textnumero);
		textnumero.setColumns(10);
				
		lblresultado = new JLabel("No se ha introducido un numero");
		lblresultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblresultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblresultado, BorderLayout.SOUTH);
		
		btnokey = new JButton("Okey");
		btnokey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje;
				mensaje = "El numero introducido es el " + textnumero.getText();
				lblresultado.setText(mensaje);
			}
		});
		panel.add(btnokey);

		
	}

}
