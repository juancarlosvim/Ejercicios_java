
public class Masajista extends SeleccionFutbol {
	private String titulacion;
	private int a�osExp;
	
	public Masajista(){
		super();
	}
	
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int a�osExp){
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.a�osExp = a�osExp;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getA�osExp() {
		return a�osExp;
	}

	public void setA�osExp(int a�osExp) {
		this.a�osExp = a�osExp;
	}
	
	public void darMasaje(){
		System.out.println("Da un masaje");
	}
}
