package modelo;

public class Casa extends Alojamiento {
	private int num_baños;
	private double metroscuadrados;
	
	//constructor vacio
	public Casa() {
		super();
	}
	//constructor con herencia
	public Casa(int num_habitaciones, int num_camas, String tipo_cama, String pension, String ubicacion, String nombre,
			boolean wifi, boolean piscina, boolean spa, boolean parking, boolean aire, boolean restaurante, boolean bar,
			boolean gimnasio, int num_baños, double metroscuadrados, double precio) {
		super(num_habitaciones, num_camas, tipo_cama, pension, ubicacion, nombre, wifi, piscina, spa, parking, aire,
				restaurante, bar, gimnasio,precio);
		this.num_baños=num_baños;
		this.metroscuadrados=metroscuadrados;
		
	}
	
	//getters and setters
	public int getNum_baños() {
		return num_baños;
	}
	public void setNum_baños(int num_baños) {
		this.num_baños = num_baños;
	}
	public double getMetroscuadrados() {
		return metroscuadrados;
	}
	public void setMetroscuadrados(double metroscuadrados) {
		this.metroscuadrados = metroscuadrados;
	}
	
	
	
	
	
}
