

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Directorios2 {

	public static void main(String[] args) throws IOException {
		String nombre;
		
		InputStreamReader f = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(f);
		try{
			System.out.println("Introduce una ruta: ");
			nombre = teclado.readLine();
			verDirectorio(nombre);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}
	
	public static void verDirectorio(String directorio){

			try{
				File fl = new File(directorio);
				File [] lista = fl.listFiles();
				
				for(int i = 0; i<=lista.length;i++){
					if(lista[i].isDirectory()){
						verDirectorio(lista[i].toString());
					}else{
						System.out.println(lista[i].toString());
					}
						
					
					
					
					
				}
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		
	}

}
