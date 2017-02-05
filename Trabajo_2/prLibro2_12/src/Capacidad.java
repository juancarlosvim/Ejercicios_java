
public class Capacidad {

	public static void main(String[] args) {
		float cilindros = 12000;
		float pistas = 16;
		float sectores_p_p = 8;
		float bytes = 512;
		float capacidad;

		capacidad = cilindros * pistas * sectores_p_p * bytes;

		System.out.println("Tamaño en bytes => " + capacidad);

		capacidad = capacidad / 1024;
		System.out.println("Tamaño en Kb => " + capacidad);

		capacidad = capacidad / 1024;
		System.out.println("Tamaño en MB => " + capacidad);

		capacidad = capacidad / 1024;
		System.out.println("Tamaño en GB => " + capacidad);

	}

}
