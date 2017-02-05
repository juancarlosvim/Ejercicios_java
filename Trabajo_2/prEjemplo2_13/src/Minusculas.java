
public class Minusculas {

	public static void main(String[] args) {
		final int primerCodigo = (int) 'a';
		int i;
		
		System.out.println("Las letras minusculas y sus codigos ASCII son => \n");
		for(i= primerCodigo; i< primerCodigo+26;i++){
			System.out.println("Caracter =>  " +(char) i + " Valor ASCII => " +i);
		}
	}

}
