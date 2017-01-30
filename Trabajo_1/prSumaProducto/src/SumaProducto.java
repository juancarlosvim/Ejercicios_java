
public class SumaProducto {
	public static void main(String args[]){
		if(args.length==0)
		{
			System.out.println("No hay valores de entrada");
		}
		else{
			double sum=0;
			float prod=1;
			for(int i=0;i<args.length;i++){
				sum += Integer.parseInt(args[i]);
				prod *= Integer.parseInt(args[i]);
			}
			System.out.println("Suma = "+sum);
			System.out.println("Producto = " +prod);
		}
	}
}
