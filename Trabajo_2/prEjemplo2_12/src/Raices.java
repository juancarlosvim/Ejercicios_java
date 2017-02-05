import java.io.*;
public class Raices {
	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		float a = 2.0F;
		float b = -5.0F;
		float c = 2.0F;
		float raiz1 = 0.0F, raiz2 =0.0F;
		float discriminante = 0.0F;
		String input;
		
		System.out.println("\n Escriba el coeficiente a => ");
		input = stdin.readLine();
		a = Float.parseFloat(input);
		System.out.println("\n Escriba el coeficiente b => ");
		input = stdin.readLine();
		b = Float.parseFloat(input);
		System.out.println("\n Escriba el coeficiente c => ");
		input = stdin.readLine();
		c = Float.parseFloat(input);
		
		System.out.println("\n Las raices de (" +a +") x^2 + (" + b +") x + (" +c + ")");
		
		discriminante = (float)(Math.pow(b, 2) - 4*a*c);
		if(discriminante <0){
			System.out.println("No existen");
		}
		else{
			raiz1 = (float)((-b + Math.sqrt(discriminante)) /2*a);
			raiz2 = (float)((-b - Math.sqrt(discriminante)) /2*a);
			System.out.println("Son " +raiz1+ " y " +raiz2);
		}
	}

}
