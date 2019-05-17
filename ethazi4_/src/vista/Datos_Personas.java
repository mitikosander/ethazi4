package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Datos_Personas extends JPanel {
	private JTextField txfnombre;
	private JTextField txfapellido;
	private JTextField txfdni;
	private JTextField txffecha;
	private JButton btnContinuar_dtpersonas, btnCancelar;
	/**
	 * Create the panel.
	 */
	public Datos_Personas() {
		setLayout(null);
		
		btnContinuar_dtpersonas = new JButton("Continuar");
		btnContinuar_dtpersonas.setBounds(223, 250, 89, 23);
		add(btnContinuar_dtpersonas);
		
		JLabel lblDatosCliente = new JLabel("Datos Cliente");
		lblDatosCliente.setBounds(161, 23, 109, 14);
		add(lblDatosCliente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(26, 81, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(26, 116, 46, 14);
		add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(26, 153, 46, 14);
		add(lblDni);
		
		JLabel lblFechanacddmmaaaa = new JLabel("Fecha_nac(dd-mm-aaaa):");
		lblFechanacddmmaaaa.setBounds(26, 190, 130, 14);
		add(lblFechanacddmmaaaa);
		
		txfnombre = new JTextField();
		txfnombre.setBounds(95, 78, 86, 20);
		add(txfnombre);
		txfnombre.setColumns(10);
		
		txfapellido = new JTextField();
		txfapellido.setBounds(95, 113, 86, 20);
		add(txfapellido);
		txfapellido.setColumns(10);
		
		txfdni = new JTextField();
		txfdni.setBounds(95, 150, 86, 20);
		add(txfdni);
		txfdni.setColumns(10);
		
		txffecha = new JTextField();
		txffecha.setBounds(162, 187, 86, 20);
		add(txffecha);
		txffecha.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(47, 250, 89, 23);
		add(btnCancelar);

	}
	public JTextField getTxfnombre() {
		return txfnombre;
	}
	public void setTxfnombre(JTextField txfnombre) {
		this.txfnombre = txfnombre;
	}
	public JTextField getTxfapellido() {
		return txfapellido;
	}
	public void setTxfapellido(JTextField txfapellido) {
		this.txfapellido = txfapellido;
	}
	public JTextField getTxfdni() {
		return txfdni;
	}
	public void setTxfdni(JTextField txfdni) {
		this.txfdni = txfdni;
	}
	public JTextField getTxffecha() {
		return txffecha;
	}
	public void setTxffecha(JTextField txffecha) {
		this.txffecha = txffecha;
	}
	public JButton getBtnContinuar_dtpersonas() {
		return btnContinuar_dtpersonas;
	}
	public void setBtnContinuar_dtpersonas(JButton btnContinuar_dtpersonas) {
		this.btnContinuar_dtpersonas = btnContinuar_dtpersonas;
	}
	public JButton getBtnCancelar() {
		return btnCancelar;
	}
	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
	
	
}
