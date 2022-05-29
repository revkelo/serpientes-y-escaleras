package co.edu.unbosque.controlador;

import co.edu.unbosque.modelo.Jugadores;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import co.edu.unbosque.vista.Ventana;

public class Controlador implements ActionListener {
	private Ventana vp;
	private int personasjugando, numeroalatoreo = 0;
	private Jugadores jugadores[];
	private Jugadores p1, p2, p3, p4, p5;
	
	int[] dado = { 1, 2, 3, 4, 5, 6 };

	public Controlador() {
		vp = new Ventana();
		jugadores = new Jugadores[5];
		ejecutar();

	}

	public void ejecutar() {

		vp.setVisible(true);
		vp.getJugarboton().addActionListener(this);
		vp.getJugarboton().setActionCommand("jugarboton");
		vp.getSalirboton().addActionListener(this);
		vp.getSalirboton().setActionCommand("salirboton");
		vp.getTutorialboton().addActionListener(this);
		vp.getTutorialboton().setActionCommand("tutorialboton");
		vp.getMenu1().getGuardar_nombres().addActionListener(this);
		vp.getMenu1().getGuardar_nombres().setActionCommand("menu_guardar");
		vp.getMenu1().getTablero4x4().addActionListener(this);
		vp.getMenu1().getTablero4x4().setActionCommand("menu_jugar_6x6");
		vp.getMenu1().getTablero8x8().addActionListener(this);
		vp.getMenu1().getTablero8x8().setActionCommand("menu_jugar_8x8");
		vp.getMenu1().getTablero12x12().addActionListener(this);
		vp.getMenu1().getTablero12x12().setActionCommand("menu_jugar_10x10");
		vp.getMenu1().getNumJug().addActionListener(this);
		vp.getMenu1().getNumJug().setActionCommand("lista_jugadores");
		vp.getJuego1().getBtn4ram().addActionListener(this);
		vp.getJuego1().getBtn4ram().setActionCommand("randomclick");
		vp.getJuego1().getMoverficha().addActionListener(this);
		vp.getJuego1().getMoverficha().setActionCommand("mover");

	}

	public void guardarnombre1(String nombre) {
		p1 = new Jugadores(nombre);
		JOptionPane.showMessageDialog(null, "jugador 1 listo");
	}

	public void guardarnombre2() {
		if (p1 == null) {
			if (vp.getMenu1().getNombre1().getText() != null) {
//				String nombre_jugador1 = vp.getMenu1().getNombre1().getText();
				String p12 = JOptionPane.showInputDialog("Jugador 1\nNombre:");
				p1 = new Jugadores(p12);

//			} else if (jugadores[1] == null) {
//				if (vp.getMenu1().getNombre2().getText() != null) {
//					String nombre_jugador2 = vp.getMenu1().getNombre2().getText();
//					jugadores[1] = new Jugadores(nombre_jugador2);
//				}
//			} else if (jugadores[2] == null) {
//				if (vp.getMenu1().getNombre3().getText() != null) {
//					String nombre_jugador3 = vp.getMenu1().getNombre3().getText();
//					jugadores[2] = new Jugadores(nombre_jugador3);
//
//				}
//			} else if (jugadores[3] == null) {
//				if (vp.getMenu1().getNombre4().getText() != null) {
//					String nombre_jugador4 = vp.getMenu1().getNombre4().getText();
//					jugadores[3] = new Jugadores(nombre_jugador4);
//
//				}
//			}
			}
		}

	}

