import java.io.*;
public class Directorios {

	public static void main(String[] args) {
		String nombre;
		
		InputStreamReader f = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(f);
		
		try{
			
			System.out.print("Introduce el directorio");
			
			nombre = teclado.readLine();
			File fc = new File(nombre);
			File [] lista = fc.listFiles();
			for(int i = 0; i<=lista.length;i++){
				System.out.println(lista[i]);
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
