package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tablero_9x9 extends JPanel {
	private JLabel ficha_roja;
	private JLabel ficha_azul;
	private JLabel ficha_v;
	private JLabel ficha_ro;
	private JPanel[][] paneles;
	int division_paneles1 = 9  ,division_paneles2 = 9;
	int numero_de_paneles1 = 9 ,numero_de_paneles2 =9;

	public Tablero_9x9() {

		setLayout(new GridLayout(division_paneles1, division_paneles2));
		setBounds(540, 29, 650, 610);

		paneles = new JPanel[numero_de_paneles1][numero_de_paneles2];
		ficha_roja = new JLabel();
		ficha_roja.setBounds(-15, 35, 60, 40);
		ImageIcon ficha_r1 = new ImageIcon("imagenes/ficharoja.png");
		Icon icono = new ImageIcon(ficha_r1.getImage().getScaledInstance(ficha_roja.getWidth(), ficha_roja.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_roja.setIcon(icono);

		ficha_v = new JLabel();
		ficha_v.setBounds(25, 5, 60, 40);
		ImageIcon ficha_v1 = new ImageIcon("imagenes/ficha_v.png");
		icono = new ImageIcon(
				ficha_v1.getImage().getScaledInstance(ficha_v.getWidth(), ficha_v.getHeight(), Image.SCALE_DEFAULT));
		ficha_v.setIcon(icono);
		ficha_v.setVisible(true);

		ficha_ro = new JLabel();
		ficha_ro.setBounds(-15, 5, 60, 40);
		ImageIcon ficha_ro1 = new ImageIcon("imagenes/ficha_ro.png");
		icono = new ImageIcon(
				ficha_ro1.getImage().getScaledInstance(ficha_ro.getWidth(), ficha_ro.getHeight(), Image.SCALE_DEFAULT));
		ficha_ro.setIcon(icono);

		ficha_azul = new JLabel();
		ficha_azul.setBounds(25, 35, 60, 40);
		ImageIcon ficha_azul1 = new ImageIcon("imagenes/ficha_azul.png");
		icono = new ImageIcon(ficha_azul1.getImage().getScaledInstance(ficha_azul.getWidth(), ficha_azul.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_azul.setIcon(icono);

		this.tablero_paneles();
		this.colortablero();
	
		
		paneles[8][0].add(ficha_roja);
		paneles[8][0].add(ficha_v);
		paneles[8][0].add(ficha_azul);
		paneles[8][0].add(ficha_ro);
		
		setVisible(true);

	}

	/**
	 * Este metodo determina los colores de las casillas
	 * 
	 * @author Kevin
	 * @param none
	 * @return void
	 **/

	public void colortablero() {
		for (int i = 0; i < paneles.length; i++) {
			for (int j = 0; j < paneles.length; j++) {
				add(paneles[i][j]);
				if ((i + j + 1) % 2 == 0) {
					paneles[i][j].setBackground(Color.BLACK);
				} else {
					paneles[i][j].setBackground(Color.WHITE);
				}

			}
		}
	}

	public void tablero_paneles() {
		for (int i = 0; i < paneles.length; i++) {
			for (int j = 0; j < paneles.length; j++) {
				paneles[i][j] = new JPanel();
				paneles[i][j].setLayout(null);
			}
		}

	}


	public JPanel[][] getPaneles() {
		return paneles;
	}

	public void setPaneles(JPanel[][] paneles) {
		this.paneles = paneles;
	}

	public JLabel getFicha_roja() {
		return ficha_roja;
	}

	public void setFicha_roja(JLabel ficha_roja) {
		this.ficha_roja = ficha_roja;
	}

	public JLabel getFicha_azul() {
		return ficha_azul;
	}

	public void setFicha_azul(JLabel ficha_azul) {
		this.ficha_azul = ficha_azul;
	}

	public JLabel getFicha_v() {
		return ficha_v;
	}

	public void setFicha_v(JLabel ficha_v) {
		this.ficha_v = ficha_v;
	}

	public JLabel getFicha_ro() {
		return ficha_ro;
	}

	public void setFicha_ro(JLabel ficha_ro) {
		this.ficha_ro = ficha_ro;
	}

	public int getDivision_paneles1() {
		return division_paneles1;
	}

	public void setDivision_paneles1(int division_paneles1) {
		this.division_paneles1 = division_paneles1;
	}

	public int getDivision_paneles2() {
		return division_paneles2;
	}

	public void setDivision_paneles2(int division_paneles2) {
		this.division_paneles2 = division_paneles2;
	}

	public int getNumero_de_paneles1() {
		return numero_de_paneles1;
	}

	public void setNumero_de_paneles1(int numero_de_paneles1) {
		this.numero_de_paneles1 = numero_de_paneles1;
	}

	public int getNumero_de_paneles2() {
		return numero_de_paneles2;
	}

	public void setNumero_de_paneles2(int numero_de_paneles2) {
		this.numero_de_paneles2 = numero_de_paneles2;
	}

}
