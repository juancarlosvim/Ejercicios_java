import java.io.*;

public class CalcularEspacio {
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		final float espacioInicial = 5.5F;
		final float velocidad = 3.2F;
		float tiempo = 22.3F;
		float espacio = 0;
		String input;

		System.out.print("\n Tiempo de desplazamiento => ");
		input = stdin.readLine();
		tiempo = Float.parseFloat(input);

		espacio = espacioInicial + velocidad * tiempo;

		System.out.println("\n Espacio recorrido = " + espacio);
	}

}
