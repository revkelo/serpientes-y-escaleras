package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana_juego extends JFrame {
	private Izq_juego_panel panel_izq;
	private Tablero_6x6 tab6;
	private Tablero_9x9 tab9;
	private Tablero_12x12 tab12;
	private JButton dado;
	private JLabel num_dado;
	

	public Ventana_juego() {
		setTitle("Juego");
		setSize(1280, 720);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(false);
	}

	private void inicializarComponentes() {
		panel_izq = new Izq_juego_panel();
		panel_izq.setBounds(10, 30, 350, 600);
		getContentPane().add(panel_izq);
		
		num_dado = new JLabel("");
		num_dado.setBounds(400,400 , 200, 50);
		num_dado.setFont(new Font("cooper black", 0, 40));
		num_dado.setForeground(Color.black);
		num_dado.setVisible(true);
		
		
		dado = new JButton("dado");
		dado.setBounds(0,0,100,100);
		dado.setActionCommand("dado");
		
		tab6 = new Tablero_6x6();
		tab6.setBounds(500, 10, 600, 600);
		tab6.setVisible(false);
		
		tab9 = new Tablero_9x9();
		tab9.setBounds(500, 10, 600, 600);
		tab9.setVisible(false);
		
		tab12 = new Tablero_12x12();
		tab12.setBounds(500, 10, 600, 600);
		tab12.setVisible(false);
		
		
		getContentPane().add(num_dado);
		getContentPane().add(dado);
		getContentPane().add(tab6);
		getContentPane().add(tab9);
		getContentPane().add(tab12);
		
	}

	public Izq_juego_panel getPanel_izq() {
		return panel_izq;
	}

	public void setPanel_izq(Izq_juego_panel panel_izq) {
		this.panel_izq = panel_izq;
	}

	public Tablero_6x6 getTab6() {
		return tab6;
	}

	public void setTab6(Tablero_6x6 tab6) {
		this.tab6 = tab6;
	}

	public Tablero_9x9 getTab9() {
		return tab9;
	}

	public void setTab9(Tablero_9x9 tab9) {
		this.tab9 = tab9;
	}

	public Tablero_12x12 getTab12() {
		return tab12;
	}

	public void setTab12(Tablero_12x12 tab12) {
		this.tab12 = tab12;
	}

	public JButton getDado() {
		return dado;
	}

	public void setDado(JButton dado) {
		this.dado = dado;
	}

	public JLabel getNum_dado() {
		return num_dado;
	}

	public void setNum_dado(JLabel num_dado) {
		this.num_dado = num_dado;
	}
	

}
