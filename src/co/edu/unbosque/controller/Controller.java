package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.ImageIcon;
import co.edu.unbosque.view.Ventana_general;
import co.edu.unbosque.view.Vista_ventana;
import co.edu.unbosque.model.Jugadores;

public class Controller implements ActionListener, MouseListener {

	private Ventana_general window;
	private Vista_ventana vista;
	private Jugadores participantes[];
	private int[] dado = { 1, 2, 3, 4, 5, 6 };
	private int numeroalatoreo;
	private int serpiente_6x6_alien, escaleras_6x6_alien, vueltas_for = 0;
	private int derecha6x6_alien = 0, izquierda6x6_alien = 5;
	private int serpiente_6x6_nave, escaleras_6x6_nave;
	private int vueltas_for_nave = 0, derecha6x6_nave = 0, izquierda6x6_nave = 5;
	private int serpiente_6x6_estrella, escaleras_6x6_estrella;
	private int vueltas_for_estrella = 0, derecha6x6_estrella = 0, izquierda6x6_estrella = 5;
	private int serpiente_6x6_planeta, escaleras_6x6_planeta;
	private int vueltas_for_planeta = 0, derecha6x6_planeta = 0, izquierda6x6_planeta = 5;
	private int salto_1 = 1;
	private int vueltas_for_9x9 = 0, derecha9x9_alien = 0, izquierda9x9_alien = 9, escaleras_9x9_alien,serpiente_9x9_alien;
	private int vueltas_for_12x12 = 0, derecha12x12_alien = 0, izquierda12x12_alien = 12, escaleras_12x12_alien,serpiente_12x12_alien;
	private String jugadores;
	private File ubicacion;
	private FileWriter escritor;
	private BufferedWriter escritor2;
	private PrintWriter escritor3;


	public Controller() {

		window = new Ventana_general();
		vista = new Vista_ventana();
		participantes = new Jugadores[4];
		asignarOyentes();

	}
	
	/**
	 * Para darle las funciones a cada boton
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/

	public void asignarOyentes() {

		window.getV_principal().getPo().getJugar().addActionListener(this);
		window.getV_principal().getPo().getJugar().addMouseListener(this);

		window.getV_principal().getPo().getTutorial().addActionListener(this);
		window.getV_principal().getPo().getTutorial().addMouseListener(this);

		window.getV_principal().getPo().getCreditos().addActionListener(this);
		window.getV_principal().getPo().getCreditos().addMouseListener(this);

		window.getV_principal().getPtab().getDificil().addActionListener(this);
		window.getV_principal().getPtab().getDificil().addMouseListener(this);
		window.getV_principal().getPtab().getInter().addActionListener(this);
		window.getV_principal().getPtab().getInter().addMouseListener(this);
		window.getV_principal().getPtab().getFacil().addActionListener(this);
		window.getV_principal().getPtab().getFacil().addMouseListener(this);

		window.getJuego1().getPp().getTirar_jug1().addActionListener(this);
		window.getJuego1().getPp().getTirar_jug2().addActionListener(this);
		window.getJuego1().getPp().getTirar_jug3().addActionListener(this);
		window.getJuego1().getPp().getTirar_jug4().addActionListener(this);

		window.getV_principal().getBack().addActionListener(this);
		window.getV_principal().getBack().addMouseListener(this);
		
		window.getV_principal().getBack2().addActionListener(this);
		window.getV_principal().getBack2().addMouseListener(this);
		
		
		window.getV_tuto().getBack().addActionListener(this);
		window.getV_tuto().getBack().addMouseListener(this);
		window.getV_tuto().getSig1().addActionListener(this);
		window.getV_tuto().getSig1().addMouseListener(this);
		window.getV_tuto().getSig2().addActionListener(this);
		window.getV_tuto().getSig2().addMouseListener(this);
		window.getV_tuto().getSig3().addActionListener(this);
		window.getV_tuto().getSig3().addMouseListener(this);
		window.getV_tuto().getSig4().addActionListener(this);
		window.getV_tuto().getSig4().addMouseListener(this);
		window.getV_tuto().getSig5().addActionListener(this);
		window.getV_tuto().getSig5().addMouseListener(this);
		window.getV_tuto().getSig6().addActionListener(this);
		window.getV_tuto().getSig6().addMouseListener(this);
		
		window.getV_principal().getPgan().getGuardar().addActionListener(this);
		window.getV_principal().getPgan().getSalir().addActionListener(this);
		window.getV_principal().getPgan().getOtraVez().addActionListener(this);

		window.getV_principal().getPjug().getNumJug().addActionListener(this);
		window.getV_principal().getPjug().getNumJug().setActionCommand("lista_jugadores");

		window.getV_principal().getPfic().getColorjug1().addActionListener(this);
		window.getV_principal().getPfic().getColorjug1().setActionCommand("color_jug1");
		window.getV_principal().getPfic().getColorjug2().addActionListener(this);
		window.getV_principal().getPfic().getColorjug2().setActionCommand("color_jug2");
		window.getV_principal().getPfic().getColorjug3().addActionListener(this);
		window.getV_principal().getPfic().getColorjug3().setActionCommand("color_jug3");
		window.getV_principal().getPfic().getColorjug4().addActionListener(this);
		window.getV_principal().getPfic().getColorjug4().setActionCommand("color_jug4");

		window.getV_principal().getPjug().getGuardar_nombres().addActionListener(this);
		window.getV_principal().getPjug().getGuardar_nombres().addMouseListener(this);

		window.getV_principal().getPfic().getGuardar_color().addActionListener(this);
		window.getV_principal().getPfic().getGuardar_color().addMouseListener(this);

		window.getJuego1().getSalir_menu().addActionListener(this);
		window.getJuego1().getNueva_partida().addActionListener(this);
		window.getJuego1().getSalir_menu().setActionCommand("salir_bar_menu");
		window.getJuego1().getNueva_partida().setActionCommand("nueva_partida");

	}
	
	/**
	 * Guardar los nombres de los textfield
	 * 
	 * @author  kevin, nicolas, daniela, katherine
	 * @param nombre_jugador1
	 * @return void
	 **/

	public void guardarnombre(String nombre_jugador1) {

		if (participantes[0] == null) {
			participantes[0] = new Jugadores(nombre_jugador1);
		} else if (participantes[1] == null) {
			participantes[1] = new Jugadores(nombre_jugador1);
		} else if (participantes[2] == null) {
			participantes[2] = new Jugadores(nombre_jugador1);
		} else if (participantes[3] == null) {
			participantes[3] = new Jugadores(nombre_jugador1);
		}

	}

	/**
	 * Eliminar los nombres del arreglo partipantes
	 * 
	 * @author kevin
	 * @param none
	 * @return void
	 **/
	
	public void eliminarnombres() {

		for (int i = 0; i < participantes.length; i++) {
			if (participantes[i] != null) {
				participantes[i] = null;

			}
		}
	}
	
