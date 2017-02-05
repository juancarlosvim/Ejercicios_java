
public class CalcularPrestamos {

	public static void main(String[] args) {
		final int MESES_EN_UN_AÑO = 12;
		float cuantiaPrestamo = 0.0F, interesAnual = 0.0F, interesMensual;
		int duracionPrestamo = 1;
		double pagoMensual = 0.0, pagoTotal = 0.0;
		int numeroPagos =0;
		
		System.out.println("Este programa calcula el pago mensual y");
		System.out.println("total para un prestumao");
		
		//entrada de datos
		
		cuantiaPrestamo = 100000;
		interesAnual =  3.5F;
		duracionPrestamo = 15;
		
		//Calculo del prestamo
		
		interesMensual = interesAnual /100.0f / MESES_EN_UN_AÑO;
		numeroPagos = duracionPrestamo * MESES_EN_UN_AÑO;
		pagoMensual = (cuantiaPrestamo * interesMensual) / (1 - Math.pow(1/(1+interesMensual), numeroPagos));
		pagoTotal = pagoMensual*numeroPagos;
		
		System.out.println("\n Cuantia del prestamo => " +cuantiaPrestamo + " euros ");
		System.out.print("\n Interes anual => " +interesAnual + " % ");
		System.out.println("\n Duracion del prestamo (años) => " +duracionPrestamo);
		System.out.println("\n Pago mensual => " +pagoMensual + " euros ");
		System.out.println("\n Cantidad total a pagar => " +pagoTotal + " euros ");
		
		
	}

}
