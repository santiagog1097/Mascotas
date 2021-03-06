package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import Mundo.CentralClientes;
import Mundo.Cliente;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuscarCliente {

	private JFrame frmBuscarCliente;
	private JTextField textidentificacion;
	private CentralClientes listaClientes;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//BuscarCliente window = new BuscarCliente();
					
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
	public BuscarCliente(CentralClientes lista) {
		initialize();
		this.listaClientes =lista;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBuscarCliente = new JFrame();
		frmBuscarCliente.setTitle("Buscar un cliente");
		frmBuscarCliente.setBounds(100, 100, 450, 300);
		frmBuscarCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Identificaci\u00F3n");
		
		textidentificacion = new JTextField();
		textidentificacion.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBuscarCliente.setVisible(false);
				GestionClientes clg = new GestionClientes(listaClientes);
			}
		});
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Mensajse que diga si existe o no el cliente
				//En caso de que exista
				Cliente encontrado = listaClientes.buscarElemento(Integer.parseInt(textidentificacion.getText()));
				if(encontrado!=null) {
					JOptionPane.showMessageDialog(null,"Cliente      : "+ encontrado.getNombre()+"\n"+"Encontrado correctamente","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
				}else {
					//En caso de que no exista
					JOptionPane.showMessageDialog(null,"El cliente identificado con el c�digo " + textidentificacion.getText() +" no ha sido encontrado");
				}
				
	
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmBuscarCliente.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(119)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textidentificacion)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnCancelar)
								.addGap(18)
								.addComponent(btnBuscar))))
					.addGap(157))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(70)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textidentificacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnBuscar))
					.addContainerGap(83, Short.MAX_VALUE))
		);
		frmBuscarCliente.getContentPane().setLayout(groupLayout);
		frmBuscarCliente.setVisible(true);
	}
}
