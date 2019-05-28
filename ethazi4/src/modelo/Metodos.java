/*
 * @author Alexander,Alain y Koldo
 */
package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.table.DefaultTableModel;

import org.apache.commons.codec.digest.DigestUtils;

import controlador.Controlador;
import vista.Vista;

public class Metodos {

	private static ArrayList<String> ciudades;
	private static ArrayList<String> hoteles;
	private static ArrayList<String> apartamentos;
	private static ArrayList<String> casas;
	private static ArrayList<String> precios;
	private ArrayList<modelo.Alojamiento> busquedas;
	static String fecha;
	static String fecha2;
	static String nombre;
	
	/*
	 * @return metodo que devuelve un arrayList de Strings despues de cargarlo con los datos de la BBDD
	 */
	
	// metodo para guardar el nombre de las ciudades en un arraylist con el que
	// cargaremos el combobox

	public ArrayList<String> cargarciudades() {
		ciudades = new ArrayList<String>();
		String sql = "SELECT DISTINCT ubicacion FROM hoteles";
		BBDD conectar = new BBDD();
		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				ciudades.add(rs.getString(1));

			}
			return ciudades;
		} catch (SQLException e) {
			System.err.println("Consulta erronea, motivo del error: " + e);
			return ciudades = null;
		}

	}
	/*
	 * @return metodo que devuelve un arrayList de Strings despues de cargarlo con los datos de la BBDD
	 */
	public ArrayList<String> cargarciudadesCasas() {
		casas = new ArrayList<String>();
		String sql = "SELECT DISTINCT ubicacion FROM casarural";
		BBDD conectar = new BBDD();
		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				casas.add(rs.getString(1));

			}
			return casas;
		} catch (SQLException e) {
			System.err.println("Consulta erronea, motivo del error: " + e);
			return casas = null;
		}

	}
	/*
	 * @return metodo que devuelve un arrayList de Strings despues de cargarlo con los datos de la BBDD
	 */

	public ArrayList<String> cargarciudadesapartamentos() {
		apartamentos = new ArrayList<String>();
		String sql = "SELECT DISTINCT ubicacion FROM apartamentos";
		BBDD conectar = new BBDD();
		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				apartamentos.add(rs.getString(1));

			}
			return apartamentos;
		} catch (SQLException e) {
			System.err.println("Consulta erronea, motivo del error: " + e);
			return apartamentos = null;
		}

	}
	/*
	 * @param recibimos un String de ubicacion para seleccionar de la base solo los alojamientos de esa ubicacion
	 * @return metodo que devuelve una tabla formateada en la cual se mostraran los datos consultados a la BBDD
	 */
	public DefaultTableModel cargarTablahoteles(String ubicacion) {

		Vista vista = new Vista();

		String sql = "SELECT nombre,precio,tipo_cama,n_camas,n_habitaciones FROM hoteles WHERE ubicacion LIKE '"
				+ ubicacion + "'";
		BBDD conectar = new BBDD();
		busquedas = null;

		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("Nombre: ");
		modelo.addColumn("Precio: ");
		modelo.addColumn("Tipo Cama: ");
		modelo.addColumn("Nº Camas: ");
		modelo.addColumn("Nº Habitaciones: ");

		try {

			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				// Creamos un array para carda fila de la tabla
				Object[] fila = new Object[5]; // Hay 5 columnas en la tabla asi que asignamos 5 posiciones

				// insertamos los datos en su posicion del array
				for (int i = 0; i < fila.length; i++) {
					fila[i] = rs.getObject(i + 1);
				}

				// anyadimos la fila a la tabla
				modelo.addRow(fila);

			}
		} catch (SQLException e) {
			System.err.println("Conexion fallida, causa del error: " + e);
		}

		// pasamos la tabla poblada lista para usar
		return modelo;

	}
	/*
	 * @param recibimos un String de ubicacion para seleccionar de la base solo los alojamientos de esa ubicacion
	 * @return metodo que devuelve una tabla formateada en la cual se mostraran los datos consultados a la BBDD
	 */
	public DefaultTableModel cargarTablaapartamentos(String ubicacion) {

		Vista vista = new Vista();

		String sql = "SELECT nombre,precio,numerobanos,mcuadrados FROM apartamentos WHERE ubicacion LIKE '" + ubicacion
				+ "'";
		BBDD conectar = new BBDD();
		busquedas = null;

		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("Nombre: ");
		modelo.addColumn("Precio: ");
		modelo.addColumn("Numerobanos: ");
		modelo.addColumn("Mcuadrados: ");

		try {

			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				// Creamos un array para carda fila de la tabla
				Object[] fila = new Object[4]; // Hay 5 columnas en la tabla asi que asignamos 5 posiciones

				// insertamos los datos en su posicion del array
				for (int i = 0; i < fila.length; i++) {
					fila[i] = rs.getObject(i + 1);
				}

				// anyadimos la fila a la tabla
				modelo.addRow(fila);

			}
		} catch (SQLException e) {
			System.err.println("Conexion fallida, causa del error: " + e);
		}

		// pasamos la tabla poblada lista para usar
		return modelo;

	}
	/*
	 * @param recibimos un String de ubicacion para seleccionar de la base solo los alojamientos de esa ubicacion
	 * @return metodo que devuelve una tabla formateada en la cual se mostraran los datos consultados a la BBDD
	 */
	public DefaultTableModel cargarTablacasasrurales(String ubicacion) {

		Vista vista = new Vista();

		String sql = "SELECT nombre,precio,numerohabita,mcuadrados FROM apartamentos WHERE casarural LIKE '" + ubicacion
				+ "'";
		BBDD conectar = new BBDD();
		busquedas = null;

		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("Nombre: ");
		modelo.addColumn("Precio: ");
		modelo.addColumn("Numerohabita ");
		modelo.addColumn("Mcuadrados ");

		try {

			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				// Creamos un array para carda fila de la tabla
				Object[] fila = new Object[4]; // Hay 4 columnas en la tabla asi que asignamos 4 posiciones

				// insertamos los datos en su posicion del array
				for (int i = 0; i < fila.length; i++) {
					fila[i] = rs.getObject(i + 1);
				}

				// anyadimos la fila a la tabla
				modelo.addRow(fila);

			}
		} catch (SQLException e) {
			System.err.println("Conexion fallida, causa del error: " + e);
		}

		// pasamos la tabla poblada lista para usar
		return modelo;

	}

	public static void imprimirfecha() {
		Vista vista = new Vista();
		String dia = Integer.toString(vista.getInicio().getCalendar_entrada().getCalendar().get(Calendar.DAY_OF_MONTH));
		String mes = Integer.toString(vista.getInicio().getCalendar_entrada().getCalendar().get(Calendar.MONTH) + 1);
		String year = Integer.toString(vista.getInicio().getCalendar_entrada().getCalendar().get(Calendar.YEAR));
		fecha = (dia + "-" + mes + "-" + year);

		String dia2 = Integer.toString(vista.getInicio().getCalendar_salida().getCalendar().get(Calendar.DAY_OF_MONTH));
		String mes2 = Integer.toString(vista.getInicio().getCalendar_salida().getCalendar().get(Calendar.MONTH) + 1);
		String year2 = Integer.toString(vista.getInicio().getCalendar_salida().getCalendar().get(Calendar.YEAR));
		fecha2 = (dia2 + "-" + mes2 + "-" + year2);

	}
	/*
	 * @param recibimos dos Strings uno contendra un nombre de usuario y el otro una contraseña que encriptaremos 
	 * @return si el valor de nuestros parametros coincide con los de la base, devolveremos un valor true para decir que coinciden y existen
	 */

	public boolean comprobarLogin(String nombreusu, String pass) {
		pass = encriptarPass(pass);
		BBDD conectar = new BBDD();
		String sql = "SELECT Nombreusu,Contrasena FROM usuarios WHERE Nombreusu LIKE '" + nombreusu
				+ "' AND Contrasena LIKE '" + pass + "'";

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			rs.last();
			if (rs.first()) // si es valido el primer reg. hay una fila, tons el usuario y su pw existen
				return true; // usuario validado correctamente
			else
				return false; // usuario validado incorrectamente

		} catch (Exception e) {
			System.err.println("Consulta erronea" + e);
			return false;
		}
	}

	public void insertarUsuario() {
		BBDD conectar = new BBDD();
		Vista vista = new Vista();
		String sql = "INSERT INTO cliente VALUES(?,?,?,?)";

		try {
			// Cogemos la sentencia realizada anteriormente
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			// asignamos los atributos a la consulta
			ps.setString(1, vista.getDatos_personas().getTxfnombre().getText());
			ps.setString(2, vista.getDatos_personas().getTxfdni().getText());
			ps.setString(3, vista.getDatos_personas().getTxfapellido().getText());
			ps.setString(4, vista.getDatos_personas().getDateChooser().getDateFormatString());

			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("Insert Erroneo");
		}

	}

	/*
	 * public Cliente cogerdatosregistroUsuario() {
	 * 
	 * // Al darle al boton registrar, Guardas los datos de la pantalla y los guarda
	 * en // un objeto usuario
	 * 
	 * Vista vista = new Vista();
	 * 
	 * Cliente A1 = new Cliente();
	 * 
	 * A1.setNombre(vista.getDatos_personas().getTxfnombre().getText());
	 * A1.setDni(vista.getDatos_personas().getTxfdni().getText());
	 * A1.setApellido(vista.getDatos_personas().getTxfapellido().getText());
	 * A1.setFecha_nac(vista.getDatos_personas().getTxffecha().getText());
	 * 
	 * return A1; }
	 */
	/*
	 * 25d55ad283aa400af464c76d713c07ad (12345678) e919c49d5f0cd737285367810a3394d0
	 * (hotel) 81dc9bdb52d04dc20036dbd8313ed055 (1234)
	 */
	
	
	/*
	 * @param recibimos un String que despues encriptaremos
	 * @return devolveremos el String encriptado
	 */
	public String encriptarPass(String pass) {

		pass = DigestUtils.md5Hex(pass);
		return pass;
	}

	// metodo que decide si en esta ejecucion del programa genera o no un codigo
	// promocional
	public void asignarCodigoPromo() {
		// primero hacemos un numero entre 1 y 2 para decidir si asignar o no el codigo
		// de esta forma no siempre se dará un codigo

		int gen = (int) Math.floor(Math.random() * 2 + 1);

		switch (gen) {
		case 1:
			break;
		case 2:
			asignacodigo();
			System.out.println("codigo Asignado");
			break;
		}
	}

	// metodo que asigna un codigo promocional a un usuario aleatorio
	private void asignacodigo() {
		// generamos un numero entre 1 y el numero de usuarios que haya en la base
		int n_users = contarUsuarios();

		int gen = (int) Math.floor(Math.random() * n_users);

		// ahora seleccionamos de la base el nombre con el numero asignado
		ArrayList<String> nombres = cargarNombresUsuario();

		String asignar = nombres.get(gen);

		// ahora insertamos el codigo promocional al usuario en la base de datos
		insertarCodigoPromo(asignar);

	}

	// metodo que inserta el codigo promocional al usuario que se le pase por
	// parametro

	private void insertarCodigoPromo(String usuario) {
		String codigoPromo = generarCodigo();
		String sql = "UPDATE usuarios SET codigopromo= ? WHERE Nombreusu LIKE '" + usuario + "'";
		Modelo modelo = new Modelo();
		try {
			PreparedStatement ps = modelo.getBasededatos().conectarBase().prepareStatement(sql);
			ps.setString(1, codigoPromo);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Actualizacion erronea: " + e);
		}
	}

	/*
	 * @return este metodo devuelve en un Arraylist todos los nombres de usuarios de la BBDD
	 */
	private ArrayList<String> cargarNombresUsuario() {
		ArrayList<String> nombres = new ArrayList<String>();

		Modelo modelo = new Modelo();

		String sql = "SELECT DISTINCT Nombreusu FROM usuarios";

		try {
			PreparedStatement ps = modelo.getBasededatos().conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				nombres.add(rs.getString(1));
			}

		} catch (SQLException e) {
			System.err.println("Conexion Erronea, motivo del error: " + e);
		}

		return nombres;
	}

