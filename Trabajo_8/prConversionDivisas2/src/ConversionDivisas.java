import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConversionDivisas extends JFrame {

	private JPanel pnlContenido;
	private JTextField txtDolares;
	private JTextField txtEuros;
	private JTextField txtPesetas;
	
	double  dolares = 0.0, euros =0.0, pesetas =0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversionDivisas frame = new ConversionDivisas();
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
	public ConversionDivisas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConversionDivisas.class.getResource("/imagenes/Monedas.png")));
		setTitle("Conversion de Divisas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pnlContenido = new JPanel();
		pnlContenido.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlContenido);
		pnlContenido.setLayout(null);
		
		JLabel lblDolares = new JLabel("Dolares");
		lblDolares.setBounds(10, 38, 62, 14);
		pnlContenido.add(lblDolares);
		
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setBounds(10, 106, 62, 14);
		pnlContenido.add(lblEuros);
		
		JLabel lblPesetas = new JLabel("Pesetas");
		lblPesetas.setBounds(10, 166, 62, 14);
		pnlContenido.add(lblPesetas);
		
		txtDolares = new JTextField();
		txtDolares.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtEuros.setEnabled(false);
				txtDolares.setEnabled(true);
			}
		});
		txtDolares.setBounds(82, 35, 86, 20);
		pnlContenido.add(txtDolares);
		txtDolares.setColumns(10);
		
		txtEuros = new JTextField();
		txtEuros.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDolares.setEnabled(false);
				txtEuros.setEnabled(true);
				
			}
		});
		txtEuros.setBounds(82, 103, 86, 20);
		pnlContenido.add(txtEuros);
		txtEuros.setColumns(10);
		
		txtPesetas = new JTextField();
		txtPesetas.setEnabled(false);
		txtPesetas.setBounds(82, 163, 86, 20);
		pnlContenido.add(txtPesetas);
		txtPesetas.setColumns(10);
		
		JButton btnDolaresAPesetas = new JButton("Dolares a Pesetas");
		btnDolaresAPesetas.addMouseListener(new MouseAdapter() {
			
		
		});
		btnDolaresAPesetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try{
					dolares = Double.parseDouble(txtDolares.getText());
				
					pesetas = dolares * 113.175;
					txtPesetas.setText(" "+pesetas);
					
				}catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error de  Datos");
				}
				
			}
		});
		
		
		btnDolaresAPesetas.setIcon(new ImageIcon(ConversionDivisas.class.getResource("/imagenes/dollar2.png")));
		btnDolaresAPesetas.setBounds(191, 29, 179, 33);
		pnlContenido.add(btnDolaresAPesetas);
		
		JButton btnEurosAPesetas = new JButton("Euros a Pesetas");
		btnEurosAPesetas.setIcon(new ImageIcon(ConversionDivisas.class.getResource("/imagenes/euro2.png")));
		btnEurosAPesetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					euros = Double.parseDouble(txtEuros.getText());
					pesetas = euros * 166.36;
					txtPesetas.setText(" "+pesetas);
				}catch (Exception e3) {
					JOptionPane.showMessageDialog(null, "Error de  Datos");
				}
			}
		});
		btnEurosAPesetas.setBounds(191, 97, 179, 33);
		pnlContenido.add(btnEurosAPesetas);
	}
}
