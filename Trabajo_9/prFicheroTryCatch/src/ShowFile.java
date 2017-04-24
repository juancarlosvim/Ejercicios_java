import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) {
		
		int i;
		FileInputStream fin;
		
		if(args.length !=1){
			System.out.println("Uso: Mostrar archivo");
			return;
		}
		System.out.println("Nombre del fichero "+args[0]);
		try{
			
			fin = new FileInputStream(args[0]);
			
		}catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
			return;
		}
		try{
			do{
				i = fin.read();
				if(i != -1){
					System.out.print((char)i);
				}
			}while(i!=-1);
		}catch (IOException e) {
			System.out.println("Error de lectura del archivo");
		}
		
		try{
			fin.close();
			
		}catch (IOException e) {
			System.out.println("Error al cerrar el archivo");
		}

	}

}
