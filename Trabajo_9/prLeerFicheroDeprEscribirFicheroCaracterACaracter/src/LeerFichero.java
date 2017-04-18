import java.io.*;
public class LeerFichero {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		
		try{
			
			fr = new FileReader("C:\\ficheros\\datos.txt");
			BufferedReader entrada = new BufferedReader(fr);
			int car = entrada.read();
			
			while(car!=-1){
				System.out.print((char)car);
				car = entrada.read();
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
