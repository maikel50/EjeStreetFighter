package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import modelo.J1Seleccionado;
import modelo.J2Seleccionado;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class CombateEnfren extends JPanel {
	public JLabel lblEscenario,labelJ1,labelJ2;
	public JProgressBar vidaJ1,vidaJ2,barraDescansoJ1,barraDescansoJ2;
	public JButton btnAtacar,btnDefender,btnDescansar;
	public JLabel lblVidaJ1;
	public JLabel lblNombreJ1;
	public JLabel lblVidaJ2;
	public JLabel lblNombreJ2;
	public CombateEnfren() {
		setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
	    layeredPane.setBounds(0, 0, 1515, 772);
	    add(layeredPane);

	    lblEscenario = new JLabel("");
	    lblEscenario.setBounds(0, 0, 1515, 772);
	    layeredPane.add(lblEscenario, JLayeredPane.DEFAULT_LAYER);

	    int escenario = escenarioAleatorio();
	    lblEscenario.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgEscenarios/" + escenario + ".jpg")));

	    vidaJ1 = new JProgressBar();
	    vidaJ1.setForeground(Color.GREEN);
	    vidaJ1.setBounds(91, 44, 574, 37);
	    vidaJ1.setValue(100);
	    layeredPane.add(vidaJ1, JLayeredPane.PALETTE_LAYER);

	    vidaJ2 = new JProgressBar();
	    vidaJ2.setForeground(Color.GREEN);
	    vidaJ2.setBounds(838, 44, 574, 37);
	    vidaJ2.setValue(100);
	    layeredPane.add(vidaJ2, JLayeredPane.PALETTE_LAYER);

	    JLabel etiquetaKO = new JLabel("K.O");
	    etiquetaKO.setBounds(675, 44, 153, 37);
	    etiquetaKO.setBackground(Color.BLACK);
	    etiquetaKO.setForeground(Color.RED);
	    etiquetaKO.setFont(new Font("Tahoma", Font.PLAIN, 45));
	    etiquetaKO.setHorizontalAlignment(SwingConstants.CENTER);
	    layeredPane.add(etiquetaKO, JLayeredPane.PALETTE_LAYER);
	    
	    labelJ1 = new JLabel("");
	    labelJ1.setForeground(Color.BLACK);
	    labelJ1.setFont(new Font("Tahoma", Font.BOLD, 30));
	    labelJ1.setBounds(50, 192, 478, 519);
	    layeredPane.add(labelJ1,JLayeredPane.PALETTE_LAYER);
	    
	    
	    labelJ2 = new JLabel("");
	    labelJ2.setForeground(Color.BLACK);
	    labelJ2.setFont(new Font("Tahoma", Font.BOLD, 30));
	    labelJ2.setBounds(934, 173, 478, 519);
	    layeredPane.add(labelJ2,JLayeredPane.PALETTE_LAYER);
	    
	     btnAtacar = new JButton("ATACAR");
	    btnAtacar.setBounds(579, 270, 167, 64);
	    layeredPane.add(btnAtacar,JLayeredPane.PALETTE_LAYER);
	    
	     btnDefender = new JButton("DEFENDER");
	    btnDefender.setBounds(579, 402, 167, 64);
	    layeredPane.add(btnDefender,JLayeredPane.PALETTE_LAYER);
	    
	     btnDescansar = new JButton("DESCANSAR");
	    btnDescansar.setBounds(579, 545, 167, 64);
	    layeredPane.add(btnDescansar,JLayeredPane.PALETTE_LAYER);
	    
	     barraDescansoJ1 = new JProgressBar();
	     barraDescansoJ1.setForeground(Color.GREEN);
	    barraDescansoJ1.setBounds(91, 720, 370, 19);
	    barraDescansoJ1.setValue(100);
	    layeredPane.add(barraDescansoJ1,JLayeredPane.PALETTE_LAYER);
	    
	     barraDescansoJ2 = new JProgressBar();
	     barraDescansoJ2.setForeground(Color.GREEN);
	    barraDescansoJ2.setBounds(995, 720, 370, 19);
	    barraDescansoJ2.setValue(100);
	    layeredPane.add(barraDescansoJ2,JLayeredPane.PALETTE_LAYER);
	    
	    lblVidaJ1 = new JLabel("100");
	    lblVidaJ1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblVidaJ1.setFont(new Font("Tahoma", Font.BOLD, 50));
	    lblVidaJ1.setBounds(91, 136, 105, 98);
	    layeredPane.add(lblVidaJ1,JLayeredPane.PALETTE_LAYER);
	    
	    lblNombreJ1 = new JLabel("");
	    lblNombreJ1.setForeground(Color.ORANGE);
	    lblNombreJ1.setFont(new Font("Tahoma", Font.BOLD, 35));
	    lblNombreJ1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNombreJ1.setBounds(206, 173, 234, 48);
	    layeredPane.add(lblNombreJ1,JLayeredPane.PALETTE_LAYER);
	    
	    lblVidaJ2 = new JLabel("100");
	    lblVidaJ2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblVidaJ2.setFont(new Font("Tahoma", Font.BOLD, 50));
	    lblVidaJ2.setBounds(1307, 136, 105, 98);
	    layeredPane.add(lblVidaJ2,JLayeredPane.PALETTE_LAYER);
	    
	    lblNombreJ2 = new JLabel("");
	    lblNombreJ2.setForeground(Color.ORANGE);
	    lblNombreJ2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNombreJ2.setFont(new Font("Tahoma", Font.BOLD, 35));
	    lblNombreJ2.setBounds(1063, 173, 234, 48);
	    layeredPane.add(lblNombreJ2,JLayeredPane.PALETTE_LAYER);
	    
	}
	private int escenarioAleatorio() {
		int nEscenario;
		nEscenario =(int)(1+Math.random()*15);
		return nEscenario;
	}
}
