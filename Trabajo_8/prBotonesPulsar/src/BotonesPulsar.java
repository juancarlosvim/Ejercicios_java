import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BotonesPulsar extends JFrame implements ActionListener {
	JButton btnButton1, btnButton2;
	JTextField txfmostrar;
	public BotonesPulsar(){
		
		super("Tutorial de Java Swing");
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnButton1 = new JButton("JButton1");
		btnButton2 = new JButton("JButton2");
		
		txfmostrar = new JTextField();
		
		JPanel pnl = new JPanel(null);
		
		btnButton1.setBounds(150, 10, 150, 20);
		btnButton2.setBounds(300, 10, 150, 20);
		
		txfmostrar.setBounds(150, 30,300, 30);
		
		pnl.add(btnButton1);
		pnl.add(btnButton2);
		pnl.add(txfmostrar);
		
		setContentPane(pnl);
		btnButton1.addActionListener(this);
		btnButton2.addActionListener(this);
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		BotonesPulsar e = new BotonesPulsar();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		if(arg0.getSource()==btnButton1){
			txfmostrar.setText("JButton1 ha sido pulsado");
		}
		if(arg0.getSource()==btnButton2){
			txfmostrar.setText("JButton2 ha sido pulsado");
		}
	}
}
