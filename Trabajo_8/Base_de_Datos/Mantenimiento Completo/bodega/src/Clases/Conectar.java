/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alumno
 */
public class Conectar {
    Connection conectar = null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar =  DriverManager.getConnection("jdbc:mysql://localhost/bodega", "root", "");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
