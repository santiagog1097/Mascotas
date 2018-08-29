package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarMascota {

	private JFrame frmAgregarUnaNueva;
	private JTextField textIdentificacion;
	private JTextField textNombre;
	private JTextField textRaza;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarMascota window = new AgregarMascota();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AgregarMascota() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgregarUnaNueva = new JFrame();
		frmAgregarUnaNueva.setTitle("Agregar una nueva Mascota");
		frmAgregarUnaNueva.setBounds(100, 100, 450, 300);
		frmAgregarUnaNueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgregarUnaNueva.getContentPane().setLayout(null);
		
		JLabel lblIdentificacin = new JLabel("Identificaci\u00F3n");
		lblIdentificacin.setBounds(10, 45, 133, 14);
		frmAgregarUnaNueva.getContentPane().add(lblIdentificacin);
		
		textIdentificacion = new JTextField();
		textIdentificacion.setBounds(231, 42, 86, 20);
		frmAgregarUnaNueva.getContentPane().add(textIdentificacion);
		textIdentificacion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 82, 133, 14);
		frmAgregarUnaNueva.getContentPane().add(lblNewLabel);
		
		textNombre = new JTextField();
		textNombre.setBounds(231, 73, 86, 20);
		frmAgregarUnaNueva.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblRaza = new JLabel("Raza");
		lblRaza.setBounds(10, 121, 133, 14);
		frmAgregarUnaNueva.getContentPane().add(lblRaza);
		
		textRaza = new JTextField();
		textRaza.setBounds(231, 118, 86, 20);
		frmAgregarUnaNueva.getContentPane().add(textRaza);
		textRaza.setColumns(10);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(10, 160, 133, 14);
		frmAgregarUnaNueva.getContentPane().add(lblColor);
		
		textField = new JTextField();
		textField.setBounds(231, 157, 86, 20);
		frmAgregarUnaNueva.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAgregarUnaNueva.setVisible(false);
				VerMascotas vmc = new VerMascotas();
			}
		});
		btnCancelar.setBounds(10, 210, 89, 23);
		frmAgregarUnaNueva.getContentPane().add(btnCancelar);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAgregarUnaNueva.setVisible(false);
				AgregarMascotasOpciones agmco = new AgregarMascotasOpciones();
			}
		});
		btnContinuar.setBounds(228, 210, 89, 23);
		frmAgregarUnaNueva.getContentPane().add(btnContinuar);
		frmAgregarUnaNueva.setVisible(true);
	}

}
