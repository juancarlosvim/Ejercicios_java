
package conexion_mysql;

import java.sql.*;

public class Conectar {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/practica";
			Connection com = DriverManager.getConnection(url,"juancarlosvim","");
			
			Statement stm = com.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM tabla1");
			
			if(rs.first()){
				do{
					System.out.println("ID "+ rs.getInt("id"));
					System.out.println("Nombre "+ rs.getString("nombre"));
				}while(rs.next());
			}
			
			System.out.println("Conexion "+com);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		

	}

}
