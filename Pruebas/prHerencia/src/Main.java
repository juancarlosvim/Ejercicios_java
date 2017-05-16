import java.util.ArrayList;

public class Main {

	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
	
	public static void main(String[] args) {
		
		
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del bosque", 60, "284EZ89");
		Futbolista iniesta = new Futbolista(2, "Andrés", "Iniesta", 33, 6, "Interior Derecho");
		
		Masajista raulMartinez = new Masajista(3,"Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);
		
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
		for(SeleccionFutbol integrante: integrantes){
			System.out.println("Nombre: "+integrante.getNombre()+ " Apellido: "+integrante.getApellidos()+" Edad: "+integrante.getEdad());
			integrante.Concentrarse();
		}
		

	}

}
