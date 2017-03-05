
public class ProductoCongelado extends Producto {

	private double temperatura;
	
	public ProductoCongelado(String fecha_cad, int numero_lo, double temp){
		super(fecha_cad, numero_lo);
		temperatura = temp;
	}
	public double getTemperatura(){
		return temperatura;
	}
	
	public String toString(){
		return("Fecha Caducidad => " +getFechaCa()+ " Numero lote => " +getNumeroLo()+ " Temperatura => " +getTemperatura() );
	}
}
