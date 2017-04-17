import java.io.*;
public class CFile {

	public static void main(String[] args) {
		File f1, f2, f3;
		String[] listaArchivos;
		int i;
		
		f1 = new File("C:\\Windows", "bootstat.dat");
		f2 = new File("pepito.xxx");
		f3 = new File(".");
		
		System.out.println(f1.getName());
		System.out.println(f2.getPath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f1.getParent());
		
		System.out.println("Existe: " +f1.exists());
		System.out.println("Permiso escritura: " +f1.canWrite());
		System.out.println("Permiso lecutra: "+f1.canRead());
		System.out.println("Es directoio: " +f1.isDirectory());
		System.out.println("Es archivo: " +f1.isFile());
		System.out.println("Es absoluto: "+f1.isAbsolute());
		System.out.println("Tamaño: "+f1.length());
		
		listaArchivos = f3.list();
		System.out.println("Contenido del directorio actual");
		for(i=0;i<listaArchivos.length;i++){
			System.out.println(listaArchivos[i]);
		}

	}

}