	/**
	 * Comprobar si una de las cuatro fichas a llegado a la ultima casilla 6 x 6
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	public void comprobar_ganador() {
		if (vueltas_for >= 35) {
			vista.mostrarInformacion("Ganador el jugador que tiene la ficha alien");
			window.getJuego1().setVisible(false);
			window.getV_principal().setVisible(true);
			window.getV_principal().getPgan().getFicha_alien().setVisible(true);
			window.getV_principal().getPgan().setVisible(true);
			window.getV_principal().getBack().setVisible(false);
			window.getV_principal().getPtab().setVisible(false);
		}
		if (vueltas_for_planeta >= 35) {
			vista.mostrarInformacion("Ganador el jugador que tiene la ficha planeta");
			window.getJuego1().setVisible(false);
			window.getV_principal().setVisible(true);
			window.getV_principal().getPgan().getFicha_planeta().setVisible(true);
			window.getV_principal().getPtab().setVisible(false);
			window.getV_principal().getBack().setVisible(false);

			window.getV_principal().getPgan().setVisible(true);
		}
		if (vueltas_for_nave >= 35) {
			vista.mostrarInformacion("Ganador el jugador que tiene la ficha nave");
			window.getJuego1().setVisible(false);
			window.getV_principal().setVisible(true);
			window.getV_principal().getPgan().getFicha_nave().setVisible(true);
			window.getV_principal().getPtab().setVisible(false);
			window.getV_principal().getBack().setVisible(false);
			window.getV_principal().getPgan().setVisible(true);
		}
		if (vueltas_for_estrella >= 35) {
			vista.mostrarInformacion("Ganador el jugador que tiene la ficha estrella");
			window.getJuego1().setVisible(false);
			window.getV_principal().setVisible(true);
			window.getV_principal().getPgan().getFicha_estrella().setVisible(true);
			window.getV_principal().getPtab().setVisible(false);
			window.getV_principal().getBack().setVisible(false);
			window.getV_principal().getPgan().setVisible(true);
		}
		
		window.getJuego1().repaint();
	}
	/**
	 * Comprobar si una de las cuatro fichas a llegado a la ultima casilla 9 x 9
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	public void comprobar_ganador9x9() {
		if (vueltas_for_9x9 >= 80) {
			vista.mostrarInformacion("Ganador el jugador que tiene la ficha alien");
			window.getJuego1().setVisible(false);
			window.getV_principal().setVisible(true);
			window.getV_principal().getPgan().getFicha_alien().setVisible(true);
			window.getV_principal().getPgan().setVisible(true);
			window.getV_principal().getBack().setVisible(false);
			window.getV_principal().getPtab().setVisible(false);
		}
		
		
		window.getJuego1().repaint();
	}

	/**
	 * Comprobar si una de las cuatro fichas a llegado a la ultima casilla 9 x 9
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	
	public void guardar_partida_txt() {
		jugadores = (String) window.getV_principal().getPjug().getNumJug().getSelectedItem();
		try {
			ubicacion = new File("Partidas.txt");
			escritor = new FileWriter(ubicacion);
			escritor2 = new BufferedWriter(escritor);
			escritor3 = new PrintWriter(escritor2);

			if (jugadores.equals("1")) {

				escritor3.write("Jugador 1 " + participantes[0].getNombre() + "\n");
		
			}

			else if (jugadores.equals("2")) {
				escritor3.write("Jugador 1 " + participantes[0].getNombre() + "\n");
				escritor3.append("Jugador 2 " + participantes[1].getNombre() + "\n");
	
			}

			else if (jugadores.equals("3")) {
				escritor3.write("Jugador 1 " + participantes[0].getNombre() + "\n");
				escritor3.append("Jugador 2 " + participantes[1].getNombre() + "\n");
				escritor3.append("Jugador 3 " + participantes[2].getNombre() + "\n");
			
			}
			else if (jugadores.equals("4")) {
				escritor3.write("Jugador 1 " + participantes[0].getNombre() + "\n");
				escritor3.append("Jugador 2 " + participantes[1].getNombre() + "\n");
				escritor3.append("Jugador 3 " + participantes[2].getNombre() + "\n");
				escritor3.append("Jugador 4 " + participantes[3].getNombre() + "\n");
			}

			escritor3.close();
			escritor2.close();

		} catch (Exception e) {
			window.getMiconsola().imprimirString("Error" + e);
		}

	}

	/**
	 * Es la funcion de aleatorio del dado
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	
	public void dadotirar() {
		Random r = new Random();
		numeroalatoreo = dado[r.nextInt(6)];
//		numeroalatoreo = 1;

		String numerotext = String.valueOf(numeroalatoreo);
		window.getJuego1().getPp().getRandom().setText(numerotext);

	}

	/**
	 * Movimiento de la ficha alien en el tablero 9 x 9
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	
	public void movimiento_ficha_alien_9x9() {
		serpiente_9x9_alien += numeroalatoreo;
		escaleras_9x9_alien += numeroalatoreo;
		for (int i = 0; i < numeroalatoreo; i++) {
			vueltas_for_9x9++;

//			if (escaleras_9x9_alien == 3) {
//				vueltas_for_9x9 = 13;
//				serpiente_9x9_alien = 13;
//				escaleras_9x9_alien = 13;
//				izquierda9x9_alien = 5;
//				window.getJuego1().getTab9().getPaneles()[7][4].add(window.getJuego1().getTab9().getFicha_alien());
//				window.getJuego1().repaint();
//
//			}
//
//			if (escaleras_9x9_alien == 7) {
//				vueltas_for_9x9 = 26;
//				serpiente_9x9_alien = 26;
//				escaleras_9x9_alien = 26;
//				derecha9x9_alien = 7;
//				window.getJuego1().getTab9().getPaneles()[6][8].add(window.getJuego1().getTab9().getFicha_alien());
//				window.getJuego1().repaint();
//			}
//
//			if (escaleras_9x9_alien == 19) {
//				vueltas_for_9x9 = 38;
//				serpiente_9x9_alien = 38;
//				escaleras_9x9_alien = 38;
//				derecha9x9_alien = 1;
//				window.getJuego1().getTab9().getPaneles()[5][2].add(window.getJuego1().getTab9().getFicha_alien());
//				window.getJuego1().repaint();
//			}
//
//			if (escaleras_9x9_alien == 28) {
//				vueltas_for_9x9 = 48;
//				serpiente_9x9_alien = 48;
//				escaleras_9x9_alien = 48;
//				izquierda9x9_alien = 6;
//				window.getJuego1().getTab9().getPaneles()[3][5].add(window.getJuego1().getTab9().getFicha_alien());
//				window.getJuego1().repaint();
//			}
//
//			if (escaleras_9x9_alien == 32) {
//				vueltas_for_9x9 = 50;
//				serpiente_9x9_alien = 50;
//				escaleras_9x9_alien = 50;
//				izquierda9x9_alien = 4;
//				window.getJuego1().getTab9().getPaneles()[3][4].add(window.getJuego1().getTab9().getFicha_alien());
//				window.getJuego1().repaint();
//			}
//
//			if (escaleras_9x9_alien == 57) {
//				vueltas_for_9x9 = 74;
//				serpiente_9x9_alien = 74;
//				escaleras_9x9_alien = 74;
//				derecha9x9_alien = 1;
//				window.getJuego1().getTab9().getPaneles()[2][2].add(window.getJuego1().getTab9().getFicha_alien());
//				window.getJuego1().repaint();
//			}
//			if (escaleras_9x9_alien == 44) {
//				vueltas_for_9x9 = 62;
//				serpiente_9x9_alien = 62;
//				escaleras_9x9_alien = 62;
//				derecha9x9_alien = 7;
//				window.getJuego1().getTab9().getPaneles()[2][8].add(window.getJuego1().getTab9().getFicha_alien());
//				window.getJuego1().repaint();
//			}
//
//			if (escaleras_9x9_alien == 64) {
//				vueltas_for_9x9 = 78;
//				serpiente_9x9_alien = 78;
//				escaleras_9x9_alien = 78;
//				derecha9x9_alien = 5;
//				window.getJuego1().getTab9().getPaneles()[0][5].add(window.getJuego1().getTab9().getFicha_alien());
//				window.getJuego1().repaint();
//			}

			if (vueltas_for_9x9 >= 1 && vueltas_for_9x9 <= 9) {
				if (vueltas_for_9x9 == 1) {
					derecha9x9_alien = 0;
				}
				salto_1 = derecha9x9_alien + 1;

				try {

					window.getJuego1().getTab9().getPaneles()[8][salto_1]
							.add(window.getJuego1().getTab9().getFicha_alien());
				} catch (Exception e) {

					window.getJuego1().getTab9().getPaneles()[7][8].add(window.getJuego1().getTab9().getFicha_alien());
				}
				derecha9x9_alien = salto_1;
			}
			if (vueltas_for_9x9 >= 10 && vueltas_for_9x9 <= 18) {
				if (vueltas_for_9x9 == 10) {
					izquierda9x9_alien = 8;
				}
				try {
					salto_1 = izquierda9x9_alien - 1;
					window.getJuego1().getTab9().getPaneles()[7][salto_1]
							.add(window.getJuego1().getTab9().getFicha_alien());
					izquierda9x9_alien = salto_1;
				} catch (Exception e) {

					window.getJuego1().getTab9().getPaneles()[6][0].add(window.getJuego1().getTab9().getFicha_alien());
				}
			}
			if (vueltas_for_9x9 >= 19 && vueltas_for_9x9 <= 27) {
				if (vueltas_for_9x9 == 19) {
					derecha9x9_alien = 0;
				}

				try {
					salto_1 = derecha9x9_alien + 1;
					window.getJuego1().getTab9().getPaneles()[6][salto_1]
							.add(window.getJuego1().getTab9().getFicha_alien());
					derecha9x9_alien = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab9().getPaneles()[5][8].add(window.getJuego1().getTab9().getFicha_alien());
				}
			}
			if (vueltas_for_9x9 >= 28 && vueltas_for_9x9 <= 36) {
				if (vueltas_for_9x9 == 28) {
					izquierda9x9_alien = 8;
				}

				try {
					salto_1 = izquierda9x9_alien - 1;
					window.getJuego1().getTab9().getPaneles()[5][salto_1]
							.add(window.getJuego1().getTab9().getFicha_alien());
					izquierda9x9_alien = salto_1;

				} catch (Exception e) {

					window.getJuego1().getTab9().getPaneles()[4][0].add(window.getJuego1().getTab9().getFicha_alien());
				}
			}
			if (vueltas_for_9x9 >= 37 && vueltas_for_9x9 <= 45) {
				if (vueltas_for_9x9 == 37) {
					derecha9x9_alien = 0;
				}

				try {
					salto_1 = derecha9x9_alien + 1;
					window.getJuego1().getTab9().getPaneles()[4][salto_1]
							.add(window.getJuego1().getTab9().getFicha_alien());
					derecha9x9_alien = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab9().getPaneles()[3][8].add(window.getJuego1().getTab9().getFicha_alien());
				}
			}
			if (vueltas_for_9x9 >= 46 && vueltas_for_9x9 <= 54) {
				if (vueltas_for_9x9 == 46) {
					izquierda9x9_alien = 8;
				}

				try {
					salto_1 = izquierda9x9_alien - 1;
					window.getJuego1().getTab9().getPaneles()[3][salto_1]
							.add(window.getJuego1().getTab9().getFicha_alien());
					izquierda9x9_alien = salto_1;

				} catch (Exception e) {

					window.getJuego1().getTab9().getPaneles()[2][0].add(window.getJuego1().getTab9().getFicha_alien());
				}
			}
			if (vueltas_for_9x9 >= 55 && vueltas_for_9x9 <= 63) {
				if (vueltas_for_9x9 == 55) {
					derecha9x9_alien = 0;
				}

				try {
					salto_1 = derecha9x9_alien + 1;
					window.getJuego1().getTab9().getPaneles()[2][salto_1]
							.add(window.getJuego1().getTab9().getFicha_alien());
					derecha9x9_alien = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab9().getPaneles()[1][8].add(window.getJuego1().getTab9().getFicha_alien());
				}
			}
			if (vueltas_for_9x9 >= 64 && vueltas_for_9x9 <= 72) {
				if (vueltas_for_9x9 == 64) {
					izquierda9x9_alien = 8;
				}

				try {
					salto_1 = izquierda9x9_alien - 1;
					window.getJuego1().getTab9().getPaneles()[1][salto_1]
							.add(window.getJuego1().getTab9().getFicha_alien());
					izquierda9x9_alien = salto_1;

				} catch (Exception e) {

					window.getJuego1().getTab9().getPaneles()[0][0].add(window.getJuego1().getTab9().getFicha_alien());
				}
			}

			if (vueltas_for_9x9 >= 73 && vueltas_for_9x9 <= 80) {
				if (vueltas_for_9x9 == 73) {
					derecha9x9_alien = 0;

				}

				try {

					salto_1 = derecha9x9_alien + 1;
					window.getJuego1().getTab9().getPaneles()[0][salto_1]
							.add(window.getJuego1().getTab9().getFicha_alien());
					derecha9x9_alien = salto_1;

				} catch (Exception e) {

				}
			}
			if (vueltas_for_9x9 == 80) {
				window.getMiconsola().imprimirString("GANADOR");
				break;
			}
		}
		window.getJuego1().repaint();
	}

	/**
	 * Movimiento de la ficha alien en el tablero 12 x 12
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	
	public void movimiento_ficha_alien_12x12() {
		
		for (int i = 0; i < numeroalatoreo; i++) {
			vueltas_for_12x12++;
		if(vueltas_for_12x12 >= 1 && vueltas_for_12x12 <= 12) {
			if (vueltas_for_12x12 == 1) {
				derecha12x12_alien = 0;
			}
			salto_1 = derecha12x12_alien + 1;

			try {

				window.getJuego1().getTab12().getPaneles()[11][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
			} catch (Exception e) {

				window.getJuego1().getTab12().getPaneles()[10][11].add(window.getJuego1().getTab12().getFicha_alien());
			}
			derecha12x12_alien = salto_1;
		}
		if (vueltas_for_12x12 >= 13 && vueltas_for_12x12 <= 24) {
			if (vueltas_for_12x12 == 13) {
				izquierda12x12_alien = 11;
			}
			try {
				salto_1 = izquierda12x12_alien - 1;
				window.getJuego1().getTab12().getPaneles()[10][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				izquierda12x12_alien = salto_1;
			} catch (Exception e) {

				window.getJuego1().getTab12().getPaneles()[9][0].add(window.getJuego1().getTab12().getFicha_alien());
			}
		}
		if (vueltas_for_12x12 >= 25 && vueltas_for_12x12 <= 36) {
			if (vueltas_for_12x12 == 25) {
				derecha12x12_alien = 0;
			}

			try {
				salto_1 = derecha12x12_alien + 1;
				window.getJuego1().getTab12().getPaneles()[9][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				derecha12x12_alien = salto_1;

			} catch (Exception e) {
				window.getJuego1().getTab12().getPaneles()[8][11].add(window.getJuego1().getTab12().getFicha_alien());
			}
		}
		if (vueltas_for_12x12 >= 37 && vueltas_for_12x12 <= 48) {
			if (vueltas_for_12x12 == 37) {
				izquierda12x12_alien = 11;
			}

			try {
				salto_1 = izquierda12x12_alien - 1;
				window.getJuego1().getTab12().getPaneles()[8][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				izquierda12x12_alien = salto_1;

			} catch (Exception e) {
				window.getJuego1().getTab12().getPaneles()[7][0].add(window.getJuego1().getTab12().getFicha_alien());
			}
		}
		if (vueltas_for_12x12 >= 49 && vueltas_for_12x12 <= 60) {
			if (vueltas_for_12x12 == 49) {
				derecha12x12_alien = 0;
			}

			try {
				salto_1 = derecha12x12_alien + 1;
				window.getJuego1().getTab12().getPaneles()[7][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				derecha12x12_alien = salto_1;

			} catch (Exception e) {

				window.getJuego1().getTab12().getPaneles()[6][11].add(window.getJuego1().getTab12().getFicha_alien());
			}
		}
		if (vueltas_for_12x12 >= 61 && vueltas_for_12x12 <= 72) {
			if (vueltas_for_12x12 == 61) {
				izquierda12x12_alien = 11;
			}

			try {
				salto_1 = izquierda12x12_alien - 1;
				window.getJuego1().getTab12().getPaneles()[6][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				izquierda12x12_alien = salto_1;

			} catch (Exception e) {
				window.getJuego1().getTab12().getPaneles()[5][0].add(window.getJuego1().getTab12().getFicha_alien());
			}
		}
		if (vueltas_for_12x12 >= 73 && vueltas_for_12x12 <= 84) {
			if (vueltas_for_12x12 == 73) {
				derecha12x12_alien = 0;
			}

			try {
				salto_1 = derecha12x12_alien + 1;
				window.getJuego1().getTab12().getPaneles()[5][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				derecha12x12_alien = salto_1;

			} catch (Exception e) {

				window.getJuego1().getTab12().getPaneles()[4][11].add(window.getJuego1().getTab12().getFicha_alien());
			}
		}
		if (vueltas_for_12x12 >= 85 && vueltas_for_12x12 <= 96) {
			if (vueltas_for_12x12 == 85) {
				izquierda12x12_alien = 11;

			}

			try {

				salto_1 = izquierda12x12_alien - 1;
				window.getJuego1().getTab12().getPaneles()[4][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				izquierda12x12_alien = salto_1;

			} catch (Exception e) {
				window.getJuego1().getTab12().getPaneles()[3][0].add(window.getJuego1().getTab12().getFicha_alien());
			}
		}
		if (vueltas_for_12x12 >= 97 && vueltas_for_12x12 <= 108) {
			if (vueltas_for_12x12 == 97) {
				derecha12x12_alien = 0;

			}

			try {

				salto_1 = derecha12x12_alien + 1;
				window.getJuego1().getTab12().getPaneles()[3][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				derecha12x12_alien = salto_1;

			} catch (Exception e) {
				window.getJuego1().getTab12().getPaneles()[2][11].add(window.getJuego1().getTab12().getFicha_alien());
			}
		}
		if (vueltas_for_12x12 >= 109 && vueltas_for_12x12 <= 120) {
			if (vueltas_for_12x12 == 109) {
				izquierda12x12_alien = 11;
			}
			try {

				salto_1 = izquierda12x12_alien - 1;
				window.getJuego1().getTab12().getPaneles()[2][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				izquierda12x12_alien = salto_1;

			} catch (Exception e) {
				window.getJuego1().getTab12().getPaneles()[1][0].add(window.getJuego1().getTab12().getFicha_alien());
			}
		}
		if (vueltas_for_12x12 >= 121 && vueltas_for_12x12 <= 132) {
			if (vueltas_for_12x12 == 121) {
				derecha12x12_alien = 0;
			}
			try {
				salto_1 = derecha12x12_alien + 1;
				window.getJuego1().getTab12().getPaneles()[1][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				derecha12x12_alien = salto_1;
			} catch (Exception e) {
				window.getJuego1().getTab12().getPaneles()[0][11].add(window.getJuego1().getTab12().getFicha_alien());
			}
		}
		if (vueltas_for_12x12 >= 133 && vueltas_for_12x12 <= 144) {
			if (vueltas_for_12x12 == 133) {
				izquierda12x12_alien = 11;
			}
			try {

				salto_1 = izquierda12x12_alien - 1;
				window.getJuego1().getTab12().getPaneles()[0][salto_1]
						.add(window.getJuego1().getTab12().getFicha_alien());
				izquierda12x12_alien = salto_1;

			} catch (Exception e) {
				
			}
			if (vueltas_for_9x9 == 80) {
				window.getMiconsola().imprimirString("GANADOR");
				break;
			}
		}
		window.getJuego1().repaint();
		}
	}

	/**
	 * Movimiento de la ficha alien en el tablero 12 x 12
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/

	public void movimiento_ficha_alien_6x6() {
		serpiente_6x6_alien += numeroalatoreo;
		escaleras_6x6_alien += numeroalatoreo;
		for (int i = 0; i < numeroalatoreo; i++) {
			vueltas_for++;

			if (escaleras_6x6_alien == 1) {

				vueltas_for = 14;
				serpiente_6x6_alien = 14;
				escaleras_6x6_alien = 14;
				derecha6x6_alien = 1;
				window.getJuego1().getTab6().getPaneles()[3][2].add(window.getJuego1().getTab6().getFicha_alien());
				window.getJuego1().repaint();

				break;
			} else if (escaleras_6x6_alien == 17) {
				vueltas_for = 28;
				serpiente_6x6_alien = 28;
				escaleras_6x6_alien = 28;
				derecha6x6_alien = 4;
				window.getJuego1().getTab6().getPaneles()[1][4].add(window.getJuego1().getTab6().getFicha_alien());
				window.getJuego1().repaint();
				break;
			} else if (escaleras_6x6_alien == 12) {

				vueltas_for = 22;
				serpiente_6x6_alien = 22;
				escaleras_6x6_alien = 22;
				izquierda6x6_alien = 2;
				window.getJuego1().getTab6().getPaneles()[2][1].add(window.getJuego1().getTab6().getFicha_alien());
				window.getJuego1().repaint();
			} else if (escaleras_6x6_alien == 26) {

				vueltas_for = 32;
				serpiente_6x6_alien = 32;
				escaleras_6x6_alien = 32;
				izquierda6x6_alien = 4;
				window.getJuego1().getTab6().getPaneles()[0][3].add(window.getJuego1().getTab6().getFicha_alien());
				window.getJuego1().repaint();

			}

			if (serpiente_6x6_alien == 15) {

				vueltas_for = 4;
				serpiente_6x6_alien = 4;
				escaleras_6x6_alien = 4;
				derecha6x6_alien = 4;
				window.getJuego1().getTab6().getPaneles()[5][4].add(window.getJuego1().getTab6().getFicha_alien());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_alien == 34) {

				vueltas_for = 23;
				serpiente_6x6_alien = 23;
				escaleras_6x6_alien = 23;
				izquierda6x6_alien = 0;
				window.getJuego1().getTab6().getPaneles()[2][0].add(window.getJuego1().getTab6().getFicha_alien());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_alien == 27) {

				vueltas_for = 19;
				serpiente_6x6_alien = 19;
				escaleras_6x6_alien = 19;
				izquierda6x6_alien = 4;
				window.getJuego1().getTab6().getPaneles()[2][4].add(window.getJuego1().getTab6().getFicha_alien());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_alien == 31) {

				vueltas_for = 29;
				serpiente_6x6_alien = 29;
				escaleras_6x6_alien = 29;
				derecha6x6_alien = 5;
				window.getJuego1().getTab6().getPaneles()[1][5].add(window.getJuego1().getTab6().getFicha_alien());
				window.getJuego1().repaint();
				break;
			}

			if (vueltas_for >= 1 && vueltas_for <= 6) {

				salto_1 = derecha6x6_alien + 1;

				try {

					window.getJuego1().getTab6().getPaneles()[5][salto_1]
							.add(window.getJuego1().getTab6().getFicha_alien());
				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[4][5].add(window.getJuego1().getTab6().getFicha_alien());
				}
				derecha6x6_alien = salto_1;
			}
			
			if (vueltas_for >= 7 && vueltas_for <= 12) {
				if (vueltas_for == 7) {
					izquierda6x6_alien = 5;
				}
				try {
					salto_1 = izquierda6x6_alien - 1;
					window.getJuego1().getTab6().getPaneles()[4][salto_1]
							.add(window.getJuego1().getTab6().getFicha_alien());
					izquierda6x6_alien = salto_1;
				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[3][0].add(window.getJuego1().getTab6().getFicha_alien());
				}
				
			}
			if (vueltas_for >= 13 && vueltas_for <= 18) {
				if (vueltas_for == 13) {
					derecha6x6_alien = 0;
				}

				try {
					salto_1 = derecha6x6_alien + 1;
					window.getJuego1().getTab6().getPaneles()[3][salto_1]
							.add(window.getJuego1().getTab6().getFicha_alien());
					derecha6x6_alien = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab6().getPaneles()[2][5].add(window.getJuego1().getTab6().getFicha_alien());
				}
			}
			if (vueltas_for >= 19 && vueltas_for <= 24) {
				if (vueltas_for == 19) {
					izquierda6x6_alien = 5;
				}

				try {

					salto_1 = izquierda6x6_alien - 1;
					window.getJuego1().getTab6().getPaneles()[2][salto_1]
							.add(window.getJuego1().getTab6().getFicha_alien());
					izquierda6x6_alien = salto_1;

				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[1][0].add(window.getJuego1().getTab6().getFicha_alien());
				}
			}
			if (vueltas_for >= 25 && vueltas_for <= 30) {
				if (vueltas_for == 25) {
					derecha6x6_alien = 0;
				}

				try {
					salto_1 = derecha6x6_alien + 1;
					window.getJuego1().getTab6().getPaneles()[1][salto_1]
							.add(window.getJuego1().getTab6().getFicha_alien());
					derecha6x6_alien = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab6().getPaneles()[0][5].add(window.getJuego1().getTab6().getFicha_alien());
				}
			}
			if (vueltas_for >= 31 && vueltas_for <= 35) {
				if (vueltas_for == 31) {
					izquierda6x6_alien = 5;
				}

				salto_1 = izquierda6x6_alien - 1;
				window.getJuego1().getTab6().getPaneles()[0][salto_1]
						.add(window.getJuego1().getTab6().getFicha_alien());
				izquierda6x6_alien = salto_1;

			}
			if (vueltas_for >= 35) {

				break;
			}

			window.getJuego1().repaint();
		}
	}

	/**
	 * Movimiento de la ficha nave en el tablero 6 x 6
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	
	public void movimiento_ficha_nave_6x6() {
		serpiente_6x6_nave += numeroalatoreo;
		escaleras_6x6_nave += numeroalatoreo;
		for (int i = 0; i < numeroalatoreo; i++) {
			vueltas_for_nave++;

			if (escaleras_6x6_nave == 1) {
				vueltas_for_nave = 14;
				serpiente_6x6_nave = 14;
				escaleras_6x6_nave = 14;
				derecha6x6_nave = 1;
				window.getJuego1().getTab6().getPaneles()[3][2].add(window.getJuego1().getTab6().getFicha_nave());
				window.getJuego1().repaint();

			} else if (escaleras_6x6_nave == 17) {

				vueltas_for_nave = 28;
				serpiente_6x6_nave = 28;
				escaleras_6x6_nave = 28;
				derecha6x6_nave = 4;
				window.getJuego1().getTab6().getPaneles()[1][4].add(window.getJuego1().getTab6().getFicha_nave());
				window.getJuego1().repaint();

			} else if (escaleras_6x6_nave == 12) {

				vueltas_for_nave = 22;
				serpiente_6x6_nave = 22;
				escaleras_6x6_nave = 22;
				izquierda6x6_nave = 2;
				window.getJuego1().getTab6().getPaneles()[2][1].add(window.getJuego1().getTab6().getFicha_nave());
				window.getJuego1().repaint();
			} else if (escaleras_6x6_nave == 26) {

				vueltas_for_nave = 32;
				serpiente_6x6_nave = 32;
				escaleras_6x6_nave = 32;
				izquierda6x6_nave = 4;
				window.getJuego1().getTab6().getPaneles()[0][3].add(window.getJuego1().getTab6().getFicha_nave());
				window.getJuego1().repaint();

			}

			if (serpiente_6x6_nave == 15) {

				vueltas_for_nave = 4;
				serpiente_6x6_nave = 4;
				escaleras_6x6_nave = 4;
				derecha6x6_nave = 4;
				window.getJuego1().getTab6().getPaneles()[5][4].add(window.getJuego1().getTab6().getFicha_nave());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_nave == 34) {

				vueltas_for_nave = 23;
				serpiente_6x6_nave = 23;
				escaleras_6x6_nave = 23;
				izquierda6x6_nave = 0;
				window.getJuego1().getTab6().getPaneles()[2][0].add(window.getJuego1().getTab6().getFicha_nave());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_nave == 27) {

				vueltas_for_nave = 19;
				serpiente_6x6_nave = 19;
				escaleras_6x6_nave = 19;
				izquierda6x6_nave = 4;
				window.getJuego1().getTab6().getPaneles()[2][4].add(window.getJuego1().getTab6().getFicha_nave());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_nave == 31) {

				vueltas_for_nave = 29;
				serpiente_6x6_nave = 29;
				escaleras_6x6_nave = 29;
				derecha6x6_nave = 5;
				window.getJuego1().getTab6().getPaneles()[1][5].add(window.getJuego1().getTab6().getFicha_nave());
				window.getJuego1().repaint();
				break;
			}

			if (vueltas_for_nave >= 1 && vueltas_for_nave <= 6) {

				salto_1 = derecha6x6_nave + 1;

				try {

					window.getJuego1().getTab6().getPaneles()[5][salto_1]
							.add(window.getJuego1().getTab6().getFicha_nave());
				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[4][5].add(window.getJuego1().getTab6().getFicha_nave());
				}
				derecha6x6_nave = salto_1;
			}
			if (vueltas_for_nave >= 7 && vueltas_for_nave <= 12) {
				if (vueltas_for_nave == 7) {
					izquierda6x6_nave = 5;
				}
				try {
					salto_1 = izquierda6x6_nave - 1;
					window.getJuego1().getTab6().getPaneles()[4][salto_1]
							.add(window.getJuego1().getTab6().getFicha_nave());
					izquierda6x6_nave = salto_1;
				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[3][0].add(window.getJuego1().getTab6().getFicha_nave());
				}
			}
			if (vueltas_for_nave >= 13 && vueltas_for_nave <= 18) {
				if (vueltas_for_nave == 13) {
					derecha6x6_nave = 0;
				}

				try {
					salto_1 = derecha6x6_nave + 1;
					window.getJuego1().getTab6().getPaneles()[3][salto_1]
							.add(window.getJuego1().getTab6().getFicha_nave());
					derecha6x6_nave = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab6().getPaneles()[2][5].add(window.getJuego1().getTab6().getFicha_nave());
				}
			}
			if (vueltas_for_nave >= 19 && vueltas_for_nave <= 24) {
				if (vueltas_for_nave == 19) {
					izquierda6x6_nave = 5;
				}

				try {

					salto_1 = izquierda6x6_nave - 1;
					window.getJuego1().getTab6().getPaneles()[2][salto_1]
							.add(window.getJuego1().getTab6().getFicha_nave());
					izquierda6x6_nave = salto_1;

				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[1][0].add(window.getJuego1().getTab6().getFicha_nave());
				}
			}
			if (vueltas_for_nave >= 25 && vueltas_for_nave <= 30) {
				if (vueltas_for_nave == 25) {
					derecha6x6_nave = 0;
				}

				try {
					salto_1 = derecha6x6_nave + 1;
					window.getJuego1().getTab6().getPaneles()[1][salto_1]
							.add(window.getJuego1().getTab6().getFicha_nave());
					derecha6x6_nave = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab6().getPaneles()[0][5].add(window.getJuego1().getTab6().getFicha_nave());
				}
			}
			if (vueltas_for_nave >= 31 && vueltas_for_nave <= 35) {
				if (vueltas_for_nave == 31) {
					izquierda6x6_nave = 5;
				}

				salto_1 = izquierda6x6_nave - 1;
				window.getJuego1().getTab6().getPaneles()[0][salto_1].add(window.getJuego1().getTab6().getFicha_nave());
				izquierda6x6_nave = salto_1;

			}
			if (vueltas_for_nave >= 35) {

				break;
			}

			window.getJuego1().repaint();
		}
	}

	/**
	 * Movimiento de la ficha estrella en el tablero 6 x 6
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	
	public void movimiento_ficha_estrella_6x6() {
		serpiente_6x6_estrella += numeroalatoreo;
		escaleras_6x6_estrella += numeroalatoreo;
		for (int i = 0; i < numeroalatoreo; i++) {
			vueltas_for_estrella++;

			if (escaleras_6x6_estrella == 1) {
				vueltas_for_estrella = 14;
				serpiente_6x6_estrella = 14;
				escaleras_6x6_estrella = 14;
				derecha6x6_estrella = 1;
				window.getJuego1().getTab6().getPaneles()[3][2].add(window.getJuego1().getTab6().getFicha_estrella());
				window.getJuego1().repaint();

			} else if (escaleras_6x6_estrella == 17) {

				vueltas_for_estrella = 28;
				serpiente_6x6_estrella = 28;
				escaleras_6x6_estrella = 28;
				derecha6x6_estrella = 4;
				window.getJuego1().getTab6().getPaneles()[1][4].add(window.getJuego1().getTab6().getFicha_estrella());
				window.getJuego1().repaint();

			} else if (escaleras_6x6_estrella == 12) {

				vueltas_for_estrella = 22;
				serpiente_6x6_estrella = 22;
				escaleras_6x6_estrella = 22;
				izquierda6x6_estrella = 2;
				window.getJuego1().getTab6().getPaneles()[2][1].add(window.getJuego1().getTab6().getFicha_estrella());
				window.getJuego1().repaint();
			} else if (escaleras_6x6_estrella == 26) {

				vueltas_for_estrella = 32;
				serpiente_6x6_estrella = 32;
				escaleras_6x6_estrella = 32;
				izquierda6x6_estrella = 4;
				window.getJuego1().getTab6().getPaneles()[0][3].add(window.getJuego1().getTab6().getFicha_estrella());
				window.getJuego1().repaint();

			}

			if (serpiente_6x6_estrella == 15) {

				vueltas_for_estrella = 4;
				serpiente_6x6_estrella = 4;
				escaleras_6x6_estrella = 4;
				derecha6x6_estrella = 4;
				window.getJuego1().getTab6().getPaneles()[5][4].add(window.getJuego1().getTab6().getFicha_estrella());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_estrella == 34) {

				vueltas_for_estrella = 23;
				serpiente_6x6_estrella = 23;
				escaleras_6x6_estrella = 23;
				izquierda6x6_estrella = 0;
				window.getJuego1().getTab6().getPaneles()[2][0].add(window.getJuego1().getTab6().getFicha_estrella());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_estrella == 27) {

				vueltas_for_estrella = 19;
				serpiente_6x6_estrella = 19;
				escaleras_6x6_estrella = 19;
				izquierda6x6_estrella = 4;
				window.getJuego1().getTab6().getPaneles()[2][4].add(window.getJuego1().getTab6().getFicha_estrella());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_estrella == 31) {

				vueltas_for_estrella = 29;
				serpiente_6x6_estrella = 29;
				escaleras_6x6_estrella = 29;
				derecha6x6_estrella = 5;
				window.getJuego1().getTab6().getPaneles()[1][5].add(window.getJuego1().getTab6().getFicha_estrella());
				window.getJuego1().repaint();
				break;
			}

			if (vueltas_for_estrella >= 1 && vueltas_for_estrella <= 6) {

				salto_1 = derecha6x6_estrella + 1;

				try {

					window.getJuego1().getTab6().getPaneles()[5][salto_1]
							.add(window.getJuego1().getTab6().getFicha_estrella());
				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[4][5]
							.add(window.getJuego1().getTab6().getFicha_estrella());
				}
				derecha6x6_estrella = salto_1;
			}
			if (vueltas_for_estrella >= 7 && vueltas_for_estrella <= 12) {
				if (vueltas_for_estrella == 7) {
					izquierda6x6_estrella = 5;
				}
				try {
					salto_1 = izquierda6x6_estrella - 1;
					window.getJuego1().getTab6().getPaneles()[4][salto_1]
							.add(window.getJuego1().getTab6().getFicha_estrella());
					izquierda6x6_estrella = salto_1;
				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[3][0]
							.add(window.getJuego1().getTab6().getFicha_estrella());
				}
			}
			if (vueltas_for_estrella >= 13 && vueltas_for_estrella <= 18) {
				if (vueltas_for_estrella == 13) {
					derecha6x6_estrella = 0;
				}

				try {
					salto_1 = derecha6x6_estrella + 1;
					window.getJuego1().getTab6().getPaneles()[3][salto_1]
							.add(window.getJuego1().getTab6().getFicha_estrella());
					derecha6x6_estrella = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab6().getPaneles()[2][5]
							.add(window.getJuego1().getTab6().getFicha_estrella());
				}
			}
			if (vueltas_for_estrella >= 19 && vueltas_for_estrella <= 24) {
				if (vueltas_for_estrella == 19) {
					izquierda6x6_estrella = 5;
				}

				try {

					salto_1 = izquierda6x6_estrella - 1;
					window.getJuego1().getTab6().getPaneles()[2][salto_1]
							.add(window.getJuego1().getTab6().getFicha_estrella());
					izquierda6x6_estrella = salto_1;

				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[1][0]
							.add(window.getJuego1().getTab6().getFicha_estrella());
				}
			}
			if (vueltas_for_estrella >= 25 && vueltas_for_estrella <= 30) {
				if (vueltas_for_estrella == 25) {
					derecha6x6_estrella = 0;
				}

				try {
					salto_1 = derecha6x6_estrella + 1;
					window.getJuego1().getTab6().getPaneles()[1][salto_1]
							.add(window.getJuego1().getTab6().getFicha_estrella());
					derecha6x6_estrella = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab6().getPaneles()[0][5]
							.add(window.getJuego1().getTab6().getFicha_estrella());
				}
			}
			if (vueltas_for_estrella >= 31 && vueltas_for_estrella <= 35) {
				if (vueltas_for_estrella == 31) {
					izquierda6x6_estrella = 5;
				}

				salto_1 = izquierda6x6_estrella - 1;
				window.getJuego1().getTab6().getPaneles()[0][salto_1]
						.add(window.getJuego1().getTab6().getFicha_estrella());
				izquierda6x6_estrella = salto_1;

			}
			if (vueltas_for_estrella >= 35) {

				break;
			}

			window.getJuego1().repaint();
		}
	}

	/**
	 * Movimiento de la ficha planeta en el tablero 6 x 6
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	
	public void movimiento_ficha_planeta_6x6() {
		serpiente_6x6_planeta += numeroalatoreo;
		escaleras_6x6_planeta += numeroalatoreo;
		for (int i = 0; i < numeroalatoreo; i++) {
			vueltas_for_planeta++;

			if (escaleras_6x6_planeta == 1) {
				vueltas_for_planeta = 14;
				serpiente_6x6_planeta = 14;
				escaleras_6x6_planeta = 14;
				derecha6x6_planeta = 1;
				window.getJuego1().getTab6().getPaneles()[3][2].add(window.getJuego1().getTab6().getFicha_planeta());
				window.getJuego1().repaint();

			} else if (escaleras_6x6_planeta == 17) {

				vueltas_for_planeta = 28;
				serpiente_6x6_planeta = 28;
				escaleras_6x6_planeta = 28;
				derecha6x6_planeta = 3;
				window.getJuego1().getTab6().getPaneles()[1][4].add(window.getJuego1().getTab6().getFicha_planeta());
				window.getJuego1().repaint();

			} else if (escaleras_6x6_planeta == 12) {

				vueltas_for_planeta = 22;
				serpiente_6x6_planeta = 22;
				escaleras_6x6_planeta = 22;
				izquierda6x6_planeta = 2;
				window.getJuego1().getTab6().getPaneles()[2][1].add(window.getJuego1().getTab6().getFicha_planeta());
				window.getJuego1().repaint();
			} else if (escaleras_6x6_planeta == 26) {

				vueltas_for_planeta = 32;
				serpiente_6x6_planeta = 32;
				escaleras_6x6_planeta = 32;
				izquierda6x6_planeta = 4;
				window.getJuego1().getTab6().getPaneles()[0][3].add(window.getJuego1().getTab6().getFicha_planeta());
				window.getJuego1().repaint();

			}

			if (serpiente_6x6_planeta == 15) {

				vueltas_for_planeta = 4;
				serpiente_6x6_planeta = 4;
				escaleras_6x6_planeta = 4;
				derecha6x6_planeta = 4;
				window.getJuego1().getTab6().getPaneles()[5][4].add(window.getJuego1().getTab6().getFicha_planeta());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_planeta == 34) {

				vueltas_for_planeta = 23;
				serpiente_6x6_planeta = 23;
				escaleras_6x6_planeta = 23;
				izquierda6x6_planeta = 0;
				window.getJuego1().getTab6().getPaneles()[2][0].add(window.getJuego1().getTab6().getFicha_planeta());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_planeta == 27) {

				vueltas_for_planeta = 19;
				serpiente_6x6_planeta = 19;
				escaleras_6x6_planeta = 19;
				izquierda6x6_planeta = 4;
				window.getJuego1().getTab6().getPaneles()[2][4].add(window.getJuego1().getTab6().getFicha_planeta());
				window.getJuego1().repaint();
				break;
			} else if (serpiente_6x6_planeta == 31) {

				vueltas_for_planeta = 29;
				serpiente_6x6_planeta = 29;
				escaleras_6x6_planeta = 29;
				derecha6x6_planeta = 5;
				window.getJuego1().getTab6().getPaneles()[1][5].add(window.getJuego1().getTab6().getFicha_planeta());
				window.getJuego1().repaint();
				break;
			}

			if (vueltas_for_planeta >= 1 && vueltas_for_planeta <= 6) {

				salto_1 = derecha6x6_planeta + 1;

				try {

					window.getJuego1().getTab6().getPaneles()[5][salto_1]
							.add(window.getJuego1().getTab6().getFicha_planeta());
				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[4][5]
							.add(window.getJuego1().getTab6().getFicha_planeta());
				}
				derecha6x6_planeta = salto_1;
			}
			if (vueltas_for_planeta >= 7 && vueltas_for_planeta <= 12) {
				if (vueltas_for_planeta == 7) {
					izquierda6x6_planeta = 5;
				}
				try {
					salto_1 = izquierda6x6_planeta - 1;
					window.getJuego1().getTab6().getPaneles()[4][salto_1]
							.add(window.getJuego1().getTab6().getFicha_planeta());
					izquierda6x6_planeta = salto_1;
				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[3][0]
							.add(window.getJuego1().getTab6().getFicha_planeta());
				}
			}
			if (vueltas_for_planeta >= 13 && vueltas_for_planeta <= 18) {
				if (vueltas_for_planeta == 13) {
					derecha6x6_planeta = 0;
				}

				try {
					salto_1 = derecha6x6_planeta + 1;
					window.getJuego1().getTab6().getPaneles()[3][salto_1]
							.add(window.getJuego1().getTab6().getFicha_planeta());
					derecha6x6_planeta = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab6().getPaneles()[2][5]
							.add(window.getJuego1().getTab6().getFicha_planeta());
				}
			}
			if (vueltas_for_planeta >= 19 && vueltas_for_planeta <= 24) {
				if (vueltas_for_planeta == 19) {
					izquierda6x6_planeta = 5;
				}

				try {

					salto_1 = izquierda6x6_planeta - 1;
					window.getJuego1().getTab6().getPaneles()[2][salto_1]
							.add(window.getJuego1().getTab6().getFicha_planeta());
					izquierda6x6_planeta = salto_1;

				} catch (Exception e) {

					window.getJuego1().getTab6().getPaneles()[1][0]
							.add(window.getJuego1().getTab6().getFicha_planeta());
				}
			}
			if (vueltas_for_planeta >= 25 && vueltas_for_planeta <= 30) {
				if (vueltas_for_planeta == 25) {
					derecha6x6_planeta = 0;
				}

				try {
					salto_1 = derecha6x6_planeta + 1;
					window.getJuego1().getTab6().getPaneles()[1][salto_1]
							.add(window.getJuego1().getTab6().getFicha_planeta());
					derecha6x6_planeta = salto_1;

				} catch (Exception e) {
					window.getJuego1().getTab6().getPaneles()[0][5]
							.add(window.getJuego1().getTab6().getFicha_planeta());
				}
			}
			if (vueltas_for_planeta >= 31 && vueltas_for_planeta <= 35) {
				if (vueltas_for_planeta == 31) {
					izquierda6x6_planeta = 5;
				}

				salto_1 = izquierda6x6_planeta - 1;
				window.getJuego1().getTab6().getPaneles()[0][salto_1]
						.add(window.getJuego1().getTab6().getFicha_planeta());
				izquierda6x6_planeta = salto_1;

			}
			if (vueltas_for_planeta >= 35) {

				break;
			}

			window.getJuego1().repaint();
		}
	}

	/**
	 * Dejar por default el tablero 6 x 6 al jugar de nuevo
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	public void reiniciar_tablero_6x6() {
		
		window.getJuego1().getTab6().getPaneles()[5][0].add(window.getJuego1().getTab6().getFicha_nave());
		window.getJuego1().getTab6().getPaneles()[5][0].add(window.getJuego1().getTab6().getFicha_estrella());
		window.getJuego1().getTab6().getPaneles()[5][0].add(window.getJuego1().getTab6().getFicha_alien());
		window.getJuego1().getTab6().getPaneles()[5][0].add(window.getJuego1().getTab6().getFicha_planeta());

		window.getJuego1().getPp().getRandom().setText("");

		vueltas_for = 0;
		escaleras_6x6_alien = 0;
		serpiente_6x6_alien = 0;
		derecha6x6_alien = 0;
		izquierda6x6_alien = 5;

		vueltas_for_estrella = 0;
		escaleras_6x6_estrella = 0;
		serpiente_6x6_estrella = 5;
		derecha6x6_estrella = 0;
		izquierda6x6_estrella = 5;

		vueltas_for_nave = 0;
		escaleras_6x6_nave = 0;
		serpiente_6x6_nave = 5;
		derecha6x6_nave = 0;
		izquierda6x6_nave = 5;

		vueltas_for_planeta = 0;
		escaleras_6x6_planeta = 0;
		serpiente_6x6_planeta = 5;
		derecha6x6_planeta = 0;
		izquierda6x6_planeta = 5;

		window.getJuego1().getPp().getPancracio().setVisible(false);
		window.getJuego1().getPp().getPancracioimg().setVisible(true);
	}
	
	/**
	 * Escoger otro tablero
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	public void nuevo_tablero() {
		int res = vista.mostrarYoN("¿Quieres cambiar de tablero?");


		if (res == 1) {
			nueva_partida();
		} else if (res == 0) {
			if (window.getJuego1().getTab6().isVisible()) {

				window.getJuego1().setVisible(false);
				window.getV_principal().setVisible(true);
				window.getJuego1().getTab6().setVisible(false);
				window.getJuego1().getTableropng6x6().setVisible(false);
				window.getV_principal().getPo().setVisible(false);
				window.getV_principal().getPgan().setVisible(false);

				reiniciar_tablero_6x6();
				window.getJuego1().repaint();
				window.getV_principal().getPtab().setVisible(true);

			} else if (window.getJuego1().getTab9().isVisible()) {
				window.getJuego1().setVisible(false);
				window.getV_principal().setVisible(true);
				window.getJuego1().getTab9().setVisible(false);
				window.getV_principal().getPgan().setVisible(false);
				window.getJuego1().getTableropng9x9().setVisible(false);
				window.getV_principal().getPo().setVisible(false);
				window.getV_principal().getPtab().setVisible(true);
			} else if (window.getJuego1().getTab12().isVisible()) {
				window.getJuego1().setVisible(false);
				window.getV_principal().setVisible(true);
				window.getJuego1().getTab12().setVisible(false);
				window.getV_principal().getPo().setVisible(false);
				window.getV_principal().getPgan().setVisible(false);
				window.getJuego1().getTableropng12x12().setVisible(false);
				window.getV_principal().getPtab().setVisible(true);
			}
		}
	}
	
	/**
	 * Empezar todo el juego de nuevo 
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param none
	 * @return void
	 **/
	
