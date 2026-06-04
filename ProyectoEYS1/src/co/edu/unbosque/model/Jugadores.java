
package co.edu.unbosque.model;

/**
 * Clase que maneja donde se guarda la informacion de los jugadores.
 * @author Kevin, Nicolás, Daniela y Katherine.
 *
 */

public class Jugadores {
	
	/**
	 * Atributo String donde se guardar los participantes.
	 */
	private String nombre;
	/**
	 * Metodo constructor
	 */
	public Jugadores() {	
	}
	
	/**
	 * Metodo constructor especifico.
	 * @param nombre
	 */
	public Jugadores(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Getters and Setters-
	 * @param nombre
	 */

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
