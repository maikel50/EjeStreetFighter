package controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ComboBoxEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import modelo.J1Seleccionado;
import modelo.J2Seleccionado;
import modelo.Jugador;
import vista.CombateEnfren;
import vista.PanelDescripcion;
import vista.PanelEleccionJugadoresEnfrentamiento;
import vista.vista;

public class Controlador implements ActionListener {
	//clases
	vista frame;
	PanelDescripcion frameDescripcion;
	PanelEleccionJugadoresEnfrentamiento frameEleccion;
	CombateEnfren combateEnfrentamiento;
	J2Seleccionado j2;
	J1Seleccionado j1;
	
	//
	String nombre;
	private Map<String, Jugador> datosJugadores;
	boolean primerClick = false,segundoClick = false,J1Seleccionado = false, J2Seleccionado = false;;
	String nombreJugador,nombreJugador2;
	int vidaJ1  , vidaJ2;
	int dañoJ1,dañoJ2;
	int potenciaJ1,potenciaJ2;
	int cansancioJ1,cansancioJ2;
	int velocidadJ1, velocidadJ2;
	int fisicoj1, fisicoj2;
	String vidaJP1,vidaJP2;
	int turno = 1;
	boolean atacar = false,defender = false, descansar = false;
	public Controlador(vista frame, PanelDescripcion frameDescripcion,PanelEleccionJugadoresEnfrentamiento frameEleccion,CombateEnfren combateEnfrentamiento) {
		this.frame=frame;
		this.frame.btnDescripcion.addActionListener(this);
		this.frame.btnEnfrentamienot.addActionListener(this);
		this.frame.btnHistoria.addActionListener(this);
		this.frame.btnInformacion.addActionListener(this);
		//FRAME DESCRIPCION
		this.frameDescripcion = frameDescripcion;
		this.frameDescripcion.btnAtras.addActionListener(this);
		this.frameDescripcion.btnMostrar.addActionListener(this);
		this.frameDescripcion.comboBox.addActionListener(this);
		rellenarDatosJugadores();
		//FRAME ELECCION JUGADORES
		this.frameEleccion=frameEleccion;
		for(JButton boton : frameEleccion.listaBotones) {
			boton.addActionListener(this);
		}
		this.frameEleccion.btnSeleccionarJP1.addActionListener(this);
		this.frameEleccion.btnSeleccionarJP2.addActionListener(this);
		this.frameEleccion.btnStart.addActionListener(this);
		//COMBATE ENFRENTAMIENTO
		this.combateEnfrentamiento=combateEnfrentamiento;
		this.combateEnfrentamiento.btnAtacar.addActionListener(this);
		this.combateEnfrentamiento.btnDefender.addActionListener(this);
		this.combateEnfrentamiento.btnDescansar.addActionListener(this);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Panel Descripcion
		if(e.getSource() == frame.btnDescripcion) {
			frame.setContentPane(frameDescripcion);
			frame.revalidate();
	        frame.repaint();
		}
		if(e.getSource() == frameDescripcion.comboBox) {
			nombre = (String) frameDescripcion.comboBox.getSelectedItem();
		}
		if(e.getSource() == frameDescripcion.btnMostrar) {
			mostrarInformacion(nombre,datosJugadores);
		}
		//FIN Panel Descripcion
		
		//Panel Enfrentamiento(eleccion personajes)
		if(e.getSource()== frame.btnEnfrentamienot) {
			frame.setContentPane(frameEleccion);
			frame.revalidate();
	        frame.repaint();
		}
		if(e.getSource() == frameEleccion.btnJ1) {
			
			if (!primerClick) {
				insertarImagenEnJLabel(frameEleccion.btnJ1, frameEleccion.lblJugadorJP1,"BALROG");
		        nombreJugador = frameEleccion.btnJ1.getText();
	            primerClick = true;
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        } 
			else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ1, frameEleccion.lblJugadorJP2,"BALROG");
	            nombreJugador2 = frameEleccion.btnJ1.getText();
	            segundoClick = true;
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		
		if(e.getSource() == frameEleccion.btnJ2) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ2, frameEleccion.lblJugadorJP1,"BLANKA");
	            nombreJugador = frameEleccion.btnJ2.getText();
	            primerClick = true;
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ2, frameEleccion.lblJugadorJP2,"BLANKA");
	            nombreJugador2 = frameEleccion.btnJ2.getText();
	            segundoClick = true;
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ3) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ3, frameEleccion.lblJugadorJP1,"CAMMY");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ3.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ3, frameEleccion.lblJugadorJP2,"CAMMY");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ3.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ4) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ4, frameEleccion.lblJugadorJP1,"CHUN-LI");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ4.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ4, frameEleccion.lblJugadorJP2,"CHUN-LI");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ4.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ5) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ5, frameEleccion.lblJugadorJP1,"DEE JAY");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ5.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ5, frameEleccion.lblJugadorJP2,"DEE JAY");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ5.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ6) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ6, frameEleccion.lblJugadorJP1,"DHALSIM");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ6.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ6, frameEleccion.lblJugadorJP2,"DHALSIM");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ6.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ7) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ7, frameEleccion.lblJugadorJP1,"GUILE");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ7.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ7, frameEleccion.lblJugadorJP2,"GUILE");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ7.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ8) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ8, frameEleccion.lblJugadorJP1,"HONDA");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ8.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ8, frameEleccion.lblJugadorJP2,"HONDA");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ8.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ9) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ9, frameEleccion.lblJugadorJP1,"KEN");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ9.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ9, frameEleccion.lblJugadorJP2,"KEN");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ9.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ10) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ10, frameEleccion.lblJugadorJP1,"M.BISON");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ10.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ10, frameEleccion.lblJugadorJP2,"M.BISON");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ10.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		
		if(e.getSource() == frameEleccion.btnJ11) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ11, frameEleccion.lblJugadorJP1,"RYU");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ11.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ11, frameEleccion.lblJugadorJP2,"RYU");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ11.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ12) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ12, frameEleccion.lblJugadorJP1,"SAGAT");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ12.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ12, frameEleccion.lblJugadorJP2,"SAGAT");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ12.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ13) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ13, frameEleccion.lblJugadorJP1,"T.HAWK");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ13.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ13, frameEleccion.lblJugadorJP2,"T.HAWK");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ13.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ14) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ14, frameEleccion.lblJugadorJP1,"VEGA");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ14.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ14, frameEleccion.lblJugadorJP2,"VEGA");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ14.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(e.getSource() == frameEleccion.btnJ15) {
			if (!primerClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ15, frameEleccion.lblJugadorJP1,"ZANGIEF");
	            primerClick = true;
	            nombreJugador = frameEleccion.btnJ15.getText();
	            if(!J2Seleccionado) {
	            	segundoClick = false;
	            }
	        }else if(!segundoClick) {
	            insertarImagenEnJLabel(frameEleccion.btnJ15, frameEleccion.lblJugadorJP2,"ZANGIEF");
	            segundoClick = true;
	            nombreJugador2 = frameEleccion.btnJ15.getText();
	            if(!J1Seleccionado) {
		            primerClick = false;
	            }
	        }
		}
		if(J1Seleccionado == true) {
			primerClick = true;
			//modificar
		}
		else if(J2Seleccionado== true) {
			segundoClick = true;
			//modificar
		}
		if(e.getSource() == frameEleccion.btnSeleccionarJP1) {
			 j1 = new J1Seleccionado(nombreJugador);
			System.out.println(nombreJugador);
			J1Seleccionado = true;
			this.combateEnfrentamiento.lblNombreJ1.setText(j1.getNombre());
			this.combateEnfrentamiento.labelJ1.setIcon((new ImageIcon(getClass().getResource("/imagenes/gifPersonajes/"+j1.getNombre()+".gif"))));
			 
		}
		if(e.getSource() == frameEleccion.btnSeleccionarJP2) {
			 j2 = new J2Seleccionado(nombreJugador2);
			System.out.println(nombreJugador2);
			J2Seleccionado = true;
			this.combateEnfrentamiento.lblNombreJ2.setText(j2.getNombre());
			this.combateEnfrentamiento.labelJ2.setIcon(new ImageIcon(getClass().getResource("/imagenes/gifPersonajes/"+j2.getNombre()+"2"+".gif")));
			if(datosJugadores.containsKey(j2.getNombre())) {
		    	System.out.println("Igual jugador 2");
		    	
		    }
		}
		if(J1Seleccionado && J2Seleccionado) {
			this.frameEleccion.btnStart.setVisible(true);
		}else {
			this.frameEleccion.btnStart.setVisible(false);
		}
		if(e.getSource() == frameEleccion.btnStart) {
			frame.setContentPane(combateEnfrentamiento);
			frame.revalidate();
	        frame.repaint();
	        combate();
		}
		//Combate Enfrentamiento
		if(e.getSource() == combateEnfrentamiento.btnAtacar) {
			this.combateEnfrentamiento.labelJ1.setIcon((new ImageIcon(getClass().getResource("/imagenes/gifAtaque/"+j1.getNombre()+".gif"))));
			
			 Timer timer = new Timer(2500, new ActionListener() {
			        @Override
			        public void actionPerformed(ActionEvent e) {
			            SwingUtilities.invokeLater(() -> {
			                combateEnfrentamiento.labelJ1.setIcon(new ImageIcon(getClass().getResource("/imagenes/gifPersonajes/" + j1.getNombre() + ".gif")));
			            });
			            ((Timer) e.getSource()).stop();
			        }
			    });

			    timer.start();
			   if(turno ==1) {
				   vidaJ2 = combateEnfrentamiento.vidaJ2.getValue();
			    	potenciaJ1 = datosJugadores.get(j1.getNombre()).getPotencia();
			    	dañoJ1 = (int)(Math.random()*potenciaJ1);
			    	vidaJ2 = datosJugadores.get(j2.getNombre()).restarVida(dañoJ1, vidaJ2);
			    	cansancioJ1 = combateEnfrentamiento.barraDescansoJ1.getValue();
			    	cansancioJ1 = datosJugadores.get(j1.getNombre()).restarDescanso(dañoJ1, cansancioJ1);
			    	combateEnfrentamiento.vidaJ2.setValue(vidaJ2);
			    	combateEnfrentamiento.barraDescansoJ1.setValue(cansancioJ1);
			    	vidaJP2 = String.valueOf(vidaJ2);
			    	combateEnfrentamiento.lblVidaJ2.setText(vidaJP2);
			    	atacar = true;
			   }
		}
		if(e.getSource() == combateEnfrentamiento.btnDefender) {
			defender = true;
			this.combateEnfrentamiento.labelJ1.setIcon((new ImageIcon(getClass().getResource("/imagenes/gifPersonajes/"+j1.getNombre()+".gif"))));
			cansancioJ1 = combateEnfrentamiento.barraDescansoJ1.getValue();
			velocidadJ1 = datosJugadores.get(j1.getNombre()).getVelocidad();
			dañoJ1 = (int)(Math.random()*velocidadJ1);
			cansancioJ1 = datosJugadores.get(j1.getNombre()).restarCansancio(dañoJ1,cansancioJ1);
			combateEnfrentamiento.barraDescansoJ1.setValue(cansancioJ1);
		}
		if(e.getSource() == combateEnfrentamiento.btnDescansar) {
			descansar = true;
			this.combateEnfrentamiento.labelJ1.setIcon((new ImageIcon(getClass().getResource("/imagenes/gifPersonajes/"+j1.getNombre()+".gif"))));
			cansancioJ1 = combateEnfrentamiento.barraDescansoJ1.getValue();
			fisicoj1 = (int)(Math.random() *datosJugadores.get(j1.getNombre()).getFisico());
			cansancioJ1 = datosJugadores.get(j1.getNombre()).sumarDescanso(fisicoj1,cansancioJ1);
			combateEnfrentamiento.barraDescansoJ1.setValue(cansancioJ1);
		}
		
	}
	public void combate() {
		int turno = 1;
		int aleatorioComputer;
		aleatorioComputer = 1;
		vidaJ1 = combateEnfrentamiento.vidaJ1.getValue();
		vidaJ2 = combateEnfrentamiento.vidaJ2.getValue();
		System.out.println(vidaJ1);
		System.out.println(vidaJ2);
		while(vidaJ1 >= 0 && vidaJ2 >= 0) {
			System.out.println("Entrado al while");
			if(!atacar) {
				if(turno == 1) {
					
					/*System.out.println("Entrado al if");
					vidaJ1 = combateEnfrentamiento.vidaJ1.getValue();
			    	potenciaJ2 = datosJugadores.get(j2.getNombre()).getPotencia();
			    	dañoJ2 = (int)(Math.random()*potenciaJ2);
			    	vidaJ1 = datosJugadores.get(j2.getNombre()).restarVida(dañoJ2, vidaJ1);
			    	cansancioJ2 = combateEnfrentamiento.barraDescansoJ2.getValue();
			    	cansancioJ2 = datosJugadores.get(j2.getNombre()).restarDescanso(dañoJ2, cansancioJ2);
			    	combateEnfrentamiento.vidaJ1.setValue(vidaJ1);
			    	combateEnfrentamiento.barraDescansoJ2.setValue(cansancioJ2);
			    	vidaJP2 = String.valueOf(vidaJ1);
			    	combateEnfrentamiento.lblVidaJ1.setText(vidaJP1);
			    	System.out.println(vidaJ1);
			    	System.out.println(vidaJ2);
			    	
			    	*/
				}
				
			}
		}
	}
	private void insertarImagenEnJLabel(JButton btnJ, JLabel lblJugadorJP, String nombre) {
		try {
			String ruta = "/imagenes/gifPersonajes/"+nombre+".gif";
			ImageIcon gif = new ImageIcon(getClass().getResource(ruta));
			lblJugadorJP.setIcon(gif);
			
		}catch(Exception e) {
			e.printStackTrace();	
		}
	}
	private void mostrarInformacion(String nombre, Map<String, Jugador> datosJugadores) {
		Jugador jugadorSeleccionado = datosJugadores.get(nombre);
		frameDescripcion.lblNombre.setText(jugadorSeleccionado.getNombre());
		frameDescripcion.lblEdad.setText("" + jugadorSeleccionado.getEdad());
		frameDescripcion.lblEstatura.setText(jugadorSeleccionado.getEstatura()+" m");
		frameDescripcion.lblPeso.setText(jugadorSeleccionado.getPeso() +" kg");
		frameDescripcion.lblPotencia.setText(""+jugadorSeleccionado.getPotencia());
		frameDescripcion.lblVelocidad.setText(""+jugadorSeleccionado.getVelocidad());
		frameDescripcion.lblFisica.setText(""+jugadorSeleccionado.getFisico());
		frameDescripcion.lblDescripcion.setText(jugadorSeleccionado.getDescripcion());
		insertarImagen(nombre);
		
	}
	private void insertarImagen(String nombre2) {
		 try {
		        String rutaImagen = "/imagenes/imgPersonajes/" + nombre2 + ".jpg";
		        ImageIcon imagenIcono = new ImageIcon(getClass().getResource(rutaImagen));
		        frameDescripcion.lblFoto.setIcon(imagenIcono);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	}
	private void rellenarDatosJugadores() {
		datosJugadores = new HashMap<>();
		datosJugadores.put("RYU", new Jugador("RYU", "JAPON", 26, 1.75, 85, 25, 32, 31, "Luchador entrenado por Gouken famoso por su potente Hadoken, golpe ganador con el que\r\n"
				+ "derrotó a Sagat en el primer torneo y lo hirió gravemente.\r\n"
				+ ""));
		datosJugadores.put("KEN", new Jugador("KEN", "EEUU", 25, 1.75, 86, 28, 30, 32, "Descendiente de una rica familia estadounidense, su padre pagó para formarle en kárate.\n" +
                "Discípulo de Gouken igual que Ryu pretende ser el mejor luchador del mundo, por encima de Ryu."));
		datosJugadores.put("GUILE", new Jugador("GUILE", "EEUU", 42, 1.85, 100, 34, 23, 33, "Ingresa al torneo para poner a M.Bison bajo custodia por ser el asesino de su mejor amigo Charlie,\r\n"
				+ "sólo la victoria sobre el mismo le hará enfrentarse a él y poder derrotarlo."));
		datosJugadores.put("CHUN-LI", new Jugador("CHUN-LI", "CHINA", 19, 1.65, 58, 18, 21, 51, "Artista marcial experta y oficial de la Interpol \n"
				+ ". Sin descanso, ella busca venganza por la muerte de su padre a manos del líder de la organización criminal Shadaloo, M.Bison."));
		datosJugadores.put("HONDA", new Jugador("HONDA", "JAPON", 40, 1.89, 170, 46, 26, 18, "Luchador de sumo profesional de Japón que entra al torneo para demostrar que el sumo es el\r\n"
				+ "mejor estilo de lucha del mundo por lo que retará a todo el que pretenda enfrentarse a él."));
		datosJugadores.put("DHALSIM", new Jugador("DHALSIM", "INDIA", 58, 1.76, 65, 24, 32, 34, "Pacifista pero entró a un torneo de lucha para recaudar dinero para su aldea empobrecida. Ha\r\n"
				+ "dedicado su vida a la meditación lo que le permite expulsar fuego por la boca y estirar su cuerpo."));
		datosJugadores.put("BLANKA", new Jugador("BLANKA", "BRASIL", 27, 1.84, 98, 22, 36, 32, "Hombre brasileño cuyo cuerpo ha sido infectado con demasiada clorofila proveniente de las selvas\r\n"
				+ "donde vive. Es famoso por su movimiento especial eléctrico y sus movimientos rodantes"));
		datosJugadores.put("VEGA", new Jugador("VEGA", "ESPAÑA", 24, 1.86, 80, 28, 34, 28, "Luchador español contratado por Shadoloo que utiliza un estilo de lucha muy particular en el que\r\n"
				+ "mezcla una rápida habilidad de esquiva parecida a la esgrima con una potente garra."));
		datosJugadores.put("ZANGIEF", new Jugador("ZANGIEF", "RUSIA", 44, 2.13, 160, 39, 36, 15, "Luchador ruso acostumbrado a entrenar con grandes osos. Es un luchador lento, pero si\r\n"
				+ "logra agarrarte, estás acabado. Ingresa al evento por motivos económicos."));
		datosJugadores.put("DEE JAY", new Jugador("DEE JAY", "JAMAICA", 31, 1.89, 87, 26, 25, 39, "Cantante que se interesó en un torneo de lucha como medio para ganar popularidad. Su fortaleza\r\n"
				+ "viene de un desastre en un concierto que le hizo ganar una onda expansiva en sus puños"));
		datosJugadores.put("T.HAWK", new Jugador("T.HAWK", "MEXICO", 39, 2.06, 112, 37, 31, 22, "Ingresa al torneo para vengar a sus compatriotas indios nativos, ya que Bison destruyó\r\n"
				+ "su asentamiento por el oro y la cantidad de riquezas que poseían."));
		datosJugadores.put("CAMMY", new Jugador("CAMMY", "REINO UNIDO", 26, 1.68, 65, 12, 33, 45, "Tiene algunos lazos misteriosos con M.Bison, es una especialista de las fuerzas especiales del\r\n"
				+ "ejército británico conocido como Delta Red.\r\n"));
		datosJugadores.put("BALROG", new Jugador("BALROG", "EEUU", 35, 1.98, 118, 55, 16, 17, "Ex boxeador profesional que trabaja bajo las órdenes de M.Bison en la organización criminal de\r\n"
				+ "Shadaloo. Lucha pura y exclusivamente con los puños"));
		datosJugadores.put("SAGAT", new Jugador("SAGAT", "TAILANDIA", 49, 2.25, 150, 35, 35, 20, "Integrante de Shadaloo, ingresa al torneo por venganza contra Ryu que años antes en una pelea le\r\n"
				+ "causó la cicatriz que tiene en el pecho."));
		datosJugadores.put("M.BISON", new Jugador("M.BISON", "DESCONOCIDA", 51, 2.10, 115, 37, 38, 25, "Líder de la organización criminal de Shadaloo. Es el organizador principal del torneo, aunque\r\n"
				+ "realmente es una tapadera, es un contrabandista de armas y drogas cegado por el poder."));
	}
}