/*
 * @return devolvemos en un valor Integer el numero de usuarios que hay en la tabla de la BBDD
 */
	private int contarUsuarios() {
		Modelo modelo = new Modelo();

		int n_users = 0;

		String sql = "SELECT COUNT(*) FROM usuarios";

		try {
			PreparedStatement ps = modelo.getBasededatos().conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				n_users = rs.getInt(1);
			}

		} catch (SQLException e) {
			System.err.println("Error de conexion, el motivo es: " + e);
		}

		return n_users;

	}

	/*
	 * @return Generamos aleatoriamente numeros y letras que despues devolveremos en forma de String 
	 */
	private String generarCodigo() {
		String codigo = null;

		// definimos en un array el numero de posiciones que queremos, de esta forma el
		// largo de nuestro codigo promocional
		// será siempre el mismo
		String[] posiciones = new String[10];

		int cont = 0;

		// generamos un numero que decidira si insertamos una letra o un numero
		int gen;

		while (cont < posiciones.length) {
			gen = (int) Math.floor(Math.random() * 2 + 1);
			switch (gen) {
			case 1:
				codigo = Character.toString(generarLetra());
				break;
			case 2:
				codigo = Integer.toString(generarnumero());
				break;
			}
			// guardamos el numero o letra generados
			posiciones[cont] = codigo;

			// incrementamos el contador
			cont++;
		}
		// guardamos en un solo String el conjunto de valores generados
		for (int i = 0; i < posiciones.length; i++) {
			codigo += posiciones[i];
		}

		return codigo;
	}

	/*
	 * @return se genera un numero entre el 1 y el 9 
	 */
	private int generarnumero() {
		int num = (int) Math.floor(Math.random() * 9 + 1);
		return num;
	}

	/*
	 * @return se devuelve una letra entre la A y la Z 
	 */
	private char generarLetra() {
		char letra = (char) Math.floor(Math.random() * (90 - 65 + 1) + 65);
		return letra;
	}

	/*
	 * @param Recibimos un usuario del cual se borrará el codigo promocional
	 */
	public void borrarPromo(String usuario) {
		Modelo modelo = new Modelo();
		String sql = "UPDATE usuarios SET codigopromo=null WHERE Nombreusu LIKE '" + usuario + "'";

		try {
			PreparedStatement ps = modelo.getBasededatos().conectarBase().prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Actualizacion erronea, motivo: " + e);
		}
	}

