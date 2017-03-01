import java.io.*;
public class TestCoche {
	private static BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String input;
		String modelo;
		String aux; //para la traccion
		double potencia;
		int nCoches =0; //numero de coches
		Coche lista[] = new Coche[100];
		
		
		do{
			Coche coch = new Coche();
			System.out.println("Introduce el modelo del coche (Fin para salir) =>");
			modelo = stdin.readLine();
			if(!modelo.equalsIgnoreCase("Fin")){
				coch.añadirModelo(modelo);
				System.out.println("Introduce la potencia => ");
				input = stdin.readLine();
				potencia = Double.parseDouble(input);
				coch.añadirPotencia(potencia);
				System.out.println("Tiene tranccion a las cuatro ruedas? (s/n)=> ");
				aux = stdin.readLine();
				if(aux.charAt(0) =='s' || aux.charAt(0) =='S'){
					coch.añadirTraccion(true);
				}
				else{
					coch.añadirTraccion(false);
				}
				lista[nCoches] = coch;
				nCoches++;
			}
			
		}while(!modelo.equalsIgnoreCase("Fin") && nCoches < lista.length);;
		
		for(Coche c: lista){
			if(c != null){
				System.out.println(c.toString());
			}
		}
		
	}
}
