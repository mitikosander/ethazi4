package vista;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Casa_Apart_Seleccionado extends JPanel {
	private JTextField tf_ubicacion_CasaApart;
	private JTextField tf_mcuadrados_CasaApart;
	private JTextField tf_ncamas_CasaApart;
	private JTextField tf_tipohabita_CasaApart;
	private JTextField tf_fentrada_CasaApart;
	private JTextField tf_fsalida_CasaApart;
	private JTextField tf_precio_CasaApart;
	private JButton btnCancelar_CasaApart;
	private JButton btnReservar_CasaApart;

	/**
	 * Create the panel.
	 */
	public Casa_Apart_Seleccionado() {
		setLayout(null);
		
		JLabel lblUbicacion = new JLabel("Ubicacion:");
		lblUbicacion.setBounds(47, 51, 56, 14);
		add(lblUbicacion);
		
		JLabel lblMetrosCuadrados = new JLabel("Metros cuadrados:");
		lblMetrosCuadrados.setBounds(46, 76, 107, 14);
		add(lblMetrosCuadrados);
		
		JLabel lblNDeCamas = new JLabel("N\u00BA de camas:");
		lblNDeCamas.setBounds(47, 101, 89, 14);
		add(lblNDeCamas);
		
		JLabel lblTipoHabitaciones = new JLabel("Tipo habitaciones: ");
		lblTipoHabitaciones.setBounds(47, 126, 106, 14);
		add(lblTipoHabitaciones);
		
		JLabel lblFechaDeEntrada = new JLabel("Fecha de entrada:");
		lblFechaDeEntrada.setBounds(47, 150, 89, 14);
		add(lblFechaDeEntrada);
		
		JLabel lblFechaDeSalida = new JLabel("Fecha de salida : ");
		lblFechaDeSalida.setBounds(47, 175, 89, 14);
		add(lblFechaDeSalida);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(316, 227, 33, 14);
		add(lblPrecio);
		
		btnCancelar_CasaApart = new JButton("Cancelar");
		btnCancelar_CasaApart.setBounds(37, 249, 89, 23);
		add(btnCancelar_CasaApart);
		
		btnReservar_CasaApart = new JButton("Reservar");
		btnReservar_CasaApart.setBounds(316, 252, 89, 23);
		add(btnReservar_CasaApart);
		
		tf_ubicacion_CasaApart = new JTextField();
		tf_ubicacion_CasaApart.setBounds(152, 48, 86, 20);
		add(tf_ubicacion_CasaApart);
		tf_ubicacion_CasaApart.setColumns(10);
		
		tf_mcuadrados_CasaApart = new JTextField();
		tf_mcuadrados_CasaApart.setBounds(152, 73, 86, 20);
		add(tf_mcuadrados_CasaApart);
		tf_mcuadrados_CasaApart.setColumns(10);
		
		tf_ncamas_CasaApart = new JTextField();
		tf_ncamas_CasaApart.setBounds(152, 98, 86, 20);
		add(tf_ncamas_CasaApart);
		tf_ncamas_CasaApart.setColumns(10);
		
		tf_tipohabita_CasaApart = new JTextField();
		tf_tipohabita_CasaApart.setBounds(152, 123, 86, 20);
		add(tf_tipohabita_CasaApart);
		tf_tipohabita_CasaApart.setColumns(10);
		
		tf_fentrada_CasaApart = new JTextField();
		tf_fentrada_CasaApart.setBounds(152, 147, 86, 20);
		add(tf_fentrada_CasaApart);
		tf_fentrada_CasaApart.setColumns(10);
		
		tf_fsalida_CasaApart = new JTextField();
		tf_fsalida_CasaApart.setBounds(152, 172, 86, 20);
		add(tf_fsalida_CasaApart);
		tf_fsalida_CasaApart.setColumns(10);
		
		tf_precio_CasaApart = new JTextField();
		tf_precio_CasaApart.setBounds(354, 221, 86, 20);
		add(tf_precio_CasaApart);
		tf_precio_CasaApart.setColumns(10);

	}

	public JTextField getTf_ubicacion_CasaApart() {
		return tf_ubicacion_CasaApart;
	}

	public void setTf_ubicacion_CasaApart(JTextField tf_ubicacion_CasaApart) {
		this.tf_ubicacion_CasaApart = tf_ubicacion_CasaApart;
	}

	public JTextField getTf_mcuadrados_CasaApart() {
		return tf_mcuadrados_CasaApart;
	}

	public void setTf_mcuadrados_CasaApart(JTextField tf_mcuadrados_CasaApart) {
		this.tf_mcuadrados_CasaApart = tf_mcuadrados_CasaApart;
	}

	public JTextField getTf_ncamas_CasaApart() {
		return tf_ncamas_CasaApart;
	}

	public void setTf_ncamas_CasaApart(JTextField tf_ncamas_CasaApart) {
		this.tf_ncamas_CasaApart = tf_ncamas_CasaApart;
	}

	public JTextField getTf_tipohabita_CasaApart() {
		return tf_tipohabita_CasaApart;
	}

	public void setTf_tipohabita_CasaApart(JTextField tf_tipohabita_CasaApart) {
		this.tf_tipohabita_CasaApart = tf_tipohabita_CasaApart;
	}

	public JTextField getTf_fentrada_CasaApart() {
		return tf_fentrada_CasaApart;
	}

	public void setTf_fentrada_CasaApart(JTextField tf_fentrada_CasaApart) {
		this.tf_fentrada_CasaApart = tf_fentrada_CasaApart;
	}

	public JTextField getTf_fsalida_CasaApart() {
		return tf_fsalida_CasaApart;
	}

	public void setTf_fsalida_CasaApart(JTextField tf_fsalida_CasaApart) {
		this.tf_fsalida_CasaApart = tf_fsalida_CasaApart;
	}

	public JTextField getTf_precio_CasaApart() {
		return tf_precio_CasaApart;
	}

	public void setTf_precio_CasaApart(JTextField tf_precio_CasaApart) {
		this.tf_precio_CasaApart = tf_precio_CasaApart;
	}

	public JButton getBtnCancelar_CasaApart() {
		return btnCancelar_CasaApart;
	}

	public void setBtnCancelar_CasaApart(JButton btnCancelar_CasaApart) {
		this.btnCancelar_CasaApart = btnCancelar_CasaApart;
	}

	public JButton getBtnReservar_CasaApart() {
		return btnReservar_CasaApart;
	}

	public void setBtnReservar_CasaApart(JButton btnReservar_CasaApart) {
		this.btnReservar_CasaApart = btnReservar_CasaApart;
	}

	
}
