
public class Circulo {
	private double radio;
	
	Circulo(double radio){
		this.radio = radio;
	}
	
	public double area(){
		return Math.PI*radio*radio;
	}
}
