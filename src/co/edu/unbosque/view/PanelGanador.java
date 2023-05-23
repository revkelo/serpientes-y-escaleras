/**
 * Paquete vista que gestiona la interfaz grafica
 */
package co.edu.unbosque.view;

/**
 * Panel destinado a que el usuario escoja la ficha que desea en el juego
 * @author Daniela
 * @author Nicolas
 * @author Kevin
 * @author Katherine
 * @version 1.1
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelGanador extends JPanel {

	/**
	 * Atributo JLabel en el que agregamos el titulo del panel, el nombre del ganador y la imagen del fondo
	 */
	private JLabel titulo, ganador,img_fondo;

	/**
	 * Atributos tipo JButton en donde dan opciones al usuario al finalizar la partida
	 */
	private JButton guardar, salir, otraVez;

	/**
	 * Atributos tipo JLabel en el que se guarda la imagen del ganador
	 */
	private JLabel ficha_planeta, ficha_nave, ficha_estrella, ficha_alien;

	/**
	 * Metodo constructor
	 */
	public PanelGanador() {

		setLayout(null);
		setSize(1000, 650);
		setOpaque(false);

		inicializarComponentes();

		setVisible(false);
	}

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */

	public void inicializarComponentes() {

		titulo = new JLabel("El ganador es");
		titulo.setBounds(330, 20, 400, 70);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font ("cooper black", 3, 50));
		add(titulo);

		ganador = new JLabel("");
		ganador.setBounds(360, 100, 500, 70);
		ganador.setForeground(Color.WHITE);
		ganador.setFont(new Font ("cooper black", 3, 50));
		add(ganador);

		ficha_nave = new JLabel();
		ficha_nave.setBounds(400, 160, 200, 200);
		ImageIcon ficha_nave1 = new ImageIcon("imagenes/nave.png");
		Icon icono = new ImageIcon(ficha_nave1.getImage().getScaledInstance(ficha_nave.getWidth(), ficha_nave.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_nave.setIcon(icono);
		ficha_nave.setVisible(false);
		add(ficha_nave);

		ficha_planeta = new JLabel();
		ficha_planeta.setBounds(420, 180, 150, 150);
		ImageIcon ficha_planeta1 = new ImageIcon("imagenes/Saturnoo.png");
		icono = new ImageIcon(ficha_planeta1.getImage().getScaledInstance(ficha_planeta.getWidth(),
				ficha_planeta.getHeight(), Image.SCALE_DEFAULT));
		ficha_planeta.setIcon(icono);
		ficha_planeta.setVisible(false);
		add(ficha_planeta);

		ficha_alien = new JLabel();
		ficha_alien.setBounds(420, 180, 150, 150);
		ImageIcon ficha_alien1 = new ImageIcon("imagenes/Alien.png");
		icono = new ImageIcon(ficha_alien1.getImage().getScaledInstance(ficha_alien.getWidth(), ficha_alien.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_alien.setIcon(icono);
		ficha_alien.setVisible(false);
		add(ficha_alien);

		ficha_estrella = new JLabel();
		ficha_estrella.setBounds(420, 180, 150, 150);
		ImageIcon ficha_estrella1 = new ImageIcon("imagenes/Estrellaa.png");
		icono = new ImageIcon(ficha_estrella1.getImage().getScaledInstance(ficha_estrella.getWidth(),
				ficha_estrella.getHeight(), Image.SCALE_DEFAULT));
		ficha_estrella.setIcon(icono);
		ficha_estrella.setVisible(false);
		add(ficha_estrella);


		guardar = new JButton("Guardar partida");
		guardar.setBounds(150, 340, 300, 70);
		guardar.setBackground(new Color(108, 246, 248, 0));
		guardar.setForeground(Color.white);
		guardar.setFont(new Font ("cooper black", 3, 30));
		guardar.setActionCommand("GUARDARPAR");
		add(guardar);

		otraVez = new JButton("Jugar otra vez");
		otraVez.setBounds(560, 340, 300, 70);
		otraVez.setBackground(new Color(108, 246, 248, 0));
		otraVez.setForeground(Color.white);
		otraVez.setFont(new Font ("cooper black", 3, 30));
		otraVez.setActionCommand("OTRAVEZ");
		add(otraVez);

		salir = new JButton("Salir");
		salir.setBounds(350, 480, 300, 70);
		salir.setBackground(new Color(108, 246, 248, 0));
		salir.setForeground(Color.white);
		salir.setFont(new Font ("cooper black", 3, 30));
		salir.setActionCommand("SALIRFIN");
		add(salir);

		img_fondo = new JLabel();
		img_fondo.setBounds(0, 0, 1280, 720);
		img_fondo.setIcon(new ImageIcon("Imagenes/FondoJuego.jpeg"));
		add(img_fondo);

	}

	/**
	 * @param titulo, ganador,img_fondo, guardar, salir, otraVez, ficha_planeta, ficha_nave, ficha_estrella, ficha_alien
	 * @return titulo, ganador,img_fondo, guardar, salir, otraVez, ficha_planeta, ficha_nave, ficha_estrella, ficha_alien
	 */

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getGanador() {
		return ganador;
	}

	public void setGanador(JLabel ganador) {
		this.ganador = ganador;
	}



	public JLabel getImg_fondo() {
		return img_fondo;
	}

	public void setImg_fondo(JLabel img_fondo) {
		this.img_fondo = img_fondo;
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

	public JButton getGuardar() {
		return guardar;
	}

	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}

	public JButton getSalir() {
		return salir;
	}

	public void setSalir(JButton salir) {
		this.salir = salir;
	}

	public JButton getOtraVez() {
		return otraVez;
	}

	public void setOtraVez(JButton otraVez) {
		this.otraVez = otraVez;
	}

}