package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Reserva extends JPanel {
	private JTextField tf_nombre_reserva;
	private JTextField tf_tipo_pagar;
	private JTextField tf_datos_reserva;
	private JTextField tf_precio_reserva;
	private JTextField tf_fecha_ida;
	private JTextField tf_fecha_vuelta;
	private JButton btnPagar_reserva;
	JButton btnCancelar_reserva;

	/**
	 * Create the panel.
	 */
	public Reserva() {
		setLayout(null);

		JLabel lblNombreDelEstablecimiento = new JLabel("Nombre del establecimiento : ");
		lblNombreDelEstablecimiento.setBounds(37, 33, 147, 14);
		add(lblNombreDelEstablecimiento);

		tf_nombre_reserva = new JTextField();
		tf_nombre_reserva.setEnabled(false);
		tf_nombre_reserva.setEditable(false);
		tf_nombre_reserva.setBounds(216, 30, 86, 20);
		add(tf_nombre_reserva);
		tf_nombre_reserva.setColumns(10);

		JLabel lblTipoDeEstablecimiento = new JLabel("Tipo de establecimiento:");
		lblTipoDeEstablecimiento.setBounds(64, 64, 130, 14);
		add(lblTipoDeEstablecimiento);

		tf_tipo_pagar = new JTextField();
		tf_tipo_pagar.setEnabled(false);
		tf_tipo_pagar.setEditable(false);
		tf_tipo_pagar.setBounds(216, 61, 86, 20);
		add(tf_tipo_pagar);
		tf_tipo_pagar.setColumns(10);

		JLabel lblFechaIda = new JLabel("Fecha ida: ");
		lblFechaIda.setBounds(135, 96, 59, 14);
		add(lblFechaIda);

		JLabel lblFechaVuelta = new JLabel("Fecha vuelta:");
		lblFechaVuelta.setBounds(126, 121, 68, 14);
		add(lblFechaVuelta);

		JLabel lblDatosVarios = new JLabel("Datos varios:");
		lblDatosVarios.setBounds(126, 150, 68, 14);
		add(lblDatosVarios);

		tf_datos_reserva = new JTextField();
		tf_datos_reserva.setEnabled(false);
		tf_datos_reserva.setEditable(false);
		tf_datos_reserva.setBounds(216, 147, 86, 20);
		add(tf_datos_reserva);
		tf_datos_reserva.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(313, 193, 46, 14);
		add(lblPrecio);

		tf_precio_reserva = new JTextField();
		tf_precio_reserva.setEnabled(false);
		tf_precio_reserva.setEditable(false);
		tf_precio_reserva.setBounds(354, 190, 86, 20);
		add(tf_precio_reserva);
		tf_precio_reserva.setColumns(10);

		btnPagar_reserva = new JButton("Pagar");
		btnPagar_reserva.setBounds(251, 241, 89, 23);
		add(btnPagar_reserva);

		btnCancelar_reserva = new JButton("Cancelar");
		btnCancelar_reserva.setBounds(112, 241, 89, 23);
		add(btnCancelar_reserva);

		tf_fecha_ida = new JTextField();
		tf_fecha_ida.setEnabled(false);
		tf_fecha_ida.setEditable(false);
		tf_fecha_ida.setBounds(216, 87, 86, 20);
		add(tf_fecha_ida);
		tf_fecha_ida.setColumns(10);

		tf_fecha_vuelta = new JTextField();
		tf_fecha_vuelta.setEditable(false);
		tf_fecha_vuelta.setEnabled(false);
		tf_fecha_vuelta.setBounds(216, 118, 86, 20);
		add(tf_fecha_vuelta);
		tf_fecha_vuelta.setColumns(10);

	}

	public JTextField getTf_nombre_reserva() {
		return tf_nombre_reserva;
	}

	public void setTf_nombre_reserva(JTextField tf_nombre_reserva) {
		this.tf_nombre_reserva = tf_nombre_reserva;
	}

	public JTextField getTf_tipo_pagar() {
		return tf_tipo_pagar;
	}

	public void setTf_tipo_pagar(JTextField tf_tipo_pagar) {
		this.tf_tipo_pagar = tf_tipo_pagar;
	}

	public JTextField getTf_datos_reserva() {
		return tf_datos_reserva;
	}

	public void setTf_datos_reserva(JTextField tf_datos_reserva) {
		this.tf_datos_reserva = tf_datos_reserva;
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

}
