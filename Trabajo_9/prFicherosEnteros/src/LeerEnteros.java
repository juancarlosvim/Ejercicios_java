import java.io.File;
import java.util.Scanner;

public class LeerEnteros {

	public static void main(String[] args) {
		File f = new File("enteros.txt");
		int numero, suma=0, cont=0;
		Scanner entrada = null;
		
		try{
			
			entrada = new  Scanner(f);
			while(entrada.hasNextInt()){
				numero = entrada.nextInt();
				System.out.println(numero);
				suma = suma + numero;
				cont++;
			}
			System.out.println("Numero leidos "+cont);
			System.out.println("Suma "+suma);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			
			entrada.close();
		}

	}

}
