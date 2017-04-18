import java.io.*;
import java.util.*;
public class Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		try{
			
			FileWriter fls = new FileWriter("Agenda.txt");
			BufferedWriter bw = new BufferedWriter(fls);
			do{
				System.out.println("Introduce un nombre: ");
				nombre = sc.nextLine();
				if(nombre.length()>0){
					System.out.print("Telefono: ");
					String telefono = sc.nextLine();
					bw.write(nombre+ "," +telefono);
					bw.newLine();
				}
				
			}while(nombre.length()>0);
			bw.close();
		}catch (IOException e) {
			System.out.println("Error en el fichero");
		}

	}

}
