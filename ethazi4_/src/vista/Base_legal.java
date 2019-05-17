package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Base_legal extends JPanel {
	private JRadioButton rdbtnAceptarLasBases;
	private JButton btnSiguiente;
	private JEditorPane editorPane;
	/**
	 * Create the panel.
	 */
	public Base_legal() {
		setLayout(null);
		
		JLabel lblBasesLegales = new JLabel("Bases Legales");
		lblBasesLegales.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBasesLegales.setBounds(160, 22, 132, 14);
		add(lblBasesLegales);
		
		
		
		editorPane = new JEditorPane();
		editorPane.setBounds(20, 47, 431, 275);
		editorPane.setEditable(false);
        editorPane.setText("1. Como reservar. \r\nEl usuario deber\u00E1 seguir las indicaciones y completar los apartados indicados en la secci\u00F3n correspondiente de esta p\u00E1gina web para realizar la reserva, y efectuar el pago de la misma en los t\u00E9rminos establecidos en el apartado 5 (CONDICIONES DE PAGO DE LA RESERVA) de las presentes condiciones. A partir del momento de hacer la reserva, entrar\u00E1n en vigor las condiciones de gastos por anulaci\u00F3n. OPTURSA le proporcionar\u00E1 un comprobante que deber\u00E1 imprimir y presentar en el hotel a su llegada. Es esencial que usted revise que todos los detalles de su reserva son correctos en el bono que usted podr\u00E1 imprimir.\r\n\r\n2. Responsabilidad. \r\nEn caso de que usted realice la reserva para dos o m\u00E1s personas, la persona que realice la reserva deber\u00E1 estar autorizado para poder representar a todos aquellos en nombre de los que haya hecho la misma, as\u00ED como aceptar la responsabilidad derivada de los pagos realizados en nombre de estas personas, incluidos los gastos por cancelaci\u00F3n o argos derivados de rectificaciones o modificaciones. Asimismo, deber\u00E1 informar a todos aquellos en cuyo nombre haya realizado la reserva, de los detalles de la reserva, as\u00ED como de cualquier otra informaci\u00F3n relevante. Aseg\u00FArese de que todos los datos personales facilitados durante su reserva deber\u00E1n ser correctos y veraces.\r\n\r\n");
		add(editorPane);
		
		rdbtnAceptarLasBases = new JRadioButton("Aceptar las bases legales");
		rdbtnAceptarLasBases.setBounds(28, 329, 147, 23);
		add(rdbtnAceptarLasBases);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSiguiente.setBounds(328, 329, 89, 23);
		add(btnSiguiente);

	}
	public JRadioButton getRdbtnAceptarLasBases() {
		return rdbtnAceptarLasBases;
	}
	public void setRdbtnAceptarLasBases(JRadioButton rdbtnAceptarLasBases) {
		this.rdbtnAceptarLasBases = rdbtnAceptarLasBases;
	}
	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}
	public void setBtnSiguiente(JButton btnSiguiente) {
		this.btnSiguiente = btnSiguiente;
	}
	public JEditorPane getEditorPane() {
		return editorPane;
	}
	public void setEditorPane(JEditorPane editorPane) {
		this.editorPane = editorPane;
	}
	
	
}
