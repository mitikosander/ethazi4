package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class VerCodigoPromo extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigoPromo;
	private JLabel lblBienvenido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VerCodigoPromo dialog = new VerCodigoPromo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VerCodigoPromo() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		 lblBienvenido = new JLabel("Bienvenido ");
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBienvenido.setBounds(122, 11, 208, 28);
		contentPanel.add(lblBienvenido);
		
		JLabel lbltienesSuerteHas = new JLabel("\u00A1TIENES SUERTE! Has conseguido un Codigo Promocional\r\n");
		lbltienesSuerteHas.setBounds(10, 56, 366, 46);
		contentPanel.add(lbltienesSuerteHas);
		
		JLabel lblCanjealoEnTu = new JLabel("Canjealo en tu pantalla de pago y recibiras un 25% de descuento en tu  reserva");
		lblCanjealoEnTu.setBounds(10, 203, 414, 14);
		contentPanel.add(lblCanjealoEnTu);
		
		txtCodigoPromo = new JTextField();
		txtCodigoPromo.setEditable(false);
		txtCodigoPromo.setBounds(40, 95, 336, 97);
		contentPanel.add(txtCodigoPromo);
		txtCodigoPromo.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	public JTextField getTxtCodigoPromo() {
		return txtCodigoPromo;
	}

	public void setTxtCodigoPromo(JTextField txtCodigoPromo) {
		this.txtCodigoPromo = txtCodigoPromo;
	}

	public JLabel getLblBienvenido() {
		return lblBienvenido;
	}

	public void setLblBienvenido(JLabel lblBienvenido) {
		this.lblBienvenido = lblBienvenido;
	}
	
	
}
