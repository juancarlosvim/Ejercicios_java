import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventosGraficos extends JFrame implements KeyListener {

	private JPanel contentPane;
	private JTextField txtPulsa;
	private JTextField txtCodigo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventosGraficos frame = new EventosGraficos();
					
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
	public EventosGraficos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPulsa = new JLabel("Pulsa una tecla");
		lblPulsa.setBounds(20, 69, 92, 14);
		contentPane.add(lblPulsa);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo de la tecla");
		lblCodigo.setBounds(20, 140, 113, 14);
		contentPane.add(lblCodigo);
		
		txtPulsa = new JTextField();
		txtPulsa.setEnabled(false);
		txtPulsa.setBounds(143, 66, 164, 20);
		contentPane.add(txtPulsa);
		txtPulsa.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setEnabled(false);
		txtCodigo.setBounds(143, 137, 164, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
	
		addKeyListener(this);
		setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent kp) {
		// nos va a controlar que tecla es la que se esta presionando o se mantiene pulsada
		
		txtPulsa.setText(kp.getKeyText(kp.getKeyCode()));
		txtCodigo.setText(""+kp.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent kr) {
		// nos va a servir para detectar que tecla ya se liberó
		txtPulsa.setText("Soltó la tecla "+kr.getKeyText(kr.getKeyCode()));
	}

	@Override
	public void keyTyped(KeyEvent kt) {
		// TODO Apéndice de método generado automáticamente
		
	}
}
