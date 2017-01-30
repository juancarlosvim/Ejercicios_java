import java.io.*;
public class longitud {
	private static BufferedReader stdin= new BufferedReader(
			new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException{
		double ladoA=0, ladoB=0, ladoC=0;
		String input;
		System.out.println("Introduce el lado A => ");
		input = stdin.readLine();
		ladoA = Double.parseDouble(input);
		System.out.println("Introdue el lado B  => ");
		input =stdin.readLine();
		ladoB = Double.parseDouble(input);
		
		ladoC = Math.sqrt(ladoA*ladoA + ladoB*ladoB);
		System.out.println("La longitud de la hipotenusa es = " + ladoC);
	}
}
