package vista;

import javax.swing.JPanel;

public class Vista {

	
	//Aqui crear la instancia en privado de los objetos de cada clase
	private Contenedor ventana;
	private Inicio inicio;
	private Pagar pagar;
	private Bases_Legales bases_legales;
	private Casa_Apart_Seleccionado casa_apart_seleccionado;
	private Datos_Personas datos_personas;
	private Hotel_Seleccionado hotel_seleccionado;
	private Inicio_Sesion inicio_sesion;
	private Mostrar_Lista listahoteles;
	private Reserva reserva;
	private Opcionesavanzadas inicio2;
	
	
	public Vista() {
		//Aqui completamos la instancia del objeto para poder acceder a sus atributos
		ventana=new Contenedor();
		inicio=new Inicio();
		pagar=new Pagar();
		listahoteles=new Mostrar_Lista();
		bases_legales=new Bases_Legales();
		casa_apart_seleccionado=new Casa_Apart_Seleccionado();
		datos_personas = new Datos_Personas();
		hotel_seleccionado = new Hotel_Seleccionado();
		inicio_sesion = new Inicio_Sesion();
		reserva = new Reserva();
		inicio2 = new Opcionesavanzadas();
	}
	
	public  void mostrarPantalla(JPanel panel) {
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

	
	public Bases_Legales getBases_legales() {
		return bases_legales;
	}

	public void setBases_legales(Bases_Legales bases_legales) {
		this.bases_legales = bases_legales;
	}

	public Casa_Apart_Seleccionado getCasa_apart_seleccionado() {
		return casa_apart_seleccionado;
	}

	public void setCasa_apart_seleccionado(Casa_Apart_Seleccionado casa_apart_seleccionado) {
		this.casa_apart_seleccionado = casa_apart_seleccionado;
	}

	public Datos_Personas getDatos_personas() {
		return datos_personas;
	}

	public void setDatos_personas(Datos_Personas datos_personas) {
		this.datos_personas = datos_personas;
	}

	public Hotel_Seleccionado getHotel_seleccionado() {
		return hotel_seleccionado;
	}

	public void setHotel_seleccionado(Hotel_Seleccionado hotel_seleccionado) {
		this.hotel_seleccionado = hotel_seleccionado;
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


	

}
