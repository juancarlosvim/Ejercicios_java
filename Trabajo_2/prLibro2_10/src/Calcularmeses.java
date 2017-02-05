import java.io.*;

public class Calcularmeses {
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int meses = 12;
		;
		int dias = 365;
		int horas = 24;
		int segundos = 60;
		int minutos = 60;
		int anyo;
		String input;
		System.out.println("Introduce el año  => ");
		input = stdin.readLine();
		anyo = Integer.parseInt(input);
		meses = meses * anyo;
		dias = dias * anyo;
		horas = horas * dias;
		minutos = minutos * horas;
		segundos = segundos * minutos;

		System.out.println("En " + anyo + " hay " + meses + " meses " + dias + " dias " + horas + " horas " + minutos
				+ " minutos " + segundos + " segundos ");

	}

}
