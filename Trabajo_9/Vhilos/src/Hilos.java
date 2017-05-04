
public class Hilos {

	public static void main(String[] args) {
		Thilo proceso1 = new Thilo("Word");
		Thilo proceso2 = new Thilo("Excel");
		Thilo proceso3 = new Thilo("Paint");
		Thilo proceso4 = new Thilo("Reloj");
		Thilo proceso5 = new Thilo("Calculadora");
		
		proceso1.start();
		proceso2.start();
		proceso3.start();
		proceso4.start();
		proceso5.start();
		
		

	}

}
