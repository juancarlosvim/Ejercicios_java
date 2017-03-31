import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
public class VGestorNulo extends JFrame {

	public VGestorNulo(){
		super("Ventana con Gestor Nulo y usando setBounds");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btnAceptar = new JButton("Aceptar");
		JButton btnCancelar = new JButton("Cancelar");
		//FlowLayout gestor = new FlowLayout();
		//JPanel pnlCont = new JPanel(gestor); //para usar FlowLayout
		JPanel pnl = new JPanel(null); //queremos el gestor nulo
		
		btnAceptar.setBounds(100, 50, 120, 30);
		btnCancelar.setBounds(100, 90, 120, 30);
		
		pnl.add(btnAceptar);
		pnl.add(btnCancelar);
		
		setContentPane(pnl);
		setVisible(true);
		
		
	}
	public static void main(String[]args){
		VGestorNulo v = new VGestorNulo();
	}
}
