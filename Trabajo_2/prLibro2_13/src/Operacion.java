
public class Operacion {

	public static void main(String[] args) {
		int operacion;
		int suma =1;
		for(int i=1; i<=5;i++)
		{
			operacion = i  *3;
			System.out.println("operacion => " +operacion);
			suma = suma + operacion;
		}
		System.out.println("La suma es => "+ suma);

	}

}
