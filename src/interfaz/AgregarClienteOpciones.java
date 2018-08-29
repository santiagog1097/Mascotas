package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.List;
import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarClienteOpciones {

	private JFrame frmAgregarCliente;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarClienteOpciones window = new AgregarClienteOpciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AgregarClienteOpciones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgregarCliente = new JFrame();
		frmAgregarCliente.setTitle("Agregar cliente");
		frmAgregarCliente.setBounds(100, 100, 489, 335);
		frmAgregarCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgregarCliente.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Opciones para agregar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(23, 18, 401, 216);
		frmAgregarCliente.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Agregar al comienzo de la lista");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 16, 218, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Agregar al final de la lista");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(6, 64, 218, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Antes del cliente con el c\u00F3digo");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(6, 121, 218, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Despu\u00E9s del cliente con el c\u00F3digo");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(6, 186, 218, 23);
		panel.add(rdbtnNewRadioButton_3);
		
		textField = new JTextField();
		textField.setBounds(289, 122, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(289, 187, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAgregarCliente.setVisible(false);
				AgregarCliente cl = new AgregarCliente();
			}
		});
		btnCancelar.setBounds(20, 262, 89, 23);
		frmAgregarCliente.getContentPane().add(btnCancelar);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Mensaje de transacción hecha correctamente
				//Actualizar la tabla de clientes
			}
		});
		btnFinalizar.setBounds(235, 262, 89, 23);
		frmAgregarCliente.getContentPane().add(btnFinalizar);
		frmAgregarCliente.setVisible(true);
	}
}
