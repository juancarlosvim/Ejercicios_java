import java.io.*;
public class Vocal {
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String c = "";
		
		int cont=0;
		System.out.println("Introduce una frase");
		
		c =stdin.readLine();
	
		for(int i=0; i<c.length();i++){
			if((c.charAt(i)=='a') || (c.charAt(i)=='A')){
				cont++;
			}
		}
		System.out.println("El numero de a o A es = " +cont);
		
		
	}
}
