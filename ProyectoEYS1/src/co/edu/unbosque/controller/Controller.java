package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import co.edu.unbosque.view.Panel_opc;
import co.edu.unbosque.view.Ventana_general;
import co.edu.unbosque.view.Ventana_menus;
import co.edu.unbosque.view.Vista_ventana;
import co.edu.unbosque.model.Jugadores;
import co.edu.unbosque.view.Panel_escoger_jugadores;

public class Controller implements ActionListener, MouseListener {

	private Ventana_general window;
	private Jugadores participantes[];
	private int[] dado = { 1, 2, 3, 4, 5, 6 };
	int estado_inicial_1 = 11, estado_inicial_2 = 0;
	int salto_2 = 1, salto_1 = 0;
	int estado_3 = 11;
	int estado_4 = 0;
	int tab6_fila2 = 5;
	int tab6_fila3 = 0;
	int tab6_fila4 = 5;
	int tab6_fila5 = 0;
	int tab6_fila6 = 5;
	int estado_inicial_casillas = 0;

	public Controller() {

		window = new Ventana_general();
		participantes = new Jugadores[4];
		asignarOyentes();

	}

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

	public void eliminarnombres() {

		if (participantes[0] != null || participantes[0] == null) {
			participantes[0] = null;

		} else if (participantes[1] != null || participantes[1] == null) {
			participantes[1] = null;

		} else if (participantes[2] != null || participantes[2] == null) {
			participantes[2] = null;

		} else if (participantes[3] != null || participantes[3] == null) {
			participantes[3] = null;
		}
	}

	public void dadotirar() {
		Random r = new Random();
		int numeroalatoreo = dado[r.nextInt(6)];
		String numerotext = String.valueOf(numeroalatoreo);

		window.getJuego1().getNum_dado().setText(numerotext);
		System.out.println(numerotext);

	}

//	public void en_1_12x12() {
//
//		while (true) {
//
//			if (estado_inicial_casillas <= 10) {
//
//				System.out.println("\n////////////////////////////////\n");
//				System.out.println("CASILLA SUMA  " + estado_inicial_2);
//				salto_1 = estado_inicial_2 + salto_2;
//
//				window.getJuego1().getTab12().getPaneles()[11][salto_1]
//						.add(window.getJuego1().getTab12().getFicha_azul());
//
//				estado_inicial_2 = salto_1;
//				salto_1 = estado_3;
//
//				System.out.println("LO QUE QUEDO DE LA SUMA  " + estado_inicial_2);
//				System.out.println("////////////////////////////////");
//			}
//			if (estado_inicial_casillas == 11) {
//
//				salto_1 = 12 - salto_2;
//				System.out.println("lo q viene del 0 al 11 " + estado_inicial_2);
//				System.out.println("posicion x y de y " + salto_1);
//				System.out.println("xd" + estado_3);
//				window.getJuego1().getTab12().getPaneles()[10][salto_1]
//						.add(window.getJuego1().getTab12().getFicha_azul());
//
//			}
//			if (estado_inicial_casillas >= 12 && estado_inicial_casillas <= 22) {
//				salto_1 = estado_3 - salto_2;
//
//				window.getJuego1().getTab12().getPaneles()[10][salto_1]
//						.add(window.getJuego1().getTab12().getFicha_azul());
//				estado_3 = salto_1;
//			}
//
//			if (estado_inicial_casillas == 23) {
//				salto_1 = 0;
//				System.out.println("lo q viene del 0 al 11 " + estado_inicial_2);
//				System.out.println("posicion x y de y " + salto_1);
//				System.out.println("xd" + estado_3);
//				window.getJuego1().getTab12().getPaneles()[9][salto_1]
//						.add(window.getJuego1().getTab12().getFicha_azul());
//			}
//			if (estado_inicial_casillas >= 24 && estado_inicial_casillas <= 34) {
//				salto_1 = estado_4 + salto_2;
//
//				window.getJuego1().getTab12().getPaneles()[9][salto_1]
//						.add(window.getJuego1().getTab12().getFicha_azul());
//				estado_4 = salto_1;
//			}
//			window.getJuego1().getTab6().repaint();
//			estado_inicial_casillas++;
//			System.out.println((estado_inicial_casillas + 1) + "  CASILLA DONDE ESTA");
//			break;
//		}
//	}

