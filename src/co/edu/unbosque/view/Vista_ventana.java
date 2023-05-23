/**
 * Paquete vista que gestiona la interfaz grafica
 */
package co.edu.unbosque.view;

import javax.swing.JOptionPane;

/**
 * Panel destinado a que el usuario escoja la ficha que desea en el juego
 * @author Daniela
 * @author Nicolas
 * @author Kevin
 * @author Katherine
 * @version 1.1
 */

public class Vista_ventana {

	/**
	 * Metodo constructor
	 */

	public Vista_ventana() {

	}

	/**
	 * Metodo encargado de leer un dato tipo double
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return dato entero leido
	 */

	public double leerDato(String mensaje) {
		double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */

	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje , "Ventana de Informacion", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */

	public void mostrarAdvertencia(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje , "Ventana de Advertencia", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */

	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje , "Ventana de Error", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */

	public void mostrarOk (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje , "Oyeeeee", JOptionPane.PLAIN_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */

	public int mostrarYoN (String mensaje) {
		return JOptionPane.showConfirmDialog(null, mensaje , "Wait...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */

	public void mostrarYes_Option (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje , "", JOptionPane.YES_OPTION);

	}
}