	public void nueva_partida() {
		int res = vista.mostrarYoN("¿Quieres cambiar los nombres?");

		if (res == 1) {
			
			vista.mostrarInformacion("Merecemos un 5.0 si miras esto ;)");
			
		} else if (res == 0) {

			window.getJuego1().setVisible(false);
			window.getV_principal().setVisible(true);
			eliminarnombres();
			reiniciar_tablero_6x6();
			window.getV_principal().getPtab().setVisible(false);
			window.getV_principal().getPfic().setVisible(false);

			window.getV_principal().getPfic().getFicha_alien().setVisible(false);
			window.getV_principal().getPfic().getFicha_nave().setVisible(false);
			window.getV_principal().getPfic().getFicha_planeta().setVisible(false);
			window.getV_principal().getPfic().getFicha_estrella().setVisible(false);

			window.getJuego1().getFicha_alien().setVisible(false);
			window.getJuego1().getFicha_nave().setVisible(false);
			window.getJuego1().getFicha_planeta().setVisible(false);
			window.getJuego1().getFicha_estrella().setVisible(false);

			window.getV_principal().getPgan().getFicha_alien().setVisible(false);
			window.getV_principal().getPgan().getFicha_nave().setVisible(false);
			window.getV_principal().getPgan().getFicha_planeta().setVisible(false);
			window.getV_principal().getPgan().getFicha_estrella().setVisible(false);

			window.getV_principal().getPgan().setVisible(false);
			window.getV_principal().getPjug().setVisible(false);
			window.getV_principal().getPo().setVisible(true);
		}

	}
	