	public void en_1_6x6() {
		while (true) {
			if (estado_inicial_casillas <= 4) {

				salto_1 = estado_inicial_2 + salto_2;

				window.getJuego1().getTab6().getPaneles()[5][salto_1].add(window.getJuego1().getTab6().getFicha_azul());

				estado_inicial_2 = salto_1;

				window.getJuego1().getTab6().repaint();
	
			}
			if (estado_inicial_casillas == 5) {
				salto_1 = 5;
				window.getJuego1().getTab6().getPaneles()[4][salto_1].add(window.getJuego1().getTab6().getFicha_azul());

			}
			if (estado_inicial_casillas >= 6 && estado_inicial_casillas <= 10) {
				salto_1 = tab6_fila2 - salto_2;

				window.getJuego1().getTab6().getPaneles()[4][salto_1].add(window.getJuego1().getTab6().getFicha_azul());
				tab6_fila2 = salto_1;
			}
			if (estado_inicial_casillas == 11) {
				salto_1 = 0;
				window.getJuego1().getTab6().getPaneles()[3][salto_1].add(window.getJuego1().getTab6().getFicha_azul());
			}
			if (estado_inicial_casillas >= 12 && estado_inicial_casillas <= 16) {
				salto_1 = tab6_fila3 + salto_2;

				window.getJuego1().getTab6().getPaneles()[3][salto_1].add(window.getJuego1().getTab6().getFicha_azul());
				tab6_fila3 = salto_1;
			}
			if (estado_inicial_casillas == 17) {
				salto_1 = 5;
				window.getJuego1().getTab6().getPaneles()[2][salto_1].add(window.getJuego1().getTab6().getFicha_azul());
			}
			if (estado_inicial_casillas >= 18 && estado_inicial_casillas <= 22) {
				salto_1 = tab6_fila4 - salto_2;

				window.getJuego1().getTab6().getPaneles()[2][salto_1].add(window.getJuego1().getTab6().getFicha_azul());
				tab6_fila4 = salto_1;
			}
			if (estado_inicial_casillas == 23) {
				salto_1 = 0;
				window.getJuego1().getTab6().getPaneles()[1][salto_1].add(window.getJuego1().getTab6().getFicha_azul());
			}
			if (estado_inicial_casillas >= 24 && estado_inicial_casillas <= 28) {
				salto_1 = tab6_fila5 + salto_2;

				window.getJuego1().getTab6().getPaneles()[1][salto_1].add(window.getJuego1().getTab6().getFicha_azul());
				tab6_fila5 = salto_1;
			}
			if (estado_inicial_casillas == 29) {
				salto_1 = 5;
				window.getJuego1().getTab6().getPaneles()[0][salto_1].add(window.getJuego1().getTab6().getFicha_azul());
			}
			if (estado_inicial_casillas >= 30 && estado_inicial_casillas <= 34) {
				salto_1 = tab6_fila6 - salto_2;

				window.getJuego1().getTab6().getPaneles()[0][salto_1].add(window.getJuego1().getTab6().getFicha_azul());
				tab6_fila6 = salto_1;
			}

			window.getJuego1().getTab6().repaint();
			System.out.println((estado_inicial_casillas + 2) + "  CASILLA DONDE ESTA");
			estado_inicial_casillas++;
			break;
		}
	}

//		switch (numeroalatoreo) {
//		case 6:
//			
//			salto_2 = estado_inicial_2 + 6;
//			window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//					.add(window.getJuego1().getTab12().getFicha_azul());
//			System.out.println("6 hpta");
//			break;
//		case 5:
//			salto_2 = estado_inicial_2 + 5;
//			window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//					.add(window.getJuego1().getTab12().getFicha_azul());
//			break;
//		case 4:
//
//			salto_2 = estado_inicial_2 + 4;
//			window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//					.add(window.getJuego1().getTab12().getFicha_azul());
//			break;
//		case 3:
//			salto_2 = estado_inicial_2 + 3;
//			window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//					.add(window.getJuego1().getTab12().getFicha_azul());
//			break;
//		case 2:
//			salto_2 = estado_inicial_2 + 2;
//			window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//					.add(window.getJuego1().getTab12().getFicha_azul());
//			break;
//		case 1:
//			salto_2 = estado_inicial_2 + 1;
//			window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//					.add(window.getJuego1().getTab12().getFicha_azul());
//			break;
//
//		default:
//			break;
//		}

