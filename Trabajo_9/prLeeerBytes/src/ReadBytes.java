import java.io.*;
public class ReadBytes {

	public static void main(String[] args) throws IOException {
		byte data[] = new byte[10];
		
		System.out.println("Introduce algunos caracteres");
		System.in.read(data);
		System.out.println("Tu has introducido: ");
		for(int i =0;i<data.length;i++)
		{
			System.out.print((char) data[i]);
		}

	}
	

}
