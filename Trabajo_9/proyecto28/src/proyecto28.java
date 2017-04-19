
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class proyecto28 {
        public static void main(String[] args) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String nombre="", dir="", email="";
        
        archivo = new File("usuarios");
        
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                
                nombre= JOptionPane.showInputDialog(null,"Introduce el nombre: ", "Solicitando datos", 3);
                dir= JOptionPane.showInputDialog(null,"Introduce la direccion: ", "Solicitando datos", 3);
                email= JOptionPane.showInputDialog(null,"Introduce el correo: ", "Solicitando datos", 3);
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                
                
                linea.println(nombre);
                linea.println(dir);
                linea.println(email);
                linea.close();
                escribir.close();
                
            } catch (IOException ex) {
                Logger.getLogger(proyecto28.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
               
                
                nombre= JOptionPane.showInputDialog(null,"Introduce el nombre: ", "Solicitando datos", 3);
                dir= JOptionPane.showInputDialog(null,"Introduce la direccion: ", "Solicitando datos", 3);
                email= JOptionPane.showInputDialog(null,"Introduce el correo: ", "Solicitando datos", 3);
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                
                
                linea.println(nombre);
                linea.println(dir);
                linea.println(email);
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(proyecto28.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