	public void dadotirar() {
		Random r = new Random();
		int numeroalatoreo = dado[r.nextInt(6)];
		String numerotext = String.valueOf(numeroalatoreo);
		vp.getJuego1().getDadopng().setVisible(false);
		vp.getJuego1().getDado().setVisible(true);
		vp.getJuego1().getRandom_numero().setText(numerotext);
		return;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("jugarboton")) {
			vp.getMenu1().setVisible(true);
			vp.setVisible(false);
		}
		if (e.getActionCommand().equals("salirboton")) {
			System.exit(0);

		}
		if (e.getActionCommand().equals("lista_jugadores")) {
			String jugadores1 = (String) vp.getMenu1().getNumJug().getSelectedItem();

			if (jugadores1.equals("1")) {
				vp.getMenu1().getNombre1().setVisible(true);
				vp.getMenu1().getPersona1().setVisible(true);
				vp.getMenu1().getNombre2().setVisible(false);
				vp.getMenu1().getPersona2().setVisible(false);
				vp.getMenu1().getNombre3().setVisible(false);
				vp.getMenu1().getPersona3().setVisible(false);
				vp.getMenu1().getNombre4().setVisible(false);
				vp.getMenu1().getPersona4().setVisible(false);
				vp.getMenu1().getGuardar_nombres().setVisible(true);

			} else if (jugadores1.equals("2")) {

				vp.getMenu1().getNombre1().setVisible(true);
				vp.getMenu1().getPersona1().setVisible(true);
				vp.getMenu1().getNombre2().setVisible(true);
				vp.getMenu1().getPersona2().setVisible(true);
				vp.getMenu1().getNombre3().setVisible(false);
				vp.getMenu1().getPersona3().setVisible(false);
				vp.getMenu1().getNombre4().setVisible(false);
				vp.getMenu1().getPersona4().setVisible(false);
				vp.getMenu1().getGuardar_nombres().setVisible(true);

			} else if (jugadores1.equals("3")) {

				vp.getMenu1().getNombre1().setVisible(true);
				vp.getMenu1().getPersona1().setVisible(true);
				vp.getMenu1().getNombre2().setVisible(true);
				vp.getMenu1().getPersona2().setVisible(true);
				vp.getMenu1().getNombre3().setVisible(true);
				vp.getMenu1().getPersona3().setVisible(true);
				vp.getMenu1().getNombre4().setVisible(false);
				vp.getMenu1().getPersona4().setVisible(false);
				vp.getMenu1().getGuardar_nombres().setVisible(true);

			} else if (jugadores1.equals("4")) {
				vp.getMenu1().getNombre1().setVisible(true);
				vp.getMenu1().getPersona1().setVisible(true);
				vp.getMenu1().getNombre2().setVisible(true);
				vp.getMenu1().getPersona2().setVisible(true);
				vp.getMenu1().getNombre3().setVisible(true);
				vp.getMenu1().getPersona3().setVisible(true);
				vp.getMenu1().getNombre4().setVisible(true);
				vp.getMenu1().getPersona4().setVisible(true);
				vp.getMenu1().getGuardar_nombres().setVisible(true);
			}

		}

		if (e.getActionCommand().equals("tutorialboton"))

		{
			vp.getTutorialboton().removeActionListener(this);

			JOptionPane.showMessageDialog(null, "Se duplica");

		}
		if (e.getActionCommand().equals("menu_jugar_6x6")) {
			vp.getMenu1().setVisible(false);
			vp.getJuego1().getTablero1().setDivision_paneles1(4);
			vp.getJuego1().getTablero1().setDivision_paneles2(4);
			vp.getJuego1().getTablero1().setNumero_de_paneles1(4);
			vp.getJuego1().getTablero1().setNumero_de_paneles2(4);

			vp.getMiconsola().imprimirString("tablero cambiado 4 x 4");
			vp.getJuego1().setVisible(true);

		}
		if (e.getActionCommand().equals("menu_jugar_8x8")) {
			vp.getMenu1().setVisible(false);
			vp.getJuego1().setVisible(true);

		}
		if (e.getActionCommand().equals("menu_jugar_10x10")) {
			vp.getMenu1().setVisible(false);
			vp.getJuego1().getTablero1().setDivision_paneles1(10);
			vp.getJuego1().getTablero1().setDivision_paneles2(10);
			vp.getJuego1().getTablero1().setNumero_de_paneles1(10);
			vp.getJuego1().getTablero1().setNumero_de_paneles2(10);
			vp.getMiconsola().imprimirString("tablero cambiado 12 x 12");
			vp.getJuego1().setVisible(true);

		}
		if (e.getActionCommand().equals("menu_guardar")) {
			String lista = (String) vp.getMenu1().getNumJug().getSelectedItem();
			if (lista.equals("1")) {
//				String nombre_jugador1 = vp.getMenu1().getNombre1().getText();
//				guardarnombre1(nombre_jugador1);
//				guardarnombre2();
			}
			vp.getMenu1().getJugadoresmenu().setVisible(false);
			vp.getMenu1().getTablerosmenu().setVisible(true);
		}
		if (e.getActionCommand().equals("randomclick")) {
			dadotirar();
		}
		if (e.getActionCommand().equals("mover")) {
			vp.getJuego1().getTablero1().setDivision_paneles1(4);
			vp.getJuego1().getTablero1().setDivision_paneles2(4);
			vp.getJuego1().getTablero1().setNumero_de_paneles1(4);
			vp.getJuego1().getTablero1().setNumero_de_paneles2(4);
//			vp.getJuego1().getTablero1().getPaneles()[7][0].remove(vp.getJuego1().getTablero1().getFicha_azul());
		}
	}

	public Ventana getVp() {
		return vp;
	}

	public void setVp(Ventana vp) {
		this.vp = vp;
	}

	public int getPersonasjugando() {
		return personasjugando;
	}

	public void setPersonasjugando(int personasjugando) {
		this.personasjugando = personasjugando;
	}

	public int getNumeroalatoreo() {
		return numeroalatoreo;
	}

	public void setNumeroalatoreo(int numeroalatoreo) {
		this.numeroalatoreo = numeroalatoreo;
	}

	public int[] getDado() {
		return dado;
	}

	public void setDado(int[] dado) {
		this.dado = dado;
	}

}
