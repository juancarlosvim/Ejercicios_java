import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ConsultaCasa {
	private RandomAccessFile archivo;
	
	private void mostrar(CasaReg reg){
		System.out.println(reg.nombreCasa+ " ubicada con las coordenadas \t("+reg.x+", "+reg.y+" )");
	}
	
	public ConsultaCasa(File f) throws IOException{
		if(f.exists()){
			archivo = new RandomAccessFile(f, "r");
			System.out.println("Flujo abierto en modo lectura, tamaño " +archivo.length());
		}else{
			archivo = null;
			throw new IOException("Archivo no existe");
		}
	}
	
	public void consultaGeneral() throws IOException{
		if(archivo !=null){
			try{
				int n;
				CasaReg reg = new CasaReg();
				n =0;
				
				while(true){
					archivo.seek(reg.desplazamiento(++n));
					if(reg.leerReg(archivo)){
						if(reg.numOrden >0){
							mostrar(reg);
						}
					}
				}
			}catch (EOFException eof) {
				System.out.println("Se alcanza el fin del archivo " + " en la consulta");
			}
		}
	}
	
	
	
	public void consultaReg(int nreg) throws IOException{
		if(archivo != null){
			CasaReg reg = new CasaReg();
			if(nreg>0 && reg.desplazamiento(nreg)<archivo.length()){
				archivo.seek(reg.desplazamiento(nreg));
				if(reg.numOrden>0){
					mostrar(reg);
				}else{
					System.out.println("Registro "+nreg+ " no dado de alta");
				}
			}else{
				throw new IOException(" Registro fuera de rango");
			}
		}
	}
	
	public static void main(String[] a){
		File f = new File("Rurales.dat");
		ConsultaCasa clta = null;
		int opc = 1;
		Scanner entrada = new Scanner(System.in);
		try{
			System.out.println("Consultas al archivo "+f.getName());
			clta = new ConsultaCasa(f);
			while(opc !=5){
				System.out.println("1 Muestra todos los registros " + " activos");
				System.out.println("2 Muestra un registro determinado ");
				System.out.println("3 Se sale de la aplicación");
				do{
					opc = entrada.nextInt();
						
				}while((opc <1 )|| (opc >2 && opc !=5));
				if(opc ==1){
					clta.consultaGeneral();
				}
				else if(opc ==2){
					int nreg;
					System.out.print("Numero de registro");
					nreg = entrada.nextInt();
					clta.consultaReg(nreg);
				}
			}
		}catch (IOException e) {
			System.out.println("Excepcion durante" +" el proceso de consulta "+e.getMessage());
		}
	}
}
