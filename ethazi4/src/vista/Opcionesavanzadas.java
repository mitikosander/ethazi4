package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Opcionesavanzadas extends JPanel {
	private JTextField textField;
	private JRadioButton rdbtnMediaPensin, rdbtnPensinCompleta, rdbtnSpa, rdbtnIndividual, rdbtnDoble, rdbtnGym, rdbtnGaraje;
	private JButton btnCancelar, btnSiguiente;
	private ButtonGroup grupo = new ButtonGroup(), grupo1= new ButtonGroup();
	
	/**
	 * Create the panel.
	 */
	
	public Opcionesavanzadas() {
		setLayout(null);
		
		JLabel lblOpcionesAvanzadas = new JLabel("Opciones Avanzadas");
		lblOpcionesAvanzadas.setBounds(164, 11, 100, 14);
		add(lblOpcionesAvanzadas);
		
		JLabel lblTipoCama = new JLabel("Tipo cama:");
		lblTipoCama.setBounds(42, 65, 66, 14);
		add(lblTipoCama);
		
		JLabel lblTemporada = new JLabel("Temporada:");
		lblTemporada.setBounds(42, 91, 66, 14);
		add(lblTemporada);
		
		JLabel lblPensin = new JLabel("Pensi\u00F3n:");
		lblPensin.setBounds(42, 116, 66, 14);
		add(lblPensin);
		
		JLabel lblOtros = new JLabel("Otros:");
		lblOtros.setBounds(42, 154, 46, 14);
		add(lblOtros);
		
		rdbtnIndividual = new JRadioButton("Individual");
		rdbtnIndividual.setBounds(110, 61, 71, 23);
		add(rdbtnIndividual);
		
		rdbtnDoble = new JRadioButton("Doble");
		rdbtnDoble.setBounds(210, 61, 66, 23);
		add(rdbtnDoble);
		
		textField = new JTextField();
		textField.setBounds(120, 88, 109, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblalta = new JLabel("(alta: +100\u20AC , media: +50\u20AC)");
		lblalta.setBounds(239, 91, 151, 14);
		add(lblalta);
		
		rdbtnMediaPensin = new JRadioButton("Media pensi\u00F3n");
		rdbtnMediaPensin.setBounds(97, 112, 109, 23);
		add(rdbtnMediaPensin);
		
		rdbtnPensinCompleta = new JRadioButton("Pensi\u00F3n completa");
		rdbtnPensinCompleta.setBounds(216, 112, 109, 23);
		add(rdbtnPensinCompleta);
		
		JLabel label = new JLabel("(+100\u20AC)");
		label.setBounds(331, 116, 59, 14);
		add(label);
		
		rdbtnSpa = new JRadioButton("SPA");
		rdbtnSpa.setBounds(42, 175, 109, 23);
		add(rdbtnSpa);
		
		rdbtnGym = new JRadioButton("GYM");
		rdbtnGym.setBounds(42, 201, 109, 23);
		add(rdbtnGym);
		
		rdbtnGaraje = new JRadioButton("Garaje");
		rdbtnGaraje.setBounds(42, 227, 109, 23);
		add(rdbtnGaraje);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(42, 257, 89, 23);
		add(btnCancelar);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(277, 257, 89, 23);
		add(btnSiguiente);
		
		grupo.add(rdbtnIndividual);
		grupo.add(rdbtnDoble);
		grupo1.add(rdbtnMediaPensin);
		grupo1.add(rdbtnPensinCompleta);

		
	}
	public JTextField getTextField() {
		return textField;
	}
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	public JRadioButton getRdbtnMediaPensin() {
		return rdbtnMediaPensin;
	}
	public void setRdbtnMediaPensin(JRadioButton rdbtnMediaPensin) {
		this.rdbtnMediaPensin = rdbtnMediaPensin;
	}
	public JRadioButton getRdbtnPensinCompleta() {
		return rdbtnPensinCompleta;
	}
	public void setRdbtnPensinCompleta(JRadioButton rdbtnPensinCompleta) {
		this.rdbtnPensinCompleta = rdbtnPensinCompleta;
	}
	public JRadioButton getRdbtnSpa() {
		return rdbtnSpa;
	}
	public void setRdbtnSpa(JRadioButton rdbtnSpa) {
		this.rdbtnSpa = rdbtnSpa;
	}
	public JRadioButton getRdbtnIndividual() {
		return rdbtnIndividual;
	}
	public void setRdbtnIndividual(JRadioButton rdbtnIndividual) {
		this.rdbtnIndividual = rdbtnIndividual;
	}
	public JRadioButton getRdbtnDoble() {
		return rdbtnDoble;
	}
	public void setRdbtnDoble(JRadioButton rdbtnDoble) {
		this.rdbtnDoble = rdbtnDoble;
	}
	public JRadioButton getRdbtnGym() {
		return rdbtnGym;
	}
	public void setRdbtnGym(JRadioButton rdbtnGym) {
		this.rdbtnGym = rdbtnGym;
	}
	public JRadioButton getRdbtnGaraje() {
		return rdbtnGaraje;
	}
	public void setRdbtnGaraje(JRadioButton rdbtnGaraje) {
		this.rdbtnGaraje = rdbtnGaraje;
	}
	public JButton getBtnCancelar() {
		return btnCancelar;
	}
	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}
	public void setBtnSiguiente(JButton btnSiguiente) {
		this.btnSiguiente = btnSiguiente;
	}
}
