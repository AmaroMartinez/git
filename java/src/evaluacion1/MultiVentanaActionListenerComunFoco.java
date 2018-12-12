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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MultiVentanaActionListenerComunFoco extends JFrame implements ActionListener {

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
					MultiVentanaActionListenerComunFoco frame = new MultiVentanaActionListenerComunFoco();
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
	public MultiVentanaActionListenerComunFoco() {
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
		textusuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textusuario.select(0, textusuario.getText().length());
			}

			@Override
			public void focusLost(FocusEvent e) {
				textusuario.select(0, 0);
			}
		});
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
		pwdpassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdpassword.setSelectionStart(0);
				String contraseña = new String(pwdpassword.getPassword());
				pwdpassword.setSelectionEnd(contraseña.length());
			}

			@Override
			public void focusLost(FocusEvent e) {
				pwdpassword.select(0, 0);
			}
		});
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
		String nombrecorrecto = "1dw3";
		String contraseñacorrecta = "1dw3";
		String mensaje = "";
		if (usuario.equals(nombrecorrecto) && password.equals(contraseñacorrecta)) {
			VentanaHola vh = new VentanaHola();
			vh.setTitle("Bienvenido " + textusuario.getText());
			vh.setVisible(true);
			// this.setVisible(false);
			this.dispose();
		} else {
			mensaje = "Usuario o contraseña no validos ";
			lblresultado.setText(mensaje);
		}

	}

}
