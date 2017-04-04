import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BotonContador extends JFrame implements ActionListener {
	JButton btn1;
	JLabel lblpulsaa;
	int contador = 0;
	String texto;
	public BotonContador(){
		
		super("Primer evento");
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1 = new JButton("Pulsa este botón");
		
		lblpulsaa = new JLabel("Sin pulsar");
		
		btn1.setBounds(30, 50, 150, 20);
		
		lblpulsaa.setBounds(30, 70, 150, 30);
		
		JPanel pnl = new JPanel(null);
		
		pnl.add(btn1);
		pnl.add(lblpulsaa);
		
		setContentPane(pnl);
		
		btn1.addActionListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args){
		BotonContador e = new BotonContador();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente
		if(e.getSource()==btn1){
			contador++;
			lblpulsaa.setText("Nº de pulsaciones: " +contador);
			
			
		}
	}
}
