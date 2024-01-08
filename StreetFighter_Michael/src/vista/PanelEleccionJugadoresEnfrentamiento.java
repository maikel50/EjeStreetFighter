package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEleccionJugadoresEnfrentamiento extends JPanel {
	
	public JPanel panel;
	public JButton btnJ1,btnJ2,btnJ3,btnJ4,btnJ5,btnJ6,btnJ7,btnJ8,btnJ9,btnJ10,btnJ11,btnJ12,btnJ13,btnJ14,btnJ15,btnSeleccionarJP1,btnSeleccionarJP2;
	public JButton btnStart;
	public JLabel lblJugadorJP1,lblJugadorJP2;
	public ArrayList<JButton> listaBotones = new ArrayList<JButton>();
	
	public PanelEleccionJugadoresEnfrentamiento() {
		setLayout(null);
		
		JLabel lblEtiqueta = new JLabel("SELECCION DE PERSONAJES");
		lblEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEtiqueta.setBounds(608, 26, 290, 54);
		add(lblEtiqueta);
		
		JLabel lblEtiquetaJP1 = new JLabel("JP1");
		lblEtiquetaJP1.setForeground(Color.RED);
		lblEtiquetaJP1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblEtiquetaJP1.setBounds(140, 119, 72, 37);
		add(lblEtiquetaJP1);
		
		JLabel lblEtiquetaJP2 = new JLabel("JP2");
		lblEtiquetaJP2.setForeground(Color.BLUE);
		lblEtiquetaJP2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblEtiquetaJP2.setBounds(1280, 119, 72, 37);
		add(lblEtiquetaJP2);
		
		panel = new JPanel();
		panel.setBounds(459, 175, 591, 386);
		add(panel);
		panel.setLayout(new GridLayout(3, 5, 3, 5));
		
		 btnJ1 = new JButton("BALROG");
		panel.add(btnJ1);
		
		 btnJ2 = new JButton("BLANKA");
		panel.add(btnJ2);
		
		 btnJ3 = new JButton("CAMMY");
		panel.add(btnJ3);
		
		 btnJ4 = new JButton("CHUN-LI");
		panel.add(btnJ4);
		
		 btnJ5 = new JButton("DEE JAY");
		panel.add(btnJ5);
		
		 btnJ6 = new JButton("DHALSIM");
		panel.add(btnJ6);
		
		 btnJ7 = new JButton("GUILE");
		panel.add(btnJ7);
		
		 btnJ8 = new JButton("HONDA");
		panel.add(btnJ8);
		
		 btnJ9 = new JButton("KEN");
		panel.add(btnJ9);
		
		 btnJ10 = new JButton("M.BISON");
		panel.add(btnJ10);
		
		 btnJ11 = new JButton("RYU");
		panel.add(btnJ11);
		
		 btnJ12 = new JButton("SAGAT");
		panel.add(btnJ12);
		
		 btnJ13 = new JButton("T.HAWK");
		panel.add(btnJ13);
		
		 btnJ14 = new JButton("VEGA");
		panel.add(btnJ14);
		
		 btnJ15 = new JButton("ZANGIEF");
		panel.add(btnJ15);
	    
	    añadirBotones();
	   
		lblJugadorJP1 = new JLabel("");
		lblJugadorJP1.setBounds(10, 176, 410, 422);
		add(lblJugadorJP1);
		
		lblJugadorJP2 = new JLabel("");
		lblJugadorJP2.setBounds(1105, 177, 410, 421);
		add(lblJugadorJP2);
		
		 btnSeleccionarJP1 = new JButton("SELECCIONAR JP1");
		btnSeleccionarJP1.setBackground(new Color(255, 0, 0));
		btnSeleccionarJP1.setForeground(Color.BLACK);
		btnSeleccionarJP1.setBounds(143, 658, 155, 37);
		add(btnSeleccionarJP1);
		
		 btnSeleccionarJP2 = new JButton("SELECCIONAR JP2");
		btnSeleccionarJP2.setForeground(Color.BLACK);
		btnSeleccionarJP2.setBackground(Color.CYAN);
		btnSeleccionarJP2.setBounds(1255, 658, 155, 37);
		add(btnSeleccionarJP2);
		
		btnStart = new JButton("START");
		btnStart.setBackground(Color.ORANGE);
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnStart.setForeground(Color.BLACK);
		btnStart.setBounds(591, 622, 320, 108);
		add(btnStart);
	}
	private void añadirBotones() {
		listaBotones.add(btnJ1);
		listaBotones.add(btnJ2);
		listaBotones.add(btnJ3);
		listaBotones.add(btnJ4);
		listaBotones.add(btnJ5);
		listaBotones.add(btnJ6);
		listaBotones.add(btnJ7);
		listaBotones.add(btnJ8);
		listaBotones.add(btnJ9);
		listaBotones.add(btnJ10);
		listaBotones.add(btnJ11);
		listaBotones.add(btnJ12);
		listaBotones.add(btnJ13);
		listaBotones.add(btnJ14);
		listaBotones.add(btnJ15);
		for(int i = 1; i <=15 ; i++) {
			 insertarImg(listaBotones.get(i - 1),"/img" + i + ".jpg");
		}
	}
	private void insertarImg(JButton btn, String ruta) {
		
	    ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/imagenes/imgSeleccionPersonajes/" + ruta));
	    Image imagen = imagenIcono.getImage();
	    btn.setIcon(new ImageIcon(imagen));
		
	}
}
