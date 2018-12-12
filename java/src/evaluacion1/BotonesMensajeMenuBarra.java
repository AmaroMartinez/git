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
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;

public class BotonesMensajeMenuBarra extends JFrame implements ActionListener {

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
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem jmiHola;
	private JMenuItem jmiAdios;
	private JMenuItem jmiKaixo;
	private JMenuItem jmiAgur;
	private JToolBar toolBar;
	private JPanel panelcentral;
	private JButton btnHolaTB;
	private JButton btnAdiosTB;
	private JButton btnKaixoTB;
	private JButton btnAgurTB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajeMenuBarra frame = new BotonesMensajeMenuBarra();
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
	public BotonesMensajeMenuBarra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 487);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		jmiHola = new JMenuItem("Hola");
		jmiHola.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		jmiHola.addActionListener(this);
		mnMenu.add(jmiHola);
		
		jmiAdios = new JMenuItem("Adios");
		jmiAdios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		jmiAdios.addActionListener(this);
		mnMenu.add(jmiAdios);
		
		jmiKaixo = new JMenuItem("Kaixo");
		jmiKaixo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_MASK));
		jmiKaixo.addActionListener(this);
		mnMenu.add(jmiKaixo);
		
		jmiAgur = new JMenuItem("Agur");
		jmiAgur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		jmiAgur.addActionListener(this);
		mnMenu.add(jmiAgur);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		lblresultado = new JLabel("No hay mensaje");
		contentPane.add(lblresultado, BorderLayout.SOUTH);
		
		toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		btnHolaTB = new JButton("Hola");
		btnHolaTB.setIcon(new ImageIcon(BotonesMensajeMenuBarra.class.getResource("/iconos/copiar.gif")));
		btnHolaTB.addActionListener(this);
		toolBar.add(btnHolaTB);
		
		btnAdiosTB = new JButton("Adios");
		btnAdiosTB.setIcon(new ImageIcon(BotonesMensajeMenuBarra.class.getResource("/iconos/cortar.gif")));
		btnAdiosTB.addActionListener(this);
		toolBar.add(btnAdiosTB);
		
		btnKaixoTB = new JButton("Kaixo");
		btnKaixoTB.setIcon(new ImageIcon(BotonesMensajeMenuBarra.class.getResource("/iconos/guardarcomo.gif")));
		btnKaixoTB.addActionListener(this);
		toolBar.add(btnKaixoTB);
		
		btnAgurTB = new JButton("Agur");
		btnAgurTB.setIcon(new ImageIcon(BotonesMensajeMenuBarra.class.getResource("/iconos/imprimir.gif")));
		btnAgurTB.addActionListener(this);
		toolBar.add(btnAgurTB);
		
		panelcentral = new JPanel();
		contentPane.add(panelcentral, BorderLayout.CENTER);
		panelcentral.setLayout(new BorderLayout(0, 0));
		
				panel = new JPanel();
				panelcentral.add(panel, BorderLayout.CENTER);
				panel.setLayout(new GridLayout(2, 2, 0, 0));
				
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
								
										textField = new JTextField();
										panelcentral.add(textField, BorderLayout.NORTH);
										textField.setColumns(10);


	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String mensaje = "";
		Object o = ae.getSource();
		mensaje = o.getClass().getName();
		if (mensaje.equals("javax.swing.JButton")) {
			mensaje = ((JButton)o).getText();
		} else {
			mensaje = ((JMenuItem)o).getText();
		}
			this.lblresultado.setText(mensaje + " " + textField.getText());

	}
}
