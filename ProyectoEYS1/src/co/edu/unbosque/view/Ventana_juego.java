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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Panel destinado a que el usuario escoja la ficha que desea en el juego
 * @author Daniela
 * @author Nicolas
 * @author Kevin
 * @author Katherine
 * @version 1.1
 */

public class Ventana_juego extends JFrame {
	private Izq_juego_panel panel_izq;
	private Tablero_6x6 tab6;
	private Tablero_9x9 tab9;
	private Tablero_12x12 tab12;
	private JButton dado;
	private JLabel num_dado, img_fondo;
	private PanelPancracio pp;
	private JLabel tableropng6x6, tableropng9x9, tableropng12x12;
	private JMenuBar barra_menu;
	private JMenu menu;
	private JMenuItem nueva_partida, salir_menu;
	private JPanel preguntas;
	private JLabel ficha_planeta, ficha_nave, ficha_estrella, ficha_alien;

	/**
	 * Metodo constructor
	 */

	public Ventana_juego() {
		setTitle("Juego");
		setSize(1280, 720);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(false);
	}

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */

	private void inicializarComponentes() {

		panel_izq = new Izq_juego_panel();
		panel_izq.setBounds(10, 30, 350, 600);

		pp = new PanelPancracio();
		pp.setBounds(860, 0, 420, 720);

		barra_menu = new JMenuBar();
		setJMenuBar(barra_menu);
		barra_menu.setBackground(Color.WHITE);

		menu = new JMenu("Opciones");
		barra_menu.add(menu);

		nueva_partida = new JMenuItem("Nueva partida");
		salir_menu = new JMenuItem("Salir");
		nueva_partida.setActionCommand("nueva_partida");
		salir_menu.setActionCommand("salir_bar_menu");

		menu.add(nueva_partida);
		menu.add(salir_menu);

		tableropng6x6 = new JLabel();
		tableropng6x6.setBounds(260, 20, 700, 600);
		ImageIcon tab6x6_1 = new ImageIcon("imagenes/6X6.png");
		Icon icono = new ImageIcon(tab6x6_1.getImage().getScaledInstance(tableropng6x6.getWidth(),
				tableropng6x6.getHeight(), Image.SCALE_DEFAULT));
		tableropng6x6.setIcon(icono);
		tableropng6x6.setVisible(false);

		tableropng9x9 = new JLabel();
		tableropng9x9.setBounds(360, 40, 590, 590);
		ImageIcon tab9x9_1 = new ImageIcon("imagenes/9X9.png");
		icono = new ImageIcon(tab9x9_1.getImage().getScaledInstance(tableropng9x9.getWidth(), tableropng9x9.getHeight(),
				Image.SCALE_DEFAULT));
		tableropng9x9.setIcon(icono);
		tableropng9x9.setVisible(false);

		tableropng12x12 = new JLabel();
		tableropng12x12.setBounds(320, 40, 610, 600);
		ImageIcon tab12x12_1 = new ImageIcon("imagenes/12X12.png");
		icono = new ImageIcon(tab12x12_1.getImage().getScaledInstance(tableropng12x12.getWidth(),
				tableropng12x12.getHeight(), Image.SCALE_DEFAULT));
		tableropng12x12.setIcon(icono);
		tableropng12x12.setVisible(false);

		ficha_nave = new JLabel();
		ficha_nave.setBounds(5, 190, 35, 35);
		ImageIcon ficha_nave1 = new ImageIcon("imagenes/nave.png");
		icono = new ImageIcon(ficha_nave1.getImage().getScaledInstance(ficha_nave.getWidth(), ficha_nave.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_nave.setIcon(icono);
		ficha_nave.setVisible(false);

		ficha_planeta = new JLabel();
		ficha_planeta.setBounds(5, 290, 35, 35);
		ImageIcon ficha_planeta1 = new ImageIcon("imagenes/Saturnoo.png");
		icono = new ImageIcon(ficha_planeta1.getImage().getScaledInstance(ficha_planeta.getWidth(),
				ficha_planeta.getHeight(), Image.SCALE_DEFAULT));
		ficha_planeta.setIcon(icono);
		ficha_planeta.setVisible(false);

		ficha_alien = new JLabel();
		ficha_alien.setBounds(5, 140, 35, 35);
		ImageIcon ficha_alien1 = new ImageIcon("imagenes/Alien.png");
		icono = new ImageIcon(ficha_alien1.getImage().getScaledInstance(ficha_alien.getWidth(), ficha_alien.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_alien.setIcon(icono);
		ficha_alien.setVisible(false);

		ficha_estrella = new JLabel();
		ficha_estrella.setBounds(5, 240, 35, 35);
		ImageIcon ficha_estrella1 = new ImageIcon("imagenes/Estrellaa.png");
		icono = new ImageIcon(ficha_estrella1.getImage().getScaledInstance(ficha_estrella.getWidth(),
				ficha_estrella.getHeight(), Image.SCALE_DEFAULT));
		ficha_estrella.setIcon(icono);
		ficha_estrella.setVisible(false);

		tab6 = new Tablero_6x6();
		tab6.setBounds(500, 10, 600, 600);
		tab6.setVisible(false);

		tab9 = new Tablero_9x9();
		tab9.setBounds(500, 10, 600, 600);
		tab9.setVisible(false);

		tab12 = new Tablero_12x12();
		tab12.setBounds(500, 10, 600, 600);
		tab12.setVisible(false);

		tab6 = new Tablero_6x6();
		tab6.setBounds(330, 30, 600, 600);
		tab6.setVisible(false);

		tab9 = new Tablero_9x9();
		tab9.setBounds(350, 30, 600, 600);
		tab9.setVisible(false);

		tab12 = new Tablero_12x12();
		tab12.setBounds(330, 30, 600, 600);
		tab12.setVisible(false);

		img_fondo = new JLabel();
		img_fondo.setBounds(0, 0, 1280, 720);
		img_fondo.setIcon(new ImageIcon("Imagenes/FondoJuego.jpeg"));

		preguntas = new JPanel();
		preguntas.setOpaque(false);
		preguntas.setBounds(955, 280, 300, 350);


		add(ficha_alien);
		add(ficha_estrella);
		add(ficha_nave);
		add(ficha_planeta);
		add(tableropng6x6);
		add(panel_izq);
		add(pp);
		add(preguntas);
		add(tableropng6x6);
		add(tableropng9x9);
		add(tableropng12x12);
		add(tab6);
		add(tab9);
		add(tab12);
		add(img_fondo);

	}

	/**
	 * @param panel_izq, tab6, tab9, tab12, dado, num_dado, img_fondo, pp, tableropng6x6, tableropng9x9, 
	 * tableropng12x12, barra_menu, menu, nueva_partida, salir_menu, preguntas, ficha_planeta, ficha_nave, 
	 * ficha_estrella, ficha_alien
	 * @return panel_izq, tab6, tab9, tab12, dado, num_dado, img_fondo, pp, tableropng6x6, tableropng9x9, 
	 * tableropng12x12, barra_menu, menu, nueva_partida, salir_menu, preguntas, ficha_planeta, ficha_nave, 
	 * ficha_estrella, ficha_alien
	 */
	public Izq_juego_panel getPanel_izq() {
		return panel_izq;
	}

	public void setPanel_izq(Izq_juego_panel panel_izq) {
		this.panel_izq = panel_izq;
	}

	public Tablero_6x6 getTab6() {
		return tab6;
	}

	public void setTab6(Tablero_6x6 tab6) {
		this.tab6 = tab6;
	}

	public Tablero_9x9 getTab9() {
		return tab9;
	}

	public void setTab9(Tablero_9x9 tab9) {
		this.tab9 = tab9;
	}

	public Tablero_12x12 getTab12() {
		return tab12;
	}

	public void setTab12(Tablero_12x12 tab12) {
		this.tab12 = tab12;
	}

	public JButton getDado() {
		return dado;
	}

	public void setDado(JButton dado) {
		this.dado = dado;
	}

	public JLabel getNum_dado() {
		return num_dado;
	}

	public void setNum_dado(JLabel num_dado) {
		this.num_dado = num_dado;
	}

	public JLabel getImg_fondo() {
		return img_fondo;
	}

	public void setImg_fondo(JLabel img_fondo) {
		this.img_fondo = img_fondo;
	}

	public PanelPancracio getPp() {
		return pp;
	}

	public JLabel getTableropng6x6() {
		return tableropng6x6;
	}

	public void setTableropng6x6(JLabel tableropng6x6) {
		this.tableropng6x6 = tableropng6x6;
	}

	public JLabel getTableropng9x9() {
		return tableropng9x9;
	}

	public void setTableropng9x9(JLabel tableropng9x9) {
		this.tableropng9x9 = tableropng9x9;
	}

	public JLabel getTableropng12x12() {
		return tableropng12x12;
	}

	public void setTableropng12x12(JLabel tableropng12x12) {
		this.tableropng12x12 = tableropng12x12;
	}

	public void setPp(PanelPancracio pp) {
		this.pp = pp;
	}

	public JMenuBar getBarra_menu() {
		return barra_menu;
	}

	public void setBarra_menu(JMenuBar barra_menu) {
		this.barra_menu = barra_menu;
	}

	public JMenu getMenu() {
		return menu;
	}

	public void setMenu(JMenu menu) {
		this.menu = menu;
	}

	public JMenuItem getNueva_partida() {
		return nueva_partida;
	}

	public void setNueva_partida(JMenuItem nueva_partida) {
		this.nueva_partida = nueva_partida;
	}

	public JMenuItem getSalir_menu() {
		return salir_menu;
	}

	public void setSalir_menu(JMenuItem salir_menu) {
		this.salir_menu = salir_menu;
	}

	public JPanel getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(JPanel preguntas) {
		this.preguntas = preguntas;
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

}
