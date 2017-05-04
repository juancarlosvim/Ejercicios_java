
public class Thilo extends Thread {
	private String proceso= "";
	private long ms=0;
	public void run(){
		try {
			ms = (long)(Math.random()*5+1)*1000/1000;
			Thread.sleep(ms);
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			System.out.println("Error de ejecución");
		}
		System.out.println("Proceso "+proceso+ " Finalizado en "+ms+" segundos ");
	}
	
	//constructor
	public Thilo(String proceso){
		this.proceso = proceso;
		
	}
}
