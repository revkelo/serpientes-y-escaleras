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
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelPancracio  extends JPanel{

	/**
	 * Atributo tipo JButton
	 */
	private JButton tirar_jug1,tirar_jug2,tirar_jug3,tirar_jug4;
	private JLabel pancracio, pancracioimg, random, pregunta, img_random;

	/**
	 * Metodo constructor 
	 */
	public PanelPancracio() {

		setLayout(null);
		setOpaque(false);
		inicializarComponentes();

		setVisible(true);
	}

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */

	public void inicializarComponentes() {

		random = new JLabel();
		random.setBounds(130, 82, 400, 100);
		random.setText("");
		random.setFont(new Font("Arial Rounded MT Bold", 0, 70));
		random.setForeground(Color.white);
		add(random);

		pancracioimg = new JLabel();
		pancracioimg.setBounds(106, 30, 290, 250);
		ImageIcon pancri = new ImageIcon("imagenes/pancracioimg.png");
		Icon icono = new ImageIcon( pancri.getImage().getScaledInstance(pancracioimg.getWidth(), pancracioimg.getHeight(), Image.SCALE_DEFAULT));
		pancracioimg.setIcon(icono);
		pancracioimg.setVisible(true);
		add(pancracioimg);

		pancracio = new JLabel();
		pancracio.setBounds(106, 30, 290, 250);
		ImageIcon pancris = new ImageIcon("imagenes/Pancracio.gif");
		icono = new ImageIcon( pancris.getImage().getScaledInstance(pancracio.getWidth(), pancracio.getHeight(), Image.SCALE_DEFAULT));
		pancracio.setIcon(icono);
		pancracio.setVisible(false);
		add(pancracio);

		tirar_jug1 =  new JButton("Tirar dado");
		tirar_jug1.setBounds(150, 300, 200, 50);
		tirar_jug1.setFont(new Font ("cooper black", 3, 25));
		tirar_jug1.setBackground(Color.BLACK);
		tirar_jug1.setForeground(Color.WHITE);
		tirar_jug1.setFocusable(false);
		tirar_jug1.setActionCommand("TIRAR_JUG1");
		tirar_jug1.setVisible(true);
		add(tirar_jug1);

		tirar_jug2 =  new JButton("Tirar dado");
		tirar_jug2.setBounds(150, 300, 200, 50);
		tirar_jug2.setFont(new Font ("cooper black", 3, 25));
		tirar_jug2.setBackground(Color.BLACK);
		tirar_jug2.setForeground(Color.WHITE);
		tirar_jug2.setFocusable(false);
		tirar_jug2.setActionCommand("TIRAR_JUG2");
		tirar_jug2.setVisible(false);
		add(tirar_jug2);

		tirar_jug3 =  new JButton("Tirar dado");
		tirar_jug3.setBounds(150, 300, 200, 50);
		tirar_jug3.setFont(new Font ("cooper black", 3, 25));
		tirar_jug3.setBackground(Color.BLACK);
		tirar_jug3.setForeground(Color.WHITE);
		tirar_jug3.setFocusable(false);
		tirar_jug3.setActionCommand("TIRAR_JUG3");
		tirar_jug3.setVisible(false);
		add(tirar_jug3);

		tirar_jug4 =  new JButton("Tirar dado");
		tirar_jug4.setBounds(150, 300, 200, 50);
		tirar_jug4.setFont(new Font ("cooper black", 3, 25));
		tirar_jug4.setBackground(Color.BLACK);
		tirar_jug4.setForeground(Color.WHITE);
		tirar_jug4.setFocusable(false);
		tirar_jug4.setActionCommand("TIRAR_JUG4");
		tirar_jug4.setVisible(false);
		add(tirar_jug4);

		img_random = new JLabel();
		img_random.setBounds(155, 390, 200, 200);
		ImageIcon imgr = new ImageIcon("imagenes/randomimg.png");
		icono = new ImageIcon(imgr.getImage().getScaledInstance(img_random.getWidth(), img_random.getHeight(),
				Image.SCALE_DEFAULT));
		img_random.setIcon(icono);
		img_random.setVisible(true);
		add(img_random);


	}

	/**
	 * @param tirar_jug1,tirar_jug2,tirar_jug3,tirar_jug4, pancracio, pancracioimg, random, pregunta, img_random
	 * @return tirar_jug1,tirar_jug2,tirar_jug3,tirar_jug4, pancracio, pancracioimg, random, pregunta, img_random
	 */

	public JButton getTirar_jug1() {
		return tirar_jug1;
	}

	public void setTirar_jug1(JButton tirar_jug1) {
		this.tirar_jug1 = tirar_jug1;
	}

	public JButton getTirar_jug2() {
		return tirar_jug2;
	}

	public void setTirar_jug2(JButton tirar_jug2) {
		this.tirar_jug2 = tirar_jug2;
	}

	public JButton getTirar_jug3() {
		return tirar_jug3;
	}

	public void setTirar_jug3(JButton tirar_jug3) {
		this.tirar_jug3 = tirar_jug3;
	}

	public JButton getTirar_jug4() {
		return tirar_jug4;
	}

	public void setTirar_jug4(JButton tirar_jug4) {
		this.tirar_jug4 = tirar_jug4;
	}

	public JLabel getPregunta() {
		return pregunta;
	}

	public void setPregunta(JLabel pregunta) {
		this.pregunta = pregunta;
	}

	public JLabel getPancracio() {
		return pancracio;
	}

	public void setPancracio(JLabel pancracio) {
		this.pancracio = pancracio;
	}

	public JLabel getPancracioimg() {
		return pancracioimg;
	}

	public void setPancracioimg(JLabel pancracioimg) {
		this.pancracioimg = pancracioimg;
	}

	public JLabel getRandom() {
		return random;
	}

	public void setRandom(JLabel random) {
		this.random = random;
	}

}




