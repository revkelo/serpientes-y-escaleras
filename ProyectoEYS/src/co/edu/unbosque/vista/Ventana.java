package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	
	private JLabel fondo_menu;
	private JButton jugarboton, tutorialboton, salirboton;
	private Menu menu1;
	private Juego juego1;
	private Tablero tablero;

	public Ventana() {
		setBounds(40, 10, 800, 850);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		menu1 = new Menu();
		juego1 = new Juego();
		tablero = new Tablero();
		
		jugarboton = new JButton("JUGAR");
		jugarboton.setFont(new Font("Segoe UI Black", 0, 50));
		jugarboton.setFocusable(false);
		jugarboton.setBounds(250, 440, 290, 80);
		jugarboton.setBackground(Color.WHITE);
		jugarboton.setForeground(Color.BLACK);
		
		tutorialboton = new JButton("TUTORIAL");
		tutorialboton.setBounds(250, 540, 290, 80);
		tutorialboton.setFocusable(false);
		tutorialboton.setFont(new Font("Segoe UI Black", 0, 50));
		tutorialboton.setBackground(Color.WHITE);
		tutorialboton.setForeground(Color.BLACK);
		
		salirboton = new JButton("SALIR");
		salirboton.setBounds(250, 640, 290, 80);
		salirboton.setFocusable(false);
		salirboton.setFont(new Font("Segoe UI Black", 0, 50));
		salirboton.setBackground(Color.WHITE);
		salirboton.setForeground(Color.BLACK);

		fondo_menu = new JLabel();
		fondo_menu.setBounds(0, 0, 800, 850);
		ImageIcon fondo_menu1 = new ImageIcon("media/Menu.jpg");
		Icon icono = new ImageIcon(fondo_menu1.getImage().getScaledInstance(fondo_menu.getWidth(),
				fondo_menu.getHeight(), Image.SCALE_DEFAULT));
		fondo_menu.setIcon(icono);

		add(jugarboton);
		add(tutorialboton);
		add(salirboton);
		add(fondo_menu);

	}

	public JLabel getFondo_menu() {
		return fondo_menu;
	}

	public void setFondo_menu(JLabel fondo_menu) {
		this.fondo_menu = fondo_menu;
	}

	public JButton getJugarboton() {
		return jugarboton;
	}

	public void setJugarboton(JButton jugarboton) {
		this.jugarboton = jugarboton;
	}

	public JButton getTutorialboton() {
		return tutorialboton;
	}
	public void setTutorialboton(JButton tutorialboton) {
		this.tutorialboton = tutorialboton;
	}

	public JButton getSalirboton() {
		return salirboton;
	}

	public void setSalirboton(JButton salirboton) {
		this.salirboton = salirboton;
	}

	public Menu getMenu1() {
		return menu1;
	}

	public void setMenu1(Menu menu1) {
		this.menu1 = menu1;
	}

	public Juego getJuego1() {
		return juego1;
	}

	public void setJuego1(Juego juego1) {
		this.juego1 = juego1;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}


}
