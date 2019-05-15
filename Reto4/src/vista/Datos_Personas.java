package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;


public class Datos_Personas extends JPanel {
	private JTextField tFNombre;
	private JTextField tFApellido;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Datos_Personas() {
		setLayout(null);
		
		JButton btnContinuar_dtpersonas = new JButton("Continuar");
		btnContinuar_dtpersonas.setBounds(351, 266, 89, 23);
		add(btnContinuar_dtpersonas);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(110, 42, 46, 14);
		add(lblNombre);
		
		tFNombre = new JTextField();
		tFNombre.setBounds(189, 39, 86, 20);
		add(tFNombre);
		tFNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(110, 81, 46, 14);
		add(lblApellido);
		
		tFApellido = new JTextField();
		tFApellido.setBounds(189, 78, 86, 20);
		add(tFApellido);
		tFApellido.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(110, 125, 46, 14);
		add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(189, 122, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setBounds(45, 167, 111, 14);
		add(lblFechaDeNacimiento);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 266, 89, 23);
		add(btnCancelar);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(189, 167, 95, 20);
		add(dateChooser);

	}
}
