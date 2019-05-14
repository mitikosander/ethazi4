package modelo;
 
	import java.beans.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
	 
public class BBDD {
	
	private Connection conexion;
	
	//Metodo al que llamaremos para inicializar la conexion con la base de datos
	public Connection conectarBase() {
		
		//Variables para la conexion
		String usuario=Fitxero.user,password=Fitxero.pass,url=Fitxero.URL;
		
		//llamamos al Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver cargado");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Driver no encontrado");
			e.printStackTrace();
		}
		
		//establecemos la conexion pasando los parametros definidos
		try {
			 conexion = DriverManager.getConnection(
					   url,
					   usuario,
					   password);
			System.out.println("Conexion completa");
			return conexion;
			
		} catch (SQLException e) {
			System.err.println("Error en la conexion");
			e.printStackTrace();
			return null;
		}
	
		
	}
	
	
	//Método para desconectar la BBDD
	
	public void desconectar() {
        if(conexion != null) {
            try {
                conexion.close();
                conexion = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
	 