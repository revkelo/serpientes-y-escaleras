package co.edu.unbosque.controlador;

import co.edu.unbosque.vista.Consola;
import co.edu.unbosque.modelo.Jugadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
import co.edu.unbosque.vista.Ventana;
import javax.swing.Timer;

public class Controlador implements ActionListener {
	private Ventana vp;
	private Consola miconsola;
	private int personasjugando, numeroalatoreo;
	private Jugadores p1, p2, p3, p4, p5;
	int[] dado = { 1, 2, 3, 4, 5, 6 };

	public Controlador() {
		miconsola = new Consola();
		vp = new Ventana();
		p1 = new Jugadores();
		p2 = new Jugadores();
		p3 = new Jugadores();
		p4 = new Jugadores();
		p5 = new Jugadores();
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
		vp.getMenu1().getJugarbotontableros().addActionListener(this);
		vp.getMenu1().getJugarbotontableros().setActionCommand("menu_jugar");

	}

	public void guardarboton() {
	}

	public void guardarnombre1(String nombre) {
		if (p1.getNombre() == null) {
			p1 = new Jugadores(nombre);
			JOptionPane.showMessageDialog(null, "jugador 1 listo");
		} else if (p2.getNombre() == null) {
			p2 = new Jugadores(nombre);
			JOptionPane.showMessageDialog(null, "jugador 2 listo");
		} else if (p3.getNombre() == null) {
			p3 = new Jugadores(nombre);

			JOptionPane.showMessageDialog(null, "jugador 3 listo");
		} else if (p4.getNombre() == null) {
			p4 = new Jugadores(nombre);

			JOptionPane.showMessageDialog(null, "jugador 4 listo");
		} else if (p5.getNombre() == null) {
			p5 = new Jugadores(nombre);

			JOptionPane.showMessageDialog(null, "jugador 5 listo");
		}

		else {
			JOptionPane.showMessageDialog(null, "jugadores listos");
		}
	}

	public void dadotirar() {
		Random r = new Random();
		int numeroalatoreo = dado[r.nextInt(6)];
		JOptionPane.showMessageDialog(null, "" + numeroalatoreo);
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

		if (e.getActionCommand().equals("tutorialboton")) {
			vp.getTutorialboton().addActionListener(null);
	
			JOptionPane.showMessageDialog(null, "hola bb");

		}
		if (e.getActionCommand().equals("menu_jugar")) {
			vp.getMenu1().setVisible(false);
			vp.getJuego1().setVisible(true);

		}
		if (e.getActionCommand().equals("menu_guardar")) {
			guardarboton();
			vp.getMenu1().getJugadoresmenu().setVisible(false);
			vp.getMenu1().getTablerosmenu().setVisible(true);
		}
		if (e.getActionCommand().equals("randomclick")) {
			dadotirar();

		}
	}

	public Consola getMiconsola() {
		return miconsola;
	}

	public void setMiconsola(Consola miconsola) {
		this.miconsola = miconsola;
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

	public Jugadores getP1() {
		return p1;
	}

	public void setP1(Jugadores p1) {
		this.p1 = p1;
	}

	public Jugadores getP2() {
		return p2;
	}

	public void setP2(Jugadores p2) {
		this.p2 = p2;
	}

	public Jugadores getP3() {
		return p3;
	}

	public void setP3(Jugadores p3) {
		this.p3 = p3;
	}

	public Jugadores getP4() {
		return p4;
	}

	public void setP4(Jugadores p4) {
		this.p4 = p4;
	}

	public Jugadores getP5() {
		return p5;
	}

	public void setP5(Jugadores p5) {
		this.p5 = p5;
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
