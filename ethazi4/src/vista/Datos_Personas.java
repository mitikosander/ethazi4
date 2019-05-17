package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;


public class Datos_Personas extends JPanel {
	private JTextField txfnombre;
	private JTextField txfapellido;
	private JTextField txfdni;
	private JButton btnContinuar_dtpersonas, btnCancelar;
	/**
	 * Create the panel.
	 */
	public Datos_Personas() {
		setLayout(null);
		
		btnContinuar_dtpersonas = new JButton("Continuar");
		btnContinuar_dtpersonas.setBounds(270, 232, 89, 23);
		add(btnContinuar_dtpersonas);
		
		JLabel lblDatosCliente = new JLabel("Datos Cliente");
		lblDatosCliente.setBounds(161, 23, 109, 14);
		add(lblDatosCliente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(106, 66, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(106, 101, 46, 14);
		add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(106, 138, 46, 14);
		add(lblDni);
		
		JLabel lblFechanacddmmaaaa = new JLabel("Fecha de nacimiento:");
		lblFechanacddmmaaaa.setBounds(106, 175, 109, 14);
		add(lblFechanacddmmaaaa);
		
		txfnombre = new JTextField();
		txfnombre.setBounds(175, 63, 86, 20);
		add(txfnombre);
		txfnombre.setColumns(10);
		
		txfapellido = new JTextField();
		txfapellido.setBounds(175, 98, 86, 20);
		add(txfapellido);
		txfapellido.setColumns(10);
		
		txfdni = new JTextField();
		txfdni.setBounds(175, 135, 86, 20);
		add(txfdni);
		txfdni.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(88, 232, 89, 23);
		add(btnCancelar);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-mm-yyyy");
		dateChooser.setBounds(214, 175, 95, 20);
		add(dateChooser);

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
