import java.io.*;
public class ConversionGrados {
	private static BufferedReader stdin= new BufferedReader(new
			InputStreamReader(System.in));
	public static void main(String args[]) throws IOException{
		float temp_f=0.0f;
		double temp_c =0;
		String input;
		
		System.out.println("Introduce los grados farenheit => ");
		input = stdin.readLine();
		temp_f = Float.parseFloat(input);
		
		temp_c = 5/9*(temp_f-32);
		
		System.out.println("La temperatura en centrigrados es = " + temp_c);
		
		
		
	}
}
