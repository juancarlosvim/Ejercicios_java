import java.io.*;
public class Ahorcadp {
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Apéndice de método generado automáticamente
		String input, opcion;
		int cont=0;
		int vidas=6;
		int tamaño;
		String[] palabras = new String[]{"programacion", "java", "postgresql", "mysql" };
		
		String palabra = palabras[(int) (Math.random()*4)];
		char[] respuesta;
		tamaño = palabra.length();
		respuesta = new char[tamaño];
		
		for(int i=0;i<palabra.length();i++){
			respuesta[i]='_';
		}
		while(vidas!=0){
			System.out.println("Introduce una letra ");
			opcion = stdin.readLine();
			if(palabra.contains(opcion)){
				for(int i=0;i<palabra.length();i++){
					if(palabra.charAt(i) == opcion.charAt(0)){
						respuesta[i]=opcion.charAt(0);
						System.out.println("Acertado");
						cont++;
					}
				}
			}else{
				vidas--;
				System.out.println("No has acertado te quedan " +vidas+" vidas" );
			}
			if(vidas==0){
				System.out.println("Has perdido, se acabaron las vidas");
			}else{
				System.out.println("");
				for(int i=0;i<palabra.length();i++){
					System.out.print(" " +respuesta[i]+" ");
				}
			}
			if(cont==palabra.length()){
				System.out.println("");
				System.out.println("Has ganado");
				break;
			}
		}
	}

}
