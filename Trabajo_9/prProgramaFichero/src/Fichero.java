import java.io.*;
public class Fichero {

	public static void main(String[] args) throws IOException {
		
		String ruta = "C:\\ficheros\\archivo1.txt";
		File archivo = new File(ruta);
		BufferedWriter bw;
		if(archivo.exists()){
			//System.out.println("El archivo existe");
			bw = new BufferedWriter(new  FileWriter(archivo));
			bw.write("El fichero de texto ya estaba creado");
		}else{
			//System.out.println("El archivo no existe");
			bw = new BufferedWriter(new  FileWriter(archivo));
			bw.write("El fichero no estaba creado, ha sido creado");
		}

	}

}
