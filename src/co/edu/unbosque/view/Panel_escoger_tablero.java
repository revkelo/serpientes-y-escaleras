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
import javax.swing.JComboBox;
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

public class Panel_escoger_tablero extends JPanel {

	/**
	 * Atributo tipo JButton para que el usuario escoja que nivel de dificutad quiere en el juego
	 */
	private JButton facil, inter, dificil;

	/**
	 * Atributo tipo JLabel en el que se guardan las imagenes de los tableros para que el usuario los pueda previsualizar
	 */
	private JLabel tab6, tab9, tab12;

	/**
	 * Metodo constructor
	 */
	public Panel_escoger_tablero() {

		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));

		inicializarComponentes();

		setVisible(false);

	}

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */

	private void inicializarComponentes() {

		facil = new JButton ("FÁCIL");
		facil.setBounds(0, 80, 130, 40);
		facil.setBackground(new Color(108, 246, 248, 0));
		facil.setFont(new Font ("cooper black", 3, 20));
		facil.setForeground(Color.white);
		facil.setActionCommand("6x6");
		facil.setFocusable(false);
		facil.setVisible(true);
		add(facil);

		inter = new JButton ("MEDIO");
		inter.setBounds(0, 160, 130, 40);
		inter.setBackground(new Color(108, 246, 248, 0));
		inter.setFont(new Font ("cooper black", 3, 20));
		inter.setForeground(Color.white);
		inter.setActionCommand("9x9");
		inter.setFocusable(false);
		inter.setVisible(true);
		add(inter);

		dificil = new JButton ("DIFICIL");
		dificil.setBounds(0, 240, 130, 40);
		dificil.setBackground(new Color(108, 246, 248, 0));
		dificil.setFont(new Font ("cooper black", 3, 20));
		dificil.setForeground(Color.white);
		dificil.setActionCommand("12x12");
		dificil.setFocusable(false);
		dificil.setVisible(true);
		add(dificil);


		tab6 = new JLabel();
		tab6.setBounds(250, 20, 300, 300);
		ImageIcon tab6x6_1 = new ImageIcon("imagenes/Tab6.png");
		Icon icono = new ImageIcon(tab6x6_1.getImage().getScaledInstance(tab6.getWidth(),
				tab6.getHeight(), Image.SCALE_DEFAULT));
		tab6.setIcon(icono);
		tab6.setVisible(false);
		add(tab6);

		tab9 = new JLabel();
		tab9.setBounds(250, 20, 300, 300);
		ImageIcon tab9x6_1 = new ImageIcon("imagenes/Tab9.png");
		icono = new ImageIcon(tab9x6_1.getImage().getScaledInstance(tab9.getWidth(),
				tab9.getHeight(), Image.SCALE_DEFAULT));
		tab9.setIcon(icono);
		tab9.setVisible(false);
		add(tab9);

		tab12 = new JLabel();
		tab12.setBounds(250, 20, 300, 300);
		ImageIcon tab12x6_1 = new ImageIcon("imagenes/Tab12.png");
		icono = new ImageIcon(tab12x6_1.getImage().getScaledInstance(tab12.getWidth(),
				tab12.getHeight(), Image.SCALE_DEFAULT));
		tab12.setIcon(icono);
		tab12.setVisible(false);
		add(tab12);

	}

	/**
	 * @param facil, inter, dificil, tab6, tab9, tab12
	 * @return facil, inter, dificil, tab6, tab9, tab12
	 */

	public JButton getFacil() {
		return facil;
	}

	public void setFacil(JButton facil) {
		this.facil = facil;
	}

	public JButton getInter() {
		return inter;
	}

	public void setInter(JButton inter) {
		this.inter = inter;
	}

	public JButton getDificil() {
		return dificil;
	}

	public void setDificil(JButton dificil) {
		this.dificil = dificil;
	}

	public JLabel getTab6() {
		return tab6;
	}

	public void setTab6(JLabel tab6) {
		this.tab6 = tab6;
	}

	public JLabel getTab9() {
		return tab9;
	}

	public void setTab9(JLabel tab9) {
		this.tab9 = tab9;
	}

	public JLabel getTab12() {
		return tab12;
	}

	public void setTab12(JLabel tab12) {
		this.tab12 = tab12;
	}


}