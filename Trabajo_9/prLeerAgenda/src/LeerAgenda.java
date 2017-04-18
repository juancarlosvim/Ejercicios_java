import java.io.*;
public class LeerAgenda {

	public static void main(String[] args) {
		String texto="";
		try{
			FileReader file = new FileReader("C:\\Users\\Alumno\\Desktop\\Java\\Trabajo_Eclipse\\Trabajo_9\\prAgenda\\Agenda.txt");
			BufferedReader br = new BufferedReader(file);
			
			while(texto!=null){
				texto = br.readLine();
				if(texto !=null){
					int posi = texto.indexOf(",");
					String nombre = texto.substring(0, posi);
					String telefono = texto.substring(posi+1);
					System.out.println("Nombre: " +nombre);
					System.out.println("Telefono: "+telefono);
				}
			}
			file.close();
		}catch (IOException e) {
			System.out.println("Error en el fichero");
		}

	}

}
