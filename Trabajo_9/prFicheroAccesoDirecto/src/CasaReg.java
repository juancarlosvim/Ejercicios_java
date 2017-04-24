import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CasaReg {
	int numOrden;
	String nombreCasa;
	double x, y;
	final int TAM = 62;
	
	public CasaReg(){
		nombreCasa = new String();
		numOrden = 0;
		x = 0.0;
		y = 0.0;
	}
	
	public boolean annaReg(RandomAccessFile fl){
		boolean flag;
		flag = true;
		try{
			fl.writeInt(numOrden);
			fl.writeUTF(nombreCasa);
			fl.writeDouble(x);
			fl.writeDouble(y);
			
		}catch (IOException e) {
			System.out.println("Excepcion al escribir el registro");
			flag = false;
		}
		return flag;
	}
	
	public int tamanno(){
		return TAM;
	}
	
	public long desplazamiento(int n){
		return TAM * (n-1);
	}
	
	public boolean leerReg(RandomAccessFile flo) throws IOException{
		boolean flag;
		flag = true;
		try{
			numOrden = flo.readInt();
			nombreCasa = flo.readUTF();
			x = flo.readDouble();
			y = flo.readDouble();
		}catch (EOFException e) {
			throw e;
		}catch (IOException e) {
			System.out.println("Excepcion al leer el registro ");
			flag = false;
		}
		return flag;
		
	}
}
