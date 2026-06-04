/**
 * Paquete vista que gestiona la interfaz grafica
 */

package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel destinado a que el usuario escoja la ficha que desea en el juego
 * @author Daniela
 * @author Nicolas
 * @author Kevin
 * @author Katherine
 * @version 1.1
 */

public class Panel_escoger_jugadores extends JPanel {

	/**
	 * Atributos tipo JLabel que guian al usuario dentro del juego
	 */
	private JLabel listjug, asignn;

	/**
	 * Atributo tipo JComboBox para que el usuario elija el numero de jugadores
	 */

	private JComboBox<String> numJug;

	/**
	 * Arreglo tipo String que contiene las opciones de cuantos jugadores pueden participar
	 */
	private String jugadores[] = { "1", "2", "3", "4" };

	/**
	 * Atributo tipo TextField para que el o los usuarios ingresen su apodo o nombre dentro del juego
	 */
	private JTextField asig_nombre1, asig_nombre2, asig_nombre3, asig_nombre4;

	/**
	 * Atributo tipo JLabel para que el o los usuarios entiendan el numero de jugador
	 */
	private JLabel jugador1, jugador2, jugador3, jugador4;

	/**
	 * Atributo tipo JButton que hara entender al usuario que los nombres se guardaron correctamente
	 */
	private JButton guardar_nombres;

