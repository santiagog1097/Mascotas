package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerMascotas {

	private JFrame frmGestinDeMascotas;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerMascotas window = new VerMascotas();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VerMascotas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestinDeMascotas = new JFrame();
		frmGestinDeMascotas.setTitle("Gesti\u00F3n de mascotas");
		frmGestinDeMascotas.setBounds(100, 100, 450, 300);
		frmGestinDeMascotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestinDeMascotas.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 182);
		frmGestinDeMascotas.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Identificaci\u00F3n", "Nombre", "Raza", "Color"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGestinDeMascotas.setVisible(false);
				AgregarMascota agmc = new AgregarMascota();
			}
		});
		btnAgregar.setBounds(10, 215, 89, 23);
		frmGestinDeMascotas.getContentPane().add(btnAgregar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGestinDeMascotas.setVisible(false);
				BuscarMascota bmc = new BuscarMascota();
			}
		});
		btnBuscar.setBounds(137, 215, 89, 23);
		frmGestinDeMascotas.getContentPane().add(btnBuscar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGestinDeMascotas.setVisible(false);
				EliminarMascota elmc = new EliminarMascota();
			}
		});
		btnEliminar.setBounds(271, 215, 89, 23);
		frmGestinDeMascotas.getContentPane().add(btnEliminar);
		frmGestinDeMascotas.setVisible(true);
	}
}
