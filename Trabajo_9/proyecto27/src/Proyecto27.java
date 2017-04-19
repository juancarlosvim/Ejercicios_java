
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Proyecto27 {
    public static void main(String[] args) {
        // Paso 1 Declarar una variable de tipo file
        File miArchivo;
        //paso 2 declarar una variable de tipo FileReader
        FileReader leer; //variable para leer
        
        //paso3  declarar una variable de tipo String
        String cadena;
        
        //paso4 preparar el archivo
        miArchivo = new File("AlgoritmoLectura.txt");
        
        try {
            //paso5 crear una instancia de tipo filereader(lector)
            leer = new FileReader(miArchivo);
            //paso 6 crear una instancia de tipo bufferedreader
            
            BufferedReader almacenamiento = new BufferedReader(leer);
            
            //paso 7 inicializamos la variable de tipo cadena a nada
            
            cadena = "";
            //paso 8 crear un ciclo que se repita mientras la variable de tipo cadena sea diferente a nula
            while(cadena!=null){
                try {
                    //Paso 8.1 Asignar a la variable de tipo cadena buffer.readline();
                    almacenamiento.readLine();
                    
                    //Paso 8.2 si la variable de tipo cadena es diferente de nulo mostrar contenido
                    
                    if(cadena!=null){
                        System.out.println(cadena);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Proyecto27.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            try {
                // paso 9 cerrar el buffer
                almacenamiento.close();
                //paso 10 cerrar el lector
                leer.close();
            } catch (IOException ex) {
                Logger.getLogger(Proyecto27.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proyecto27.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