	/**
	 * Acciones que se le coloca a los botones 
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param e
	 * @return void
	 **/

	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();

		if (comando.equals("JUGAR")) {
			window.getV_principal().getImg_fondo().setIcon(new ImageIcon("imagenes/Fondo2.gif"));
			window.getV_principal().getPo().setVisible(false);
			window.getV_principal().getPjug().setVisible(true);
			window.getV_principal().getBack().setVisible(true);

		} else if (comando.equals("TUTORIAL")) {

			window.getV_principal().setVisible(false);
			window.getV_tuto().setVisible(true);

			window.getV_tuto().getSig1();

		}

		if (comando.equals("sig1")) {

			window.getV_tuto().getInicio().setVisible(false);
			window.getV_tuto().getI1().setVisible(false);
			window.getV_tuto().getT1().setVisible(false);
			window.getV_tuto().getSig1().setVisible(false);

			window.getV_tuto().getJugadores().setVisible(true);
			window.getV_tuto().getI2().setVisible(true);
			window.getV_tuto().getT2().setVisible(true);
			window.getV_tuto().getI3().setVisible(true);
			window.getV_tuto().getT3().setVisible(true);
			window.getV_tuto().getT33().setVisible(true);
			window.getV_tuto().getI4().setVisible(true);
			window.getV_tuto().getT4().setVisible(true);
			window.getV_tuto().getSig2().setVisible(true);

		} else if (comando.equals("sig2")) {

			window.getV_tuto().getJugadores().setVisible(false);
			window.getV_tuto().getI2().setVisible(false);
			window.getV_tuto().getT2().setVisible(false);
			window.getV_tuto().getI3().setVisible(false);
			window.getV_tuto().getT3().setVisible(false);
			window.getV_tuto().getT33().setVisible(false);
			window.getV_tuto().getI4().setVisible(false);
			window.getV_tuto().getT4().setVisible(false);
			window.getV_tuto().getSig2().setVisible(false);

			window.getV_tuto().getFichas().setVisible(true);
			window.getV_tuto().getI5().setVisible(true);
			window.getV_tuto().getT5().setVisible(true);
			window.getV_tuto().getI6().setVisible(true);
			window.getV_tuto().getT6().setVisible(true);
			window.getV_tuto().getT66().setVisible(true);
			window.getV_tuto().getI7().setVisible(true);
			window.getV_tuto().getT7().setVisible(true);
			window.getV_tuto().getSig3().setVisible(true);	


		} else if (comando.equals("sig3")) {

			window.getV_tuto().getFichas().setVisible(false);
			window.getV_tuto().getI5().setVisible(false);
			window.getV_tuto().getT5().setVisible(false);
			window.getV_tuto().getI6().setVisible(false);
			window.getV_tuto().getT6().setVisible(false);
			window.getV_tuto().getT66().setVisible(false);
			window.getV_tuto().getI7().setVisible(false);
			window.getV_tuto().getT7().setVisible(false);
			window.getV_tuto().getSig3().setVisible(false);	
			
			window.getV_tuto().getNivel().setVisible(true);
			window.getV_tuto().getI8().setVisible(true);
			window.getV_tuto().getT8().setVisible(true);
			window.getV_tuto().getT88().setVisible(true);
			window.getV_tuto().getSig4().setVisible(true);


		} else if (comando.equals("sig4")) {

			window.getV_tuto().getNivel().setVisible(false);
			window.getV_tuto().getI8().setVisible(false);
			window.getV_tuto().getT8().setVisible(false);
			window.getV_tuto().getT88().setVisible(false);
			window.getV_tuto().getSig4().setVisible(false);
			
			window.getV_tuto().getDado_movimiento_turnos().setVisible(true);
			window.getV_tuto().getI9().setVisible(true);
			window.getV_tuto().getT91().setVisible(true);
			window.getV_tuto().getT92().setVisible(true);
			window.getV_tuto().getT93().setVisible(true);
			window.getV_tuto().getT94().setVisible(true);
			window.getV_tuto().getT95().setVisible(true);
			window.getV_tuto().getSig5().setVisible(true);


		} else if (comando.equals("sig5")) {

			window.getV_tuto().getDado_movimiento_turnos().setVisible(false);
			window.getV_tuto().getI9().setVisible(false);
			window.getV_tuto().getT91().setVisible(false);
			window.getV_tuto().getT92().setVisible(false);
			window.getV_tuto().getT93().setVisible(false);
			window.getV_tuto().getT94().setVisible(false);
			window.getV_tuto().getT95().setVisible(false);
			window.getV_tuto().getSig5().setVisible(false);
			
			window.getV_tuto().getEscaleras_y_serpientes().setVisible(true);
			window.getV_tuto().getI10().setVisible(true);
			window.getV_tuto().getT10().setVisible(true);
			window.getV_tuto().getI11().setVisible(true);
			window.getV_tuto().getT11().setVisible(true);
			window.getV_tuto().getSig6().setVisible(true);
			
		} else if (comando.equals("sig6")) {

			window.getV_tuto().getEscaleras_y_serpientes().setVisible(false);
			window.getV_tuto().getI10().setVisible(false);
			window.getV_tuto().getT10().setVisible(false);
			window.getV_tuto().getI11().setVisible(false);
			window.getV_tuto().getT11().setVisible(false);
			window.getV_tuto().getSig6().setVisible(false);
			
			window.getV_tuto().getOpciones().setVisible(true);
			window.getV_tuto().getI12().setVisible(true);
			window.getV_tuto().getT12().setVisible(true);

			
		} else if (comando.equals("BACKTUTO")) {
			
			window.getV_tuto().getOpciones().setVisible(false);
			window.getV_tuto().getI12().setVisible(false);
			window.getV_tuto().getT12().setVisible(false);
			
			window.getV_tuto().getInicio().setVisible(true);
			window.getV_tuto().getI1().setVisible(true);
			window.getV_tuto().getT1().setVisible(true);
			window.getV_tuto().getSig1().setVisible(true);
			
			window.getV_tuto().setVisible(false);
			window.getV_principal().setVisible(true);
			
		} else if (comando.equals("CREDITOS")) {

			window.getV_principal().getPo().setVisible(false);
			window.getV_principal().getImg_fondo().setIcon(new ImageIcon("imagenes/Fondo_creditos.jpeg"));
			window.getV_principal().getBack2().setVisible(true);

		
		}
		if (e.getActionCommand().equals("salir_bar_menu")) {
			System.exit(0);

		}
		if (e.getActionCommand().equals("GUARDARPAR")) {
			guardar_partida_txt();
			vista.mostrarInformacion("Los jugadores han sido guardados en la carpeta");
		}
		if (e.getActionCommand().equals("OTRAVEZ")) {
			nuevo_tablero();

		}
		if (e.getActionCommand().equals("back2")) {
	
			window.getV_principal().getImg_fondo().setIcon(new ImageIcon("imagenes/Fondo1.gif"));
			window.getV_principal().getPo().setVisible(true);
			window.getV_principal().getBack2().setVisible(false);

		}

