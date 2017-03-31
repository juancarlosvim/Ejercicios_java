import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
public class Nodo {
	
	
	
	 String nombre;
	 int calificacion_1;
	 int calificacion_2;
	 int calificacion_3;
	 
	 
	 Nodo(String nom, int cal1, int cal2, int cal3){
		 nombre = nom;
		 calificacion_1 = cal1;
		 calificacion_2 = cal2;
		 calificacion_3 = cal3;
	 }
	 
	 public int calcularLaMedia(int cal1, int cal2, int cal3){
		 calificacion_1 = cal1;
		 calificacion_2 = cal2;
		 calificacion_3 = cal3;
		
		 int media;
		 media = (cal1 +cal2+cal3) /3;
		 return media;
	 }
	 
	
	 private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	 public static void main(String[] args)throws IOException{
		 String input, respuesta;
		 ArrayList<Nodo> alumnos = new ArrayList<Nodo>();
		 int nota1, nota2,nota3;
		
		 do{
			 System.out.println("Introduce el nombre");
			 String nombre = stdin.readLine();
			 
			 System.out.println("Introduce la calificacion 1");
			 input=stdin.readLine();
			 nota1= Integer.parseInt(input);
			 System.out.println("Introduce la calificacion 2");
			 input=stdin.readLine();
			 nota2 = Integer.parseInt(input);
			 System.out.println("Introduce la calificacion 3");
			 input=stdin.readLine();
			 nota3 = Integer.parseInt(input);
			 
			 
			 alumnos.add(new Nodo(nombre, nota1, nota2, nota3));
			
			 System.out.println("Introducir mas (s/n) => ");
			 respuesta = stdin.readLine();
		 }while(respuesta.charAt(0)=='s' || respuesta.charAt(0)=='S');
		 
		 
		 
		 Iterator<Nodo> recorrer = alumnos.iterator();
		 Nodo tmpalumnos;
		 int i=0;
		 while(recorrer.hasNext()){
			 
			 tmpalumnos = recorrer.next();
			 System.out.println("nºalumno " +(i+1));
			 System.out.println("Nombre " +tmpalumnos.nombre);
			 System.out.println("Calificacion1 => " +tmpalumnos.calificacion_1);
			 System.out.println("Calificacion2 => " +tmpalumnos.calificacion_2);
			 System.out.println("Calificacion3 => " +tmpalumnos.calificacion_3);
			 System.out.println("Media => " +(tmpalumnos.calificacion_1+tmpalumnos.calificacion_2+tmpalumnos.calificacion_3)/3);
			 System.out.println("Media => " +tmpalumnos.calcularLaMedia(nota1, nota2, nota3));

			 i++;
		 }
	 }
	
}
