package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import Mundo.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfirmarEliminarCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private CentralClientes listaClientes;
	private int codigo;
	/**
	 * Launch the application.
	 */
	JPanel frameDialogo;
	public static void main(String[] args) {
		try {
			//ConfirmarEliminarCliente dialog = new ConfirmarEliminarCliente();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfirmarEliminarCliente(CentralClientes lista,int codigo) {
		this.listaClientes = lista;
		this.codigo = codigo;
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("INFORMACI\u00D3N IMPORTANTE");
		setBounds(100, 100, 450, 146);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblestaSeguroDe = new JLabel("\u00BFESTA SEGURO DE REALIZAR ESTA TRANSACCI\u00D3N?");
			contentPanel.add(lblestaSeguroDe);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						listaClientes.eliminarElemento(codigo);
						GestionClientes gtcl = new GestionClientes(listaClientes);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		setVisible(true);
	}

}
