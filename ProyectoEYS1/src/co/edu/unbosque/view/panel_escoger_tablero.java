package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panel_escoger_tablero extends JPanel {
	private JButton tablero_6x6, tablero_9x9, tablero_12x12;

	public panel_escoger_tablero() {
		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));

		inicializarComponentes();

		setVisible(false);
	}

	private void inicializarComponentes() {
		tablero_6x6 = new JButton("6x6");
		tablero_6x6.setBounds(0, 0, 100, 100);
		tablero_6x6.setActionCommand("6x6");
		
		tablero_9x9 = new JButton("9x9");
		tablero_9x9.setBounds(100, 0, 100, 100);
		tablero_9x9.setActionCommand("9x9");
		
		tablero_12x12 = new JButton("12x12");
		tablero_12x12.setBounds(400, 0, 100, 100);
		tablero_12x12.setActionCommand("12x12");
		
		
		add(tablero_12x12);
		add(tablero_6x6);
		add(tablero_9x9);
	}

	public JButton getTablero_6x6() {
		return tablero_6x6;
	}

	public void setTablero_6x6(JButton tablero_6x6) {
		this.tablero_6x6 = tablero_6x6;
	}

	public JButton getTablero_9x9() {
		return tablero_9x9;
	}

	public void setTablero_9x9(JButton tablero_9x9) {
		this.tablero_9x9 = tablero_9x9;
	}

	public JButton getTablero_12x12() {
		return tablero_12x12;
	}

	public void setTablero_12x12(JButton tablero_12x12) {
		this.tablero_12x12 = tablero_12x12;
	}

}
