import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PersonalizarBotones extends JFrame {

	private JPanel contentPane;
	ImageIcon imgNormal, imgPasar, imgPulsado, imgNormal2, imgPasar2, imgPulsado2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalizarBotones frame = new PersonalizarBotones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PersonalizarBotones() {
		setTitle("Personalizar Boton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		imgNormal = new ImageIcon(PersonalizarBotones.class.getResource("/MisImagenes/aceptarNormal.png"));
		imgPulsado = new ImageIcon(PersonalizarBotones.class.getResource("/MisImagenes/aceptarPulsado.png"));
		imgPasar = new ImageIcon(PersonalizarBotones.class.getResource("/MisImagenes/aceptarPasar.png"));
		JButton btnAceptar = new JButton("");
		btnAceptar.setIcon(imgNormal);
		

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				if(arg0.getSource()==btnAceptar){
					JOptionPane.showMessageDialog(null, "Botón personalizado pulsado");
				}
			}
		});
		btnAceptar.setBounds(24, 185, 121, 35);
		btnAceptar.setBorder(null);
		btnAceptar.setBorderPainted(false);
		btnAceptar.setContentAreaFilled(false);
		
		btnAceptar.setPressedIcon(imgPulsado);
		btnAceptar.setRolloverIcon(imgPasar);
		
		
		contentPane.add(btnAceptar);
		
		imgNormal2 = new ImageIcon(PersonalizarBotones.class.getResource("/MisImagenes/CancelarNormal.png"));
		imgPulsado2 = new ImageIcon(PersonalizarBotones.class.getResource("/MisImagenes/CancelarPulsado.png"));
		imgPasar2 = new ImageIcon(PersonalizarBotones.class.getResource("/MisImagenes/CancelarPasar.png"));
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setIcon(imgNormal2);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnCancelar){
					JOptionPane.showMessageDialog(null, "Botón cancelar pulsado");
				}
			}
		});
		
		btnCancelar.setBounds(292, 185, 131, 46);
		btnCancelar.setBorder(null);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setContentAreaFilled(false);
		
		btnCancelar.setPressedIcon(imgPulsado2);
		btnCancelar.setRolloverIcon(imgPasar2);
		
		
		
		
		contentPane.add(btnCancelar);
	}
}
