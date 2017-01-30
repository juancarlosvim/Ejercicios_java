import java.io.*;

public class EntradaSalida {
	private static BufferedReader stdin = new BufferedReader(
			new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException{
		int i =0;
		float f= 0.0f;
		double d = 0.0;
		char c;
		String input;
		
		System.out.print("\n Escriba un numero entero => ");
		input = stdin.readLine();
		i = Integer.parseInt(input);
		System.out.println("El numero es " +i);
		System.out.print("\n Escriba un numero flotante => ");
		input = stdin.readLine();
		f = Float.parseFloat(input);
		System.out.println("El numero es "+f);
		System.out.print("Escriba un numero double => ");
		input = stdin.readLine();
		d = Double.parseDouble(input);
		System.out.println("El numero es "+d);
		System.out.print("\n Escriba un string => ");
		input = stdin.readLine();
		System.out.println("\n El string es "+input);
		
	}
}
