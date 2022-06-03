package co.edu.unbosque.view;

import javax.swing.JFrame;

public class Ventana_general {
	private Ventana_menus v_principal;
	private Ventana_juego juego1;
	private Vista_ventana vista;

	public Ventana_general() {
		v_principal = new Ventana_menus();
		juego1 = new Ventana_juego();
		vista = new Vista_ventana();
	}

	public Ventana_menus getV_principal() {
		return v_principal;
	}

	public void setV_principal(Ventana_menus v_principal) {
		this.v_principal = v_principal;
	}

	public Ventana_juego getJuego1() {
		return juego1;
	}

	public void setJuego1(Ventana_juego juego1) {
		this.juego1 = juego1;
	}

	public Vista_ventana getVista() {
		return vista;
	}

	public void setVista(Vista_ventana vista) {
		this.vista = vista;
	}
	
}
