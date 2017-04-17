import java.io.*;
public class LeerFicheros {

	public static void main(String[] args) throws IOException {
		String fichero1 = "Fichero1.txt";
		File f1 = new File(fichero1);
		String fichero2 = "Fichero2.txt";
		File f2 = new File(fichero2);
		if(f1.isDirectory() && f2.isDirectory()){
			System.out.println("Directorio de "+fichero1);
		}else{
			if(f1.isFile() && f2.isFile()){
				System.out.println("Nombre: "+f1.getName());
				System.out.println("Camino: "+f1.getPath());
				
				if(f1.exists()){
					System.out.print("El fichero existe ");
				}else{
					System.out.print("El fichero no existe ");
				}
				if(f1.canRead()){
					System.out.print("y se puede leer ");
				}else{
					System.out.print("No se puede leer ");
				}
				if(f1.canWrite()){
					System.out.print("y se puede Escribir ");
				}else{
					System.out.println("No se puede escribir ");
				}
				
				/*System.out.println("Existe: "+f1.exists() );
				System.out.println("Permiso de escritura: "+f1.canWrite());
				System.out.println("Permiso de lectura: "+f1.canRead());*/
				System.out.println();
				System.out.println("La longitud del fichero es de " +f1.length()+" bytes");
				System.out.println("Nombre: "+f2.getName());
				System.out.println("Camino: "+f2.getPath());
				if(f2.exists()){
					System.out.print("El fichero existe ");
				}else{
					System.out.print("El fichero no existe ");
				}
				if(f2.canRead()){
					System.out.print("y se puede leer ");
				}else{
					System.out.print("No se puede leer ");
				}
				if(f2.canWrite()){
					System.out.print("y se puede Escribir ");
				}else{
					System.out.println("No se puede escribir ");
				}
				System.out.println();
				System.out.println("La longitud del fichero es de " +f2.length()+" bytes");
			}
		}
	}

}
