package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana_tablero extends JFrame {

	private Ventana_tablero vent;
	private Vista_ventana vista;
	
	public Ventana_tablero () {
		
		setTitle("KEDANIKA");
		setSize (1000, 650);
		vista = new Vista_ventana();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	private void inicializarComponentes() {
		
	}

}


