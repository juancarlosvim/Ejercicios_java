import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VComponentes extends JFrame {
	//creamos constructor
	public VComponentes(){
		super("Ventana con Componentes"); //titulo
		setSize(300,200); //tamaño
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cerrar la ventana
		JLabel lblNombre = new JLabel("Nombre"); //creamos etiqueta
		JTextField txfNombre = new JTextField(20);//el numero de ancho que va a tener
		JButton btnSinEvento = new JButton("Bontón sin evento");
		JPanel pnlContenido = new JPanel();
		//Agregamos los componentes al contendor
		pnlContenido.add(lblNombre);
		pnlContenido.add(txfNombre);
		pnlContenido.add(btnSinEvento);
		//Asociamos el contenedor a la ventana;
		setContentPane(pnlContenido);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args){
		VComponentes ventana = new VComponentes();
	}
	
}
