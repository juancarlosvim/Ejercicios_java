import java.io.*;
public class NumeroBinario {
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Apéndice de método generado automáticamente
		
		int numero;
		
		System.out.println("Introduce un numero");
		String s = stdin.readLine();
		numero = Integer.parseInt(s);
		s = "";
		do{
			s = (numero%2)+s;
			numero = numero /2;
		}while(numero!=0);
		
		System.out.println("El numero en binario es =>  " +s);
	}

}
