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

public class Panel_escoger_ficha extends JPanel {

	private JLabel nombrejugador1, nombrejugador2, nombrejugador3, nombrejugador4;
	private JComboBox<String> colorjug1, colorjug2, colorjug3, colorjug4;
	private String colores[] = { "Verde", "Azul", "Rojo", "Morado" };
	private JLabel ficha_verde, ficha_roja, ficha_rosada, ficha_azul;

	public Panel_escoger_ficha () {
		
		setLayout(null);
        setBackground(new Color(108, 246, 248, 0));
        
        inicializarComponentes();
        
        setVisible(false);
        
    }

	private void inicializarComponentes() {
		
		nombrejugador1 = new JLabel("Nombre 1:");
		nombrejugador1.setBounds(90, 50, 200, 50);
		nombrejugador1.setFont(new Font("cooper black", 0, 20));
		nombrejugador1.setForeground(Color.WHITE);
		nombrejugador1.setVisible(true);
		add(nombrejugador1);
		
		nombrejugador2 = new JLabel("Nombre 2:");
		nombrejugador2.setBounds(90, 100, 200, 50);
		nombrejugador2.setFont(new Font("cooper black", 0, 20));
		nombrejugador2.setForeground(Color.WHITE);
		nombrejugador2.setVisible(true);
		add(nombrejugador2);

		nombrejugador3 = new JLabel("Nombre 3:");
		nombrejugador3.setBounds(90, 150, 200, 50);
		nombrejugador3.setFont(new Font("cooper black", 0, 20));
		nombrejugador3.setForeground(Color.WHITE);
		nombrejugador3.setVisible(true);
		add(nombrejugador3);

		nombrejugador4 = new JLabel("Nombre 4:");
		nombrejugador4.setBounds(90, 200, 200, 50);
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

//		ficha_roja = new JLabel();
//		ficha_roja.setBounds(470, 245, 150, 120);
//		ImageIcon ficha_r1 = new ImageIcon("media/ficharoja.png");
		
//		Icon icono = new ImageIcon(ficha_r1.getImage().getScaledInstance(ficha_roja.getWidth(), ficha_roja.getHeight(),
//		Image.SCALE_DEFAULT));
//		ficha_roja.setIcon(icono);
//		ficha_roja.setVisible(false);
//		add(ficha_roja);

		
		
		ficha_roja = new JLabel();
		ficha_roja.setBounds(350, 70, 150, 120);
		ficha_roja.setIcon(new ImageIcon("imagenes/ficharoja.png"));
		ficha_roja.setVisible(false);
		add(ficha_roja);
		
		ficha_verde = new JLabel();
		ficha_verde.setBounds(350, 120, 150, 120);
		ficha_verde.setIcon(new ImageIcon("imagenes/ficharoja.png"));
		ficha_verde.setVisible(false);
		add(ficha_verde);
		
		ficha_rosada = new JLabel();
		ficha_rosada.setBounds(350, 170, 150, 120);
		ficha_rosada.setIcon(new ImageIcon("imagenes/ficharoja.png"));
		ficha_rosada.setVisible(false);
		add(ficha_rosada);
		
		ficha_azul = new JLabel();
		ficha_azul.setBounds(350, 220, 150, 120);
		ficha_azul.setIcon(new ImageIcon("imagenes/ficharoja.png"));
		ficha_azul.setVisible(false);
		add(ficha_azul);
		
		
		
//		ficha_verde = new JLabel();
//		ficha_verde.setBounds(470, 325, 150, 120);
//		ImageIcon ficha_verde1 = new ImageIcon("media/ficha_v.png");
//		icono = new ImageIcon(ficha_verde1.getImage().getScaledInstance(ficha_verde.getWidth(), ficha_verde.getHeight(),
//		Image.SCALE_DEFAULT));
//		ficha_verde.setIcon(icono);
//		ficha_verde.setVisible(false);
//		add(ficha_verde);
//
//		ficha_rosada = new JLabel();
//		ficha_rosada.setBounds(470, 405, 150, 120);
//		ImageIcon ficha_rosada1 = new ImageIcon("media/ficha_ro.png");
//		icono = new ImageIcon(ficha_rosada1.getImage().getScaledInstance(ficha_rosada.getWidth(),
//		ficha_rosada.getHeight(), Image.SCALE_DEFAULT));
//		ficha_rosada.setIcon(icono);
//		ficha_rosada.setVisible(false);
//		add(ficha_rosada);
//
//		ficha_azul = new JLabel();
//		ficha_azul.setBounds(470, 485, 150, 120);
//		ImageIcon ficha_azul1 = new ImageIcon("media/ficha_azul.png");
//		icono = new ImageIcon(ficha_azul1.getImage().getScaledInstance(ficha_azul.getWidth(), ficha_azul.getHeight(),
//		Image.SCALE_DEFAULT));
//		ficha_azul.setIcon(icono);
//		ficha_azul.setVisible(false);
//		add(ficha_azul);

	}

	public JLabel getFicha_verde() {
		return ficha_verde;
	}

	public void setFicha_verde(JLabel ficha_verde) {
		this.ficha_verde = ficha_verde;
	}

	public JLabel getFicha_roja() {
		return ficha_roja;
	}

	public void setFicha_roja(JLabel ficha_roja) {
		this.ficha_roja = ficha_roja;
	}

	public JLabel getFicha_rosada() {
		return ficha_rosada;
	}

	public void setFicha_rosada(JLabel ficha_rosada) {
		this.ficha_rosada = ficha_rosada;
	}

	public JLabel getFicha_azul() {
		return ficha_azul;
	}

	public void setFicha_azul(JLabel ficha_azul) {
		this.ficha_azul = ficha_azul;
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
