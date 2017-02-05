import java.io.*;
public class DivisionEntera {
	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		final int DIVISOR = 10; //constante
		int i = 5;
		int mult =1; //divis =1;
		String input;
		
		System.out.println("Escriba un numero => ");
		input = stdin.readLine();
		i= Integer.parseInt(input);
		
		mult = i*20;
		System.out.println("\n" +i +" *20/10 es - " +(mult/DIVISOR));
		mult = mult +i;
		System.out.println("Division entera: ("+ i + " * 20 + " + i + " ) /10 - " +(mult/DIVISOR) );
		if((mult%DIVISOR)!=0){
			System.out.println("Resto: ("+i +"*20 + " +i +") %10 = "+ (mult% DIVISOR));
		}
	}

}
