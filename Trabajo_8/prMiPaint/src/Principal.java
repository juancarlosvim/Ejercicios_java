import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame implements ActionListener {
	AreaDibujo aread;
	JPanel pnlHtas;
	JButton btnCirVacion, btnCirRelleno, btnBorrar;
	public Principal(){
		setTitle("Graficos en Java");
		setBounds(100, 50, 800, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnCirVacion = new JButton("Circulo Vacio");
		btnCirVacion.setBounds(10, 10, 120, 40);
		btnCirRelleno = new JButton("Circulo Relleno");
		btnCirRelleno.setBounds(10, 60, 120, 40);
		
		btnBorrar = new JButton("Borrar Datos");
		btnBorrar.setBounds(10, 110, 120, 40);
		
		pnlHtas = new JPanel(null);
		aread = new AreaDibujo();
		pnlHtas.setBounds(0, 0, 200, 400);
		pnlHtas.setBackground(Color.DARK_GRAY);
		
		pnlHtas.add(btnCirVacion);
		pnlHtas.add(btnCirRelleno);
		pnlHtas.add(btnBorrar);
		
		add(pnlHtas);
		add(aread);
		
		btnCirVacion.addActionListener(this);
		btnCirRelleno.addActionListener(this);
		btnBorrar.addActionListener(this);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Principal ventana = new Principal();
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		if(arg0.getSource()==btnCirVacion){
			AreaDibujo.dibujarCirculoVacio(aread.getGraphics(), 50, 50, 80, 80);
		}
		if(arg0.getSource()==btnCirRelleno){
			AreaDibujo.dibujarCirculoRelleno(aread.getGraphics(), 50, 150, 80, 80);
		}
		if(arg0.getSource()==btnBorrar){
			repaint();
		}
	}

}
