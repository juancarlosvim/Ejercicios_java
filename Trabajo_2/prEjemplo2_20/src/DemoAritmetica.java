import java.io.*;
public class DemoAritmetica {
	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int i = 27;
		int j=32;
		//int cont;
		double x = 17.475;
		double y = 4.22;
		String input;
		
		System.out.println("Escriba el numero entero i => ");
		input =stdin.readLine();
		i =Integer.parseInt(input);	
		System.out.println("Escriba el numero entero j => ");
		input =stdin.readLine();
		j = Integer.parseInt(input);
		
		//operaciones con enteros
		
		System.out.println("\n Numeros enteros ");
		System.out.println("Valores de las variables");
		System.out.println("i => " +i);
		System.out.println("j => " +j);
		System.out.println("Operaciones");
		System.out.println(" i + j => " +(i+j));
		System.out.println(" i - j => " +(i-j));
		System.out.println(" i * j => " +(i*j));
		System.out.println(" i / j => " +(i/j));
		System.out.println(" i % j => " +(i%j));
		
		//lectura de numeros reales desde consola
		System.out.println("Escriba un numero real x => ");
		input= stdin.readLine();
		x =Double.parseDouble(input);
		System.out.println("Escriba un numero real y => ");
		input= stdin.readLine();
		y =Double.parseDouble(input);
		
		//operaciones reales
		System.out.println("Numeros reales");
		System.out.println("Valor de las variables ");
		System.out.println("x => " +x);
		System.out.println("y => " +y);
		System.out.println("Operaciones");
		System.out.println(" x + y => " +(x+y));
		System.out.println(" x - y => " +(x-y));
		System.out.println(" x * y => " +(x*y));
		System.out.println(" x / y => " +(x/y));
		System.out.println(" x % y => " +(x%y));
		
		//operaciones con mezcla de tipos
		System.out.println("Operaciones con mezcla de tipos ");
		System.out.println(" j + y => " +(j+y));
		System.out.println(" i * x => " +(i*x));
		System.out.println(" j / x => " +(j/x));
	}

}
