package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Inicio_Sesion extends JPanel {
	private JTextField tf_Usuario_Inicio_Sesion;
	private JPasswordField pf_Contra_Inicio_Sesion;
	private JButton btnAceptar_Inicio_Sesion;
	private JButton btnCancelar_Inicio_Sesion;
	private JButton btnRegistro;

	/**
	 * Create the panel.
	 */
	public Inicio_Sesion() {
		setLayout(null);
		
		JLabel lblInicioDeSesion = new JLabel("INICIO DE SESION");
		lblInicioDeSesion.setFont(new Font("Stencil", Font.BOLD, 18));
		lblInicioDeSesion.setBounds(132, 11, 195, 41);
		add(lblInicioDeSesion);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario: ");
		lblNombreDeUsuario.setBounds(81, 90, 97, 14);
		add(lblNombreDeUsuario);
		
		tf_Usuario_Inicio_Sesion = new JTextField();
		tf_Usuario_Inicio_Sesion.setBounds(188, 87, 86, 20);
		add(tf_Usuario_Inicio_Sesion);
		tf_Usuario_Inicio_Sesion.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(81, 133, 97, 14);
		add(lblContrasea);
		
		btnAceptar_Inicio_Sesion = new JButton("Aceptar");
		btnAceptar_Inicio_Sesion.setBounds(307, 184, 89, 23);
		add(btnAceptar_Inicio_Sesion);
		
		btnCancelar_Inicio_Sesion = new JButton("Cancelar");
		btnCancelar_Inicio_Sesion.setBounds(25, 184, 113, 23);
		add(btnCancelar_Inicio_Sesion);
		
		pf_Contra_Inicio_Sesion = new JPasswordField();
		pf_Contra_Inicio_Sesion.setBounds(188, 130, 86, 17);
		add(pf_Contra_Inicio_Sesion);
		
		btnRegistro = new JButton("Registro");
		btnRegistro.setBounds(164, 181, 115, 29);
		add(btnRegistro);

	}

	public JTextField getTf_Usuario_Inicio_Sesion() {
		return tf_Usuario_Inicio_Sesion;
	}

	public void setTf_Usuario_Inicio_Sesion(JTextField tf_Usuario_Inicio_Sesion) {
		this.tf_Usuario_Inicio_Sesion = tf_Usuario_Inicio_Sesion;
	}

	public JPasswordField getPf_Contra_Inicio_Sesion() {
		return pf_Contra_Inicio_Sesion;
	}

	public void setPf_Contra_Inicio_Sesion(JPasswordField pf_Contra_Inicio_Sesion) {
		this.pf_Contra_Inicio_Sesion = pf_Contra_Inicio_Sesion;
	}

	public JButton getBtnAceptar_Inicio_Sesion() {
		return btnAceptar_Inicio_Sesion;
	}

	public void setBtnAceptar_Inicio_Sesion(JButton btnAceptar_Inicio_Sesion) {
		this.btnAceptar_Inicio_Sesion = btnAceptar_Inicio_Sesion;
	}

	public JButton getBtnCancelar_Inicio_Sesion() {
		return btnCancelar_Inicio_Sesion;
	}

	public void setBtnCancelar_Inicio_Sesion(JButton btnCancelar_Inicio_Sesion) {
		this.btnCancelar_Inicio_Sesion = btnCancelar_Inicio_Sesion;
	}

	public JButton getBtnRegistro() {
		return btnRegistro;
	}

	public void setBtnRegistro(JButton btnRegistro) {
		this.btnRegistro = btnRegistro;
	}
	
	
}
