import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VGestorNulo extends JFrame implements ActionListener {
	JButton btnAceptar, btnCancelar;
	public VGestorNulo(){
		super("Ventana con Gestor Nulo y usando setBounds");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAceptar = new JButton("Aceptar");
		btnCancelar = new JButton("Cancelar");
		//FlowLayout gestor = new FlowLayout();
		//JPanel pnlCont = new JPanel(gestor); //para usar FlowLayout
		JPanel pnl = new JPanel(null); //queremos el gestor nulo
		
		btnAceptar.setBounds(100, 50, 120, 30);
		btnCancelar.setBounds(100, 90, 120, 30);
		
		pnl.add(btnAceptar);
		pnl.add(btnCancelar);
		
		setContentPane(pnl);
		//agregamos el escuchador al bot�n
		btnAceptar.addActionListener(this);
		btnCancelar.addActionListener(this);
		setVisible(true);
		
		
	}
	public static void main(String[]args){
		VGestorNulo v = new VGestorNulo();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		if(arg0.getSource()==btnAceptar){
			JOptionPane.showMessageDialog(null, "Pulsaste el bot�n Aceptar");
		}else{
			JOptionPane.showMessageDialog(null, "Pulsaste el bot�n Cancelar");
		}
		
	}
}
