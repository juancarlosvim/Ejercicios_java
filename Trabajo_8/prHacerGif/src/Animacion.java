
import java.awt.*;
import javax.swing.*;
public class Animacion extends JFrame implements Runnable{
	ImageIcon peli[] = new ImageIcon[38];
	int indice=0;
	JLabel imagenS;
	Thread hiloAnimacion;
	Animacion(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 10; i < 45; i++)
			peli[i-10]=new ImageIcon("logo"+i+"b.png");
		imagenS = new JLabel(new ImageIcon("logo10.png"));
		add(imagenS, BorderLayout.CENTER);
		hiloAnimacion = new Thread(this);
		hiloAnimacion.start();
		setTitle("Animación");
		setSize(350,350);
		setVisible(true);
	}
	public void run() {
		while (true) {
			try {
				Thread.sleep(200);
			}catch (Exception e) {}
			if(++indice >= peli.length)
				indice = 0;
			repaint();
		}
	}
	public void paint(Graphics g){
		imagenS.setIcon(peli[indice]);
	}
	public static void main(String args[]){
		Animacion e1=new Animacion();
	}
}