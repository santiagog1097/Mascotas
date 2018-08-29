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
import Mundo.*;
public class AgregarClienteOpciones {

	private JFrame frmAgregarCliente;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textAntesDe;
	private JTextField textDespuesDe;
	
	private Cliente e;
	private CentralClientes listaClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//AgregarClienteOpciones window = new AgregarClienteOpciones();
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
	public AgregarClienteOpciones(Cliente c,CentralClientes lista) {
		initialize();
		this.e = c;
		this.listaClientes = lista;
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
		
		JRadioButton rdbtnAlComienzo = new JRadioButton("Agregar al comienzo de la lista");
		buttonGroup.add(rdbtnAlComienzo);
		rdbtnAlComienzo.setBounds(6, 16, 218, 23);
		panel.add(rdbtnAlComienzo);
		
		JRadioButton rdbtnAlFinal = new JRadioButton("Agregar al final de la lista");
		buttonGroup.add(rdbtnAlFinal);
		rdbtnAlFinal.setBounds(6, 64, 218, 23);
		panel.add(rdbtnAlFinal);
		
		JRadioButton rdbtnAntesDe = new JRadioButton("Antes del cliente con el c\u00F3digo");
		buttonGroup.add(rdbtnAntesDe);
		rdbtnAntesDe.setBounds(6, 121, 218, 23);
		panel.add(rdbtnAntesDe);
		
		JRadioButton rdbtnDespuesDe = new JRadioButton("Despu\u00E9s del cliente con el c\u00F3digo");
		buttonGroup.add(rdbtnDespuesDe);
		rdbtnDespuesDe.setBounds(6, 186, 218, 23);
		panel.add(rdbtnDespuesDe);
		
		textAntesDe = new JTextField();
		textAntesDe.setBounds(289, 122, 86, 20);
		panel.add(textAntesDe);
		textAntesDe.setColumns(10);
		
		textDespuesDe = new JTextField();
		textDespuesDe.setBounds(289, 187, 86, 20);
		panel.add(textDespuesDe);
		textDespuesDe.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAgregarCliente.setVisible(false);
				AgregarCliente cl = new AgregarCliente(listaClientes);
			}
		});
		btnCancelar.setBounds(20, 262, 89, 23);
		frmAgregarCliente.getContentPane().add(btnCancelar);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Mensaje de transacción hecha correctamente
				//Se agrega al comienzo de la lista
				if(rdbtnAlComienzo.isSelected()) {
					listaClientes.insert1Elemento(e);
					//System.out.println("Identificación" + e.getIdentificacion()+"Direccion:"+ e.getDireccion());
				}
				//Se inserta al final de la lista
				if(rdbtnAlFinal.isSelected()) {
					listaClientes.insertarAlfinal(e);
				}
				
				//Se inserta un cliente antes del cliente con codigo
				if(rdbtnAntesDe.isSelected()) {
					listaClientes.insertarAntesDe(Integer.parseInt(textAntesDe.getText()), e);
				}
				
				//Se inserta un cliente después del cliente con código
				if(rdbtnDespuesDe.isSelected()) {
					listaClientes.insertarDespuesDe(Integer.parseInt(textDespuesDe.getText()), e);
				}
				System.out.println("Mostramos Lista");
				listaClientes.mostrarLista();
				
				//Actualizar la tabla de clientes
			}
		});
		btnFinalizar.setBounds(235, 262, 89, 23);
		frmAgregarCliente.getContentPane().add(btnFinalizar);
		frmAgregarCliente.setVisible(true);
	}
}
