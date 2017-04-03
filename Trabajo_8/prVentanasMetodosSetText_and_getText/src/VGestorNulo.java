import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class VGestorNulo extends JFrame implements ActionListener {
	
	JButton btnMostrar, btnBorrar;
	JLabel lblNombre, lblEdad, lblDatos;
	JTextField txtNombre, txtEdad, txtDatos;
	
	ImageIcon miImagen;
	
	public VGestorNulo(){
		super("Utilizando metodos setText y getText");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblNombre = new JLabel("Nombre: ");
		lblEdad = new JLabel("Edad: ");
		lblDatos = new JLabel("Datos: ");
		
		txtNombre = new JTextField(30);
		txtEdad = new JTextField(10);
		txtDatos = new JTextField(50);
		
		miImagen = new ImageIcon();
		miImagen = new ImageIcon("ver.png");
		btnMostrar = new JButton(miImagen);
		btnBorrar = new JButton("Borrar Datos");
		
		
		JPanel pnlCont = new JPanel(null);
		
		
		lblNombre.setBounds(5, 10, 55, 20);
		lblEdad.setBounds(5, 50, 50, 20);
		lblDatos.setBounds(5, 90, 50, 20);
		
		txtNombre.setBounds(75, 10, 150, 20);
		txtEdad.setBounds(75, 50, 50, 20);
		txtDatos.setBounds(75, 90, 220, 20);
		
		btnMostrar.setBounds(320, 10, 120, 40);
		btnBorrar.setBounds(320, 90, 120, 40);
		
		pnlCont.add(lblNombre);
		pnlCont.add(lblEdad);
		pnlCont.add(lblDatos);
		
		pnlCont.add(txtNombre);
		pnlCont.add(txtEdad);
		pnlCont.add(txtDatos);
		
		pnlCont.add(btnMostrar);
		pnlCont.add(btnBorrar);
		
		setContentPane(pnlCont);
		
		
		btnMostrar.addActionListener(this);
		btnBorrar.addActionListener(this);
		
		setVisible(true);
		
		

	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		VGestorNulo e = new VGestorNulo();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		String nombre="", edad="", datos="";
		if(arg0.getSource()==btnMostrar){
			nombre=txtNombre.getText();
			edad = txtEdad.getText();
			
			txtDatos.setText("Tu nombre es " +nombre+ " y tu edad es " +edad);
		}
		
		if(arg0.getSource()==btnBorrar){
			txtNombre.setText("");;
			txtEdad.setText("");;
			txtDatos.setText("");
		}
	}
	
	

}
