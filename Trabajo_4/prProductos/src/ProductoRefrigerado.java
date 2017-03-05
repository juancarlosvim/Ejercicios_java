
public class ProductoRefrigerado extends Producto {
		
	private String codigo_organismo;
	
	public ProductoRefrigerado(String fecha_cad, int numero_lo, String codigo_org){
		super(fecha_cad, numero_lo);
		codigo_organismo = codigo_org;
	}
	public String getCodigoOrg(){
		return codigo_organismo;
	}
	
	public String toString(){
		return ("Fecha Caducidad => "+getFechaCa()+" Numero lote => "+ getNumeroLo()+" Codigo organismo => " +getCodigoOrg());
	}
	
}
