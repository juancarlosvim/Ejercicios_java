import javax.swing.JFrame;

public class Principal extends JFrame {
	AreaDibujo aread;
	public Principal(){
		setTitle("Graficos en Java");
		setBounds(100, 50, 800, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aread = new AreaDibujo();
		add(aread);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Principal ventana = new Principal();
	}

}
