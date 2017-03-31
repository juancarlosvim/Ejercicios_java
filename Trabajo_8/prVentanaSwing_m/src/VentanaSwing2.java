import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class VentanaSwing2 extends JFrame implements ActionListener {
	JTextField tftexf;
	JLabel lbllabel;
	JButton btnMostrar;
	//constructor
	public VentanaSwing2(){
		super("Ventana con botón");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tftexf = new JTextField();
		
		lbllabel = new JLabel("..............................................");
		btnMostrar = new JButton("Mostrar texto");
		
		JPanel pnl = new JPanel(null);
		
		tftexf.setBounds(150, 70, 150, 30);
		lbllabel.setBounds(150, 130, 150, 30);
		btnMostrar.setBounds(150, 200, 150, 30);
		
		pnl.add(tftexf);
		pnl.add(lbllabel);
		pnl.add(btnMostrar);
		
		
		
		setContentPane(pnl);
		btnMostrar.addActionListener(this);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		VentanaSwing2 ve = new VentanaSwing2();
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		
	if(arg0.getSource()==btnMostrar){
		String texto =tftexf.getText();
		lbllabel.setText(texto);
	}
	
		
		
		
	}
	
	

}
