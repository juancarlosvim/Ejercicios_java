import java.io.*;
public class QuickSort {
	
	void ordenaQuickSort(int lista[], int inf, int sup){
		int izq, der;
		int eMedio, temp;
		izq=inf;
		der =sup;
		//selecciona el elemento situado en la posicion del centro
		eMedio = lista[(izq+der)/2];
		//situa los menores del elemento del medio a la izquierda y
		//los mayores a la derecha
		do{
			//avanza por la izquierda hasta que hay un elemento mayor
			//que el patron o se llega al sup
			while(lista[izq]<eMedio && izq<sup){
				izq++;
				//avanza por la derecha hasta que hay un elemento menor
				//qye el patron o se llega al inf
			}
			while(lista[der]>eMedio &&der>inf){
				der--;
				//permuta el elemento de la izq por el der
			}
			if(izq <=der){
				temp = lista[izq];
				lista[izq] = lista[der];
				lista[der]=temp;
				izq++;
				der--;
			}
		}while(izq <=der);
		
		if(der>inf){
			ordenaQuickSort(lista,inf,der);
		}
		if(izq<sup){
			ordenaQuickSort(lista,izq,sup);
		}
	}
	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String input;
		
		int numeros;
		int nm =0;
		int lista[] = new int[18];
		//int a[]={13,6,4,14,3,12,11,7,15,9,16,27,47,93,3,4,5,2};
		for(int i=1;i<=lista.length;i++){
			
			System.out.println("Introduce un numero 0 para salir=> ");
			input =stdin.readLine();
			numeros = Integer.parseInt(input);
			if(numeros==0){
				break;
			}
			lista[nm] = numeros;
			nm++;
			
		}
		QuickSort sortObj=new QuickSort();
		System.out.println("Conjunto sin ordenar ");
		for(int i: lista){
			System.out.println("lista => " +i);
		}
		/*for(int i: a){
			System.out.println("numero => " +i);
		}*/
		
		//sortObj.ordenaQuickSort(a, 0, a.length-1);
		sortObj.ordenaQuickSort(lista, 0, lista.length-1);
		System.out.println("Conjunto ordenado ");
		for(int i: lista){
			System.out.println("lista => " +i);
		}
		/*for(int i: a){
			System.out.println("Numero => "+i);
		}*/
		
			
			
			
		
		
	
		
		
	}

}
