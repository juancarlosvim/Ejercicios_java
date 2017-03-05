
public class Producto {
	private String fecha_caducidad;
	private int numero_lote;
	
	public Producto(String fecha_ca, int numero_lo){
		fecha_caducidad = fecha_ca;
		numero_lote=numero_lo;
	}
	public String getFechaCa(){
		return fecha_caducidad;
	}
	public void setNumeroLo(int numero_lo){
		numero_lote= numero_lo;
	}
	public int getNumeroLo(){
		return numero_lote;
	}
	
	public String toString(){
		return("Fecha Caducidad => " +getFechaCa()+ " Numero Lote => " +getNumeroLo());
	}
}
