package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Reserva extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tf_nombre_reserva;
	private JTextField tf_tipo_establecimiento;
	private JTextField tf_precio_reserva;
	private JTextField tf_fecha_ida;
	private JTextField tf_fecha_vuelta;
	private JButton btnPagar_reserva;
	JButton btnCancelar_reserva;
	private JTextField texpension;
	private JTextField textcama;

	/**
	 * Create the panel.
	 */
	public Reserva() {
		setLayout(null);

		JLabel lblNombreDelEstablecimiento = new JLabel("Nombre del establecimiento : ");
		lblNombreDelEstablecimiento.setBounds(101, 50, 150, 14);
		add(lblNombreDelEstablecimiento);

		tf_nombre_reserva = new JTextField();
		tf_nombre_reserva.setEditable(false);
		tf_nombre_reserva.setEnabled(false);
		tf_nombre_reserva.setBounds(261, 47, 86, 20);
		add(tf_nombre_reserva);
		tf_nombre_reserva.setColumns(10);

		JLabel lblTipoDeEstablecimiento = new JLabel("Tipo de establecimiento:");
		lblTipoDeEstablecimiento.setBounds(121, 75, 130, 14);
		add(lblTipoDeEstablecimiento);

		tf_tipo_establecimiento = new JTextField();
		tf_tipo_establecimiento.setEditable(false);
		tf_tipo_establecimiento.setEnabled(false);
		tf_tipo_establecimiento.setBounds(261, 72, 86, 20);
		add(tf_tipo_establecimiento);
		tf_tipo_establecimiento.setColumns(10);

		JLabel lblFechaIda = new JLabel("Fecha ida: ");
		lblFechaIda.setBounds(181, 100, 59, 14);
		add(lblFechaIda);

		JLabel lblFechaVuelta = new JLabel("Fecha vuelta:");
		lblFechaVuelta.setBounds(169, 125, 71, 14);
		add(lblFechaVuelta);

		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(194, 198, 46, 14);
		add(lblPrecio);

		tf_precio_reserva = new JTextField();
		tf_precio_reserva.setEditable(false);
		tf_precio_reserva.setEnabled(false);
		tf_precio_reserva.setBounds(261, 195, 86, 20);
		add(tf_precio_reserva);
		tf_precio_reserva.setColumns(10);

		btnPagar_reserva = new JButton("Imprimir Ticket");
		btnPagar_reserva.setBounds(251, 241, 120, 23);
		add(btnPagar_reserva);

		btnCancelar_reserva = new JButton("Cancelar");
		btnCancelar_reserva.setBounds(45, 241, 89, 23);
		add(btnCancelar_reserva);

		tf_fecha_ida = new JTextField();
		tf_fecha_ida.setEditable(false);
		tf_fecha_ida.setEnabled(false);
		tf_fecha_ida.setBounds(261, 97, 86, 20);
		add(tf_fecha_ida);
		tf_fecha_ida.setColumns(10);

		tf_fecha_vuelta = new JTextField();
		tf_fecha_vuelta.setEditable(false);
		tf_fecha_vuelta.setEnabled(false);
		tf_fecha_vuelta.setBounds(261, 122, 86, 20);
		add(tf_fecha_vuelta);
		tf_fecha_vuelta.setColumns(10);

		JLabel lblTipoPensin = new JLabel("Tipo Pensi\u00F3n:");
		lblTipoPensin.setBounds(170, 150, 70, 14);
		add(lblTipoPensin);

		JLabel lblTipoCama = new JLabel("Tipo Cama:");
		lblTipoCama.setBounds(181, 175, 59, 14);
		add(lblTipoCama);

		texpension = new JTextField();
		texpension.setEditable(false);
		texpension.setEnabled(false);
		texpension.setBounds(261, 147, 86, 20);
		add(texpension);
		texpension.setColumns(10);

		textcama = new JTextField();
		textcama.setEditable(false);
		textcama.setEnabled(false);
		textcama.setBounds(261, 172, 86, 20);
		add(textcama);
		textcama.setColumns(10);

		JLabel lblResumenDeLa = new JLabel("Resumen de la reserva realizada");
		lblResumenDeLa.setBounds(130, 11, 180, 14);
		add(lblResumenDeLa);

	}

	public JTextField getTf_nombre_reserva() {
		return tf_nombre_reserva;
	}

	public void setTf_nombre_reserva(JTextField tf_nombre_reserva) {
		this.tf_nombre_reserva = tf_nombre_reserva;
	}

	public JTextField getTf_tipo_pagar() {
		return tf_tipo_establecimiento;
	}

	public void setTf_tipo_pagar(JTextField tf_tipo_pagar) {
		this.tf_tipo_establecimiento = tf_tipo_pagar;
	}

	public JTextField getTf_precio_reserva() {
		return tf_precio_reserva;
	}

	public void setTf_precio_reserva(JTextField tf_precio_reserva) {
		this.tf_precio_reserva = tf_precio_reserva;
	}

	public JTextField getTf_fecha_ida() {
		return tf_fecha_ida;
	}

	public void setTf_fecha_ida(JTextField tf_fecha_ida) {
		this.tf_fecha_ida = tf_fecha_ida;
	}

	public JTextField getTf_fecha_vuelta() {
		return tf_fecha_vuelta;
	}

	public void setTf_fecha_vuelta(JTextField tf_fecha_vuelta) {
		this.tf_fecha_vuelta = tf_fecha_vuelta;
	}

	public JButton getBtnPagar_reserva() {
		return btnPagar_reserva;
	}

	public void setBtnPagar_reserva(JButton btnPagar_reserva) {
		this.btnPagar_reserva = btnPagar_reserva;
	}

	public JButton getBtnCancelar_reserva() {
		return btnCancelar_reserva;
	}

	public void setBtnCancelar_reserva(JButton btnCancelar_reserva) {
		this.btnCancelar_reserva = btnCancelar_reserva;
	}

	public JTextField getTf_tipo_establecimiento() {
		return tf_tipo_establecimiento;
	}

	public void setTf_tipo_establecimiento(JTextField tf_tipo_establecimiento) {
		this.tf_tipo_establecimiento = tf_tipo_establecimiento;
	}

	public JTextField getTexpension() {
		return texpension;
	}

	public void setTexpension(JTextField texpension) {
		this.texpension = texpension;
	}

	public JTextField getTextcama() {
		return textcama;
	}

	public void setTextcama(JTextField textcama) {
		this.textcama = textcama;
	}

}