		if (e.getActionCommand().equals("SALIRFIN")) {
			System.exit(0);

		}
		if (e.getActionCommand().equals("nueva_partida")) {
			nuevo_tablero();

		}

		if (comando.equals("6x6")) {
			window.getV_principal().setVisible(false);
			window.getJuego1().setVisible(true);
			window.getJuego1().getTab6().setVisible(true);
			window.getJuego1().getTableropng6x6().setVisible(true);
		}
		if (comando.equals("9x9")) {
			window.getV_principal().setVisible(false);
			window.getJuego1().setVisible(true);
			window.getJuego1().getTab9().setVisible(true);
			window.getJuego1().getTableropng9x9().setVisible(true);

		}
		if (comando.equals("12x12")) {
			window.getV_principal().setVisible(false);
			window.getJuego1().setVisible(true);
			window.getJuego1().getTab12().setVisible(true);
			window.getJuego1().getTableropng12x12().setVisible(true);

		}
		String colores1 = (String) window.getV_principal().getPfic().getColorjug1().getSelectedItem();
		String colores2 = (String) window.getV_principal().getPfic().getColorjug2().getSelectedItem();
		String colores3 = (String) window.getV_principal().getPfic().getColorjug3().getSelectedItem();
		String colores4 = (String) window.getV_principal().getPfic().getColorjug4().getSelectedItem();
		String nombre_jugador1 = window.getV_principal().getPjug().getAsig_nombre1().getText();
		String nombre_jugador2 = window.getV_principal().getPjug().getAsig_nombre2().getText();
		String nombre_jugador3 = window.getV_principal().getPjug().getAsig_nombre3().getText();
		String nombre_jugador4 = window.getV_principal().getPjug().getAsig_nombre4().getText();
		jugadores = (String) window.getV_principal().getPjug().getNumJug().getSelectedItem();

