package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal {

	private JFrame frmMcvetMen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmMcvetMen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMcvetMen = new JFrame();
		frmMcvetMen.setTitle("McVet - Men\u00FA Principal");
		frmMcvetMen.setBounds(100, 100, 450, 300);
		frmMcvetMen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMcvetMen.getContentPane().setLayout(null);

		JButton btnGestinDeClientes = new JButton("Gesti\u00F3n de clientes");
		btnGestinDeClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnGestinDeClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				GestionClientes a = new GestionClientes();
			}
		});
		btnGestinDeClientes.setBounds(129, 118, 185, 23);
		frmMcvetMen.getContentPane().add(btnGestinDeClientes);
	}

}
