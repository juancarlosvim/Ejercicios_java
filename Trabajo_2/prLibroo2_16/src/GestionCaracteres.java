
public class GestionCaracteres {

	public static void main(String[] args) {

		Character cx = new Character('x');
		Character c$ = new Character('$');
		int codigo;
		codigo = cx.charValue();
		System.out.println("Codigo de x = " + codigo);
		if (Character.isUpperCase(cx.charValue())) {
			System.out.println("El caracter " + cx + " es mayuscula");
		} else {
			System.out.println("El caracter " + cx + " es minuscula");
		}
		codigo = c$.charValue();
		System.out.println("Codigo de x = " + codigo);
		if (Character.isUpperCase(cx.charValue())) {
			System.out.println("El caracter " + c$ + " es mayuscula");
		} else {
			System.out.println("El caracter " + c$ + " es minuscula");
		}
		if (cx.equals(c$)) {
			System.out.println("El caracter " + cx + "y " + c$ + " son iguales");

		} else {
			System.out.println("El caracter " + cx + "y " + c$ + " son distintos");
		}
		System.out.println("Los caracteres son " + cx.toString() + "y" + c$.toString());
		;

	}

}
