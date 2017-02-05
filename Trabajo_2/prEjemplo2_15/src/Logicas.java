
public class Logicas {

	public static void main(String[] args) {
		
		boolean verdad = true, falso = false;
		int i = 5, j = 4;
		boolean aux;
		System.out.println("\n Operaciones logicas ...");
		System.out.println(" Not verdad es " +!verdad);
		System.out.println(" Not falso es " +!falso);
		
		aux = verdad && falso;
		
		System.out.println(" verdad AND FALSO es " + aux);
		aux = verdad || falso;
		System.out.println(" verdad OR falso es " +aux);
		
		//operaciones relacionales
		System.out.println("Mayor o igual que ...");
		System.out.println(" (i >=j) = " +(i>=j)); //true
		System.out.println(" (j >-i) = " +(j>-i)); //false
		System.out.println(" (i !=j) = " +(i!=j)); //true
		
		//operadores logicos con enteros
		System.out.println(" operaciones logicas con enteros...");
		System.out.println(" NOT(i >=j) " +!(i >=j)); //false
		aux = (i>=j) && (j>=i);
		System.out.println(" (i >-j) AND (j>-i ) = " +aux); //false
		aux = (i>=j)|| (j>=i);
		System.out.println(" (i>=j)  OR (j>=i) = " +aux ); //true 

	}

}
