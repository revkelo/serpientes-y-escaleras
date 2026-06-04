/**
 * Paquete vista que gestiona la interfaz grafica
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel destinado a que el usuario escoja la ficha que desea en el juego
 * @author Daniela
 * @author Nicolas
 * @author Kevin
 * @author Katherine
 * @version 1.1
 */

public class Izq_juego_panel extends JPanel {
	/**
	 * Atributos tipo JLabel donde aparecen los nombres de los jugadores
	 */
	private JLabel jugador_1, jugador_2, jugador_3, jugador_4, turno,jugadores_1;

	/**
	 * Atributo tipo JLabel donde aparece la casilla actual de cada jugador
	 */
	private JLabel cas_1,cas_2,cas_3,cas_4;

	/**
	 * Atributo tipo JLabel donde aparece el turno del jugador
	 */
	private JLabel tur_jug1;

	/**
	 * Metodo constructor
	 */

	public Izq_juego_panel() {
		setLayout(null);
		setBounds(0, 0, 200, 200);
		setOpaque(false);
		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */

	private void inicializarComponentes() {

		jugador_1 = new JLabel("nombre 1");
		jugador_1 .setBounds(50, 100, 200, 50);
		jugador_1 .setBackground(new Color(108, 246, 248, 0));
		jugador_1 .setFont(new Font("cooper black", 0, 30));
		jugador_1 .setForeground(Color.white);
		jugador_1.setVisible(false);

		jugador_2 = new JLabel("nombre 2");
		jugador_2 .setBounds(50, 150, 200, 50);
		jugador_2 .setBackground(new Color(108, 246, 248, 0));
		jugador_2 .setFont(new Font("cooper black", 0, 30));
		jugador_2 .setForeground(Color.white);
		jugador_2.setVisible(false);

		jugador_3 = new JLabel("nombre 3");
		jugador_3 .setBounds(50, 200, 200, 50);
		jugador_3 .setBackground(new Color(108, 246, 248, 0));
		jugador_3 .setFont(new Font("cooper black", 0, 30));
		jugador_3 .setForeground(Color.white);
		jugador_3.setVisible(false);

		jugador_4 = new JLabel("nombre 4");
		jugador_4 .setBounds(50, 250, 200, 50);
		jugador_4 .setBackground(new Color(108, 246, 248, 0));
		jugador_4 .setFont(new Font("cooper black", 0, 30));
		jugador_4 .setForeground(Color.white);
		jugador_4.setVisible(false);

		tur_jug1= new JLabel("Turno de:");
		tur_jug1.setBounds(20, 300, 200, 300);
		tur_jug1.setBackground(new Color(108, 246, 248, 0));
		tur_jug1.setFont(new Font("cooper black", 0, 20));
		tur_jug1.setForeground(Color.white);
		tur_jug1.setVisible(true);

		jugadores_1= new JLabel("Jugadores");
		jugadores_1.setBounds(50, -100, 200, 300);
		jugadores_1.setBackground(new Color(108, 246, 248, 0));
		jugadores_1.setFont(new Font("cooper black", 0, 40));
		jugadores_1.setForeground(Color.white);
		jugadores_1.setVisible(true);		

		jugadores_1= new JLabel("Jugadores");
		jugadores_1.setBounds(50, -100, 200, 300);
		jugadores_1.setBackground(new Color(108, 246, 248, 0));
		jugadores_1.setFont(new Font("cooper black", 0, 30));
		jugadores_1.setForeground(Color.white);
		jugadores_1.setVisible(true);


		cas_1= new JLabel("24");
		cas_1.setBounds(250, 105, 250, 50);
		cas_1.setBackground(new Color(108, 246, 248, 0));
		cas_1.setFont(new Font("cooper black", 0, 20));
		cas_1.setForeground(Color.white);
		cas_1.setVisible(false);

		cas_2= new JLabel("12");
		cas_2.setBounds(250, 155, 250, 50);
		cas_2.setBackground(new Color(108, 246, 248, 0));
		cas_2.setFont(new Font("cooper black", 0, 20));
		cas_2.setForeground(Color.white);
		cas_2.setVisible(false);

		cas_3= new JLabel("13");
		cas_3.setBounds(250, 205, 250, 50);
		cas_3.setBackground(new Color(108, 246, 248, 0));
		cas_3.setFont(new Font("cooper black", 0, 20));
		cas_3.setForeground(Color.white);
		cas_3.setVisible(false);

		cas_4= new JLabel("1");
		cas_4.setBounds(250, 255, 250, 50);
		cas_4.setBackground(new Color(108, 246, 248, 0));
		cas_4.setFont(new Font("cooper black", 0, 20));
		cas_4.setForeground(Color.white);
		cas_4.setVisible(false);

		turno = new JLabel("");
		turno .setBounds(20, 350, 200, 300);
		turno .setBackground(new Color(108, 246, 248, 0));
		turno .setFont(new Font("cooper black", 0, 40));
		turno .setForeground(Color.white);

		add(cas_1);
		add(cas_2);
		add(cas_3);
		add(cas_4);
		add(jugadores_1);
		add(tur_jug1);
		add(jugador_1);
		add(jugador_2);
		add(jugador_3);
		add(jugador_4);
		add(turno);

	}

	/**
	 * @param jugador_1, jugador_2, jugador_3, jugador_4, turno,jugadores_1,cas_1,cas_2,cas_3,cas_4, tur_jug1
	 * @return jugador_1, jugador_2, jugador_3, jugador_4, turno,jugadores_1,cas_1,cas_2,cas_3,cas_4, tur_jug1
	 */
	public JLabel getJugador_1() {
		return jugador_1;
	}

	public void setJugador_1(JLabel jugador_1) {
		this.jugador_1 = jugador_1;
	}

	public JLabel getJugador_2() {
		return jugador_2;
	}

	public void setJugador_2(JLabel jugador_2) {
		this.jugador_2 = jugador_2;
	}

	public JLabel getJugador_3() {
		return jugador_3;
	}

	public void setJugador_3(JLabel jugador_3) {
		this.jugador_3 = jugador_3;
	}

	public JLabel getJugador_4() {
		return jugador_4;
	}

	public void setJugador_4(JLabel jugador_4) {
		this.jugador_4 = jugador_4;
	}

	public JLabel getTurno() {
		return turno;
	}

	public void setTurno(JLabel turno) {
		this.turno = turno;
	}

	public JLabel getTur_jug1() {
		return tur_jug1;
	}

	public void setTur_jug1(JLabel tur_jug1) {
		this.tur_jug1 = tur_jug1;
	}

	public JLabel getJugadores_1() {
		return jugadores_1;
	}

	public void setJugadores_1(JLabel jugadores_1) {
		this.jugadores_1 = jugadores_1;
	}

	public JLabel getCas_1() {
		return cas_1;
	}

	public void setCas_1(JLabel cas_1) {
		this.cas_1 = cas_1;
	}

	public JLabel getCas_2() {
		return cas_2;
	}

	public void setCas_2(JLabel cas_2) {
		this.cas_2 = cas_2;
	}

	public JLabel getCas_3() {
		return cas_3;
	}

	public void setCas_3(JLabel cas_3) {
		this.cas_3 = cas_3;
	}

	public JLabel getCas_4() {
		return cas_4;
	}

	public void setCas_4(JLabel cas_4) {
		this.cas_4 = cas_4;
	}



}
