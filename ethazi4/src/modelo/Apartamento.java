package modelo;

public class Apartamento  extends Casa{

	private int piso;
	//constructor vacio
	public Apartamento() {
		super();
	}
	//constructor con la herencia de casa
	public Apartamento(int num_habitaciones, int num_camas, String tipo_cama, String pension, String ubicacion,
			String nombre, boolean wifi, boolean piscina, boolean spa, boolean parking, boolean aire,
			boolean restaurante, boolean bar, boolean gimnasio, int num_baños, double metroscuadrados, int piso, double precio) {
		super(num_habitaciones, num_camas, tipo_cama, pension, ubicacion, nombre, wifi, piscina, spa, parking, aire,
				restaurante, bar, gimnasio, num_baños, metroscuadrados,precio);
		this.piso=piso;
		
	}
	//getters and setters
	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	
	
}
