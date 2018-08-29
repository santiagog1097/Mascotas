package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarMascotasOpciones {

	private JFrame frmAgregarMascota;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textAntesDe;
	private JTextField textDespuesDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarMascotasOpciones window = new AgregarMascotasOpciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AgregarMascotasOpciones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgregarMascota = new JFrame();
		frmAgregarMascota.setTitle("Agregar Mascota");
		frmAgregarMascota.setBounds(100, 100, 450, 300);
		frmAgregarMascota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgregarMascota.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Opciones para agregar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(21, 20, 403, 190);
		frmAgregarMascota.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnAgregarAlComienzo = new JRadioButton("Agregar al comienzo de la lista");
		buttonGroup.add(rdbtnAgregarAlComienzo);
		rdbtnAgregarAlComienzo.setBounds(6, 16, 197, 23);
		panel.add(rdbtnAgregarAlComienzo);
		
		JRadioButton rdbtnAgregarAlFinal = new JRadioButton("Agregar al final de la lista");
		buttonGroup.add(rdbtnAgregarAlFinal);
		rdbtnAgregarAlFinal.setBounds(6, 60, 197, 23);
		panel.add(rdbtnAgregarAlFinal);
		
		JRadioButton rdbtnAntesDeLa = new JRadioButton("Antes de la mascota con el c\u00F3digo");
		buttonGroup.add(rdbtnAntesDeLa);
		rdbtnAntesDeLa.setBounds(6, 102, 252, 23);
		panel.add(rdbtnAntesDeLa);
		
		textAntesDe = new JTextField();
		textAntesDe.setBounds(307, 103, 86, 20);
		panel.add(textAntesDe);
		textAntesDe.setColumns(10);
		
		JRadioButton rdbtnDespusDeLa = new JRadioButton("Despu\u00E9s de la mascota con el c\u00F3digo");
		buttonGroup.add(rdbtnDespusDeLa);
		rdbtnDespusDeLa.setBounds(6, 147, 252, 23);
		panel.add(rdbtnDespusDeLa);
		
		textDespuesDe = new JTextField();
		textDespuesDe.setBounds(307, 148, 86, 20);
		panel.add(textDespuesDe);
		textDespuesDe.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAgregarMascota.setVisible(false);
				AgregarMascota agm = new AgregarMascota();
			}
		});
		btnCancelar.setBounds(27, 227, 89, 23);
		frmAgregarMascota.getContentPane().add(btnCancelar);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Agregar en la posición correcta
				//Actualizar la tabla de mascotas
			}
		});
		btnFinalizar.setBounds(281, 227, 89, 23);
		frmAgregarMascota.getContentPane().add(btnFinalizar);
		frmAgregarMascota.setVisible(true);
	}
}
