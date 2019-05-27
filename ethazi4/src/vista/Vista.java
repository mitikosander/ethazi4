package vista;

import javax.swing.JPanel;

public class Vista {

	// Aqui crear la instancia en privado de los objetos de cada clase
	private Contenedor ventana;
	private Inicio inicio;
	private Pagar pagar;
	private Base_legal base_legal;
	private Datos_Personas datos_personas;
	private Inicio_Sesion inicio_sesion;
	private Mostrar_Lista listahoteles;
	private Reserva reserva;
	private Opcionesavanzadas inicio2;
	private VerCodigoPromo vcodigopromo;

	public Vista() {
		// Aqui completamos la instancia del objeto para poder acceder a sus atributos
		ventana = new Contenedor();
		inicio = new Inicio();
		pagar = new Pagar();
		listahoteles = new Mostrar_Lista();
		base_legal = new Base_legal();
		datos_personas = new Datos_Personas();
		inicio_sesion = new Inicio_Sesion();
		reserva = new Reserva();
		inicio2 = new Opcionesavanzadas();
		vcodigopromo = new VerCodigoPromo();
	}

	public void mostrarPantalla(JPanel panel) {
		ventana.setContentPane(panel);
		ventana.setVisible(true);

	}

	public Contenedor getVentana() {
		return ventana;
	}

	public void setVentana(Contenedor ventana) {
		this.ventana = ventana;
	}

	public Inicio getInicio() {
		return inicio;
	}

	public void setInicio(Inicio inicio) {
		this.inicio = inicio;
	}

	public Pagar getPagar() {
		return pagar;
	}

	public void setPagar(Pagar pagar) {
		this.pagar = pagar;
	}

	public Mostrar_Lista getListahoteles() {
		return listahoteles;
	}

	public void setListahoteles(Mostrar_Lista listahoteles) {
		this.listahoteles = listahoteles;
	}

	public Base_legal getBase_legal() {
		return base_legal;
	}

	public void setBases_legales(Base_legal base_legal) {
		this.base_legal = base_legal;
	}

	public Datos_Personas getDatos_personas() {
		return datos_personas;
	}

	public void setDatos_personas(Datos_Personas datos_personas) {
		this.datos_personas = datos_personas;
	}

	public Inicio_Sesion getInicio_sesion() {
		return inicio_sesion;
	}

	public void setInicio_sesion(Inicio_Sesion inicio_sesion) {
		this.inicio_sesion = inicio_sesion;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Opcionesavanzadas getInicio2() {
		return inicio2;
	}

	public void setInicio2(Opcionesavanzadas inicio2) {
		this.inicio2 = inicio2;
	}

	public VerCodigoPromo getVcodigopromo() {
		return vcodigopromo;
	}

	public void setVcodigopromo(VerCodigoPromo vcodigopromo) {
		this.vcodigopromo = vcodigopromo;
	}

	public void setBase_legal(Base_legal base_legal) {
		this.base_legal = base_legal;
	}

}
