/**
 * Paquete vista que gestiona la interfaz grafica
 */

package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
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

public class Panel_escoger_ficha extends JPanel {

	/**
	 * Atributo tipo JLabel en donde se guarda el nombre de cada jugador
	 */
	private JLabel nombrejugador1, nombrejugador2, nombrejugador3, nombrejugador4;

	/**
	 * Atributo tipo JComboBox para que el usuario veas las opciones de vista que tiene
	 */

	private JComboBox<String> colorjug1, colorjug2, colorjug3, colorjug4;

	/**
	 * Arreglo tipo String que contiene el nombre de las fichas 
	 */
	private String colores[] = { "Planeta", "Alien", "Nave", "Estrella" };

	/**
	 * Atributo tipo JLabel en el que se guardan las imagenes de las fichas como iconos
	 */

	private JLabel ficha_planeta, ficha_nave, ficha_estrella, ficha_alien;

	/**
	 * Boton para hacer entender al usuario que las fichas se guardaron correctamente 
	 */
	private JButton guardar_color;

	/**
	 * Metodo constructor
	 */

	public Panel_escoger_ficha () {

		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));

		inicializarComponentes();

		setVisible(false);

	}

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */

	private void inicializarComponentes() {

		nombrejugador1 = new JLabel("Nombre 1:");
		nombrejugador1.setBounds(20, 50, 200, 50);
		nombrejugador1.setFont(new Font("cooper black", 0, 20));
		nombrejugador1.setForeground(Color.WHITE);
		nombrejugador1.setVisible(true);
		add(nombrejugador1);

		nombrejugador2 = new JLabel("Nombre 2:");
		nombrejugador2.setBounds(20, 100, 200, 50);
		nombrejugador2.setFont(new Font("cooper black", 0, 20));
		nombrejugador2.setForeground(Color.WHITE);
		nombrejugador2.setVisible(true);
		add(nombrejugador2);

		nombrejugador3 = new JLabel("Nombre 3:");
		nombrejugador3.setBounds(20, 150, 200, 50);
		nombrejugador3.setFont(new Font("cooper black", 0, 20));
		nombrejugador3.setForeground(Color.WHITE);
		nombrejugador3.setVisible(true);
		add(nombrejugador3);

		nombrejugador4 = new JLabel("Nombre 4:");
		nombrejugador4.setBounds(20, 200, 200, 50);
		nombrejugador4.setFont(new Font("cooper black", 0, 20));
		nombrejugador4.setForeground(Color.WHITE);
		nombrejugador4.setVisible(true);
		add(nombrejugador4);

		colorjug1 = new JComboBox<String>(colores);
		colorjug1.setBounds(250, 70, 100, 20);
		colorjug1.setBackground(Color.WHITE);
		colorjug1.setFont(new Font("cooper black", 0, 15));
		colorjug1.setForeground(Color.black);
		add(colorjug1);

		colorjug2 = new JComboBox<String>(colores);
		colorjug2.setBounds(250, 120, 100, 20);
		colorjug2.setBackground(Color.WHITE);
		colorjug2.setFont(new Font("cooper black", 0, 15));
		colorjug2.setForeground(Color.black);
		add(colorjug2);

		colorjug3 = new JComboBox<String>(colores);
		colorjug3.setBounds(250, 170, 100, 20);
		colorjug3.setBackground(Color.WHITE);
		colorjug3.setFont(new Font("cooper black", 0, 15));
		colorjug3.setForeground(Color.black);
		add(colorjug3);

		colorjug4 = new JComboBox<String>(colores);
		colorjug4.setBounds(250, 220, 100, 20);
		colorjug4.setBackground(Color.WHITE);
		colorjug4.setFont(new Font("cooper black", 0, 15));
		colorjug4.setForeground(Color.black);
		add(colorjug4);

		guardar_color = new JButton("GUARDAR");
		guardar_color.setBounds(190, 300, 200, 30);
		guardar_color.setBackground(new Color(108, 246, 248, 0));
		guardar_color.setFont(new Font ("cooper black", 3, 20));
		guardar_color.setForeground(Color.white);
		guardar_color.setActionCommand("guardar1");
		guardar_color.setFocusable(false);
		guardar_color.setVisible(true);
		add(guardar_color);

		ficha_nave = new JLabel();
		ficha_nave.setBounds(430, -20, 100, 210);
		ficha_nave.setIcon(new ImageIcon("imagenes/nave.png"));
		ficha_nave.setVisible(false);
		add(ficha_nave);

		ficha_planeta = new JLabel();
		ficha_planeta.setBounds(430, 30, 100, 210);
		ficha_planeta.setIcon(new ImageIcon("imagenes/Saturnoo.png"));
		ficha_planeta.setVisible(false);
		add(ficha_planeta);

		ficha_estrella = new JLabel();
		ficha_estrella.setBounds(430, 80, 100, 210);
		ficha_estrella.setIcon(new ImageIcon("imagenes/Estrellaa.png"));
		ficha_estrella.setVisible(false);
		add(ficha_estrella);

		ficha_alien = new JLabel();
		ficha_alien.setBounds(435, 130, 100, 210);
		ficha_alien.setIcon(new ImageIcon("imagenes/Alien.png"));
		ficha_alien.setVisible(false);
		add(ficha_alien);

	}

	/**
	 * @param nombrejugador1, nombrejugador2, nombrejugador3, nombrejugador4, colorjug1, colorjug2, colorjug3, colorjug4,
	 * colores[], ficha_planeta, ficha_nave, ficha_estrella, ficha_alien, guardar_color
	 * @return nombrejugador1, nombrejugador2, nombrejugador3, nombrejugador4, colorjug1, colorjug2, colorjug3, colorjug4,
	 * colores[], ficha_planeta, ficha_nave, ficha_estrella, ficha_alien, guardar_color
	 */

	public JButton getGuardar_color() {
		return guardar_color;
	}

	public void setGuardar_color(JButton guardar_color) {
		this.guardar_color = guardar_color;

	}

	public JLabel getFicha_planeta() {
		return ficha_planeta;
	}

	public void setFicha_planeta(JLabel ficha_planeta) {
		this.ficha_planeta = ficha_planeta;
	}

	public JLabel getFicha_nave() {
		return ficha_nave;
	}

	public void setFicha_nave(JLabel ficha_nave) {
		this.ficha_nave = ficha_nave;
	}

	public JLabel getFicha_estrella() {
		return ficha_estrella;
	}

	public void setFicha_estrella(JLabel ficha_estrella) {
		this.ficha_estrella = ficha_estrella;
	}

	public JLabel getFicha_alien() {
		return ficha_alien;
	}

	public void setFicha_alien(JLabel ficha_alien) {
		this.ficha_alien = ficha_alien;
	}

	public JLabel getNombrejugador1() {
		return nombrejugador1;
	}

	public void setNombrejugador1(JLabel nombrejugador1) {
		this.nombrejugador1 = nombrejugador1;
	}

	public JLabel getNombrejugador2() {
		return nombrejugador2;
	}

	public void setNombrejugador2(JLabel nombrejugador2) {
		this.nombrejugador2 = nombrejugador2;
	}

	public JLabel getNombrejugador3() {
		return nombrejugador3;
	}

	public void setNombrejugador3(JLabel nombrejugador3) {
		this.nombrejugador3 = nombrejugador3;
	}

	public JLabel getNombrejugador4() {
		return nombrejugador4;
	}

	public void setNombrejugador4(JLabel nombrejugador4) {
		this.nombrejugador4 = nombrejugador4;
	}

	public JComboBox<String> getColorjug1() {
		return colorjug1;
	}

	public void setColorjug1(JComboBox<String> colorjug1) {
		this.colorjug1 = colorjug1;
	}

	public JComboBox<String> getColorjug2() {
		return colorjug2;
	}

	public void setColorjug2(JComboBox<String> colorjug2) {
		this.colorjug2 = colorjug2;
	}

	public JComboBox<String> getColorjug3() {
		return colorjug3;
	}

	public void setColorjug3(JComboBox<String> colorjug3) {
		this.colorjug3 = colorjug3;
	}

	public JComboBox<String> getColorjug4() {
		return colorjug4;
	}

	public void setColorjug4(JComboBox<String> colorjug4) {
		this.colorjug4 = colorjug4;
	}

	public String[] getColores() {
		return colores;
	}

	public void setColores(String[] colores) {
		this.colores = colores;
	}
}
