package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BotonesMensaje extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;
	private JButton btnhola;
	private JButton btnadios;
	private JButton btnkaixo;
	private JButton btnagur;
	private JLabel lblresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensaje frame = new BotonesMensaje();
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
	public BotonesMensaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 207, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setColumns(10);
		contentPane.add(textField, BorderLayout.NORTH);

		lblresultado = new JLabel("No hay mensaje");
		contentPane.add(lblresultado, BorderLayout.SOUTH);

		panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		contentPane.add(panel, BorderLayout.CENTER);

		btnhola = new JButton("Hola");
		btnhola.addActionListener(this);
		panel.add(btnhola);

		btnadios = new JButton("Adios");
		btnadios.addActionListener(this);
		panel.add(btnadios);
		
		btnkaixo = new JButton("Kaixo");
		btnkaixo.addActionListener(this);
		panel.add(btnkaixo);
		
		btnagur = new JButton("Agur");
		btnagur.addActionListener(this);
		panel.add(btnagur);



	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String mensaje = textField.getText();
		String boton = " ";
		Object o = ae.getSource();
		
		// MODO HACKER
		boton = ((JButton)o).getText();
		
		// MODO NORMAL
		/*
		 	if (o == btnhola) {
			boton = "Hola ";
		} else if (o == btnadios) {
			boton = "Adios ";
		} else if (o == btnkaixo) {
			boton = "Kaixo ";
		} else if (o == btnagur) {
			boton = "Agur ";
		}
		*/
		this.lblresultado.setText(boton + " " + mensaje);

	}
}
