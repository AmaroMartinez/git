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

public class VentanaActionListenerComun extends JFrame implements ActionListener{

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
					VentanaActionListenerComun frame = new VentanaActionListenerComun();
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
	public VentanaActionListenerComun() {
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
		textusuario.addActionListener(this);
		textusuario.setText("Usuario");
		textusuario.setHorizontalAlignment(SwingConstants.LEFT);
		textusuario.setColumns(10);
		panel.add(textusuario);


		lblresultado = new JLabel("Anonimo");
		lblresultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblresultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblresultado, BorderLayout.SOUTH);

		lblpassword = new JLabel("Password:");
		panel.add(lblpassword);

		pwdpassword = new JPasswordField();
		pwdpassword.addActionListener(this);
		pwdpassword.setColumns(10);
		pwdpassword.setText("1dw3");
		panel.add(pwdpassword);

		btnok = new JButton("Ok");
		btnok.addActionListener(this);
		panel.add(btnok);
		
		
			
	}

	@Override
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

}
