package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tablero extends JPanel {
	private JPanel[][] paneles = new JPanel[8][8];
	private JLabel ficha_roja;
	private JLabel ficha_azul;
	private JLabel ficha_v;
	private JLabel ficha_ro;

	public Tablero() {

		setLayout(new GridLayout(8, 8));
		setBounds(540, 29, 650, 610);

		ficha_roja = new JLabel();
		ficha_roja.setBounds(-10, 40, 60, 40);
		ImageIcon ficha_r1 = new ImageIcon("media/ficharoja.png");
		Icon icono = new ImageIcon(
				ficha_r1.getImage().getScaledInstance(ficha_roja.getWidth(), ficha_roja.getHeight(), Image.SCALE_DEFAULT));
		ficha_roja.setIcon(icono);
		
		
		ficha_v = new JLabel();
		ficha_v.setBounds(35, 10, 60, 40);
		ImageIcon ficha_v1 = new ImageIcon("media/ficha_v.png");
		icono = new ImageIcon(
				ficha_v1.getImage().getScaledInstance(ficha_v.getWidth(), ficha_v.getHeight(), Image.SCALE_DEFAULT));
		ficha_v.setIcon(icono);

		

		ficha_ro = new JLabel();
		ficha_ro.setBounds(-10, 10, 60, 40);
		ImageIcon ficha_ro1 = new ImageIcon("media/ficha_ro.png");
		icono = new ImageIcon(
				ficha_ro1.getImage().getScaledInstance(ficha_ro.getWidth(), ficha_ro.getHeight(), Image.SCALE_DEFAULT));
		ficha_ro.setIcon(icono);

		ficha_azul = new JLabel();
		ficha_azul.setBounds(35, 40, 60, 40);
		ImageIcon ficha_azul1 = new ImageIcon("media/ficha_azul.png");
		icono = new ImageIcon(ficha_azul1.getImage().getScaledInstance(ficha_azul.getWidth(), ficha_azul.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_azul.setIcon(icono);

		this.tablero_paneles();
		this.colortablero();

		paneles[7][0].add(ficha_roja);
		paneles[7][0].add(ficha_v);
		paneles[7][0].add(ficha_azul);
		paneles[7][0].add(ficha_ro);
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
}
