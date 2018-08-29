package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionClientes {

	private JFrame frmGestinDeClientes;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionClientes window = new GestionClientes();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestionClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmGestinDeClientes = new JFrame();
		frmGestinDeClientes.setTitle("Gesti\u00F3n de clientes");
		frmGestinDeClientes.setBounds(100, 100, 450, 300);
		frmGestinDeClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{},
				{},
				{},
			},
			new String[] {
			}
		));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarCliente addCliente = new AgregarCliente();
				
				
			}
		});
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGestinDeClientes.setVisible(false);
				BuscarCliente bcli = new BuscarCliente();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGestinDeClientes.setVisible(false);
				EliminarCliente elcl = new EliminarCliente();
			}
		});
		
		JButton btnVerMascotas = new JButton("Ver Mascotas");
		btnVerMascotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGestinDeClientes.setVisible(false);
				VerMascotas vmc = new VerMascotas();
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmGestinDeClientes.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAgregar)
							.addGap(18)
							.addComponent(btnNewButton)
							.addGap(18)
							.addComponent(btnNewButton_1)
							.addGap(18)
							.addComponent(btnVerMascotas)))
					.addContainerGap(7, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(38)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAgregar)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnVerMascotas))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"hola", "como", "estas", "tu"},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Identificaci\u00F3n", "Nombre", "Direcci\u00F3n", "Tel\u00E9fono"
			}
		));
		scrollPane.setViewportView(table_1);
		frmGestinDeClientes.getContentPane().setLayout(groupLayout);
		frmGestinDeClientes.setVisible(true);
	}
}
