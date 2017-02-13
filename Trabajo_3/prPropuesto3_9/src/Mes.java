import java.io.*;
public class Mes {
	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int dia, j=0;
		int ndias=0;
		int nmes=0, año;
		String mes = null;
		String input;
		
		System.out.println("Introduce el año => ");
		input = stdin.readLine();
		año = Integer.parseInt(input);
		
		System.out.println("Introduce el mes => ");
		input = stdin.readLine();
		nmes = Integer.parseInt(input);
		switch(nmes)
		{
			case 1:
			{
				mes ="Enero";
				ndias = 31;
				break;
			}
			case 2:
			{
				mes ="Febrero";
				if(año%4==0 && (año%400==0 || año%100!=0)){
					
					ndias = 29;
					
				}
				else{
					
					ndias= 28;
				}
				break;
			}
			case 3:
			{
				mes = "Marzo";
				ndias = 31;
				break;
			}
			case 4:
			{
				mes = "Abril";
				ndias = 30;
				break;
			}
			case 5:
			{
				mes = "Mayo";
				ndias = 31;
				break;
			}
			case 6:
			{
				mes = "Junio";
				ndias = 30;
				break;
			}
			case 7:
			{
				mes = "Julio";
				ndias = 31;
				break;
			}
			case 8:
			{
				mes = "Agosto";
				ndias = 31;
				break;
			}
			case 9:
			{
				mes = "Septiembre";
				ndias = 30;
				break;
			}
			case 10:
			{
				mes = "Octubre";
				ndias = 31;
				break;
			}
			case 11:
			{
				mes = "Noviembre";
				ndias = 30;
				break;
			}
			case 12:
			{
				mes = "Diciembre";
				ndias = 31;
				break;
			}
		}
		
		System.out.println("Introduce el dia por el que empiece el mes => ");
		input = stdin.readLine();
		dia = Integer.parseInt(input);
		
		System.out.println("");
		System.out.println("Mes " + mes+ "\t\t\t\t Año " +año);
		System.out.println("");
		System.out.println("L	M	X	J	V	S	D");
		for(int i=1;i<dia;i++)
		{
			System.out.print("	");
		}
		for(int i=dia;i<=7;i++)
		{
			j = j+1;
			System.out.print(j+"	");
		}
		System.out.print("\n");
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=7;k++)
			{
				j =j+1;
				if(j<=ndias){
					System.out.print(j+"	");
				}
				
			}
			System.out.print("\n");
		}
	}

}
