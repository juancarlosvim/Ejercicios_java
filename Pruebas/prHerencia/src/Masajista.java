
public class Masajista extends SeleccionFutbol {
	private String titulacion;
	private int añosExp;
	
	public Masajista(){
		super();
	}
	
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int añosExp){
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.añosExp = añosExp;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAñosExp() {
		return añosExp;
	}

	public void setAñosExp(int añosExp) {
		this.añosExp = añosExp;
	}
	
	public void darMasaje(){
		System.out.println("Da un masaje");
	}
}
