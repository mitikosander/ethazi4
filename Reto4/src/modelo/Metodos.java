package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.codec.digest.DigestUtils;

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
	private static Connection conexion;
	// metodo para guardar el nombre de las ciudades en un arraylist con el que
	// cargaremos el combobox

	public ArrayList<String> cargarciudades() {
		ciudades = new ArrayList<String>();
		String sql = "SELECT ubicacion FROM hoteles";
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

	public ArrayList<String> cargarciudadesCasas() {
		casas = new ArrayList<String>();
		String sql = "SELECT ubicacion FROM casarural";
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

	public ArrayList<String> cargarciudadesapartamentos() {
		apartamentos = new ArrayList<String>();
		String sql = "SELECT ubicacion FROM apartamentos";
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
	 * public ArrayList<String> cargarCiudades() {
	 * 
	 * Vista vista = new Vista(); Modelo modelo = new Modelo(); ArrayList<String>
	 * ciudades = new ArrayList<String>(); String sql = " ";
	 * 
	 * // Comprobamos el alojamiento seleccionado para cargar las ciudades if
	 * (vista.getInicio().getRdbtnHotel().isSelected() == true) { sql =
	 * "SELECT DISTINCT ubicacion FROM hoteles"; } else if
	 * (vista.getInicio().getRdbtnApartamento().isSelected() == true) { sql =
	 * "SELECT DISTINCT ubicacion FROM apartamentos"; } else if
	 * (vista.getInicio().getRdbtnCasaRural().isSelected() == true) { sql =
	 * "SELECT DISTINCT ubicacion FROM casarural"; } else {
	 * System.err.println("No se ha seleccionado el tipo de alojamiento"); }
	 * 
	 * try { modelo.getBasededatos().conectarBase();
	 * 
	 * PreparedStatement ps =
	 * modelo.getBasededatos().conectarBase().prepareStatement(sql);
	 * 
	 * ResultSet rs = ps.executeQuery();
	 * 
	 * while (rs.next()) { ciudades.add(rs.getString(1)); }
	 * 
	 * } catch (SQLException e) {
	 * System.err.println("Fallo en la conexion, motivo del error: \n" + e); }
	 * 
	 * return ciudades;
	 * 
	 * }
	 */

	public ArrayList<String> cargarApartamentos(String nombreubicacion) {
		Vista vista = new Vista();

		BBDD conectar = new BBDD();
		apartamentos = new ArrayList<String>();
		String sql = "SELECT nombre FROM apartamentos WHERE ubicacion LIKE '" + nombreubicacion + "' ";

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				apartamentos.add(rs.getString(1));

			}
			return apartamentos;
		} catch (Exception e) {
			System.err.println("Consulta no valida");
			return apartamentos = null;
		}

	}

	public ArrayList<String> cargarcasas(String nombreubicacion) {
		Vista vista = new Vista();

		BBDD conectar = new BBDD();
		casas = new ArrayList<String>();
		String sql = "SELECT nombre FROM casarural WHERE ubicacion LIKE '" + nombreubicacion + "' ";

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				casas.add(rs.getString(1));

			}
			return casas;
		} catch (Exception e) {
			System.err.println("Consulta no valida");
			return casas = null;
		}

	}

	public ArrayList<String> cargarHoteles(String nombreubicacion) {
		Vista vista = new Vista();

		BBDD conectar = new BBDD();
		hoteles = new ArrayList<String>();
		String sql = "SELECT nombre FROM hoteles WHERE ubicacion LIKE '" + nombreubicacion + "' ";

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				hoteles.add(rs.getString(1));

			}
			return hoteles;
		} catch (Exception e) {
			System.err.println("Consulta no valida");
			return hoteles = null;
		}

	}

	// Metodo para buscar alojamiento segun los valores indicados en la busqueda
	public ArrayList<Alojamiento> buscarAlojamientos() {
		ArrayList<Alojamiento> ret = new ArrayList<Alojamiento>();

		Vista vista = new Vista();
		BBDD conectar = new BBDD();
		String sql = "SELECT * FROM hoteles WHERE ubicacion LIKE '" + vista.getInicio().getCombo_ubicacion() + "'";
		Alojamiento alojamiento = new Alojamiento();
		try {
			if (vista.getInicio().getCombo_ubicacion().getSelectedItem() != null) {
				PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					alojamiento.setNum_habitaciones(rs.getInt(1));
					alojamiento.setNum_camas(rs.getInt(2));
					alojamiento.setTipo_cama(rs.getString(3));
					alojamiento.setPension(rs.getString(4));
					alojamiento.setUbicacion(rs.getString(5));
					alojamiento.setNombre(rs.getString(6));
					ret.add(alojamiento);
				}
				rs.close();
				System.out.println("Lista cargada");
			} else {
				System.err.println("Error al cargar la lista, Ubicacion nula");
			}

		} catch (SQLException e) {
			System.err.println("Conexion fallida, causa del error: " + e);
		}

		return ret;

	}

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
		modelo.addColumn("N� Camas: ");
		modelo.addColumn("N� Habitaciones: ");

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

	public boolean comprobarLogin(String dni, String pass) {
		pass = encriptarPass(pass);
		BBDD conectar = new BBDD();
		String sql = "SELECT Nombreusu,Contrasena FROM usuarios WHERE Nombreusu LIKE '" + dni
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

	/*
	 * 25d55ad283aa400af464c76d713c07ad (12345678) e919c49d5f0cd737285367810a3394d0
	 * (hotel) 81dc9bdb52d04dc20036dbd8313ed055 (1234)
	 * 
	 */
	public String encriptarPass(String pass) {

		pass = DigestUtils.md5Hex(pass);
		return pass;
	}

	// Metodo para generar un fichero de texto
	public static void modificarfichero() {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("C:\\Users\\alain\\Desktop\\prueba.txt");
			pw = new PrintWriter(fichero);

			imprimirfecha();

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

	public static void guardar(String Nombre, String Apellido, String DNI, Date Fecha_nac) {
		BBDD conectar = new BBDD();
		try {
			String insertTableSQL = "INSERT INTO cliente VALUES (?,?,?,?)";
			PreparedStatement stmt = conectar.conectarBase().prepareStatement(insertTableSQL);
			stmt.setString(1, Nombre);
			stmt.setString(2, Apellido);
			stmt.setString(3, DNI);
			stmt.setDate(4, Fecha_nac);
			stmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	public static double codigos(String codigo, double precio) {
		if (codigo.equals("promo1")) {
			precio = precio - 50;
			return precio;
		} else if (codigo.equals("promo2")) {
			precio = precio - 25;
			return precio;
		} else {
			precio = precio + 0;
			return precio;
		}
	}

}
