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
import javax.swing.JPasswordField;

public class VentanaLeerContraseña extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textusuario;
	private JLabel lblusuario;
	private JLabel lblresultado;
	private JPanel panel;
	private JLabel lblpassword;
	private JPasswordField pwdpassword;
	private JButton btnok;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLeerContraseña frame = new VentanaLeerContraseña();
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
	public VentanaLeerContraseña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 127);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		lblusuario = new JLabel("Usuario:");
		panel.add(lblusuario);

		textusuario = new JTextField();
		textusuario.setText("Usuario");
		textusuario.setHorizontalAlignment(SwingConstants.LEFT);
		textusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = textusuario.getText();
				String password = new String(pwdpassword.getPassword());
				String mensaje;
				if (usuario.equals("1dw3") && password.equals("1dw3")) {
					mensaje = "Bienvenido " + usuario;
					lblresultado.setText(mensaje);
				} else {
					mensaje = "Usuario o contraseña no validos ";
					lblresultado.setText(mensaje);
				}
			}
		});

		panel.add(textusuario);
		textusuario.setColumns(10);

		lblresultado = new JLabel("Anonimo");
		lblresultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblresultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblresultado, BorderLayout.SOUTH);

		lblpassword = new JLabel("Password:");
		panel.add(lblpassword);

		pwdpassword = new JPasswordField();
		pwdpassword.setColumns(10);
		pwdpassword.setText("1dw3");
		pwdpassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = textusuario.getText();
				String password = new String(pwdpassword.getPassword());
				String mensaje;
				if (usuario.equals("1dw3") && password.equals("1dw3")) {
					mensaje = "Bienvenido " + usuario;
					lblresultado.setText(mensaje);
				} else {
					mensaje = "Usuario o contraseña no validos ";
					lblresultado.setText(mensaje);
				}
			}
		});
		panel.add(pwdpassword);

		btnok = new JButton("Ok");

		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = textusuario.getText();
				String password = new String(pwdpassword.getPassword());
				String mensaje;
				if (usuario.equals("1dw3") && password.equals("1dw3")) {
					mensaje = "Bienvenido " + usuario;
					lblresultado.setText(mensaje);
				} else {
					mensaje = "Usuario o contraseña no validos ";
					lblresultado.setText(mensaje);
				}
			}
		});
		panel.add(btnok);
		
			
	}

}
