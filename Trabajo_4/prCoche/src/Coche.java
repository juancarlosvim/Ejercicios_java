
public class Coche {
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
	public void a�adirModelo(String modelo){
		this.modelo = modelo;
	}
	public void a�adirPotencia(double potencia){
		this.potencia = potencia;
	}
	public void a�adirTraccion(boolean cRuedas){
		this.cRuedas = cRuedas;
	}
	public String daModelo(){
		return modelo;
	}
	public double daPotencia(){
		return potencia;
	}
	
	public String toString(){
		if(cRuedas==true){
			return ("El coche es " +modelo+ " con una potencia de " +potencia+ "  , con traccion a las 4 ruedas ");

		}
		else{
			return ("El coche es " +modelo+ " con una potencia de " +potencia+ "  , sin traccion a las 4 ruedas ");

		}
	}
	
	
	
	
}
