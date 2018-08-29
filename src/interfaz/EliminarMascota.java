package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarMascota {

	private JFrame frmEliminarMascota;
	private JTextField textIdentificacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarMascota window = new EliminarMascota();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EliminarMascota() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEliminarMascota = new JFrame();
		frmEliminarMascota.setTitle("Eliminar Mascota");
		frmEliminarMascota.setBounds(100, 100, 450, 300);
		frmEliminarMascota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEliminarMascota.getContentPane().setLayout(null);
		
		JLabel lblIdentificacin = new JLabel("Identificaci\u00F3n");
		lblIdentificacin.setBounds(159, 64, 114, 14);
		frmEliminarMascota.getContentPane().add(lblIdentificacin);
		
		textIdentificacion = new JTextField();
		textIdentificacion.setBounds(159, 99, 114, 20);
		frmEliminarMascota.getContentPane().add(textIdentificacion);
		textIdentificacion.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEliminarMascota.setVisible(false);
				VerMascotas vmc = new VerMascotas();
			}
		});
		btnCancelar.setBounds(91, 160, 89, 23);
		frmEliminarMascota.getContentPane().add(btnCancelar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Todo
				//Validar que si exista o no en la lista
				//en caso de que si existe, confirmar su elminación y hacerlo
			}
		});
		btnEliminar.setBounds(226, 160, 89, 23);
		frmEliminarMascota.getContentPane().add(btnEliminar);
		frmEliminarMascota.setVisible(true);
	}

}
