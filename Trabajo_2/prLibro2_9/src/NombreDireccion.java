import java.io.*;

public class NombreDireccion {
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) throws IOException {
		// String input;
		String nombre;
		String direccion;
		System.out.println("Introduce su nombre => ");
		nombre = stdin.readLine();

		System.out.println("Introduce su direccion => ");
		direccion = stdin.readLine();
		System.out.println("Su nombre es => " + nombre + " y su direccon es " + direccion);
	}
}
