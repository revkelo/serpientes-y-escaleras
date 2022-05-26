package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tablero extends JPanel{
	private JPanel[][] paneles;
	private JLabel ficha_r;
	public Tablero() {
		
		ficha_r = new JLabel();
		ficha_r.setBounds(0, 0, 1, 1);
		ImageIcon ficha_r1 = new ImageIcon("media/ficharoja.png");
		Icon icono = new ImageIcon(
				ficha_r1.getImage().getScaledInstance(ficha_r.getWidth(), ficha_r.getHeight(), Image.SCALE_DEFAULT));
		ficha_r.setIcon(icono);
		
		
		paneles = new JPanel[4][4];
		for (int i = 0; i < paneles.length; i++) {
			for (int j = 0; j < paneles.length; j++) {
				paneles[i][j] = new JPanel();

			}
		}
		this.armado();
		this.atributos();
		this.lanzar_tablero();
		
	}
	public void atributos() {
		setLayout(new GridLayout(4,4));
		setBounds(540, 29, 650, 610);
		
	}
public void armado () {
	for (int i = 0; i < paneles.length; i++) {
		for (int j = 0; j < paneles.length; j++) {
			add(paneles[i][j]);
			if((i+j+1)%2==0) {
				paneles[i][j].setBackground(Color.BLACK);
			}
			else {
				paneles[i][j].setBackground(Color.WHITE);
			}
			
		}
	}
}
public void lanzar_tablero() {
	setVisible(true);
}
	
	

}
