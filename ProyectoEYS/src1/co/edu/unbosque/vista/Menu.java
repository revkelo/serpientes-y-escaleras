package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JFrame {
	private JLabel fondo_menu, fondo_tableros,amongus, tablero_1, tablero_2, tablero_3;
	private JLabel listaper, persona1, persona2, persona3, persona4;
	private JLabel tab1, tab2, tab3;
	private JTextField nombre1, nombre2, nombre3, nombre4;
	private JButton guardar_nombres, tablero8x8, tablero12x12, tablero4x4;
	private JPanel jugadoresmenu, tablerosmenu;
	private String jugadores[] = { "1", "2", "3", "4" };
	private JComboBox<String> numJug;

	public Menu() {
		setBounds(260, 0, 800, 850);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jugadoresmenu = new JPanel();
		jugadoresmenu.setBounds(0, 0, 800, 850);
		jugadoresmenu.setLayout(null);
		jugadoresmenu.setVisible(true);

		tablerosmenu = new JPanel();
		tablerosmenu.setBounds(0, 0, 800, 850);
		tablerosmenu.setLayout(null);
		tablerosmenu.setVisible(false);

		nombre1 = new JTextField();
		nombre1.setBounds(220, 488, 450, 30);
		nombre1.setVisible(false);

		nombre2 = new JTextField();
		nombre2.setBounds(220, 538, 450, 30);
		nombre2.setVisible(false);

		nombre3 = new JTextField();
		nombre3.setBounds(220, 588, 450, 30);
		nombre3.setVisible(false);

		nombre4 = new JTextField();
		nombre4.setBounds(220, 638, 450, 30);
		nombre4.setVisible(false);

		numJug = new JComboBox<String>(jugadores);
		numJug.setBounds(440, 390, 40, 40);
		numJug.setBackground(Color.white);
		numJug.setForeground(Color.black);

		guardar_nombres = new JButton("GUARDAR");
		guardar_nombres.setBounds(300, 680, 200, 50);
		guardar_nombres.setBackground(Color.WHITE);
		guardar_nombres.setForeground(Color.BLACK);
		guardar_nombres.setVisible(false);

		tablero8x8 = new JButton("Normal");
		tablero8x8.setBounds(320, 480, 150, 50);
		tablero8x8.setFocusable(false);
		tablero8x8.setBackground(Color.WHITE);
		tablero8x8.setForeground(Color.BLACK);

		tablero12x12 = new JButton("Difícil");
		tablero12x12.setBounds(538, 480, 150, 50);
		tablero12x12.setFocusable(false);
		tablero12x12.setBackground(Color.WHITE);
		tablero12x12.setForeground(Color.BLACK);

		tablero4x4 = new JButton("Facil");
		tablero4x4.setBounds(100, 480, 150, 50);
		tablero4x4.setFocusable(false);
		tablero4x4.setBackground(Color.WHITE);
		tablero4x4.setForeground(Color.BLACK);

		listaper = new JLabel("Jugadores");
		listaper.setBounds(280, 310, 200, 200);
		listaper.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		listaper.setForeground(Color.WHITE);

		persona1 = new JLabel("Jugador 1");
		persona1.setBounds(90, 400, 200, 200);
		persona1.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		persona1.setForeground(Color.WHITE);
		persona1.setVisible(false);

		persona2 = new JLabel("Jugador 2");
		persona2.setBounds(90, 450, 200, 200);
		persona2.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		persona2.setForeground(Color.WHITE);
		persona2.setVisible(false);

		persona3 = new JLabel("Jugador 3");
		persona3.setBounds(90, 500, 200, 200);
		persona3.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		persona3.setForeground(Color.WHITE);
		persona3.setVisible(false);

		persona4 = new JLabel("Jugador 4");
		persona4.setBounds(90, 550, 200, 200);
		persona4.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		persona4.setForeground(Color.WHITE);
		persona4.setVisible(false);

		fondo_menu = new JLabel();
		fondo_menu.setBounds(0, 0, 800, 850);
		ImageIcon fondo_menu1 = new ImageIcon("media/Menu.jpg");
		Icon icono = new ImageIcon(fondo_menu1.getImage().getScaledInstance(fondo_menu.getWidth(),
				fondo_menu.getHeight(), Image.SCALE_DEFAULT));
		fondo_menu.setIcon(icono);

		fondo_tableros = new JLabel();
		fondo_tableros.setBounds(0, 0, 800, 850);
		ImageIcon fondo_tableros1 = new ImageIcon("media/tableros.jpg");
		icono = new ImageIcon(fondo_tableros1.getImage().getScaledInstance(fondo_tableros.getWidth(),
				fondo_tableros.getHeight(), Image.SCALE_DEFAULT));
		fondo_tableros.setIcon(icono);

		tablero_1 = new JLabel();
		tablero_1.setBounds(85, 250, 180, 180);
		ImageIcon tablero_11 = new ImageIcon("media/tablero.jpg");
		icono = new ImageIcon(tablero_11.getImage().getScaledInstance(tablero_1.getWidth(), tablero_1.getHeight(),
				Image.SCALE_DEFAULT));
		tablero_1.setIcon(icono);

		tablero_2 = new JLabel();
		tablero_2.setBounds(525, 250, 180, 180);
		ImageIcon tablero_21 = new ImageIcon("media/tablero.jpg");
		icono = new ImageIcon(tablero_21.getImage().getScaledInstance(tablero_2.getWidth(), tablero_2.getHeight(),
				Image.SCALE_DEFAULT));
		tablero_2.setIcon(icono);

		tablero_3 = new JLabel();
		tablero_3.setBounds(310, 250, 180, 180);
		ImageIcon tablero_31 = new ImageIcon("media/tablero.jpg");
		icono = new ImageIcon(tablero_31.getImage().getScaledInstance(tablero_3.getWidth(), tablero_3.getHeight(),
				Image.SCALE_DEFAULT));
		tablero_3.setIcon(icono);
		
		amongus = new JLabel();
		amongus.setBounds(240, 550, 300, 180);
		ImageIcon amongus1 = new ImageIcon("media/among.gif");
		icono = new ImageIcon(amongus1.getImage().getScaledInstance(amongus.getWidth(), amongus.getHeight(),
				Image.SCALE_DEFAULT));
		amongus.setIcon(icono);

		tab1 = new JLabel("6 x 6");
		tab1.setBounds(375, 350, 200, 200);
		tab1.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		tab1.setForeground(Color.WHITE);

		tab2 = new JLabel("10 x 10");
		tab2.setBounds(570, 350, 200, 200);
		tab2.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		tab2.setForeground(Color.WHITE);

		tab3 = new JLabel("4 x 4");
		tab3.setBounds(150, 350, 200, 200);
		tab3.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		tab3.setForeground(Color.WHITE);

		jugadoresmenu.add(listaper);
		jugadoresmenu.add(persona1);
		jugadoresmenu.add(nombre1);
		jugadoresmenu.add(persona2);
		jugadoresmenu.add(nombre2);
		jugadoresmenu.add(persona3);
		jugadoresmenu.add(nombre3);
		jugadoresmenu.add(persona4);
		jugadoresmenu.add(nombre4);
		jugadoresmenu.add(numJug);
		jugadoresmenu.add(guardar_nombres);
		jugadoresmenu.add(fondo_menu);
		tablerosmenu.add(tablero_1);
		tablerosmenu.add(tab1);
		tablerosmenu.add(tablero4x4);
		tablerosmenu.add(tablero_2);
		tablerosmenu.add(tab2);
		tablerosmenu.add(tablero8x8);
		tablerosmenu.add(tablero_3);
		tablerosmenu.add(tab3);
		tablerosmenu.add(tablero12x12);
		tablerosmenu.add(amongus);
		tablerosmenu.add(fondo_tableros);
		add(jugadoresmenu);
		add(tablerosmenu);

	}

	public JLabel getFondo_menu() {
		return fondo_menu;
	}

	public void setFondo_menu(JLabel fondo_menu) {
		this.fondo_menu = fondo_menu;
	}

	public JLabel getListaper() {
		return listaper;
	}

	public void setListaper(JLabel listaper) {
		this.listaper = listaper;
	}

	public JLabel getPersona1() {
		return persona1;
	}

	public void setPersona1(JLabel persona1) {
		this.persona1 = persona1;
	}

	public JLabel getPersona2() {
		return persona2;
	}

	public void setPersona2(JLabel persona2) {
		this.persona2 = persona2;
	}

	public JLabel getPersona3() {
		return persona3;
	}

	public void setPersona3(JLabel persona3) {
		this.persona3 = persona3;
	}

	public JLabel getPersona4() {
		return persona4;
	}

	public void setPersona4(JLabel persona4) {
		this.persona4 = persona4;
	}

	public JTextField getNombre1() {
		return nombre1;
	}

	public void setNombre1(JTextField nombre1) {
		this.nombre1 = nombre1;
	}

	public JTextField getNombre2() {
		return nombre2;
	}

	public void setNombre2(JTextField nombre2) {
		this.nombre2 = nombre2;
	}

	public JTextField getNombre3() {
		return nombre3;
	}

	public void setNombre3(JTextField nombre3) {
		this.nombre3 = nombre3;
	}

	public JTextField getNombre4() {
		return nombre4;
	}

	public void setNombre4(JTextField nombre4) {
		this.nombre4 = nombre4;
	}

	public JButton getGuardar_nombres() {
		return guardar_nombres;
	}

	public void setGuardar_nombres(JButton guardar_nombres) {
		this.guardar_nombres = guardar_nombres;
	}

	public JLabel getFondo_tableros() {
		return fondo_tableros;
	}

	public void setFondo_tableros(JLabel fondo_tableros) {
		this.fondo_tableros = fondo_tableros;
	}

	public JPanel getJugadoresmenu() {
		return jugadoresmenu;
	}

	public void setJugadoresmenu(JPanel jugadoresmenu) {
		this.jugadoresmenu = jugadoresmenu;
	}

	public JPanel getTablerosmenu() {
		return tablerosmenu;
	}

	public void setTablerosmenu(JPanel tablerosmenu) {
		this.tablerosmenu = tablerosmenu;
	}

	public String[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(String[] jugadores) {
		this.jugadores = jugadores;
	}

	public JComboBox<String> getNumJug() {
		return numJug;
	}

	public void setNumJug(JComboBox<String> numJug) {
		this.numJug = numJug;
	}

	public JLabel getAmongus() {
		return amongus;
	}

	public void setAmongus(JLabel amongus) {
		this.amongus = amongus;
	}

	public JLabel getTablero_1() {
		return tablero_1;
	}

	public void setTablero_1(JLabel tablero_1) {
		this.tablero_1 = tablero_1;
	}

	public JLabel getTablero_2() {
		return tablero_2;
	}

	public void setTablero_2(JLabel tablero_2) {
		this.tablero_2 = tablero_2;
	}

	public JLabel getTablero_3() {
		return tablero_3;
	}

	public void setTablero_3(JLabel tablero_3) {
		this.tablero_3 = tablero_3;
	}

	public JLabel getTab1() {
		return tab1;
	}

	public void setTab1(JLabel tab1) {
		this.tab1 = tab1;
	}

	public JLabel getTab2() {
		return tab2;
	}

	public void setTab2(JLabel tab2) {
		this.tab2 = tab2;
	}

	public JLabel getTab3() {
		return tab3;
	}

	public void setTab3(JLabel tab3) {
		this.tab3 = tab3;
	}

	public JButton getTablero8x8() {
		return tablero8x8;
	}

	public void setTablero8x8(JButton tablero8x8) {
		this.tablero8x8 = tablero8x8;
	}

	public JButton getTablero12x12() {
		return tablero12x12;
	}

	public void setTablero12x12(JButton tablero12x12) {
		this.tablero12x12 = tablero12x12;
	}

	public JButton getTablero4x4() {
		return tablero4x4;
	}

	public void setTablero4x4(JButton tablero4x4) {
		this.tablero4x4 = tablero4x4;
	}

}
