import java.io.*;
public class Fichero {
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		String cadena;
		PrintWriter salida = null;
		
		try{
			salida = new PrintWriter("C:\\ficheros\\datos.txt");
			System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
			cadena = stdin.readLine();
			
			while(!cadena.equalsIgnoreCase("FIN")){
				salida.println(cadena);
				cadena = stdin.readLine();
			}
			salida.flush();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			salida.close();
		}

	}

}
