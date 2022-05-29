package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Juego extends JFrame {
	private JLabel titulo;
	private JLabel jug1, jug2, jug3, jug4, random_numero;
	private JLabel froja,frosada,fverde,fazul;
	private JLabel imag,dado,dadopng,amongus;
	private JButton btn4ram,moverficha;
	private Tablero tablero1;

	public Juego() {
		setBounds(40, 10, 1280, 720);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		tablero1 = new Tablero();

		titulo = new JLabel("ESCALERAS Y SERPIENTES");
		titulo.setBounds(80, 0, 400, 100);
		titulo.setFont(new Font("Segoe UI Black", 0, 25));
		titulo.setForeground(Color.white);

		froja = new JLabel();
		froja.setBounds(240, 355, 100, 80);
		ImageIcon ficha_r1 = new ImageIcon("media/ficharoja.png");
		Icon icono = new ImageIcon(
				ficha_r1.getImage().getScaledInstance(froja.getWidth(), froja.getHeight(), Image.SCALE_DEFAULT));
		froja.setIcon(icono);
		
		
		fverde = new JLabel();
		fverde.setBounds(240, 275, 100, 80);
		ImageIcon fverde1 = new ImageIcon("media/ficha_v.png");
		icono = new ImageIcon(
				fverde1.getImage().getScaledInstance(fverde.getWidth(), fverde.getHeight(), Image.SCALE_DEFAULT));
		fverde.setIcon(icono);

		

		frosada= new JLabel();
		frosada.setBounds(40, 275, 100, 80);
		ImageIcon frosada1 = new ImageIcon("media/ficha_ro.png");
		icono = new ImageIcon(
				frosada1.getImage().getScaledInstance(frosada.getWidth(), frosada.getHeight(), Image.SCALE_DEFAULT));
		frosada.setIcon(icono);

		fazul = new JLabel();
		fazul.setBounds(40, 355, 100, 80);
		ImageIcon fazul1 = new ImageIcon("media/ficha_azul.png");
		icono = new ImageIcon(fazul1.getImage().getScaledInstance(fazul.getWidth(), fazul.getHeight(),
				Image.SCALE_DEFAULT));
		fazul.setIcon(icono);
		
	
		
		jug1 = new JLabel();
		jug1.setBounds(110, 265, 400, 100);
		jug1.setText("Kevin");
		jug1.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		jug1.setForeground(Color.white);

		jug2 = new JLabel();
		jug2.setBounds(110, 345, 400, 100);
		jug2.setText("Carlos");
		jug2.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		jug2.setForeground(Color.white);

		jug3 = new JLabel();
		jug3.setBounds(310, 345, 400, 100);
		jug3.setText("Arroz");
		jug3.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		jug3.setForeground(Color.white);

		jug4 = new JLabel();
		jug4.setBounds(310, 265, 400, 100);
		jug4.setText("Pollo");
		jug4.setFont(new Font("Arial Rounded MT Bold", 0, 25));
		jug4.setForeground(Color.white);

		random_numero = new JLabel();
		random_numero.setBounds(230, 510, 400, 100);
		random_numero.setText("");
		random_numero.setFont(new Font("Arial Rounded MT Bold", 0, 40));
		random_numero.setForeground(Color.white);

		btn4ram = new JButton();
		btn4ram.setBounds(40, 550, 100, 30);
		btn4ram.setText("Tirar dado");
		btn4ram.setForeground(Color.black);
		btn4ram.setBackground(Color.white);
		

		moverficha = new JButton();
		moverficha.setBounds(400, 550, 100, 30);
		moverficha.setText("Mover");
		moverficha.setForeground(Color.black);
		moverficha.setBackground(Color.white);
		


		imag = new JLabel();
		imag.setBounds(0, 0, 1280, 685);
		ImageIcon imag1 = new ImageIcon("media/Fondo.jpg");
		icono = new ImageIcon(
				imag1.getImage().getScaledInstance(imag.getWidth(), imag.getHeight(), Image.SCALE_DEFAULT));
		imag.setIcon(icono);

		dado = new JLabel();
		dado.setBounds(200, 600, 75, 75);
		ImageIcon dado1 = new ImageIcon("media/dados-4.gif");
		icono = new ImageIcon(
				dado1.getImage().getScaledInstance(dado.getWidth(), dado.getHeight(), Image.SCALE_DEFAULT));
		dado.setIcon(icono);
		dado.setVisible(false);

		dadopng = new JLabel();
		dadopng.setBounds(200, 600, 75, 75);
		ImageIcon dadopng1 = new ImageIcon("media/dadopng.png");
		icono = new ImageIcon(
				dadopng1.getImage().getScaledInstance(dadopng.getWidth(), dadopng.getHeight(), Image.SCALE_DEFAULT));
		dadopng.setIcon(icono);
		dadopng.setVisible(true);

	

		amongus = new JLabel();
		amongus.setBounds(0, 0, 1280, 720);
		ImageIcon amongus1 = new ImageIcon("media/among.gif");
		icono = new ImageIcon(
				amongus1.getImage().getScaledInstance(amongus.getWidth(), amongus.getHeight(), Image.SCALE_DEFAULT));
		amongus.setIcon(icono);
		amongus.setVisible(false);

		

		add(amongus);
		add(tablero1);
		add(fazul);
		add(fverde);
		add(froja);
		add(frosada);
		add(jug1);
		add(jug2);
		add(jug3);
		add(jug4);
		add(random_numero);
		add(titulo);
		add(btn4ram);
		add(moverficha);
		add(dadopng);
		add(dado);
		add(imag);

	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getJug1() {
		return jug1;
	}

	public void setJug1(JLabel jug1) {
		this.jug1 = jug1;
	}

	public JLabel getJug2() {
		return jug2;
	}

	public void setJug2(JLabel jug2) {
		this.jug2 = jug2;
	}

	public JLabel getJug3() {
		return jug3;
	}

	public void setJug3(JLabel jug3) {
		this.jug3 = jug3;
	}

	public JLabel getJug4() {
		return jug4;
	}

	public void setJug4(JLabel jug4) {
		this.jug4 = jug4;
	}

	public JLabel getImag() {
		return imag;
	}

	public void setImag(JLabel imag) {
		this.imag = imag;
	}

	public JLabel getDado() {
		return dado;
	}

	public void setDado(JLabel dado) {
		this.dado = dado;
	}

	public JLabel getDadopng() {
		return dadopng;
	}

	public void setDadopng(JLabel dadopng) {
		this.dadopng = dadopng;
	}

	public JLabel getAmongus() {
		return amongus;
	}

	public void setAmongus(JLabel amongus) {
		this.amongus = amongus;
	}

	public JButton getBtn4ram() {
		return btn4ram;
	}

	public void setBtn4ram(JButton btn4ram) {
		this.btn4ram = btn4ram;
	}

	

	public Tablero getTablero1() {
		return tablero1;
	}

	public void setTablero1(Tablero tablero1) {
		this.tablero1 = tablero1;
	}

	public JLabel getRandom_numero() {
		return random_numero;
	}

	public void setRandom_numero(JLabel random_numero) {
		this.random_numero = random_numero;
	}

	public JLabel getFroja() {
		return froja;
	}

	public void setFroja(JLabel froja) {
		this.froja = froja;
	}

	public JLabel getFrosada() {
		return frosada;
	}

	public void setFrosada(JLabel frosada) {
		this.frosada = frosada;
	}

	public JLabel getFverde() {
		return fverde;
	}

	public void setFverde(JLabel fverde) {
		this.fverde = fverde;
	}

	public JLabel getFazul() {
		return fazul;
	}

	public void setFazul(JLabel fazul) {
		this.fazul = fazul;
	}

	public JButton getMoverficha() {
		return moverficha;
	}

	public void setMoverficha(JButton moverficha) {
		this.moverficha = moverficha;
	}
	
	
	
}
