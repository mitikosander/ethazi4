package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Pagar extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblTotalAPagar;
	private JLabel lblPagado;
	private JLabel lblADevolver;
	private JButton btn50euro;
	private JButton btn20euro;
	private JButton btn10euro;
	private JButton btn5euro;
	private JButton btn2euro;
	private JButton btn1euro;
	private JButton btnDevolver;
	private JButton btnCancelar;
	private JButton btncnt;
	private JButton btn50cnt;
	private JButton btn20cnt;
	private JButton btn10cnt;
	private JButton btn5cnt;
	private JButton btn2cnt;
	private JButton btn1cnt;
	
	/**
	 * Create the panel.
	 */
	public Pagar() {
setLayout(null);
		
		lblTotalAPagar = new JLabel("Total a pagar:");
		lblTotalAPagar.setBounds(103, 42, 95, 16);
		add(lblTotalAPagar);
		
		textField = new JTextField();
		textField.setBounds(240, 39, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		lblPagado = new JLabel("Total Introducido :");
		lblPagado.setBounds(103, 69, 116, 16);
		add(lblPagado);
		
		textField_1 = new JTextField();
		textField_1.setBounds(240, 68, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblADevolver = new JLabel("A devolver :");
		lblADevolver.setBounds(103, 101, 95, 16);
		add(lblADevolver);
		
		textField_2 = new JTextField();
		textField_2.setBounds(240, 98, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		btn50euro = new JButton("50\u20AC");
		btn50euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn50euro.setBounds(33, 128, 60, 25);
		add(btn50euro);
		
		btn20euro = new JButton("20\u20AC");
		btn20euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn20euro.setBounds(103, 128, 60, 25);
		add(btn20euro);
		
		btn10euro = new JButton("10 \u20AC");
		btn10euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn10euro.setBounds(170, 128, 60, 25);
		add(btn10euro);
		
		btn5euro = new JButton("5\u20AC");
		btn5euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5euro.setBounds(240, 128, 60, 25);
		add(btn5euro);
		
		btn2euro = new JButton("2\u20AC");
		btn2euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2euro.setBounds(310, 128, 60, 25);
		add(btn2euro);
		
		btn1euro = new JButton("1\u20AC");
		btn1euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1euro.setBounds(380, 128, 60, 25);
		add(btn1euro);
		
		btnDevolver = new JButton("Devolver");
		btnDevolver.setBounds(315, 218, 97, 25);
		add(btnDevolver);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(52, 218, 97, 25);
		add(btnCancelar);
		
		btn50cnt = new JButton("50cnt");
		btn50cnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn50cnt.setBounds(33, 164, 60, 25);
		add(btn50cnt);
		
		btn20cnt = new JButton("20cnt");
		btn20cnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn20cnt.setBounds(103, 164, 60, 25);
		add(btn20cnt);
		
		btn10cnt = new JButton("10cnt");
		btn10cnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn10cnt.setBounds(170, 164, 60, 25);
		add(btn10cnt);
		
		btn5cnt = new JButton("5cnt");
		btn5cnt.setBounds(240, 164, 60, 25);
		add(btn5cnt);
		
		btn2cnt = new JButton("2cnt");
		btn2cnt.setBounds(310, 164, 60, 25);
		add(btn2cnt);
		
		btn1cnt = new JButton("1cnt");
		btn1cnt.setBounds(380, 164, 60, 25);
		add(btn1cnt);
	}
	public JTextField gettextField() {
		return (this.textField);
	}

	public void settextField() {
		this.textField.setText("");
	}

	public JTextField gettextField_1() {
		return (this.textField_1);
	}

	public void settextField_1() {
		this.textField_1.setText("");
	}

	public JTextField gettextField_2() {
		return (this.textField_2);
	}

	public void settextField_2() {
		this.textField_2.setText("");
	}

	public JLabel getlblTotalAPagar() {
		return (this.lblTotalAPagar);
	}

	public void setlblTotalAPagar() {
		this.lblTotalAPagar.setText("Total A Pagar");
	}

	public JLabel getlblPagado() {
		return (this.lblPagado);
	}

	public void setlblPagado() {
		this.lblPagado.setText("Pagado");
	}

	public JLabel getlblADevolver() {
		return (this.lblADevolver);
	}

	public void setlblADevolver() {
		this.lblADevolver.setText("A Devolver");
	}

	public JButton getbtn50euro() {
		return (this.btn50euro);
	}

	public void setbtn50euro() {
		this.btn50euro.setText("50€");
	}

	public JButton getbtn20euro() {
		return (this.btn20euro);
	}

	public void setbtn20euro() {
		this.btn20euro.setText("20€");
	}

	public JButton getbtn10euro() {
		return (this.btn10euro);
	}

	public void setbtn10euro() {
		this.btn10euro.setText("10€");
	}

	public JButton getbtn5euro() {
		return (this.btn5euro);
	}

	public void setbtn5euro() {
		this.btn5euro.setText("5€");
	}

	public JButton getbtn2euro() {
		return (this.btn2euro);
	}

	public void setbtn2euro() {
		this.btn2euro.setText("2€");
	}

	public JButton getbtn1euro() {
		return (this.btn1euro);
	}

	public void setbtn1euro() {
		this.btn1euro.setText("1€");
	}

	public JButton getbtnDevolver() {
		return (this.btnDevolver);
	}

	public void setbtnDevolver() {
		this.btnDevolver.setText("Devolver");
	}

	public JButton getbtnCancelar() {
		return (this.btnCancelar);
	}

	public void setbtnCancelar() {
		this.btnCancelar.setText("Cancelar");
	}
	public JButton getbtn50cnt() {
		return (this.btn50cnt);
	}

	public void setbtn50cnt() {
		this.btn50cnt.setText("50 cnt");
	}
	public JButton getbtn20cnt() {
	return (this.btn20cnt);
	}

	public void setbtn20cnt() {
	this.btn20cnt.setText("20 cnt");
	}
	
	public JButton getbtn10cnt() {
	return (this.btn10cnt);
	}

	public void setbtn10cnt() {
	this.btn10cnt.setText("10 cnt");
	}
	public JButton getbtn5cnt() {
	return (this.btn5cnt);
	}

	public void setbtn5cnt() {
	this.btn5cnt.setText("5 cnt");
	}
	
	public JButton getbtn2cnt() {
	return (this.btn2cnt);
	}

	public void setbtn2cnt() {
	this.btn2cnt.setText("2 cnt");
	}
	
	public JButton getbtn1cnt() {
	return (this.btn1cnt);
	}

	public void setbtn1cnt() {
	this.btn1cnt.setText("1 cnt");
	}
	
}