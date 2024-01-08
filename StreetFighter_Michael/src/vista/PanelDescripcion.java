package vista;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class PanelDescripcion extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<JLabel>listaPanel = new ArrayList<JLabel>();
	public JComboBox<String> comboBox;
	public JButton btnMostrar,btnAtras;
	public JLabel lblEtiquetaNombre,lblEtiquetaEdad,lblEtiquetaEstatura,lblEtiquetaPeso,lblEtiquetaPotencia,lblEtiquetaVelocidad,
	lblEtiquetaFisica,lblEtiquetaDescripcion;
	public JLabel lblNombre,lblEdad,lblEstatura,lblPeso,lblPotencia,lblVelocidad,lblFisica,lblFoto,lblDescripcion;
	/**
	 * Create the panel.
	 */
	public PanelDescripcion() {
		setBackground(Color.BLACK);
		setLayout(null);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(113, 49, 280, 41);
		add(comboBox);
		añadirPersonajesComboBox(comboBox);
		
		btnMostrar = new JButton("MOSTRAR");
		btnMostrar.setBackground(Color.ORANGE);
		btnMostrar.setBounds(480, 53, 120, 33);
		add(btnMostrar);
		
		lblEtiquetaNombre = new JLabel("NOMBRE: ");
		lblEtiquetaNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEtiquetaNombre.setForeground(Color.ORANGE);
		lblEtiquetaNombre.setBackground(Color.WHITE);
		lblEtiquetaNombre.setBounds(138, 260, 105, 25);
		add(lblEtiquetaNombre);
		
		lblNombre = new JLabel("");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(253, 239, 183, 59);
		add(lblNombre);
		
		lblEtiquetaEdad = new JLabel("EDAD:");
		lblEtiquetaEdad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEtiquetaEdad.setForeground(Color.ORANGE);
		lblEtiquetaEdad.setBounds(138, 378, 65, 33);
		add(lblEtiquetaEdad);
		
		lblEdad = new JLabel("");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setBounds(213, 361, 138, 59);
		add(lblEdad);
		
		lblEtiquetaEstatura = new JLabel("ESTATURA:");
		lblEtiquetaEstatura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEtiquetaEstatura.setForeground(Color.ORANGE);
		lblEtiquetaEstatura.setBounds(380, 381, 114, 27);
		add(lblEtiquetaEstatura);
		
		lblEstatura = new JLabel("");
		lblEstatura.setForeground(Color.WHITE);
		lblEstatura.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEstatura.setBounds(504, 361, 138, 50);
		add(lblEstatura);
		
		lblEtiquetaPeso = new JLabel("PESO:");
		lblEtiquetaPeso.setForeground(Color.ORANGE);
		lblEtiquetaPeso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEtiquetaPeso.setBounds(652, 381, 65, 27);
		add(lblEtiquetaPeso);
		
		lblPeso = new JLabel("");
		lblPeso.setForeground(Color.WHITE);
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPeso.setBounds(727, 365, 138, 50);
		add(lblPeso);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(191, 471, 167, 98);
		add(lblNewLabel);
		
		lblEtiquetaPotencia = new JLabel("POTENCIA");
		lblEtiquetaPotencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaPotencia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEtiquetaPotencia.setForeground(Color.ORANGE);
		lblEtiquetaPotencia.setBounds(224, 481, 96, 25);
		add(lblEtiquetaPotencia);
		
		lblPotencia = new JLabel("");
		lblPotencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblPotencia.setForeground(Color.WHITE);
		lblPotencia.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPotencia.setBounds(253, 517, 49, 41);
		add(lblPotencia);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(361, 471, 167, 98);
		add(lblNewLabel_1);
		
		lblEtiquetaVelocidad = new JLabel("VELOCIDAD");
		lblEtiquetaVelocidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaVelocidad.setForeground(Color.ORANGE);
		lblEtiquetaVelocidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEtiquetaVelocidad.setBounds(394, 481, 114, 25);
		add(lblEtiquetaVelocidad);
		
		lblVelocidad = new JLabel("");
		lblVelocidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblVelocidad.setForeground(Color.WHITE);
		lblVelocidad.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblVelocidad.setBounds(423, 517, 49, 41);
		add(lblVelocidad);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(538, 471, 167, 98);
		add(lblNewLabel_2);
		
		lblEtiquetaFisica = new JLabel("FÍSICO");
		lblEtiquetaFisica.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaFisica.setForeground(Color.ORANGE);
		lblEtiquetaFisica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEtiquetaFisica.setBounds(571, 481, 96, 25);
		add(lblEtiquetaFisica);
		
		lblFisica = new JLabel("");
		lblFisica.setHorizontalAlignment(SwingConstants.CENTER);
		lblFisica.setForeground(Color.WHITE);
		lblFisica.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblFisica.setBounds(593, 511, 49, 52);
		add(lblFisica);
		
		lblEtiquetaDescripcion = new JLabel("DESCRIPCION:");
		lblEtiquetaDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEtiquetaDescripcion.setForeground(Color.ORANGE);
		lblEtiquetaDescripcion.setBounds(138, 638, 146, 25);
		add(lblEtiquetaDescripcion);
		
		lblDescripcion = new JLabel("\r\n\r\n\r\n\r\n\r\n\r\n");
		lblDescripcion.setVerticalAlignment(SwingConstants.TOP);
		lblDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBounds(138, 685, 756, 59);
		add(lblDescripcion);
		
		lblFoto = new JLabel("");
		lblFoto.setBounds(1025, 93, 400, 540);
		add(lblFoto);
		
		btnAtras = new JButton("ATRÁS");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAtras.setBackground(new Color(255, 255, 0));
		btnAtras.setBounds(1242, 697, 183, 59);
		add(btnAtras);
		
	}
	private void añadirPersonajesComboBox(JComboBox<String> comboBox2) {
		ArrayList<String> nombresPersonajes = new ArrayList();
		nombresPersonajes.add(" ");
		nombresPersonajes.add("RYU");
		nombresPersonajes.add("KEN");
		nombresPersonajes.add("GUILE");
		nombresPersonajes.add("CHUN-LI");
		nombresPersonajes.add("HONDA");
		nombresPersonajes.add("DHALSIM");
		nombresPersonajes.add("BLANKA");
		nombresPersonajes.add("VEGA");
		nombresPersonajes.add("ZANGIEF");
		nombresPersonajes.add("DEE JAY");
		nombresPersonajes.add("T.HAWK");
		nombresPersonajes.add("CAMMY");
		nombresPersonajes.add("BALROG");
		nombresPersonajes.add("SAGAT");
		nombresPersonajes.add("M.BISON");
		
		for(String nombre : nombresPersonajes) {
			comboBox2.addItem(nombre);
		}
		
	}
}
