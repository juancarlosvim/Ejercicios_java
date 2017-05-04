import java.io.IOException;

public class HilosRunnable implements Runnable {
	private long ms=0;
	@Override
	public void run() {
		try {
			ms = (long)(Math.random()*5+1)*1000/1000;
			Thread.sleep(ms);
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		System.out.println("Proceso "+ Thread.currentThread().getName()+ " Finalizado en " +ms+ " segundos");
		
	}
	
	

}
