import java.io.*;
public class DivisionReal {
	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		final float DIVISOR = 1.0E+1F;
		int i = 5;
		float mult=1; // divis =1;
		String input;
		
		System.out.println("Escriba un numero => ");
		input = stdin.readLine();
		i = Integer.parseInt(input);
		
		//Division REAL
		mult = i *20.0F;
		System.out.println("\n " +i + " *20.0 /10.0 es = " +(mult/DIVISOR));
		mult = mult + i;
		System.out.println("Division real: ("+i + " *20.0 + " +i+ ") / 10.0 = " + (mult/DIVISOR));
		
		if( (mult %DIVISOR ) != 0){
			System.out.println(" Rest : ("+i+ "*20.0 + " + i + " ) %10.0 = " +(mult%DIVISOR));
		}
	}

} 
