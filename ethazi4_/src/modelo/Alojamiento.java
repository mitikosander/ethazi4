package modelo;

public class Alojamiento {

	//ATRIBUTOS
    protected int num_habitaciones;
    protected int num_camas;
    protected String tipo_cama;
    protected String pension;
    protected String ubicacion;
    protected String nombre;
    protected boolean wifi;
    protected boolean piscina;
    protected boolean spa;
    protected boolean parking;
    protected boolean aire;
    protected boolean restaurante;
    protected boolean bar;
    protected boolean gimnasio;
    protected double precio;
//: wifi, piscina, spa, parking, aire acondicionado, restaurante, bar y gimnasio
    
    //CONSTRUCTOR VACIO
    public Alojamiento() {
    }
    
    //CONSTRUCTOR
    public Alojamiento(int num_habitaciones, int num_camas,  String tipo_cama, String pension, String ubicacion, String nombre, boolean wifi,
     boolean piscina, boolean spa, boolean parking, boolean aire,boolean restaurante, boolean bar, boolean gimnasio, double precio) {
        this.num_habitaciones = num_habitaciones;
        this.num_camas = num_camas;
        this.tipo_cama = tipo_cama;
        this.pension = pension;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.wifi = wifi;
        this.piscina = piscina;
        this.spa = spa;
        this.parking = parking;
        this.aire = aire;
        this.restaurante = restaurante;
        this.bar = bar;
        this.gimnasio = gimnasio;
        this.precio=precio;
    }
    
    public int getNum_habitaciones() {
		return num_habitaciones;
	}

	public void setNum_habitaciones(int num_habitaciones) {
		this.num_habitaciones = num_habitaciones;
	}

	public int getNum_camas() {
		return num_camas;
	}

	public void setNum_camas(int num_camas) {
		this.num_camas = num_camas;
	}

	public String getTipo_cama() {
		return tipo_cama;
	}

	public void setTipo_cama(String tipo_cama) {
		this.tipo_cama = tipo_cama;
	}

	public String getPension() {
		return pension;
	}

	public void setPension(String pension) {
		this.pension = pension;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public boolean isSpa() {
		return spa;
	}

	public void setSpa(boolean spa) {
		this.spa = spa;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isAire() {
		return aire;
	}

	public void setAire(boolean aire) {
		this.aire = aire;
	}

	public boolean isRestaurante() {
		return restaurante;
	}

	public void setRestaurante(boolean restaurante) {
		this.restaurante = restaurante;
	}

	public boolean isBar() {
		return bar;
	}

	public void setBar(boolean bar) {
		this.bar = bar;
	}

	public boolean isGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(boolean gimnasio) {
		this.gimnasio = gimnasio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


    

}
