import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class SepararContenido {

	public static void main(String[] args)  {
		
		File f = new File("C:\\ficheros\\fichero.txt");
		Scanner s;
		
		try{
			
			s = new Scanner(f);
			while(s.hasNextLine()){
				String linea = s.nextLine();
				Scanner sl = new Scanner(linea);
				sl.useDelimiter("\\s*,\\s*");
				System.out.println(sl.next());
				System.out.println(sl.next());
				System.out.println(sl.next());
			}
			s.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
