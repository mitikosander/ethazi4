package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class Inicio extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtBuscador;
	private JTextField txtAquiVaEl;
	private JButton btn_buscar_inicio;
	private JRadioButton rdbtnApartamento;
	private JRadioButton rdbtnHotel;
	private JRadioButton rdbtnCasaRural;
	private JComboBox combo_ubicacion;
	private JButton btnseleccionar;
	private ButtonGroup grupo;

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setLayout(null);

		btn_buscar_inicio = new JButton("Buscar");
		btn_buscar_inicio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_buscar_inicio.setBounds(181, 310, 78, 23);
		add(btn_buscar_inicio);

		txtAquiVaEl = new JTextField();
		txtAquiVaEl.setText("AQUI VA EL LOGO");
		txtAquiVaEl.setBounds(86, 11, 301, 58);
		add(txtAquiVaEl);
		txtAquiVaEl.setColumns(10);

		JLabel lblFechaDeEntrada = new JLabel("Fecha de entrada");
		lblFechaDeEntrada.setBounds(26, 211, 101, 14);
		add(lblFechaDeEntrada);

		JLabel lblFechaDeSalida = new JLabel("Fecha de salida");
		lblFechaDeSalida.setBounds(299, 211, 96, 14);
		add(lblFechaDeSalida);

		combo_ubicacion = new JComboBox();
		combo_ubicacion.setBounds(44, 145, 158, 23);
		add(combo_ubicacion);

		rdbtnHotel = new JRadioButton("hotel");
		rdbtnHotel.setBounds(44, 85, 83, 29);
		add(rdbtnHotel);

		rdbtnApartamento = new JRadioButton("apartamento");
		rdbtnApartamento.setBounds(161, 85, 155, 29);
		add(rdbtnApartamento);

		rdbtnCasaRural = new JRadioButton("Casa Rural");
		rdbtnCasaRural.setBounds(323, 85, 155, 29);
		add(rdbtnCasaRural);

		btnseleccionar = new JButton("seleccionar");
		btnseleccionar.setBounds(274, 142, 115, 29);
		add(btnseleccionar);

		grupo = new ButtonGroup();
		grupo.add(rdbtnApartamento);
		grupo.add(rdbtnHotel);
		grupo.add(rdbtnCasaRural);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(36, 236, 95, 20);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(299, 236, 95, 20);
		add(dateChooser_1);

	}

	public JTextField getTxtBuscador() {
		return txtBuscador;
	}

	public void setTxtBuscador(JTextField txtBuscador) {
		this.txtBuscador = txtBuscador;
	}

	public JTextField getTxtAquiVaEl() {
		return txtAquiVaEl;
	}

	public void setTxtAquiVaEl(JTextField txtAquiVaEl) {
		this.txtAquiVaEl = txtAquiVaEl;
	}

	public JButton getBtn_buscar_inicio() {
		return btn_buscar_inicio;
	}

	public void setBtn_buscar_inicio(JButton btn_buscar_inicio) {
		this.btn_buscar_inicio = btn_buscar_inicio;
	}

	public JCalendar getCalendar_entrada() {
		return calendar_entrada;
	}

	public void setCalendar_entrada(JCalendar calendar_entrada) {
		this.calendar_entrada = calendar_entrada;
	}

	public JCalendar getCalendar_salida() {
		return calendar_salida;
	}

	public void setCalendar_salida(JCalendar calendar_salida) {
		this.calendar_salida = calendar_salida;
	}

	public JRadioButton getRdbtnApartamento() {
		return rdbtnApartamento;
	}

	public void setRdbtnApartamento(JRadioButton rdbtnApartamento) {
		this.rdbtnApartamento = rdbtnApartamento;
	}

	public JRadioButton getRdbtnHotel() {
		return rdbtnHotel;
	}

	public void setRdbtnHotel(JRadioButton rdbtnHotel) {
		this.rdbtnHotel = rdbtnHotel;
	}

	public JRadioButton getRdbtnCasaRural() {
		return rdbtnCasaRural;
	}

	public void setRdbtnCasaRural(JRadioButton rdbtnCasaRural) {
		this.rdbtnCasaRural = rdbtnCasaRural;
	}

	public JButton getBtnseleccionar() {
		return btnseleccionar;
	}

	public void setBtnseleccionar(JButton btnseleccionar) {
		this.btnseleccionar = btnseleccionar;
	}

	public JComboBox getCombo_ubicacion() {
		return combo_ubicacion;
	}

	public void setCombo_ubicacion(JComboBox combo_ubicacion) {
		this.combo_ubicacion = combo_ubicacion;
	}
}
