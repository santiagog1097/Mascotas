package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarCliente {

	private JFrame frmEliminarCliente;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarCliente window = new EliminarCliente();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EliminarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEliminarCliente = new JFrame();
		frmEliminarCliente.setTitle("Eliminar cliente");
		frmEliminarCliente.setBounds(100, 100, 450, 300);
		frmEliminarCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEliminarCliente.getContentPane().setLayout(null);
		
		JLabel lblIdentificacin = new JLabel("Identificaci\u00F3n");
		lblIdentificacin.setBounds(145, 65, 119, 14);
		frmEliminarCliente.getContentPane().add(lblIdentificacin);
		
		textField = new JTextField();
		textField.setBounds(145, 104, 119, 20);
		frmEliminarCliente.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEliminarCliente.setVisible(false);
				GestionClientes gcl = new GestionClientes();
			}
		});
		btnCancelar.setBounds(88, 157, 89, 23);
		frmEliminarCliente.getContentPane().add(btnCancelar);
		
		JButton btnBuscar = new JButton("Eliminar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Indicar si el cliente existe o no
				//si existe confirmar si lo quiere eliminar o no y luego eliminarlo de la lista.
			}
		});
		btnBuscar.setBounds(220, 157, 89, 23);
		frmEliminarCliente.getContentPane().add(btnBuscar);
		
		frmEliminarCliente.setVisible(true);
	}

}