/*
 * @param recibimos un valor Double precio que se utilizará para imprimirlo en el fichero
 */
	public void modificarfichero(Double precio) {
		Vista vista = new Vista();
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("C:\\Users\\IN1DM3B_09\\Desktop\\prueba.txt");
			pw = new PrintWriter(fichero);

			imprimirfecha();
			pw.println(nombre);

			if (vista.getInicio().getRdbtnHotel().isSelected()) {
				pw.println("hotel");
			} else {
				if (vista.getInicio().getRdbtnCasaRural().isSelected()) {
					pw.println("casa rural");
				} else {
					pw.println("apartamentos");
				}
			}

			if (vista.getInicio2().getRdbtnMediaPensin().isSelected()) {
				pw.println("media pension");
			} else {
				pw.println("pension completa");
			}
			pw.println(precio);

			if (vista.getInicio2().getRdbtnDoble().isSelected()) {
				pw.println("Cama Doble");
			} else {
				pw.println("cama individual");
			}

			pw.println(fecha);
			pw.println(fecha2);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	/*
	 * @param recibimos un usuario para comprobar en la BBDD si este tiene un codigo promocional asignado
	 * @return devuelve el codigo promocional de ser existente de lo contrario pasamos un nulo
	 */
	public String consultarPromo(String usuario) {
		String sql = "SELECT codigopromo FROM usuarios WHERE Nombreusu LIKE '" + usuario + "'";
		String codigopromo = null;
		Modelo modelo = new Modelo();

		try {
			PreparedStatement ps = modelo.getBasededatos().conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			// comprobamos si el resultado de la consulta no es nulo, si es el
			// caso,devolvemos el codigo del usuario
			while (rs.next()) {
				codigopromo = rs.getString(1);
			}
			if (codigopromo != null) {
				return codigopromo;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.err.println("Conexion erronea, motivo: " + e);
			return null;
		}

	}

	

}
