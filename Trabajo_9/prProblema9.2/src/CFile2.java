import java.io.*;
public class CFile2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Con cadenas");
		String dirname="C:\\Users\\Alumno\\Desktop\\Java";
		File fc = new File(dirname);
		if(fc.isDirectory()){
			System.out.println("Directorio de "+dirname);
			String s[] = fc.list();
			for(int j = 0; j<s.length;j++){
				File f = new File(dirname+"\\"+s[j]);
				if(f.isDirectory()){
					System.out.println(s[j]+ " es un directorio");
				}else{
					System.out.println(s[j]+ " es un archivo");
				}
			}
		}
		else{
			System.out.println(dirname+" no es un directorio");
		
			File fnew = new File("fich_nuevo");
			
			fnew.createNewFile();
			
			
			fnew = new File("nuevo_dir");
			fnew.mkdir();
		}
		
	}

}
