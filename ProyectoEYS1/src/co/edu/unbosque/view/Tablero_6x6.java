/**
 * Paquete vista que gestiona la interfaz grafica
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel destinado a que el usuario escoja la ficha que desea en el juego
 * @author Daniela
 * @author Nicolas
 * @author Kevin
 * @author Katherine
 * @version 1.1
 */

public class Tablero_6x6 extends JPanel {

	/**
	 * Atributo tipo JLabel donde se encuentran las fichas del juego en el tablero 9x9
	 */
	private JLabel ficha_planeta, ficha_nave, ficha_estrella, ficha_alien;

	/**
	 * Atributo tipo JPanel para generar las casillas
	 */

	private JPanel[][] paneles;

	/**
	 * Atributo tipo entero (6) donde se colocan los parametros de las casillas
	 */
	int division_paneles1 = 6, division_paneles2 = 6;
	int numero_de_paneles1 = 6, numero_de_paneles2 = 6;

	/**
	 * Metodo constructor
	 */

	public Tablero_6x6() {

		setLayout(new GridLayout(division_paneles1, division_paneles2));
		setBounds(540, 29, 650, 610);

		paneles = new JPanel[numero_de_paneles1][numero_de_paneles2];

		ficha_nave = new JLabel();
		ficha_nave.setBounds(5, 60, 40, 40);
		ImageIcon ficha_nave1 = new ImageIcon("imagenes/nave.png");
		Icon icono = new ImageIcon(ficha_nave1.getImage().getScaledInstance(ficha_nave.getWidth(), ficha_nave.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_nave.setIcon(icono);


		ficha_planeta = new JLabel();
		ficha_planeta.setBounds(50, 5, 30, 30);
		ImageIcon ficha_planeta1 = new ImageIcon("imagenes/Saturnoo.png");
		icono = new ImageIcon(ficha_planeta1.getImage().getScaledInstance(ficha_planeta.getWidth(), ficha_planeta.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_planeta.setIcon(icono);


		ficha_alien = new JLabel();
		ficha_alien.setBounds(50, 60, 30, 30);
		ImageIcon ficha_alien1 = new ImageIcon("imagenes/Alien.png");
		icono = new ImageIcon(ficha_alien1.getImage().getScaledInstance(ficha_alien.getWidth(), ficha_alien.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_alien.setIcon(icono);


		ficha_estrella= new JLabel();
		ficha_estrella.setBounds(5, 5, 30, 30);
		ImageIcon ficha_estrella1 = new ImageIcon("imagenes/Estrellaa.png");
		icono = new ImageIcon(ficha_estrella1.getImage().getScaledInstance(ficha_estrella.getWidth(), ficha_estrella.getHeight(),
				Image.SCALE_DEFAULT));
		ficha_estrella.setIcon(icono);


		this.tablero_paneles();
		this.colortablero();


		paneles[5][0].add(ficha_nave);
		paneles[5][0].add(ficha_planeta);
		paneles[5][0].add(ficha_alien);
		paneles[5][0].add(ficha_estrella);
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

	/**
	 * Metodo encargado para generar las casillas
	 * @param none
	 * @return void
	 */

	public void tablero_paneles() {
		for (int i = 0; i < paneles.length; i++) {
			for (int j = 0; j < paneles.length; j++) {
				paneles[i][j] = new JPanel();
				paneles[i][j].setLayout(null);
			}
		}

	}

	/**
	 * @param ficha_planeta, ficha_nave, ficha_estrella, ficha_alien, paneles, division_paneles1, division_paneles2,
	 * numero_de_paneles1, numero_de_paneles2
	 * @return ficha_planeta, ficha_nave, ficha_estrella, ficha_alien, paneles, division_paneles1, division_paneles2,
	 * numero_de_paneles1, numero_de_paneles2
	 */

	public JPanel[][] getPaneles() {
		return paneles;
	}

	public void setPaneles(JPanel[][] paneles) {
		this.paneles = paneles;
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
