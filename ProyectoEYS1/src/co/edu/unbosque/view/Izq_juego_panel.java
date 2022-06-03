package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Izq_juego_panel extends JPanel {
	private JLabel jugador_1, jugador_2, jugador_3, jugador_4, turno;
	private JLabel tur_jug1,tur_jug2,tur_jug3,tur_jug4;

	public Izq_juego_panel() {
		setLayout(null);
		setBounds(0, 0, 200, 200);
		setBackground(Color.GRAY);
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {
		jugador_1 = new JLabel("nombre 1");
		jugador_1 .setBounds(50, 100, 250, 50);
		jugador_1 .setBackground(new Color(108, 246, 248, 0));
		jugador_1 .setFont(new Font("cooper black", 0, 30));
		jugador_1 .setForeground(Color.white);

		
		jugador_2 = new JLabel("nombre 2");
		jugador_2 .setBounds(50, 150, 250, 50);
		jugador_2 .setBackground(new Color(108, 246, 248, 0));
		jugador_2 .setFont(new Font("cooper black", 0, 30));
		jugador_2 .setForeground(Color.white);

		

		jugador_3 = new JLabel("nombre 3");
		jugador_3 .setBounds(50, 200, 250, 50);
		jugador_3 .setBackground(new Color(108, 246, 248, 0));
		jugador_3 .setFont(new Font("cooper black", 0, 30));
		jugador_3 .setForeground(Color.white);


		jugador_4 = new JLabel("nombre 4");
		jugador_4 .setBounds(50, 250, 250, 50);
		jugador_4 .setBackground(new Color(108, 246, 248, 0));
		jugador_4 .setFont(new Font("cooper black", 0, 30));
		jugador_4 .setForeground(Color.white);
		
		tur_jug1= new JLabel("nombre 1");
		tur_jug1.setBounds(20, 350, 200, 300);
		tur_jug1.setBackground(new Color(108, 246, 248, 0));
		tur_jug1.setFont(new Font("cooper black", 0, 30));
		tur_jug1.setForeground(Color.white);
		tur_jug1.setVisible(false);
		
		tur_jug2= new JLabel("nombre 2");
		tur_jug2.setBounds(20, 320, 200, 300);
		tur_jug2.setBackground(new Color(108, 246, 248, 0));
		tur_jug2.setFont(new Font("cooper black", 0, 30));
		tur_jug2.setForeground(Color.white);
		tur_jug2.setVisible(false);


		tur_jug3= new JLabel("nombre 3");
		tur_jug3.setBounds(20, 320, 200, 300);
		tur_jug3.setBackground(new Color(108, 246, 248, 0));
		tur_jug3.setFont(new Font("cooper black", 0, 30));
		tur_jug3.setForeground(Color.white);
		tur_jug3.setVisible(false);
		
		
		
		tur_jug4= new JLabel("nombre 4");
		tur_jug4.setBounds(20, 360, 200, 300);
		tur_jug4.setBackground(new Color(108, 246, 248, 0));
		tur_jug4.setFont(new Font("cooper black", 0, 30));
		tur_jug4.setForeground(Color.white);
		tur_jug4.setVisible(false);
		
		
		
		
		turno = new JLabel("TURNO");
		turno .setBounds(20, 280, 200, 300);
		turno .setBackground(new Color(108, 246, 248, 0));
		turno .setFont(new Font("cooper black", 0, 40));
		turno .setForeground(Color.white);
		
//		jugador_4 .setVisible(false);
		
		
		add(jugador_1);
		add(jugador_2);
		add(jugador_3);
		add(jugador_4);
		add(turno);
		add(tur_jug1);
		add(tur_jug2);
		add(tur_jug3);
		add(tur_jug4);
	}

}
