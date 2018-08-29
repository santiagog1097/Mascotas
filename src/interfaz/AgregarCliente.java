package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarCliente {

	private JFrame frmAgregarCliente;
	private JTextField txtIdentifiacion;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JButton btnCancelar;
	private JButton btnAgregar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarCliente window = new AgregarCliente();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AgregarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmAgregarCliente = new JFrame();
		frmAgregarCliente.setTitle("Agregar Un Nuevo Cliente");
		frmAgregarCliente.setBounds(100, 100, 531, 368);
		frmAgregarCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmAgregarCliente.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblIdentifiacin = new JLabel("Identifiaci\u00F3n");
		GridBagConstraints gbc_lblIdentifiacin = new GridBagConstraints();
		gbc_lblIdentifiacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentifiacin.gridx = 1;
		gbc_lblIdentifiacin.gridy = 2;
		frmAgregarCliente.getContentPane().add(lblIdentifiacin, gbc_lblIdentifiacin);
		
		txtIdentifiacion = new JTextField();
		GridBagConstraints gbc_txtIdentifiacion = new GridBagConstraints();
		gbc_txtIdentifiacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdentifiacion.insets = new Insets(0, 0, 5, 0);
		gbc_txtIdentifiacion.anchor = GridBagConstraints.NORTH;
		gbc_txtIdentifiacion.gridx = 4;
		gbc_txtIdentifiacion.gridy = 2;
		frmAgregarCliente.getContentPane().add(txtIdentifiacion, gbc_txtIdentifiacion);
		txtIdentifiacion.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 4;
		frmAgregarCliente.getContentPane().add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 4;
		gbc_txtNombre.gridy = 4;
		frmAgregarCliente.getContentPane().add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Direcci\u00F3n");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 6;
		frmAgregarCliente.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		txtDireccion = new JTextField();
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.gridx = 4;
		gbc_txtDireccion.gridy = 6;
		frmAgregarCliente.getContentPane().add(txtDireccion, gbc_txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 1;
		gbc_lblTelfono.gridy = 8;
		frmAgregarCliente.getContentPane().add(lblTelfono, gbc_lblTelfono);
		
		txtTelefono = new JTextField();
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 4;
		gbc_txtTelefono.gridy = 8;
		frmAgregarCliente.getContentPane().add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAgregarCliente.setVisible(false);
				GestionClientes cli = new GestionClientes();
			}
		});
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 10;
		frmAgregarCliente.getContentPane().add(btnCancelar, gbc_btnCancelar);
		
		btnAgregar = new JButton("Continuar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAgregarCliente.setVisible(false);
				AgregarClienteOpciones clop = new  AgregarClienteOpciones();
			}
		});
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.gridx = 4;
		gbc_btnAgregar.gridy = 10;
		frmAgregarCliente.getContentPane().add(btnAgregar, gbc_btnAgregar);
		frmAgregarCliente.setVisible(true);
		
	}
}
