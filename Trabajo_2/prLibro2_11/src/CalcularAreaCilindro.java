import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcularAreaCilindro {
	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		float PI = 3.14f;
		float radio= 0.0f;
		float altura = 0.0f;
		float area;
		String  input;
		System.out.println("Introduce el radio del cilindro => ");
		input = stdin.readLine();
		radio = Float.parseFloat(input);
		System.out.println("Introduce la altura del cilindro => ");
		input = stdin.readLine();
		altura = Float.parseFloat(input);
		area = 2 * PI * radio* (radio + altura);
		
		System.out.println("El area del cilindro es " +area);
	}
	
}
