import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MiMenu extends JFrame {
	//1º los menu de comandos
	JMenuItem cmdAbrir, cmdCerrar,cmdSalir, cmdCopiar, cmdPegar;
	
	JMenu mnuArchivo, mnuEdicion;
	
	JMenuBar braMenu;
	
	public MiMenu(){
		super("Mi primer menu hecho a mano");
		setBounds(200, 200, 800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		cmdAbrir = new JMenuItem("Abrir");
		cmdCerrar = new  JMenuItem("Cerrar");
		cmdSalir = new JMenuItem("Salir");
		cmdCopiar = new JMenuItem("Copiar");
		cmdPegar = new JMenuItem("Pegar");
		
		
		mnuArchivo = new JMenu("Archivo");
		mnuEdicion = new JMenu("Edicion");
		
		braMenu = new JMenuBar();
		
		
		mnuArchivo.add(cmdAbrir);
		mnuArchivo.add(cmdCerrar);
		mnuArchivo.add(cmdSalir);
		mnuEdicion.add(cmdCopiar);
		mnuEdicion.add(cmdPegar);
		
		braMenu.add(mnuArchivo);
		braMenu.add(mnuEdicion);
		
		setJMenuBar(braMenu);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MiMenu v = new MiMenu();
	}

}
