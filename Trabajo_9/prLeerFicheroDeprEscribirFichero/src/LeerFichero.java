import java.io.*;
public class LeerFichero {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		
		try{
			
			fr = new FileReader("C:\\ficheros\\datos.txt");
			BufferedReader entrada = new BufferedReader(fr);
			String cadena = entrada.readLine();
			while(cadena!=null){
				System.out.println(cadena);
				cadena = entrada.readLine();
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally{
			try{
				if(fr!=null){
					fr.close();
				}
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
