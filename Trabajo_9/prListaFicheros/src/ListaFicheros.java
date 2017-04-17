import java.io.*;
public class ListaFicheros {

	public static void main(String[] args) {
		File canal = new File("C:\\Users\\Alumno\\Desktop\\Java");
		File[] lista = canal.listFiles();
		for(int i = 0;i<lista.length;i++){
			System.out.println(lista[i]);
		}

	}

}
