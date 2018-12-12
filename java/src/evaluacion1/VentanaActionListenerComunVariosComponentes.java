package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VentanaActionListenerComunVariosComponentes extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblresultado;
	private JPanel panel_1;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaActionListenerComunVariosComponentes frame = new VentanaActionListenerComunVariosComponentes();
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
	public VentanaActionListenerComunVariosComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 114);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		lblresultado = new JLabel("Ningun Boton Pulsado");
		lblresultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblresultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblresultado);

		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		btn1 = new JButton("1");
		btn1.addActionListener(this);
		panel_1.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(this);
		panel_1.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(this);
		panel_1.add(btn3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		String mensaje = "";
		if (o == btn1) {
			mensaje = "Ha pulsado el boton 1";
		} else if (o == btn2) {
			mensaje = "Ha pulsado el boton 2";
		} else if (o == btn3) {
			mensaje = "Ha pulsado el boton 3";
		}
		this.lblresultado.setText(mensaje);
	}

}