	/**
	 * Metodo constructor
	 */
	public Panel_escoger_jugadores() {

		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));

		inicializarComponentes();

		setVisible(false);

	}

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */

	private void inicializarComponentes() {


		listjug = new JLabel ("¿Cuántas personas jugaran?");
		listjug.setBounds(80, 20, 300, 50);
		listjug.setBackground(new Color(108, 246, 248, 0));
		listjug.setFont(new Font("cooper black", 0, 20));
		listjug.setForeground(Color.WHITE);
		add(listjug);

		asignn = new JLabel ("Asigne los nombres: ");
		asignn.setBounds(20, 60, 250, 50);
		asignn.setBackground(new Color(108, 246, 248, 0));
		asignn.setFont(new Font("cooper black", 0, 20));
		asignn.setForeground(Color.WHITE);
		asignn.setVisible(false);
		add(asignn);

		numJug = new JComboBox <String> (jugadores);
		numJug.setBounds(410, 40, 50, 25);
		numJug.setBackground(new Color(108, 246, 248, 0));
		numJug.setFont(new Font("cooper black", 0, 20));
		numJug.setForeground(Color.white);
		add(numJug);

		asig_nombre1 = new JTextField();
		asig_nombre1.setBounds(150, 120, 200, 30);
		asig_nombre1.setFont(new Font("cooper black", 0, 20));
		asig_nombre1.setVisible(false);
		add(asig_nombre1);

		asig_nombre2 = new JTextField();
		asig_nombre2.setBounds(150, 160, 200, 30);
		asig_nombre2.setFont(new Font("cooper black", 0, 20));
		asig_nombre2.setVisible(false);
		add(asig_nombre2);

		asig_nombre3 = new JTextField();
		asig_nombre3.setBounds(150, 200, 200, 30);
		asig_nombre3.setFont(new Font("cooper black", 0, 20));
		asig_nombre3.setVisible(false);
		add(asig_nombre3);

		asig_nombre4 = new JTextField();
		asig_nombre4.setBounds(150, 240, 200, 30);
		asig_nombre4.setFont(new Font("cooper black", 0, 20));
		asig_nombre4.setVisible(false);
		add(asig_nombre4);


		jugador1 = new JLabel("Jugador 1");
		jugador1.setBounds(20, 120, 200, 30);
		jugador1.setFont(new Font("cooper black", 0, 20));
		jugador1.setForeground(Color.white);
		jugador1.setVisible(false);
		add(jugador1);

		jugador2 = new JLabel("Jugador 2");
		jugador2.setBounds(20, 160, 200, 30);
		jugador2.setFont(new Font("cooper black", 0, 20));
		jugador2.setForeground(Color.white);
		jugador2.setVisible(false);
		add(jugador2);

		jugador3 = new JLabel("Jugador 3");
		jugador3.setBounds(20, 200, 200, 30);
		jugador3.setFont(new Font("cooper black", 0, 20));
		jugador3.setForeground(Color.white);
		jugador3.setVisible(false);
		add(jugador3);

		jugador4 = new JLabel("Jugador 4");
		jugador4.setBounds(20, 240, 200, 30);
		jugador4.setFont(new Font("cooper black", 0, 20));
		jugador4.setForeground(Color.white);
		jugador4.setVisible(false);
		add(jugador4);

		guardar_nombres = new JButton("GUARDAR");
		guardar_nombres.setBounds(200, 300, 200, 30);
		guardar_nombres.setBackground(new Color(108, 246, 248, 0));
		guardar_nombres.setFont(new Font ("cooper black", 3, 20));
		guardar_nombres.setForeground(Color.white);
		guardar_nombres.setActionCommand("guardar");
		guardar_nombres.setFocusable(false);
		guardar_nombres.setVisible(false);
		add(guardar_nombres);

	}

	/**
	 * @param listjug, asignn, numJug, asig_nombre1, asig_nombre2, asig_nombre3, asig_nombre4, jugador1, jugador2, jugador3, jugador4,
	 * guardar_nombres
	 * @return listjug, asignn, numJug, asig_nombre1, asig_nombre2, asig_nombre3, asig_nombre4, jugador1, jugador2, jugador3, jugador4,
	 * guardar_nombres
	 */

	public JLabel getAsignn() {
		return asignn;
	}

	public void setAsignn(JLabel asignn) {
		this.asignn = asignn;
	}

	public String[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(String[] jugadores) {
		this.jugadores = jugadores;
	}

	public JTextField getAsig_nombre1() {
		return asig_nombre1;
	}

	public void setAsig_nombre1(JTextField asig_nombre1) {
		this.asig_nombre1 = asig_nombre1;
	}

	public JTextField getAsig_nombre2() {
		return asig_nombre2;
	}

	public void setAsig_nombre2(JTextField asig_nombre2) {
		this.asig_nombre2 = asig_nombre2;
	}

	public JTextField getAsig_nombre3() {
		return asig_nombre3;
	}

	public void setAsig_nombre3(JTextField asig_nombre3) {
		this.asig_nombre3 = asig_nombre3;
	}

	public JTextField getAsig_nombre4() {
		return asig_nombre4;
	}

	public void setAsig_nombre4(JTextField asig_nombre4) {
		this.asig_nombre4 = asig_nombre4;
	}

	public JLabel getPersona1() {
		return jugador1;
	}

	public void setPersona1(JLabel persona1) {
		this.jugador1 = persona1;
	}

	public JLabel getPersona2() {
		return jugador2;
	}

	public void setPersona2(JLabel persona2) {
		this.jugador2 = persona2;
	}

	public JLabel getPersona3() {
		return jugador3;
	}

	public void setPersona3(JLabel persona3) {
		this.jugador3 = persona3;
	}

	public JLabel getPersona4() {
		return jugador4;
	}

	public void setPersona4(JLabel persona4) {
		this.jugador4 = persona4;
	}

	public JLabel getJugador1() {
		return jugador1;
	}

	public void setJugador1(JLabel jugador1) {
		this.jugador1 = jugador1;
	}

	public JLabel getJugador2() {
		return jugador2;
	}

	public void setJugador2(JLabel jugador2) {
		this.jugador2 = jugador2;
	}

	public JLabel getJugador3() {
		return jugador3;
	}

	public void setJugador3(JLabel jugador3) {
		this.jugador3 = jugador3;
	}

	public JLabel getJugador4() {
		return jugador4;
	}

	public void setJugador4(JLabel jugador4) {
		this.jugador4 = jugador4;
	}

	public JButton getGuardar_nombres() {
		return guardar_nombres;
	}

	public void setGuardar_nombres(JButton guardar_nombres) {
		this.guardar_nombres = guardar_nombres;
	}

	public JComboBox<String> getNumJug() {
		return numJug;
	}

	public void setNumJug(JComboBox<String> numJug) {
		this.numJug = numJug;
	}

	public JLabel getListjug() {
		return listjug;
	}

	public void setListjug(JLabel listjug) {
		this.listjug = listjug;
	}


}