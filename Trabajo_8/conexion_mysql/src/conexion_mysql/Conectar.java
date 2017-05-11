
package conexion_mysql;

import java.sql.*;

public class Conectar {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/practica";
			Connection com = DriverManager.getConnection(url,"juancarlosvim","");
			
			System.out.println("Conexion "+com);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		

	}

}
