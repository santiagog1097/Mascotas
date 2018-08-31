package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Mundo.CentralClientes;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarCliente {

	private JFrame frmEliminarCliente;
	private JTextField textIdentificacion;
	private CentralClientes listaClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//EliminarCliente window = new EliminarCliente();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public EliminarCliente(CentralClientes lista) {
		initialize();
		this.listaClientes =lista;
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
		
		textIdentificacion = new JTextField();
		textIdentificacion.setBounds(145, 104, 119, 20);
		frmEliminarCliente.getContentPane().add(textIdentificacion);
		textIdentificacion.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEliminarCliente.setVisible(false);
				GestionClientes gcl = new GestionClientes(listaClientes);
			}
		});
		btnCancelar.setBounds(88, 157, 89, 23);
		frmEliminarCliente.getContentPane().add(btnCancelar);
		
		JButton btnBuscar = new JButton("Eliminar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Indicar si el cliente existe o no
				JOptionPane mensaje = new JOptionPane();
				if(listaClientes.buscarElemento(Integer.parseInt(textIdentificacion.getText()))!=null) {
					mensaje.showMessageDialog(null,"El cliente identificado con el código " + textIdentificacion.getText() +" ha sido encontrado");
					ConfirmarEliminarCliente ne = new ConfirmarEliminarCliente(listaClientes,Integer.parseInt(textIdentificacion.getText()));
				}else {
					//En caso de que no exista
					mensaje.showMessageDialog(null,"El cliente identificado con el código " + textIdentificacion.getText() +" no ha sido encontrado");
					
				}
				//si existe confirmar si lo quiere eliminar o no y luego eliminarlo de la lista.
			}
		});
		btnBuscar.setBounds(220, 157, 89, 23);
		frmEliminarCliente.getContentPane().add(btnBuscar);
		
		frmEliminarCliente.setVisible(true);
	}

}
