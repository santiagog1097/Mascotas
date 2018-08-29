package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuscarMascota {

	private JFrame frmBuscarUnaMascota;
	private JTextField textIdentificacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarMascota window = new BuscarMascota();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BuscarMascota() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBuscarUnaMascota = new JFrame();
		frmBuscarUnaMascota.setTitle("Buscar una mascota");
		frmBuscarUnaMascota.setBounds(100, 100, 450, 300);
		frmBuscarUnaMascota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBuscarUnaMascota.getContentPane().setLayout(null);
		
		JLabel lblIdentificacin = new JLabel("Identificaci\u00F3n");
		lblIdentificacin.setBounds(157, 63, 127, 14);
		frmBuscarUnaMascota.getContentPane().add(lblIdentificacin);
		
		textIdentificacion = new JTextField();
		textIdentificacion.setBounds(157, 87, 127, 20);
		frmBuscarUnaMascota.getContentPane().add(textIdentificacion);
		textIdentificacion.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBuscarUnaMascota.setVisible(false);
				VerMascotas vmc = new VerMascotas();
			}
		});
		btnCancelar.setBounds(94, 142, 89, 23);
		frmBuscarUnaMascota.getContentPane().add(btnCancelar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//todo
				//Debe de validar si la mascota si existe o no
				//en caso de que exista se debe de eliminar de la lista
			}
		});
		btnBuscar.setBounds(234, 142, 89, 23);
		frmBuscarUnaMascota.getContentPane().add(btnBuscar);
		frmBuscarUnaMascota.setVisible(true);
	}

}
