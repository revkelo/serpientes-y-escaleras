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
	private int personasjugando, numeroalatoreo = 6;
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

	public void ejecutar() {

		vp.setVisible(true);
		vp.getBtn3().addActionListener(this);
		vp.getBtn3().setActionCommand("salirclick");
		vp.getBtn2().addActionListener(this);
		vp.getBtn2().setActionCommand("mostrarclick");
		vp.getBtn1().addActionListener(this);
		vp.getBtn1().setActionCommand("jugarclick");
		vp.getBtn4ram().addActionListener(this);
		vp.getBtn4ram().setActionCommand("randomclick");

	}

	private static void delaySegundo() {
		
		
		
		
		
//		try {
//		    TimeUnit.SECONDS.sleep(1);
//		} catch (InterruptedException ie) {
//		    Thread.currentThread().interrupt();
//		}
	}

	public void movimiento_ficha_roja() {
		int estado_inicial_ficha_roja = 523, saltos_ficha_roja;

		if (numeroalatoreo == 6) {
			for (int i = 0; i < 6; i++) {
//				delaySegundo();
			saltos_ficha_roja = estado_inicial_ficha_roja += 82;
			vp.getFicha_r().setBounds(saltos_ficha_roja, 605, 60, 40);
			}
		}
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
		if (e.getActionCommand().equals("jugarclick")) {

			JOptionPane.showMessageDialog(null, "Bienvenido a Escaleras y serpientes");
			int res = JOptionPane.showConfirmDialog(null, "Quieres jugar?", "Pregunta", JOptionPane.YES_NO_OPTION);

			if (res == 0) {

				personasjugando = Integer
						.parseInt(JOptionPane.showInputDialog("Maximo 5 personas\n¿Cuantas personas vas a jugar?"));
				if (personasjugando == 5) {

					String p1 = JOptionPane.showInputDialog("Jugador 1\nNombre:");
					String p2 = JOptionPane.showInputDialog("Jugador 2\nNombre:");
					String p3 = JOptionPane.showInputDialog("Jugador 3\nNombre:");
					String p4 = JOptionPane.showInputDialog("Jugador 4\nNombre:");
					String p5 = JOptionPane.showInputDialog("Jugador 5\nNombre:");
					guardarnombre1(p1);
					guardarnombre1(p2);
					guardarnombre1(p3);
					guardarnombre1(p4);
					guardarnombre1(p5);
				} else if (personasjugando == 4) {
					String p1 = JOptionPane.showInputDialog("Jugador 1\nNombre:");
					String p2 = JOptionPane.showInputDialog("Jugador 2\nNombre:");
					String p3 = JOptionPane.showInputDialog("Jugador 3\nNombre:");
					String p4 = JOptionPane.showInputDialog("Jugador 4\nNombre:");
					guardarnombre1(p1);
					guardarnombre1(p2);
					guardarnombre1(p3);
					guardarnombre1(p4);
				} else if (personasjugando == 3) {
					String p1 = JOptionPane.showInputDialog("Jugador 1\nNombre:");
					String p2 = JOptionPane.showInputDialog("Jugador 2\nNombre:");
					String p3 = JOptionPane.showInputDialog("Jugador 3\nNombre:");
					guardarnombre1(p1);
					guardarnombre1(p2);
					guardarnombre1(p3);
				} else if (personasjugando == 2) {
					String p1 = JOptionPane.showInputDialog("Jugador 1\nNombre:");
					String p2 = JOptionPane.showInputDialog("Jugador 2\nNombre:");
					guardarnombre1(p1);
					guardarnombre1(p2);

				} else if (personasjugando == 1) {
					String p1 = JOptionPane.showInputDialog("Jugador 1\nNombre:");
					guardarnombre1(p1);
				} else {
					JOptionPane.showMessageDialog(null, "Maximo 5 personas");
				}
				vp.getJug1().setText(p1.getNombre());
				vp.getJug2().setText(p2.getNombre());
				vp.getJug3().setText(p3.getNombre());
				vp.getJug4().setText(p4.getNombre());
				vp.getJug5().setText(p5.getNombre());
			} else if (res == 1) {
				JOptionPane.showMessageDialog(null, "Ah bueno");

			}
		}
		if (e.getActionCommand().equals("salirclick")) {
			System.exit(0);

		}

		if (e.getActionCommand().equals("mostrarclick")) {
//			vista.getPdatos().getLista_nombre().removeActionListener(this);
//			vista.getPdatos().getLista_nombre().removeAllItems();
//			JOptionPane.showMessageDialog(null, "Arroz con pollo");
//			vp.getAmongus().setVisible(true);
//			JOptionPane.showMessageDialog(null, "ta tiste?");
//			vp.getAmongus().setVisible(false);
//			vp.getBtn3().removeActionListener(null);
//			vp.getBtn3().removeAll();

		}
		if (e.getActionCommand().equals("randomclick")) {
			// dadotirar();
			// vp.getDadopng().setVisible(false);
			// vp.getDado().setVisible(true);
			// JOptionPane.showMessageDialog(null, "Dado movimiento");
			// vp.getDadopng().setVisible(true);
			// vp.getDado().setVisible(false);
			movimiento_ficha_roja();

		}
	}
}
