
public class Jarra {
	private int cantidad;
	private int capacidad;
	//constructor
	public void Jarra(int capacidadinicial){
		capacidad = capacidadinicial;
		cantidad = 0;
	}
	//metodos
	public int capacidad(){
		return capacidad;
	}
	public int cantidad(){
		return cantidad;
	}
	public void llena(){
		cantidad = capacidad;
	}
	public void vacia(){
		cantidad = 0;
	}
	public void llenaDesde(Jarra j){
		int cantidadminima = Math.min(capacidad-cantidad, j.cantidad);
		cantidad += cantidadminima;
		j.cantidad -= cantidadminima;
	}
	public String toString(){
		return ("La jarra tiene " +cantidad+" con capacidad de " +capacidad);
	}
}