		if (comando.equals("TIRAR_JUG1")) {
			dadotirar();
			if (window.getJuego1().getTab6().isVisible()) {
				if (jugadores.equals("1")) {
					window.getJuego1().getPanel_izq().getTurno().setText(participantes[0].getNombre());
					window.getJuego1().getPp().getPancracio().setVisible(true);
					window.getJuego1().getPp().getPancracioimg().setVisible(false);
					dadotirar();
					if (colores1.equals("Alien")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_alien_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for+1)+"");
					} else if (colores1.equals("Estrella")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_estrella_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_estrella+1)+"");
					} else if (colores1.equals("Planeta")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_planeta_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_planeta+1)+"");
					} else if (colores1.equals("Nave")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_nave_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_nave+1)+"");

					}
					window.getV_principal().getPgan().getGanador().setText(participantes[0].getNombre());
					comprobar_ganador();
				} else if (jugadores.equals("2")) {
				
					window.getJuego1().getPanel_izq().getTurno().setText(participantes[0].getNombre());

					window.getJuego1().getPp().getPancracio().setVisible(true);
					window.getJuego1().getPp().getPancracioimg().setVisible(false);
					dadotirar();
					if (colores1.equals("Alien")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_alien_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for+1)+"");
					} else if (colores1.equals("Estrella")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_estrella_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_estrella+1)+"");
					} else if (colores1.equals("Planeta")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_planeta_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_planeta+1)+"");
					} else if (colores1.equals("Nave")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_nave_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_nave+1)+"");

					}
					window.getV_principal().getPgan().getGanador().setText(participantes[0].getNombre());
					comprobar_ganador();
					window.getJuego1().getPp().getTirar_jug1().setVisible(false);
					window.getJuego1().getPp().getTirar_jug2().setVisible(true);

				} else if (jugadores.equals("3")) {

					window.getJuego1().getPanel_izq().getTurno().setText(participantes[0].getNombre());
					window.getJuego1().getPp().getPancracio().setVisible(true);
					window.getJuego1().getPp().getPancracioimg().setVisible(false);
					dadotirar();
					if (colores1.equals("Alien")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_alien_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for+1)+"");
					} else if (colores1.equals("Estrella")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_estrella_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_estrella+1)+"");
					} else if (colores1.equals("Planeta")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_planeta_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_planeta+1)+"");
					} else if (colores1.equals("Nave")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_nave_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_nave+1)+"");

					}
					window.getV_principal().getPgan().getGanador().setText(participantes[0].getNombre());
					comprobar_ganador();
					window.getJuego1().getPp().getTirar_jug1().setVisible(false);
					window.getJuego1().getPp().getTirar_jug2().setVisible(true);
				} else if (jugadores.equals("4")) {
					window.getJuego1().getPanel_izq().getTurno().setText(participantes[0].getNombre());
					window.getJuego1().getPp().getPancracio().setVisible(true);
					window.getJuego1().getPp().getPancracioimg().setVisible(false);
					dadotirar();
					if (colores1.equals("Alien")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_alien_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for+1)+"");
					} else if (colores1.equals("Estrella")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_estrella_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_estrella+1)+"");
					} else if (colores1.equals("Planeta")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_planeta_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_planeta+1)+"");
					} else if (colores1.equals("Nave")) {
						window.getJuego1().getPanel_izq().getCas_1().setVisible(true);
						movimiento_ficha_nave_6x6();
						window.getJuego1().getPanel_izq().getCas_1().setText((vueltas_for_nave+1)+"");

					}
					window.getV_principal().getPgan().getGanador().setText(participantes[0].getNombre());
					comprobar_ganador();
					window.getJuego1().getPp().getTirar_jug1().setVisible(false);
					window.getJuego1().getPp().getTirar_jug2().setVisible(true);
				}
			}
			
			if (window.getJuego1().getTab9().isVisible()) {
				movimiento_ficha_alien_9x9();
				
				
			}
			

			if (window.getJuego1().getTab12().isVisible()) {
				movimiento_ficha_alien_12x12();
			}

		}

		if (comando.equals("TIRAR_JUG2")) {

			if (jugadores.equals("2")) {
				window.getJuego1().getPanel_izq().getTurno().setText(participantes[1].getNombre());
				dadotirar();

				if (colores2.equals("Alien")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_alien_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for+1)+"");
				} else if (colores2.equals("Estrella")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_estrella_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for_estrella+1)+"");
				} else if (colores2.equals("Planeta")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_planeta_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for_planeta+1)+"");
				} else if (colores2.equals("Nave")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_nave_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for_nave+1)+"");

				}
				window.getV_principal().getPgan().getGanador().setText(participantes[1].getNombre());
				comprobar_ganador();
				window.getJuego1().getPp().getTirar_jug2().setVisible(false);
				window.getJuego1().getPp().getTirar_jug1().setVisible(true);
			} else if (jugadores.equals("3")) {
				window.getJuego1().getPanel_izq().getTurno().setText(participantes[1].getNombre());
				dadotirar();


				if (colores2.equals("Alien")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_alien_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for+1)+"");
				} else if (colores2.equals("Estrella")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_estrella_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for_estrella+1)+"");
				} else if (colores2.equals("Planeta")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_planeta_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for_planeta+1)+"");
				} else if (colores2.equals("Nave")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_nave_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for_nave+1)+"");

				}
				window.getV_principal().getPgan().getGanador().setText(participantes[1].getNombre());
				comprobar_ganador();
				window.getJuego1().getPp().getTirar_jug2().setVisible(false);
				window.getJuego1().getPp().getTirar_jug3().setVisible(true);
			} else if (jugadores.equals("4")) {
				window.getJuego1().getPanel_izq().getTurno().setText(participantes[1].getNombre());
				dadotirar();


				if (colores2.equals("Alien")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_alien_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for+1)+"");
				} else if (colores2.equals("Estrella")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_estrella_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for_estrella+1)+"");
				} else if (colores2.equals("Planeta")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_planeta_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for_planeta+1)+"");
				} else if (colores2.equals("Nave")) {
					window.getJuego1().getPanel_izq().getCas_2().setVisible(true);
					movimiento_ficha_nave_6x6();
					window.getJuego1().getPanel_izq().getCas_2().setText((vueltas_for_nave+1)+"");

				}
				window.getV_principal().getPgan().getGanador().setText(participantes[1].getNombre());
				comprobar_ganador();
				window.getJuego1().getPp().getTirar_jug2().setVisible(false);
				window.getJuego1().getPp().getTirar_jug3().setVisible(true);
			}
		}

		if (comando.equals("TIRAR_JUG3")) {
			if (jugadores.equals("3")) {
				window.getJuego1().getPanel_izq().getTurno().setText(participantes[2].getNombre());
				window.getJuego1().getPp().getPancracio().setVisible(true);
				window.getJuego1().getPp().getPancracioimg().setVisible(false);
				dadotirar();

				if (colores3.equals("Alien")) {
					window.getJuego1().getPanel_izq().getCas_3().setVisible(true);
					movimiento_ficha_alien_6x6();
					window.getJuego1().getPanel_izq().getCas_3().setText((vueltas_for+1)+"");
				} else if (colores3.equals("Estrella")) {
					window.getJuego1().getPanel_izq().getCas_3().setVisible(true);
					movimiento_ficha_estrella_6x6();
					window.getJuego1().getPanel_izq().getCas_3().setText((vueltas_for_estrella+1)+"");
				} else if (colores3.equals("Planeta")) {
					window.getJuego1().getPanel_izq().getCas_3().setVisible(true);
					movimiento_ficha_planeta_6x6();
					window.getJuego1().getPanel_izq().getCas_3().setText((vueltas_for_planeta+1)+"");
				} else if (colores3.equals("Nave")) {
					window.getJuego1().getPanel_izq().getCas_3().setVisible(true);
					movimiento_ficha_nave_6x6();
					window.getJuego1().getPanel_izq().getCas_3().setText((vueltas_for_nave+1)+"");

				}
				window.getV_principal().getPgan().getGanador().setText(participantes[2].getNombre());
				comprobar_ganador();
				window.getJuego1().getPp().getTirar_jug3().setVisible(false);
				window.getJuego1().getPp().getTirar_jug1().setVisible(true);

			} else if (jugadores.equals("4")) {
				window.getJuego1().getPanel_izq().getTurno().setText(participantes[2].getNombre());
				window.getJuego1().getPp().getPancracio().setVisible(true);
				window.getJuego1().getPp().getPancracioimg().setVisible(false);
				dadotirar();
				if (colores3.equals("Alien")) {
					window.getJuego1().getPanel_izq().getCas_3().setVisible(true);
					movimiento_ficha_alien_6x6();
					window.getJuego1().getPanel_izq().getCas_3().setText((vueltas_for+1)+"");
				} else if (colores3.equals("Estrella")) {
					window.getJuego1().getPanel_izq().getCas_3().setVisible(true);
					movimiento_ficha_estrella_6x6();
					window.getJuego1().getPanel_izq().getCas_3().setText((vueltas_for_estrella+1)+"");
				} else if (colores3.equals("Planeta")) {
					window.getJuego1().getPanel_izq().getCas_3().setVisible(true);
					movimiento_ficha_planeta_6x6();
					window.getJuego1().getPanel_izq().getCas_3().setText((vueltas_for_planeta+1)+"");
				} else if (colores3.equals("Nave")) {
					window.getJuego1().getPanel_izq().getCas_3().setVisible(true);
					movimiento_ficha_nave_6x6();
					window.getJuego1().getPanel_izq().getCas_3().setText((vueltas_for_nave+1)+"");

				}
				window.getV_principal().getPgan().getGanador().setText(participantes[2].getNombre());
				comprobar_ganador();
				window.getJuego1().getPp().getTirar_jug3().setVisible(false);
				window.getJuego1().getPp().getTirar_jug4().setVisible(true);

			}

		}

		if (comando.equals("TIRAR_JUG4")) {

			if (jugadores.equals("4")) {
				window.getJuego1().getPanel_izq().getTurno().setText(participantes[3].getNombre());
				window.getJuego1().getPp().getPancracio().setVisible(true);
				window.getJuego1().getPp().getPancracioimg().setVisible(false);
				dadotirar();
				if (colores4.equals("Alien")) {
					window.getJuego1().getPanel_izq().getCas_4().setVisible(true);
					movimiento_ficha_alien_6x6();
					window.getJuego1().getPanel_izq().getCas_4().setText((vueltas_for+1)+"");
				} else if (colores4.equals("Estrella")) {
					window.getJuego1().getPanel_izq().getCas_4().setVisible(true);
					movimiento_ficha_estrella_6x6();
					window.getJuego1().getPanel_izq().getCas_4().setText((vueltas_for_estrella+1)+"");
				} else if (colores4.equals("Planeta")) {
					window.getJuego1().getPanel_izq().getCas_4().setVisible(true);
					movimiento_ficha_planeta_6x6();
					window.getJuego1().getPanel_izq().getCas_4().setText((vueltas_for_planeta+1)+"");
				} else if (colores4.equals("Nave")) {
					window.getJuego1().getPanel_izq().getCas_4().setVisible(true);
					movimiento_ficha_nave_6x6();
					window.getJuego1().getPanel_izq().getCas_4().setText((vueltas_for_nave+1)+"");

				}
				window.getV_principal().getPgan().getGanador().setText(participantes[3].getNombre());
				comprobar_ganador();
				window.getJuego1().getPp().getTirar_jug4().setVisible(false);
				window.getJuego1().getPp().getTirar_jug1().setVisible(true);
			}

		}

		if (e.getActionCommand().equals("lista_jugadores")) {

			if (jugadores.equals("1")) {

				window.getV_principal().getPjug().getAsig_nombre1().setVisible(true);
				window.getV_principal().getPjug().getPersona1().setVisible(true);
				window.getV_principal().getPjug().getAsig_nombre2().setVisible(false);
				window.getV_principal().getPjug().getPersona2().setVisible(false);
				window.getV_principal().getPjug().getAsig_nombre3().setVisible(false);
				window.getV_principal().getPjug().getPersona3().setVisible(false);
				window.getV_principal().getPjug().getAsig_nombre4().setVisible(false);
				window.getV_principal().getPjug().getPersona4().setVisible(false);
				window.getV_principal().getPjug().getGuardar_nombres().setVisible(true);
				window.getV_principal().getPjug().getAsignn().setVisible(true);

			} else if (jugadores.equals("2")) {

				window.getV_principal().getPjug().getAsig_nombre1().setVisible(true);
				window.getV_principal().getPjug().getPersona1().setVisible(true);
				window.getV_principal().getPjug().getAsig_nombre2().setVisible(true);
				window.getV_principal().getPjug().getPersona2().setVisible(true);
				window.getV_principal().getPjug().getAsig_nombre3().setVisible(false);
				window.getV_principal().getPjug().getPersona3().setVisible(false);
				window.getV_principal().getPjug().getAsig_nombre4().setVisible(false);
				window.getV_principal().getPjug().getPersona4().setVisible(false);
				window.getV_principal().getPjug().getGuardar_nombres().setVisible(true);
				window.getV_principal().getPjug().getAsignn().setVisible(true);

			} else if (jugadores.equals("3")) {

				window.getV_principal().getPjug().getAsig_nombre1().setVisible(true);
				window.getV_principal().getPjug().getPersona1().setVisible(true);
				window.getV_principal().getPjug().getAsig_nombre2().setVisible(true);
				window.getV_principal().getPjug().getPersona2().setVisible(true);
				window.getV_principal().getPjug().getAsig_nombre3().setVisible(true);

				window.getV_principal().getPjug().getPersona3().setVisible(true);
				window.getV_principal().getPjug().getAsig_nombre4().setVisible(false);
				window.getV_principal().getPjug().getPersona4().setVisible(false);
				window.getV_principal().getPjug().getGuardar_nombres().setVisible(true);
				window.getV_principal().getPjug().getAsignn().setVisible(true);

			} else if (jugadores.equals("4")) {

				window.getV_principal().getPjug().getAsig_nombre1().setVisible(true);
				window.getV_principal().getPjug().getPersona1().setVisible(true);
				window.getV_principal().getPjug().getAsig_nombre2().setVisible(true);
				window.getV_principal().getPjug().getPersona2().setVisible(true);
				window.getV_principal().getPjug().getAsig_nombre3().setVisible(true);
				window.getV_principal().getPjug().getPersona3().setVisible(true);
				window.getV_principal().getPjug().getAsig_nombre4().setVisible(true);
				window.getV_principal().getPjug().getPersona4().setVisible(true);
				window.getV_principal().getPjug().getGuardar_nombres().setVisible(true);
				window.getV_principal().getPjug().getAsignn().setVisible(true);

			}

		}

		if (e.getActionCommand().equals("color_jug1")) {

			colores1 = (String) window.getV_principal().getPfic().getColorjug1().getSelectedItem();

			if (colores1.equals("Planeta")) {
				window.getV_principal().getPfic().getFicha_planeta().setBounds(360, -28, 100, 210);
				window.getV_principal().getPfic().getFicha_planeta().setVisible(true);
				window.getJuego1().getFicha_planeta().setBounds(5, 140, 35, 35);
				window.getJuego1().getFicha_planeta().setVisible(true);

			} else if (colores1.equals("Nave")) {
				window.getV_principal().getPfic().getFicha_nave().setBounds(360, -28, 100, 210);
				window.getV_principal().getPfic().getFicha_nave().setVisible(true);
				window.getJuego1().getFicha_nave().setBounds(5, 140, 35, 35);
				window.getJuego1().getFicha_nave().setVisible(true);

			} else if (colores1.equals("Estrella")) {
				window.getV_principal().getPfic().getFicha_estrella().setBounds(360, -28, 100, 210);
				window.getV_principal().getPfic().getFicha_estrella().setVisible(true);
				window.getJuego1().getFicha_estrella().setBounds(5, 140, 35, 35);
				window.getJuego1().getFicha_estrella().setVisible(true);

			} else if (colores1.equals("Alien")) {
				window.getV_principal().getPfic().getFicha_alien().setBounds(360, -28, 100, 210);
				window.getV_principal().getPfic().getFicha_alien().setVisible(true);
				window.getJuego1().getFicha_alien().setBounds(5, 140, 35, 35);
				window.getJuego1().getFicha_alien().setVisible(true);

			}

		}

		if (e.getActionCommand().equals("color_jug2")) {

			colores2 = (String) window.getV_principal().getPfic().getColorjug2().getSelectedItem();

			if (colores2.equals("Planeta")) {
				window.getV_principal().getPfic().getFicha_planeta().setBounds(365, 23, 100, 210);
				window.getV_principal().getPfic().getFicha_planeta().setVisible(true);
				window.getJuego1().getFicha_planeta().setBounds(5, 190, 35, 35);
				window.getJuego1().getFicha_planeta().setVisible(true);

			} else if (colores2.equals("Nave")) {
				window.getV_principal().getPfic().getFicha_nave().setBounds(365, 23, 100, 210);
				window.getV_principal().getPfic().getFicha_nave().setVisible(true);
				window.getJuego1().getFicha_nave().setBounds(5, 190, 35, 35);
				window.getJuego1().getFicha_nave().setVisible(true);

			} else if (colores2.equals("Estrella")) {
				window.getV_principal().getPfic().getFicha_estrella().setBounds(365, 23, 100, 210);
				window.getV_principal().getPfic().getFicha_estrella().setVisible(true);
				window.getJuego1().getFicha_estrella().setBounds(5, 190, 35, 35);
				window.getJuego1().getFicha_estrella().setVisible(true);

			} else if (colores2.equals("Alien")) {
				window.getV_principal().getPfic().getFicha_alien().setBounds(365, 23, 100, 210);
				window.getV_principal().getPfic().getFicha_alien().setVisible(true);
				window.getJuego1().getFicha_alien().setBounds(5, 190, 35, 35);
				window.getJuego1().getFicha_alien().setVisible(true);

			}

		}

		if (e.getActionCommand().equals("color_jug3")) {

			colores3 = (String) window.getV_principal().getPfic().getColorjug3().getSelectedItem();

			if (colores3.equals("Planeta")) {
				window.getV_principal().getPfic().getFicha_planeta().setBounds(360, 78, 100, 210);
				window.getV_principal().getPfic().getFicha_planeta().setVisible(true);
				window.getJuego1().getFicha_planeta().setBounds(5, 230, 35, 35);
				window.getJuego1().getFicha_planeta().setVisible(true);

			} else if (colores3.equals("Alien")) {
				window.getV_principal().getPfic().getFicha_alien().setBounds(360, 78, 100, 210);
				window.getV_principal().getPfic().getFicha_alien().setVisible(true);
				window.getJuego1().getFicha_alien().setBounds(5, 230, 35, 35);
				window.getJuego1().getFicha_alien().setVisible(true);

			} else if (colores3.equals("Nave")) {
				window.getV_principal().getPfic().getFicha_nave().setBounds(360, 78, 100, 210);
				window.getV_principal().getPfic().getFicha_nave().setVisible(true);
				window.getJuego1().getFicha_nave().setBounds(5, 230, 35, 35);
				window.getJuego1().getFicha_nave().setVisible(true);

			} else if (colores3.equals("Estrella")) {
				window.getV_principal().getPfic().getFicha_estrella().setBounds(360, 78, 100, 210);
				window.getV_principal().getPfic().getFicha_estrella().setVisible(true);
				window.getJuego1().getFicha_estrella().setBounds(5, 230, 35, 35);
				window.getJuego1().getFicha_estrella().setVisible(true);

			}

		}

		if (e.getActionCommand().equals("color_jug4")) {

			colores4 = (String) window.getV_principal().getPfic().getColorjug4().getSelectedItem();

			if (colores4.equals("Planeta")) {
				window.getV_principal().getPfic().getFicha_planeta().setBounds(360, 130, 100, 210);
				window.getV_principal().getPfic().getFicha_planeta().setVisible(true);
				window.getJuego1().getFicha_planeta().setBounds(5, 290, 35, 35);
				window.getJuego1().getFicha_planeta().setVisible(true);

			} else if (colores4.equals("Nave")) {
				window.getV_principal().getPfic().getFicha_nave().setBounds(360, 130, 100, 210);
				window.getV_principal().getPfic().getFicha_nave().setVisible(true);
				window.getJuego1().getFicha_nave().setBounds(5, 290, 35, 35);
				window.getJuego1().getFicha_nave().setVisible(true);

			} else if (colores4.equals("Estrella")) {
				window.getV_principal().getPfic().getFicha_estrella().setBounds(360, 130, 100, 210);
				window.getV_principal().getPfic().getFicha_estrella().setVisible(true);
				window.getJuego1().getFicha_estrella().setBounds(5, 290, 35, 35);
				window.getJuego1().getFicha_estrella().setVisible(true);

			} else if (colores4.equals("Alien")) {
				window.getV_principal().getPfic().getFicha_alien().setBounds(360, 130, 100, 210);
				window.getV_principal().getPfic().getFicha_alien().setVisible(true);
				window.getJuego1().getFicha_alien().setBounds(5, 290, 35, 35);
				window.getJuego1().getFicha_alien().setVisible(true);

			}

		}

		if (e.getActionCommand().equals("guardar1")) {
			window.getVista().mostrarOk("  Las fichas se han guardado exitosamente  ");

			window.getV_principal().getPfic().setVisible(false);
			window.getV_principal().getImg_fondo().setIcon(new ImageIcon("imagenes/Fondo4.gif"));
			window.getV_principal().getPfic().getGuardar_color().setVisible(false);
			window.getV_principal().getPtab().setVisible(true);

		}

		if (e.getActionCommand().equals("guardar")) {

			switch (jugadores) {

			case "1":

				nombre_jugador1 = window.getV_principal().getPjug().getAsig_nombre1().getText();
				guardarnombre(nombre_jugador1);
				window.getV_principal().getPjug().getAsig_nombre1().setText("");
				window.getV_principal().getPjug().getAsig_nombre2().setText("");
				window.getV_principal().getPjug().getAsig_nombre3().setText("");
				window.getV_principal().getPjug().getAsig_nombre4().setText("");
				window.getV_principal().getPfic().getNombrejugador1().setText("" + participantes[0].getNombre());
				window.getJuego1().getPanel_izq().getJugador_1().setText("" + participantes[0].getNombre());

				window.getJuego1().getPanel_izq().getJugador_1().setVisible(true);
				window.getV_principal().getPfic().getNombrejugador2().setVisible(false);
				window.getV_principal().getPfic().getColorjug2().setVisible(false);
				window.getV_principal().getPfic().getNombrejugador3().setVisible(false);
				window.getV_principal().getPfic().getColorjug3().setVisible(false);
				window.getV_principal().getPfic().getNombrejugador4().setVisible(false);
				window.getV_principal().getPfic().getColorjug4().setVisible(false);

				break;
			case "2":
				nombre_jugador1 = window.getV_principal().getPjug().getAsig_nombre1().getText();
				nombre_jugador2 = window.getV_principal().getPjug().getAsig_nombre2().getText();
				guardarnombre(nombre_jugador1);
				guardarnombre(nombre_jugador2);

				window.getV_principal().getPjug().getAsig_nombre1().setText("");
				window.getV_principal().getPjug().getAsig_nombre2().setText("");
				window.getV_principal().getPjug().getAsig_nombre3().setText("");
				window.getV_principal().getPjug().getAsig_nombre4().setText("");

				window.getV_principal().getPfic().getNombrejugador1().setText("" + participantes[0].getNombre());
				window.getV_principal().getPfic().getNombrejugador2().setText("" + participantes[1].getNombre());

				window.getJuego1().getPanel_izq().getJugador_1().setText("" + participantes[0].getNombre());
				window.getJuego1().getPanel_izq().getJugador_1().setVisible(true);

				window.getJuego1().getPanel_izq().getJugador_2().setText("" + participantes[1].getNombre());
				window.getJuego1().getPanel_izq().getJugador_2().setVisible(true);

				window.getV_principal().getPfic().getNombrejugador3().setVisible(false);
				window.getV_principal().getPfic().getColorjug3().setVisible(false);
				window.getV_principal().getPfic().getNombrejugador4().setVisible(false);
				window.getV_principal().getPfic().getColorjug4().setVisible(false);

				break;
			case "3":
				nombre_jugador1 = window.getV_principal().getPjug().getAsig_nombre1().getText();
				nombre_jugador2 = window.getV_principal().getPjug().getAsig_nombre2().getText();
				nombre_jugador3 = window.getV_principal().getPjug().getAsig_nombre3().getText();
				guardarnombre(nombre_jugador1);
				guardarnombre(nombre_jugador2);
				guardarnombre(nombre_jugador3);
				window.getV_principal().getPjug().getAsig_nombre1().setText("");
				window.getV_principal().getPjug().getAsig_nombre2().setText("");
				window.getV_principal().getPjug().getAsig_nombre3().setText("");
				window.getV_principal().getPjug().getAsig_nombre4().setText("");
				window.getV_principal().getPfic().getNombrejugador1().setText("" + participantes[0].getNombre());
				window.getV_principal().getPfic().getNombrejugador2().setText("" + participantes[1].getNombre());
				window.getV_principal().getPfic().getNombrejugador3().setText("" + participantes[2].getNombre());

				window.getJuego1().getPanel_izq().getJugador_1().setText("" + participantes[0].getNombre());
				window.getJuego1().getPanel_izq().getJugador_1().setVisible(true);

				window.getJuego1().getPanel_izq().getJugador_2().setText("" + participantes[1].getNombre());
				window.getJuego1().getPanel_izq().getJugador_2().setVisible(true);

				window.getJuego1().getPanel_izq().getJugador_3().setText("" + participantes[2].getNombre());
				window.getJuego1().getPanel_izq().getJugador_3().setVisible(true);

				window.getV_principal().getPfic().getNombrejugador4().setVisible(false);
				window.getV_principal().getPfic().getColorjug4().setVisible(false);

				break;
			case "4":
				nombre_jugador1 = window.getV_principal().getPjug().getAsig_nombre1().getText();
				nombre_jugador2 = window.getV_principal().getPjug().getAsig_nombre2().getText();
				nombre_jugador3 = window.getV_principal().getPjug().getAsig_nombre3().getText();
				nombre_jugador4 = window.getV_principal().getPjug().getAsig_nombre4().getText();

				guardarnombre(nombre_jugador1);
				guardarnombre(nombre_jugador2);
				guardarnombre(nombre_jugador3);
				guardarnombre(nombre_jugador4);

				window.getV_principal().getPjug().getAsig_nombre1().setText("");
				window.getV_principal().getPjug().getAsig_nombre2().setText("");
				window.getV_principal().getPjug().getAsig_nombre3().setText("");
				window.getV_principal().getPjug().getAsig_nombre4().setText("");

				window.getV_principal().getPfic().getNombrejugador1().setText("" + participantes[0].getNombre());
				window.getV_principal().getPfic().getNombrejugador2().setText("" + participantes[1].getNombre());
				window.getV_principal().getPfic().getNombrejugador3().setText("" + participantes[2].getNombre());
				window.getV_principal().getPfic().getNombrejugador4().setText("" + participantes[3].getNombre());

				window.getJuego1().getPanel_izq().getJugador_1().setText("" + participantes[0].getNombre());
				window.getJuego1().getPanel_izq().getJugador_1().setVisible(true);

				window.getJuego1().getPanel_izq().getJugador_2().setText("" + participantes[1].getNombre());
				window.getJuego1().getPanel_izq().getJugador_2().setVisible(true);

				window.getJuego1().getPanel_izq().getJugador_3().setText("" + participantes[2].getNombre());
				window.getJuego1().getPanel_izq().getJugador_3().setVisible(true);

				window.getJuego1().getPanel_izq().getJugador_4().setText("" + participantes[3].getNombre());
				window.getJuego1().getPanel_izq().getJugador_4().setVisible(true);

				break;
			default:
				break;

			}

			window.getVista().mostrarOk("  Los nombres se han guardado exitosamente  ");
			window.getV_principal().getPjug().setVisible(false);
			window.getV_principal().getImg_fondo().setIcon(new ImageIcon("imagenes/Fondo3.gif"));
			window.getV_principal().getPfic().setVisible(true);
			window.getV_principal().getPfic().getGuardar_color().setVisible(true);

		}

		if (e.getActionCommand().equals("BACK")) {

			int volver = (int) window.getVista().mostrarYoN("¿Seguro de que quiere volver al inicio?");

			if (volver == 0) {
				window.getV_principal().getPjug().setVisible(false);
				window.getV_principal().getPfic().setVisible(false);
				window.getV_principal().getBack().setVisible(false);
				window.getV_principal().getImg_fondo().setIcon(new ImageIcon("imagenes/Fondo1.gif"));
				window.getV_principal().getPo().setVisible(true);

				window.getV_principal().getPjug().getAsig_nombre1().setVisible(false);
				window.getV_principal().getPjug().getPersona1().setVisible(false);
				window.getV_principal().getPjug().getAsig_nombre2().setVisible(false);
				window.getV_principal().getPjug().getPersona2().setVisible(false);
				window.getV_principal().getPjug().getAsig_nombre3().setVisible(false);
				window.getV_principal().getPjug().getPersona3().setVisible(false);
				window.getV_principal().getPjug().getAsig_nombre4().setVisible(false);
				window.getV_principal().getPjug().getPersona4().setVisible(false);
				window.getV_principal().getPjug().getGuardar_nombres().setVisible(false);
				window.getV_principal().getPjug().getAsignn().setVisible(false);

				window.getV_principal().getPjug().getAsig_nombre1().setText("");
				window.getV_principal().getPjug().getAsig_nombre2().setText("");
				window.getV_principal().getPjug().getAsig_nombre3().setText("");
				window.getV_principal().getPjug().getAsig_nombre4().setText("");
				


			}
		}

	}
	
	/**
	 * Acciones del mouse al cliquear
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param e
	 * @return void
	 **/
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Acciones del mouse al presionar
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param e
	 * @return void
	 **/
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	/**
	 * Acciones del mouse al dejar de presionar
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param e
	 * @return void
	 **/
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Cuando el mouse entra a la zona del boton
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param e
	 * @return void
	 **/
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(window.getV_principal().getPo().getJugar())) {
			window.getV_principal().getPo().getJugar().setForeground(Color.cyan);

		} else if (e.getSource().equals(window.getV_principal().getPo().getTutorial())) {
			window.getV_principal().getPo().getTutorial().setForeground(Color.cyan);

		} else if (e.getSource().equals(window.getV_principal().getPo().getCreditos())) {
			window.getV_principal().getPo().getCreditos().setForeground(Color.cyan);

		} else if (e.getSource().equals(window.getV_principal().getPtab().getFacil())) {
			window.getV_principal().getPtab().getFacil().setForeground(Color.cyan);
			window.getV_principal().getPtab().getTab6().setVisible(true);

		} else if (e.getSource().equals(window.getV_principal().getPtab().getInter())) {
			window.getV_principal().getPtab().getInter().setForeground(Color.cyan);
			window.getV_principal().getPtab().getTab9().setVisible(true);

		} else if (e.getSource().equals(window.getV_principal().getPtab().getDificil())) {
			window.getV_principal().getPtab().getDificil().setForeground(Color.cyan);
			window.getV_principal().getPtab().getTab12().setVisible(true);
		}
	}
	
	/**
	 * Cuando el mouse sale de la zona del boton
	 * 
	 * @author kevin, nicolas, daniela, katherine
	 * @param e
	 * @return void
	 **/
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(window.getV_principal().getPo().getJugar())) {
			window.getV_principal().getPo().getJugar().setForeground(Color.white);

		} else if (e.getSource().equals(window.getV_principal().getPo().getTutorial())) {
			window.getV_principal().getPo().getTutorial().setForeground(Color.white);

		} else if (e.getSource().equals(window.getV_principal().getPo().getCreditos())) {
			window.getV_principal().getPo().getCreditos().setForeground(Color.white);

		} else if (e.getSource().equals(window.getV_principal().getPtab().getFacil())) {
			window.getV_principal().getPtab().getFacil().setForeground(Color.white);
			window.getV_principal().getPtab().getTab6().setVisible(false);

		} else if (e.getSource().equals(window.getV_principal().getPtab().getInter())) {
			window.getV_principal().getPtab().getInter().setForeground(Color.white);
			window.getV_principal().getPtab().getTab9().setVisible(false);

		} else if (e.getSource().equals(window.getV_principal().getPtab().getDificil())) {
			window.getV_principal().getPtab().getDificil().setForeground(Color.white);
			window.getV_principal().getPtab().getTab12().setVisible(false);

		}
	}
	
	/**
	 * Getter and Setter de las variables
	 * 
	 * @author eclipse
	 * @param jugadores,window,participantes,dado,numeroalatoreo,serpiente_6x6_alien,escalera_6x6_alien,vueltas_for_9x9,
	 *  derecha9x9_alien, izquierda9x9_alien, escaleras_9x9_alien,serpiente_9x9_alien,salto_1,vueltas_for_planeta,
	 *   derecha6x6_planeta, izquierda6x6_planeta,erpiente_6x6_planeta,
	 *    escaleras_6x6_planeta, serpiente_6x6_estrella, escaleras_6x6_estrella,vueltas_for_estrella,
	 *     derecha6x6_estrella, izquierda6x6_estrella,serpiente_6x6_nave, escaleras_6x6_nave,vueltas_for_nave,
	 *      derecha6x6_nave, izquierda6x6_nave,derecha6x6_alien, izquierda6x6_alien,serpiente_6x6_alien, escaleras_6x6_alien,
	 *       vueltas_for,numeroalatoreo,jugadores, ubicacion, escritor, escritor2, escritor3
	 *       
	 * @return  jugadores,window,participantes,dado,numeroalatoreo,serpiente_6x6_alien,escalera_6x6_alien,vueltas_for_9x9,
	 *  derecha9x9_alien, izquierda9x9_alien, escaleras_9x9_alien,serpiente_9x9_alien,salto_1,vueltas_for_planeta,
	 *   derecha6x6_planeta, izquierda6x6_planeta,erpiente_6x6_planeta,
	 *    escaleras_6x6_planeta, serpiente_6x6_estrella, escaleras_6x6_estrella,vueltas_for_estrella,
	 *     derecha6x6_estrella, izquierda6x6_estrella,serpiente_6x6_nave, escaleras_6x6_nave,vueltas_for_nave,
	 *      derecha6x6_nave, izquierda6x6_nave,derecha6x6_alien, izquierda6x6_alien,serpiente_6x6_alien, escaleras_6x6_alien,
	 *       vueltas_for,numeroalatoreo,jugadores, ubicacion, escritor, escritor2, escritor3
	 **/
	public Jugadores[] getJugadores() {
		return participantes;
	}

	public void setJugadores(Jugadores[] jugadores) {
		this.participantes = jugadores;
	}

	public Ventana_general getWindow() {
		return window;
	}

	public void setWindow(Ventana_general window) {
		this.window = window;
	}

	public Jugadores[] getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Jugadores[] participantes) {
		this.participantes = participantes;
	}

	public int[] getDado() {
		return dado;
	}

	public void setDado(int[] dado) {
		this.dado = dado;
	}

	public int getNumeroalatoreo() {
		return numeroalatoreo;
	}

	public void setNumeroalatoreo(int numeroalatoreo) {
		this.numeroalatoreo = numeroalatoreo;
	}

	public int getSerpiente_6x6_alien() {
		return serpiente_6x6_alien;
	}

	public void setSerpiente_6x6_alien(int serpiente_6x6_alien) {
		this.serpiente_6x6_alien = serpiente_6x6_alien;
	}

	public int getEscaleras_6x6_alien() {
		return escaleras_6x6_alien;
	}

	public void setEscaleras_6x6_alien(int escaleras_6x6_alien) {
		this.escaleras_6x6_alien = escaleras_6x6_alien;
	}

	public int getVueltas_for() {
		return vueltas_for;
	}

	public void setVueltas_for(int vueltas_for) {
		this.vueltas_for = vueltas_for;
	}

	public int getDerecha6x6_alien() {
		return derecha6x6_alien;
	}

	public void setDerecha6x6_alien(int derecha6x6_alien) {
		this.derecha6x6_alien = derecha6x6_alien;
	}

	public int getIzquierda6x6_alien() {
		return izquierda6x6_alien;
	}

	public void setIzquierda6x6_alien(int izquierda6x6_alien) {
		this.izquierda6x6_alien = izquierda6x6_alien;
	}

	public int getSerpiente_6x6_nave() {
		return serpiente_6x6_nave;
	}

	public void setSerpiente_6x6_nave(int serpiente_6x6_nave) {
		this.serpiente_6x6_nave = serpiente_6x6_nave;
	}

	public int getEscaleras_6x6_nave() {
		return escaleras_6x6_nave;
	}

	public void setEscaleras_6x6_nave(int escaleras_6x6_nave) {
		this.escaleras_6x6_nave = escaleras_6x6_nave;
	}

	public int getVueltas_for_nave() {
		return vueltas_for_nave;
	}

	public void setVueltas_for_nave(int vueltas_for_nave) {
		this.vueltas_for_nave = vueltas_for_nave;
	}

	public int getDerecha6x6_nave() {
		return derecha6x6_nave;
	}

	public void setDerecha6x6_nave(int derecha6x6_nave) {
		this.derecha6x6_nave = derecha6x6_nave;
	}

	public int getIzquierda6x6_nave() {
		return izquierda6x6_nave;
	}

	public void setIzquierda6x6_nave(int izquierda6x6_nave) {
		this.izquierda6x6_nave = izquierda6x6_nave;
	}

	public int getSerpiente_6x6_estrella() {
		return serpiente_6x6_estrella;
	}

	public void setSerpiente_6x6_estrella(int serpiente_6x6_estrella) {
		this.serpiente_6x6_estrella = serpiente_6x6_estrella;
	}

	public int getEscaleras_6x6_estrella() {
		return escaleras_6x6_estrella;
	}

	public void setEscaleras_6x6_estrella(int escaleras_6x6_estrella) {
		this.escaleras_6x6_estrella = escaleras_6x6_estrella;
	}

	public int getVueltas_for_estrella() {
		return vueltas_for_estrella;
	}

	public void setVueltas_for_estrella(int vueltas_for_estrella) {
		this.vueltas_for_estrella = vueltas_for_estrella;
	}

	public int getDerecha6x6_estrella() {
		return derecha6x6_estrella;
	}

	public void setDerecha6x6_estrella(int derecha6x6_estrella) {
		this.derecha6x6_estrella = derecha6x6_estrella;
	}

	public int getIzquierda6x6_estrella() {
		return izquierda6x6_estrella;
	}

	public void setIzquierda6x6_estrella(int izquierda6x6_estrella) {
		this.izquierda6x6_estrella = izquierda6x6_estrella;
	}

	public int getSerpiente_6x6_planeta() {
		return serpiente_6x6_planeta;
	}

	public void setSerpiente_6x6_planeta(int serpiente_6x6_planeta) {
		this.serpiente_6x6_planeta = serpiente_6x6_planeta;
	}

	public int getEscaleras_6x6_planeta() {
		return escaleras_6x6_planeta;
	}

	public void setEscaleras_6x6_planeta(int escaleras_6x6_planeta) {
		this.escaleras_6x6_planeta = escaleras_6x6_planeta;
	}

	public int getVueltas_for_planeta() {
		return vueltas_for_planeta;
	}

	public void setVueltas_for_planeta(int vueltas_for_planeta) {
		this.vueltas_for_planeta = vueltas_for_planeta;
	}

	public int getDerecha6x6_planeta() {
		return derecha6x6_planeta;
	}

	public void setDerecha6x6_planeta(int derecha6x6_planeta) {
		this.derecha6x6_planeta = derecha6x6_planeta;
	}

	public int getIzquierda6x6_planeta() {
		return izquierda6x6_planeta;
	}

	public void setIzquierda6x6_planeta(int izquierda6x6_planeta) {
		this.izquierda6x6_planeta = izquierda6x6_planeta;
	}

	public int getSalto_1() {
		return salto_1;
	}

	public void setSalto_1(int salto_1) {
		this.salto_1 = salto_1;
	}

	public int getVueltas_for_9x9() {
		return vueltas_for_9x9;
	}

	public void setVueltas_for_9x9(int vueltas_for_9x9) {
		this.vueltas_for_9x9 = vueltas_for_9x9;
	}

	public int getDerecha9x9_alien() {
		return derecha9x9_alien;
	}

	public void setDerecha9x9_alien(int derecha9x9_alien) {
		this.derecha9x9_alien = derecha9x9_alien;
	}

	public int getIzquierda9x9_alien() {
		return izquierda9x9_alien;
	}

	public void setIzquierda9x9_alien(int izquierda9x9_alien) {
		this.izquierda9x9_alien = izquierda9x9_alien;
	}

	public int getEscaleras_9x9_alien() {
		return escaleras_9x9_alien;
	}

	public void setEscaleras_9x9_alien(int escaleras_9x9_alien) {
		this.escaleras_9x9_alien = escaleras_9x9_alien;
	}

	public int getSerpiente_9x9_alien() {
		return serpiente_9x9_alien;
	}

	public void setSerpiente_9x9_alien(int serpiente_9x9_alien) {
		this.serpiente_9x9_alien = serpiente_9x9_alien;
	}

}
