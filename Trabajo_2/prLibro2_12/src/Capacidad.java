
public class Capacidad {

	public static void main(String[] args) {
		float cilindros = 12000;
		float pistas = 16;
		float sectores_p_p = 8;
		float bytes = 512;
		float capacidad;

		capacidad = cilindros * pistas * sectores_p_p * bytes;

		System.out.println("Tama�o en bytes => " + capacidad);

		capacidad = capacidad / 1024;
		System.out.println("Tama�o en Kb => " + capacidad);

		capacidad = capacidad / 1024;
		System.out.println("Tama�o en MB => " + capacidad);

		capacidad = capacidad / 1024;
		System.out.println("Tama�o en GB => " + capacidad);

	}

}
