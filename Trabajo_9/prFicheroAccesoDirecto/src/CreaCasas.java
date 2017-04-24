import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CreaCasas {
	File af;
	RandomAccessFile arch;
	CasaReg reg;
	final int MAXREG = 99;
	
	public CreaCasas(){
		try{
			af = new File("Rurales.dat");
			arch = new RandomAccessFile(af, "rw");
			reg = new CasaReg();
		}catch (Exception e) {
			System.out.println("No se puede abrir el flujo "+e.getMessage());
			System.exit(1);
		}
	}
	
	
	void archVacio(){
		try {
			reg = new CasaReg();
			for(int k = 1; k<= MAXREG;++k){
				arch.seek(reg.desplazamiento(k));
				reg.annaReg(arch);
			}
		}catch (Exception e) {
			System.out.println("Excepcion al mover puntero del archivo");
			System.exit(1);
		}
	}
	
	
	
	void procesoEntrada(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Datos de la muestra en e lorden: "+" Numero de orden. Nombre. Coordenadas\n"+"Para terminar numero de orden =0");
		try{
			
			int nr;
			double x, y;
			String cd;
			boolean masRegistros = true;
			
			while(masRegistros){
				do{
					System.out.println("Numero d orden");
					nr = entrada.nextInt();
				}while(nr<0 || nr>MAXREG);
				
				if(nr>0){
					reg.numOrden = nr;
					entrada.nextLine(); //he añadido esta linea para limpiar el buffer
					System.out.println("Nombre ");
					cd = entrada.nextLine();
					
					reg.nombreCasa = cd.substring(0, Math.min(40, cd.length()));
					//se asegura que sea maximo 40 caracteres
					
					do{
						System.out.println("Coordenadas (x,y) ");
						x = entrada.nextDouble();
						y = entrada.nextDouble();
					}while((x<1.0 || x >100.0) || (y<1.0 || y>100.0));
					
					reg.x = x;
					reg.y = y;
					arch.seek(reg.desplazamiento(nr));
					reg.annaReg(arch);
				}
				masRegistros = (nr>0); //para que salga del bucle
			}
			
		}catch (IOException e) {
			System.out.println("Excepcion termina el proceso");
			System.exit(1);
		}finally{
			System.out.println("Se cierra el flijo");
			try{
				arch.close();
			}catch (IOException e) {
				System.out.println("Error al cerrar el flujo");
			}
			
		}
	}
	
	public static void main(String[] a){
		CreaCasas pr = new CreaCasas();
		pr.archVacio();
		pr.procesoEntrada();
	}
}
