package vista;

import javax.swing.JFrame;


public class Contenedor extends JFrame {

	 
	private static final long serialVersionUID = 1L;
	public JFrame frame;

	public Contenedor() {	
	setBounds(150, 150, 600, 500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	}

	
}
