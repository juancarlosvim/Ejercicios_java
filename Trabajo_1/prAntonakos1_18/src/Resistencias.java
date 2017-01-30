import java.io.*;
public class Resistencias {
	private static BufferedReader stdin= new  BufferedReader(
			new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException{
		float r1 = 0.0f;
		float r2 = 0.0f;
		float req = 0.0f;
		String input;
		System.out.println("Introduce la resistencia 1 => ");
		input = stdin.readLine();
		r1 = Float.parseFloat(input);
		System.out.println("Introduce la resistencia 2 => ");
		input =stdin.readLine();
		r2 =Float.parseFloat(input);
		
		req = (r1*r2) /(r1+r2);
		
		System.out.println("La resistencia equivalente es = " + req);
		
	}
}
