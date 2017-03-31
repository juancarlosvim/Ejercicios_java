import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
	//Creamos el constructor
	/*public Ventana(){
		super("Mi primera Ventana a Mano en Java");
		setSize(400, 600); //tamaño de la ventana;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierre ventana
		setVisible(true);
		
		
	}*/
	
	public static void main(String[] args){
		Ventana objVentana = new Ventana(); //creamos el objeto
		objVentana.setTitle("Mi primera Ventana a Mano en Java");
		objVentana.setSize(400, 600);
		objVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objVentana.setVisible(true);
	}
}
