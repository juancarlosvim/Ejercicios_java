
public class GestionStrings {

	public static void main(String[] args) {
		
		int longitud;
		String s1 = "Hola ";
		String s2 = "lector";
		
		String concat = s1 +s2;
		if(s1.equals(s2)){
			System.out.println("Los strings "+ s1 + " y " +s2+ " son iguales");
		}
		else{
			System.out.println("Los strings "+ s1 + " y " +s2+ " son distintos");
		}
		
		longitud= s1.length();
		System.out.println("La longitud de "+ s1 +" es: " +longitud);
		System.out.println("El segundo caracter de " +s1+ " es " + s1.charAt(1));
		longitud= s2.length();
		System.out.println("La longitud de "+ s2 +" es: " +longitud);
		System.out.println("El segundo caracter de " +s2+ " es " + s2.charAt(1));
		
		System.out.println("El string concatenado es => "+concat);
		System.out.println("El substring del concatenado es => " +concat.substring(1.5));
	}

}
