import java.io.*;

public class Cantidad {
	private static BufferedReader stdin= new BufferedReader(
			new InputStreamReader(System.in));
	public static void main(String args) throws IOException{
		double cantidad =0;
		double interes=0.0f;
		double anio =0.0f;
		double total =0.0f;
		String input;
		
		System.out.println("Introduzca la cantidad a invertir => ");
		input = stdin.readLine();
		cantidad = Double.parseDouble(input);
		System.out.println("Introduzca la tasa de interes anual => ");
		input =stdin.readLine();
		interes = Double.parseDouble(input);
		System.out.println("Introduzca el numero de anio => ");
		input =stdin.readLine();
		anio = Double.parseDouble(input);
		interes = interes / 100;
		total = cantidad * Math.pow((1.0 +interes), anio);
		
		System.out.println("La cantidad total acumulada es = "+ total);
		
		
		
		
	}

}