	public void asignarOyentes() {

		window.getV_principal().getPo().getJugar().addActionListener(this);
		window.getV_principal().getPo().getJugar().addMouseListener(this);

		window.getV_principal().getPo().getTutorial().addActionListener(this);
		window.getV_principal().getPo().getTutorial().addMouseListener(this);

		window.getV_principal().getPo().getCreditos().addActionListener(this);
		window.getV_principal().getPo().getCreditos().addMouseListener(this);

		window.getV_principal().getPtab().getDificil().addActionListener(this);
		window.getV_principal().getPtab().getInter().addActionListener(this);
		window.getV_principal().getPtab().getFacil().addActionListener(this);

		window.getJuego1().getDado().addActionListener(this);

		window.getV_principal().getBack().addActionListener(this);
		window.getV_principal().getBack().addMouseListener(this);

		window.getV_principal().getPjug().getNumJug().addActionListener(this);
		window.getV_principal().getPjug().getNumJug().setActionCommand("lista_jugadores");
		window.getV_principal().getPjug().getGuardar_nombres().addActionListener(this);

		window.getV_principal().getPfic().getColorjug1().addActionListener(this);
		window.getV_principal().getPfic().getColorjug1().setActionCommand("color_jug1");
		window.getV_principal().getPfic().getColorjug2().addActionListener(this);
		window.getV_principal().getPfic().getColorjug2().setActionCommand("color_jug2");
		window.getV_principal().getPfic().getColorjug3().addActionListener(this);
		window.getV_principal().getPfic().getColorjug3().setActionCommand("color_jug3");
		window.getV_principal().getPfic().getColorjug4().addActionListener(this);
		window.getV_principal().getPfic().getColorjug4().setActionCommand("color_jug4");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();

		if (comando.equals("JUGAR")) {
			window.getV_principal().getImg_fondo().setIcon(new ImageIcon("imagenes/Fondo2.gif"));
			window.getV_principal().getPo().setVisible(false);
			window.getV_principal().getPjug().setVisible(true);
			window.getV_principal().getBack().setVisible(true);


		} else if (comando.equals("TUTORIAL")) {

			System.out.println("Oprime el botón tutorial");

		} else if (comando.equals("CREDITOS")) {

			System.out.println("Oprime el botón creditos");
		}

		if (comando.equals("6x6")) {
			window.getV_principal().setVisible(false);
			window.getJuego1().setVisible(true);
			window.getJuego1().getTab6().setVisible(true);
		}
		if (comando.equals("9x9")) {
			window.getV_principal().setVisible(false);
			window.getJuego1().setVisible(true);
			window.getJuego1().getTab9().setVisible(true);

		}
		if (comando.equals("12x12")) {
			window.getV_principal().setVisible(false);
			window.getJuego1().setVisible(true);
			window.getJuego1().getTab12().setVisible(true);

		}

		if (comando.equals("dado")) {

			en_1_6x6();

//			en_1_12x12();

//			dadotirar();

//			if (window.getJuego1().getTab12().getDivision_paneles1() == 12) {
//				int estado_inicial_1 = 11, estado_inicial_2 = 0;
//				int salto_2 = 0, salto_1 = 0;
//				window.getJuego1().getTab12().getPaneles()[estado_inicial_1][estado_inicial_2]
//						.remove(window.getJuego1().getTab12().getFicha_azul());

//				switch (numeroalatoreo) {
//				case 6:
//					salto_2 = estado_inicial_2 + 6;
//					window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//							.add(window.getJuego1().getTab12().getFicha_azul());
//					System.out.println("6 hpta");
//					break;
//				case 5:
//					salto_2 = estado_inicial_2 + 5;
//					window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//							.add(window.getJuego1().getTab12().getFicha_azul());
//					break;
//				case 4:
//
//					salto_2 = estado_inicial_2 + 4;
//					window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//							.add(window.getJuego1().getTab12().getFicha_azul());
//					break;
//				case 3:
//					salto_2 = estado_inicial_2 + 3;
//					window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//							.add(window.getJuego1().getTab12().getFicha_azul());
//					break;
//				case 2:
//					salto_2 = estado_inicial_2 + 2;
//					window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//							.add(window.getJuego1().getTab12().getFicha_azul());
//					break;
//				case 1:
//					salto_2 = estado_inicial_2 + 1;
//					window.getJuego1().getTab12().getPaneles()[estado_inicial_1][salto_2]
//							.add(window.getJuego1().getTab12().getFicha_azul());
//					break;
//		
//				default:
//					break;
//				}
			window.getJuego1().getTab12().repaint();
		}

		if (window.getJuego1().getTab6().getDivision_paneles1() == 6) {

		}
		if (window.getJuego1().getTab9().getDivision_paneles1() == 9) {

		}

		if (e.getActionCommand().equals("lista_jugadores")) {

			String jugadores = (String) window.getV_principal().getPjug().getNumJug().getSelectedItem();

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
		if (e.getActionCommand().equals("guardar1")) {

//			if (e.getActionCommand().equals("Color_jug1")) {
//				
//				String colores1 = (String) window.getPfic().getColorjug1().getSelectedItem();
	//
//				if (colores1.equals("Verde")) {
//					window.getPfic().getFicha_verde().setBounds(200, 70, 20, 50);
//					window.getPfic().getFicha_verde().setVisible(true);
//					//				window.getJuego1().getFverde().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFverde().setVisible(true);
//				} else if (colores1.equals("Rojo")) {
//					window.getPfic().getFicha_rosada().setBounds(200, 70, 100, 50);
//					window.getPfic().getFicha_roja().setVisible(true);
//					//				window.getJuego1().getFroja().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFroja().setVisible(true);
//				} else if (colores1.equals("Rosado")) {
//					window.getPfic().getFicha_rosada().setBounds(200, 70, 100, 50);
//					window.getPfic().getFicha_rosada().setVisible(true);
//					//				window.getJuego1().getFrosada().setVisible(true);
//				} else if (colores1.equals("Azul")) {
//					window.getPfic().getFicha_azul().setBounds(200, 70, 100, 50);
//					window.getPfic().getFicha_azul().setVisible(true);
//					//				window.getJuego1().getFazul().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFazul().setVisible(true);
//				}			
	//
//			}
//			
//			if (e.getActionCommand().equals("Color_jug2")) {
	//
//				String colores1 = (String) window.getPfic().getColorjug2().getSelectedItem();
	//
//				if (colores1.equals("Verde")) {
//					window.getPfic().getFicha_verde().setBounds(470, 245, 150, 120);
//					window.getPfic().getFicha_verde().setVisible(true);
//					//				window.getJuego1().getFverde().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFverde().setVisible(true);
//				} else if (colores1.equals("Rojo")) {
//					window.getPfic().getFicha_roja().setVisible(true);
//					//				window.getJuego1().getFroja().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFroja().setVisible(true);
//				} else if (colores1.equals("Rosado")) {
//					window.getPfic().getFicha_rosada().setBounds(470, 245, 150, 120);
//					window.getPfic().getFicha_rosada().setVisible(true);
//					//				window.getJuego1().getFrosada().setVisible(true);
//				} else if (colores1.equals("Azul")) {
//					window.getPfic().getFicha_azul().setBounds(470, 245, 150, 120);
//					window.getPfic().getFicha_azul().setVisible(true);
//					//				window.getJuego1().getFazul().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFazul().setVisible(true);
//				}			
	//
//			}
//			
//			if (e.getActionCommand().equals("Color_jug3")) {
	//
//				String colores1 = (String) window.getPfic().getColorjug3().getSelectedItem();
	//
//				if (colores1.equals("Verde")) {
//					window.getPfic().getFicha_verde().setBounds(470, 245, 150, 120);
//					window.getPfic().getFicha_verde().setVisible(true);
//					//				window.getJuego1().getFverde().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFverde().setVisible(true);
//				} else if (colores1.equals("Rojo")) {
//					window.getPfic().getFicha_roja().setVisible(true);
//					//				window.getJuego1().getFroja().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFroja().setVisible(true);
//				} else if (colores1.equals("Rosado")) {
//					window.getPfic().getFicha_rosada().setBounds(470, 245, 150, 120);
//					window.getPfic().getFicha_rosada().setVisible(true);
//					//				window.getJuego1().getFrosada().setVisible(true);
//				} else if (colores1.equals("Azul")) {
//					window.getPfic().getFicha_azul().setBounds(470, 245, 150, 120);
//					window.getPfic().getFicha_azul().setVisible(true);
//					//				window.getJuego1().getFazul().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFazul().setVisible(true);
//				}			
	//
//			}
//			
//			if (e.getActionCommand().equals("Color_jug4")) {
	//
//				String colores1 = (String) window.getPfic().getColorjug4().getSelectedItem();
	//
//				if (colores1.equals("Verde")) {
//					window.getPfic().getFicha_verde().setBounds(470, 245, 150, 120);
//					window.getPfic().getFicha_verde().setVisible(true);
//					//				window.getJuego1().getFverde().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFverde().setVisible(true);
//				} else if (colores1.equals("Rojo")) {
//					window.getPfic().getFicha_roja().setVisible(true);
//					//				window.getJuego1().getFroja().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFroja().setVisible(true);
//				} else if (colores1.equals("Rosado")) {
//					window.getPfic().getFicha_rosada().setBounds(470, 245, 150, 120);
//					window.getPfic().getFicha_rosada().setVisible(true);
//					//				window.getJuego1().getFrosada().setVisible(true);
//				} else if (colores1.equals("Azul")) {
//					window.getPfic().getFicha_azul().setBounds(470, 245, 150, 120);
//					window.getPfic().getFicha_azul().setVisible(true);
//					//				window.getJuego1().getFazul().setBounds(40, 275, 100, 80);
//					//				window.getJuego1().getFazul().setVisible(true);
//				}			
	//
//			}
			
				window.getVista().mostrarOk("  Los colores se han guardado exitosamente  ");
				
				window.getV_principal().getPfic().setVisible(false);
				window.getV_principal().getImg_fondo().setIcon(new ImageIcon("imagenes/Fondo4.gif"));
				window.getV_principal().getPfic().getGuardar_color().setVisible(false);
				window.getV_principal().getPtab().setVisible(true);

		
			}

		if (e.getActionCommand().equals("guardar")) {

			String jugadores = (String) window.getV_principal().getPjug().getNumJug().getSelectedItem();

			switch (jugadores) {

			case "1":

				String nombre_jugador1 = window.getV_principal().getPjug().getAsig_nombre1().getText();
				guardarnombre(nombre_jugador1);
				window.getV_principal().getPfic().getNombrejugador1().setText("" + participantes[0].getNombre());

				break;
			case "2":
				nombre_jugador1 = window.getV_principal().getPjug().getAsig_nombre1().getText();
				String nombre_jugador2 = window.getV_principal().getPjug().getAsig_nombre2().getText();
				guardarnombre(nombre_jugador1);
				guardarnombre(nombre_jugador2);
				window.getV_principal().getPfic().getNombrejugador1().setText("" + participantes[0].getNombre());
				window.getV_principal().getPfic().getNombrejugador2().setText("" + participantes[1].getNombre());

				break;
			case "3":
				nombre_jugador1 = window.getV_principal().getPjug().getAsig_nombre1().getText();
				nombre_jugador2 = window.getV_principal().getPjug().getAsig_nombre2().getText();
				String nombre_jugador3 = window.getV_principal().getPjug().getAsig_nombre3().getText();
				guardarnombre(nombre_jugador1);
				guardarnombre(nombre_jugador2);
				guardarnombre(nombre_jugador3);
				window.getV_principal().getPfic().getNombrejugador1().setText("" + participantes[0].getNombre());
				window.getV_principal().getPfic().getNombrejugador2().setText("" + participantes[1].getNombre());
				window.getV_principal().getPfic().getNombrejugador3().setText("" + participantes[2].getNombre());

				break;
			case "4":
				nombre_jugador1 = window.getV_principal().getPjug().getAsig_nombre1().getText();
				nombre_jugador2 = window.getV_principal().getPjug().getAsig_nombre2().getText();
				nombre_jugador3 = window.getV_principal().getPjug().getAsig_nombre3().getText();
				String nombre_jugador4 = window.getV_principal().getPjug().getAsig_nombre4().getText();
				guardarnombre(nombre_jugador1);
				guardarnombre(nombre_jugador2);
				guardarnombre(nombre_jugador3);
				guardarnombre(nombre_jugador4);
				window.getV_principal().getPfic().getNombrejugador1().setText("" + participantes[0].getNombre());
				window.getV_principal().getPfic().getNombrejugador2().setText("" + participantes[1].getNombre());
				window.getV_principal().getPfic().getNombrejugador3().setText("" + participantes[2].getNombre());
				window.getV_principal().getPfic().getNombrejugador4().setText("" + participantes[3].getNombre());

				break;
			default:
				break;
			}

			window.getVista().mostrarOk("  Los nombres se han guardado exitosamente  ");
			window.getV_principal().getPjug().setVisible(false);
			window.getV_principal().getImg_fondo().setIcon(new ImageIcon("imagenes/Fondo3.gif"));
			window.getV_principal().getPfic().setVisible(true);

		}

		if (e.getActionCommand().equals("BACK")) {

			int volver = (int) window.getVista().mostrarYoN("¿Seguro de que quiere volver al inicio?");

			if (volver == JOptionPane.YES_OPTION) {
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

				String comando1 = e.getActionCommand();

				if (comando1.equals("JUGAR")) {

					window.getV_principal().getPo().setVisible(false);
					window.getV_principal().getImg_fondo().setIcon(new ImageIcon("imagenes/Fondo2.gif"));
					window.getV_principal().getPjug().setVisible(true);

				} else if (comando1.equals("TUTORIAL")) {

					System.out.println("Oprime el botón tutorial");

				} else if (comando1.equals("CREDITOS")) {

					System.out.println("Oprime el botón creditos");
				}
			}
		}

//		if (e.getActionCommand().equals("color_jug_1")) {
//
//			String colores = (String) window.getV_principal().getPfic().getColorjug1().getSelectedItem();
//
//			if (colores.equals("Verde")) {
//
//				// window.getPfic().getFicha_verde().setBounds(470, 245, 150, 120);
//				window.getV_principal().getPfic().getFicha_verde().setVisible(true);
//				// window.getJuego1().getFverde().setBounds(40, 275, 100, 80);
//				// window.getJuego1().getFverde().setVisible(true);
//
//			} else if (colores.equals("Rojo")) {
//
//				window.getV_principal().getPfic().getFicha_roja().setVisible(true);
//				// window.getJuego1().getFroja().setBounds(40, 275, 100, 80);
//				// window.getJuego1().getFroja().setVisible(true);
//
//			} else if (colores.equals("Rosado")) {
//
//				// window.getPfic().getFicha_rosada().setBounds(470, 245, 150, 120);
//				window.getV_principal().getPfic().getFicha_rosada().setVisible(true);
//				// window.getJuego1().getFrosada().setVisible(true);
//
//			} else if (colores.equals("Azul")) {
//
//				// window.getPfic().getFicha_azul().setBounds(470, 245, 150, 120);
//				window.getV_principal().getPfic().getFicha_azul().setVisible(true);
//				// window.getJuego1().getFazul().setBounds(40, 275, 100, 80);
//				// window.getJuego1().getFazul().setVisible(true);
//
//			}
		}

	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(window.getV_principal().getPo().getJugar())) {
			window.getV_principal().getPo().getJugar().setForeground(Color.cyan);

		} else if (e.getSource().equals(window.getV_principal().getPo().getTutorial())) {
			window.getV_principal().getPo().getTutorial().setForeground(Color.cyan);

		} else if (e.getSource().equals(window.getV_principal().getPo().getCreditos())) {
			window.getV_principal().getPo().getCreditos().setForeground(Color.cyan);

		} else if (e.getSource().equals(window.getV_principal().getBack())) {
			window.getV_principal().getBack().setForeground(Color.cyan);

		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(window.getV_principal().getPo().getJugar())) {
			window.getV_principal().getPo().getJugar().setForeground(Color.white);

		} else if (e.getSource().equals(window.getV_principal().getPo().getTutorial())) {
			window.getV_principal().getPo().getTutorial().setForeground(Color.white);

		} else if (e.getSource().equals(window.getV_principal().getPo().getCreditos())) {
			window.getV_principal().getPo().getCreditos().setForeground(Color.white);

		} else if (e.getSource().equals(window.getV_principal().getBack())) {
			window.getV_principal().getBack().setForeground(Color.white);

		}

	}

	public Jugadores[] getJugadores() {
		return participantes;
	}

	public void setJugadores(Jugadores[] jugadores) {
		this.participantes = jugadores;
	}

}
