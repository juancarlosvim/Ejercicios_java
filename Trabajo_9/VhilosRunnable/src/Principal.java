
public class Principal {

	public static void main(String[] args) {
		HilosRunnable miHilo = new HilosRunnable();
		HilosRunnable miHilo2 = new HilosRunnable();
		HilosRunnable miHilo3 = new HilosRunnable();
		HilosRunnable miHilo4 = new HilosRunnable();
		HilosRunnable miHilo5 = new HilosRunnable();
		
		Thread proceso1 = new Thread(miHilo, "Word");
		Thread proceso2 = new Thread(miHilo2, "Excel");
		Thread proceso3 = new Thread(miHilo3, "Power Point");
		Thread proceso4 = new Thread(miHilo4, "Paint");
		Thread proceso5 = new Thread(miHilo5, "Reloj");
		
		proceso1.start();
		proceso2.start();
		proceso3.start();
		proceso4.start();
		proceso5.start();
	}

}
