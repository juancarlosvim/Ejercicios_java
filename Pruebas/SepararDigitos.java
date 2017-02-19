import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SepararDigitos {

	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException{
		String input;
		int casos;
		int num=0;
		System.out.println("Introduce el numero de casos => ");
		input=stdin.readLine();
		casos = Integer.parseInt(input);
		for(int i=1;i<=casos;i++)
		{
			input=stdin.readLine();
			num = Integer.parseInt(input);
			
			String numeros = String.valueOf(num);
			
			for(int j =0; j<numeros.length();j++)
			{
				int k = Character.digit(numeros.charAt(j), 10);
				System.out.println("Digitos=>  "+k);
				
			}
			
		}
	}

}
