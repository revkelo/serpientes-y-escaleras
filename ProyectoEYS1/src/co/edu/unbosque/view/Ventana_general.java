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

public class Ventana_general {

	private Ventana_menus v_principal;
	private Ventana_tutorial v_tuto;
	private Ventana_juego juego1;
	private Vista_ventana vista;
	private Consola miconsola;

	/**
	 * Metodo constructor
	 */

	public Ventana_general() {

		v_principal = new Ventana_menus();
		v_tuto = new Ventana_tutorial();
		juego1 = new Ventana_juego();
		vista = new Vista_ventana();
		miconsola = new Consola();
	}

	/**
	 * @param v_principal, v_tuto, juego1, vista, miconsola
	 * @return v_principal, v_tuto, juego1, vista, miconsola
	 */

	public Ventana_menus getV_principal() {
		return v_principal;
	}

	public Ventana_tutorial getV_tuto() {
		return v_tuto;
	}

	public void setV_tuto(Ventana_tutorial v_tuto) {
		this.v_tuto = v_tuto;
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

	public Consola getMiconsola() {
		return miconsola;
	}

	public void setMiconsola(Consola miconsola) {
		this.miconsola = miconsola;
	}

}
