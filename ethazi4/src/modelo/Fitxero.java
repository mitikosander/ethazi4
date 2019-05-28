package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fitxero {

	protected static PreparedStatement statement = null;
	protected static ResultSet rs = null;

	static String pass = "root";
	static String user = "root1";
	static String nombre = "reto4";
	static String server = "127.0.0.1";
	static String URL = "jdbc:mysql://" + server + ":3306/" + nombre
			+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

}