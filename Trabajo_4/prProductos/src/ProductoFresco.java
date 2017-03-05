
public class ProductoFresco extends Producto {
	private String fecha_envasado;
	private String pais_origen;
	
	public ProductoFresco(String fecha_cad, int numero_lo, String fecha_env, String pais_or){
		
		super(fecha_cad, numero_lo);
		fecha_envasado = fecha_env;
		pais_origen = pais_or;
		
	}
	public String getFechaEnv(){
		return fecha_envasado;
	}
	public String getPais(){
		return pais_origen;
	}
	
	public String toString(){
		return ("Fecha Caducidad =>" + getFechaCa()+" Numero de lote => " +getNumeroLo()+ " Fecha envasado => " +getFechaEnv()+ " Pais => " +getPais());
	}
}
