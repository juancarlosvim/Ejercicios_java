import java.io.*;
public class DemoRelacionales {
	private static BufferedReader stdin = new BufferedReader ( new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		final int MASCARA =9;
		int i =27;
		int j =32;
		boolean aux;
		String input;
		
		System.out.println("Escriba un numero entero i => ");
		input = stdin.readLine();
		i = Integer.parseInt(input);
		System.out.println("Escriba un numero entero j => ");
		input = stdin.readLine();
		j = Integer.parseInt(input);
		
		//Operadores relacionales
		System.out.println("Mayor o igual que...");
		System.out.println(" i>=j = " + (i>=j)); //false
		System.out.println(" j>= i = " + (j>=i)); //true
		System.out.println(" i!=j = " + (i!=j)); //true
		System.out.println(" i!=i = " + (i!=i)); //false
		
		//opreadores logicos
		System.out.println("Operadores logicos");
		System.out.println("AND logico");
		aux = (i>=j) && (j>=i);
		System.out.println(" (i>= j) && (j>=i) => " +aux); //false
		System.out.println("OR logico");
		aux = (i>=j) || (j>=i);
		System.out.println(" (i>=j) || (j>=i) => " +aux);
		
		//opreadores a nivel de bit
		System.out.println("Opreadores de Bit");
		System.out.print(" i = " +i+ " Mascara = " +MASCARA);
		System.out.println("\n AND binario");
		j= i & MASCARA;
		System.out.println(" i & MASCARA = " +j);
		System.out.println("OR binario");
		j= i | MASCARA;
		System.out.println(" i | MASCARA = " +j);
		j = i << 4;
		System.out.println("Desplazamiento binario");
		System.out.println(" i<<4 = "+j);
		j = i >>2;
		System.out.println("Desplazamiento binario");
		System.out.println(" i>>2 = "+j);
	}

}
