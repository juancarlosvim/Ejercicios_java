import java.io.*;
public class PruebaTablaFactorial {
	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		long n;
		String input;
		System.out.println("Introduzca un numero => ");
		input= stdin.readLine();
		n =Long.parseLong(input);
		for(int i=1;i<=n;i++)
		{
			System.out.println(+i+" != "+factorial(i));
		}
		
		
		}
		public static long factorial(long n){
			long aux =1;
			if(n==0){
				return 1;
			}
			else{
				aux= n*factorial(n-1);
				return aux;
			}
	}

}
