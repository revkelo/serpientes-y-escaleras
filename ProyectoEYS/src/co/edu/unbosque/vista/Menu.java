package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JFrame {
	private JLabel fondo_menu,fondo_tableros;
	private JLabel listaper,persona1,persona2,persona3,persona4;
	private JTextField nombre1,nombre2,nombre3,nombre4;
	private JButton guardar_nombres,jugarbotontableros;
	private JPanel jugadoresmenu,tablerosmenu;

	public Menu() {
		setBounds(40, 10, 800,850);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jugadoresmenu = new JPanel();
		jugadoresmenu.setBounds(0, 0, 800,850);
		jugadoresmenu.setLayout(null);
		jugadoresmenu.setVisible(true);
		
		tablerosmenu = new JPanel();
		tablerosmenu.setBounds(0, 0, 800,850);
		tablerosmenu.setLayout(null);
		tablerosmenu.setVisible(false);
		
		nombre1 = new JTextField();
		nombre1.setBounds(220, 488, 450, 30);
		
		nombre2 = new JTextField();
		nombre2.setBounds(220, 538, 450, 30);
		
		nombre3 = new JTextField();
		nombre3.setBounds(220, 588, 450, 30);
		
		nombre4 = new JTextField();
		nombre4.setBounds(220, 638, 450, 30);
		
		
		guardar_nombres = new JButton("GUARDAR");
		guardar_nombres.setBounds(300, 700, 200, 50);
		guardar_nombres.setBackground(Color.WHITE);
		guardar_nombres.setForeground(Color.BLACK);
		
		jugarbotontableros = new JButton("JUGAR");
		jugarbotontableros.setBounds(300, 700, 200, 50);
		jugarbotontableros.setBackground(Color.WHITE);
		jugarbotontableros.setForeground(Color.BLACK);
	
		
		listaper = new JLabel("Jugadores");
		listaper.setBounds(280, 310, 200, 200);
		listaper.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		listaper.setForeground(Color.WHITE);
		
		persona1 = new JLabel("Jugador 1");
		persona1.setBounds(90, 400, 200, 200);
		persona1.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		persona1.setForeground(Color.WHITE);
		
		persona2 = new JLabel("Jugador 2");
		persona2.setBounds(90, 450, 200, 200);
		persona2.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		persona2.setForeground(Color.WHITE);
		
		persona3 = new JLabel("Jugador 3");
		persona3.setBounds(90, 500, 200, 200);
		persona3.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		persona3.setForeground(Color.WHITE);
		
		persona4 = new JLabel("Jugador 4");
		persona4.setBounds(90, 550, 200, 200);
		persona4.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		persona4.setForeground(Color.WHITE);
		

		
		
		fondo_menu = new JLabel();
		fondo_menu.setBounds(0, 0, 800, 850);
		ImageIcon fondo_menu1 = new ImageIcon("media/Menu.jpg");
		Icon icono = new ImageIcon(
				fondo_menu1.getImage().getScaledInstance(fondo_menu.getWidth(), fondo_menu.getHeight(), Image.SCALE_DEFAULT));
		fondo_menu.setIcon(icono);
		
		fondo_tableros = new JLabel();
		fondo_tableros.setBounds(0, 0, 800, 850);
		ImageIcon fondo_tableros1 = new ImageIcon("media/tableros.jpg");
		icono = new ImageIcon(
				fondo_tableros1.getImage().getScaledInstance(fondo_tableros.getWidth(), fondo_tableros.getHeight(), Image.SCALE_DEFAULT));
		fondo_tableros.setIcon(icono);
		
		
		
		jugadoresmenu.add(listaper);
		jugadoresmenu.add(persona1);
		jugadoresmenu.add(nombre1);
		jugadoresmenu.add(persona2);
		jugadoresmenu.add(nombre2);
		jugadoresmenu.add(persona3);
		jugadoresmenu.add(nombre3);
		jugadoresmenu.add(persona4);
		jugadoresmenu.add(nombre4);
		jugadoresmenu.add(guardar_nombres);
		jugadoresmenu.add(fondo_menu);
		tablerosmenu.add(jugarbotontableros);
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

	public JButton getJugarbotontableros() {
		return jugarbotontableros;
	}

	public void setJugarbotontableros(JButton jugarbotontableros) {
		this.jugarbotontableros = jugarbotontableros;
	}
	

}
