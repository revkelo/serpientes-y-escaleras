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
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Panel destinado a que el usuario escoja la ficha que desea en el juego
 * @author Daniela
 * @author Nicolas
 * @author Kevin
 * @author Katherine
 * @version 1.1
 */

public class Ventana_tutorial extends JFrame {

	private JLabel img_fondo, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;
	private JLabel t1, t2, t3, t33, t4, t5, t6, t66,  t7, t8, t88, t91, t92, t93, t94, t95, t10, t11, t12;
	private JPanel inicio, jugadores, fichas, nivel, dado_movimiento_turnos, escaleras_y_serpientes, opciones;
	private JButton sig1, sig2, sig3, sig4, sig5, sig6, back;

	/**
	 * Metodo constructor
	 */

	public Ventana_tutorial () {

		setTitle("KEDANIKA");
		setSize (1000, 650);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);

	}

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {

		//p1

		t1 = new JLabel ("Darle click a Jugar");
		t1.setBounds(620, 300, 300, 50);
		t1.setBackground(new Color(108, 246, 248, 0));
		t1.setFont(new Font("cooper black", 0, 20));
		t1.setForeground(Color.black);
		t1.setVisible(true);
		add(t1);

		i1 = new JLabel();
		i1.setBounds(200, 190, 400, 300);
		ImageIcon img1 = new ImageIcon("imagenes/vtut1.png");
		Icon icono = new ImageIcon(img1.getImage().getScaledInstance(i1.getWidth(), i1.getHeight(),
				Image.SCALE_DEFAULT));
		i1.setIcon(icono);
		i1.setVisible(true);
		add(i1);

		sig1 = new JButton("Next");
		sig1.setBounds(740, 490, 90, 30);
		sig1.setBackground(new Color(108, 246, 248, 0));
		sig1.setFont(new Font ("cooper black", 3, 20));
		sig1.setForeground(Color.black);
		sig1.setFocusable(false);
		sig1.setVisible(true);
		sig1.setActionCommand("sig1");
		add(sig1);

		inicio = new JPanel ();
		inicio.setBounds(180, 180, 655, 345);
		inicio.setBackground(Color.LIGHT_GRAY);
		inicio.setVisible(true);
		add (inicio);

		//p2


		i2 = new JLabel();
		i2.setBounds(190, 190, 200, 150);
		ImageIcon img2 = new ImageIcon("imagenes/vtut2.png");
		icono = new ImageIcon(img2.getImage().getScaledInstance(i2.getWidth(), i2.getHeight(),
				Image.SCALE_DEFAULT));
		i2.setIcon(icono);
		i2.setVisible(false);
		add(i2);

		t2 = new JLabel ("Escoge cuantos jugaran");
		t2.setBounds(195, 400, 300, 50);
		t2.setBackground(new Color(108, 246, 248, 0));
		t2.setFont(new Font("cooper black", 0, 15));
		t2.setForeground(Color.black);
		t2.setVisible(false);
		add(t2);

		i3 = new JLabel();
		i3.setBounds(395, 190, 210, 150);
		ImageIcon img3 = new ImageIcon("imagenes/vtut3.png");
		icono = new ImageIcon(img3.getImage().getScaledInstance(i3.getWidth(), i3.getHeight(),
				Image.SCALE_DEFAULT));
		i3.setIcon(icono);
		i3.setVisible(false);
		add(i3);

		t3 = new JLabel ("Escribe los nicknames");
		t3.setBounds(420, 380, 300, 50);
		t3.setBackground(new Color(108, 246, 248, 0));
		t3.setFont(new Font("cooper black", 0, 15));
		t3.setForeground(Color.black);
		t3.setVisible(false);
		add(t3);

		t33 = new JLabel ("y click en guardar");
		t33.setBounds(435, 420, 300, 50);
		t33.setBackground(new Color(108, 246, 248, 0));
		t33.setFont(new Font("cooper black", 0, 15));
		t33.setForeground(Color.black);
		t33.setVisible(false);
		add(t33);

		i4 = new JLabel();
		i4.setBounds(615, 190, 215, 150);
		ImageIcon img4 = new ImageIcon("imagenes/vtut4.png");
		icono = new ImageIcon(img4.getImage().getScaledInstance(i4.getWidth(), i4.getHeight(),
				Image.SCALE_DEFAULT));
		i4.setIcon(icono);
		i4.setVisible(false);
		add(i4);

		t4 = new JLabel ("Vas bien si sale este mensaje");
		t4.setBounds(620, 400, 300, 50);
		t4.setBackground(new Color(108, 246, 248, 0));
		t4.setFont(new Font("cooper black", 0, 15));
		t4.setForeground(Color.black);
		t4.setVisible(false);
		add(t4);

		sig2 = new JButton("Next");
		sig2.setBounds(740, 490, 90, 30);
		sig2.setBackground(new Color(108, 246, 248, 0));
		sig2.setFont(new Font ("cooper black", 3, 20));
		sig2.setForeground(Color.black);
		sig2.setFocusable(false);
		sig2.setVisible(false);
		sig2.setActionCommand("sig2");
		add(sig2);

		jugadores = new JPanel ();
		jugadores.setBounds(180, 180, 655, 345);
		jugadores.setBackground(Color.LIGHT_GRAY);
		jugadores.setVisible(false);
		add (jugadores);


		//p3	

		i5 = new JLabel();
		i5.setBounds(190, 190, 200, 150);
		ImageIcon img5 = new ImageIcon("imagenes/vtut5.png");
		icono = new ImageIcon(img5.getImage().getScaledInstance(i5.getWidth(), i5.getHeight(),
				Image.SCALE_DEFAULT));
		i5.setIcon(icono);
		i5.setVisible(false);
		add(i5);

		t5 = new JLabel ("Escoge la ficha deseada");
		t5.setBounds(195, 400, 300, 50);
		t5.setBackground(new Color(108, 246, 248, 0));
		t5.setFont(new Font("cooper black", 0, 15));
		t5.setForeground(Color.black);
		t5.setVisible(false);
		add(t5);

		i6 = new JLabel();
		i6.setBounds(395, 190, 210, 150);
		ImageIcon img6 = new ImageIcon("imagenes/vtut6.png");
		icono = new ImageIcon(img6.getImage().getScaledInstance(i6.getWidth(), i6.getHeight(),
				Image.SCALE_DEFAULT));
		i6.setIcon(icono);
		i6.setVisible(false);
		add(i6);

		t6 = new JLabel ("Al terminar hacer");
		t6.setBounds(430, 380, 300, 50);
		t6.setBackground(new Color(108, 246, 248, 0));
		t6.setFont(new Font("cooper black", 0, 15));
		t6.setForeground(Color.black);
		t6.setVisible(false);
		add(t6);

		t66 = new JLabel ("click en guardar");
		t66.setBounds(435, 420, 300, 50);
		t66.setBackground(new Color(108, 246, 248, 0));
		t66.setFont(new Font("cooper black", 0, 15));
		t66.setForeground(Color.black);
		t66.setVisible(false);
		add(t66);

		i7 = new JLabel();
		i7.setBounds(615, 190, 215, 150);
		ImageIcon img7 = new ImageIcon("imagenes/vtut7.png");
		icono = new ImageIcon(img7.getImage().getScaledInstance(i7.getWidth(), i7.getHeight(),
				Image.SCALE_DEFAULT));
		i7.setIcon(icono);
		i7.setVisible(false);
		add(i7);

		t7 = new JLabel ("Vas bien si sale este mensaje");
		t7.setBounds(620, 400, 300, 50);
		t7.setBackground(new Color(108, 246, 248, 0));
		t7.setFont(new Font("cooper black", 0, 15));
		t7.setForeground(Color.black);
		t7.setVisible(false);
		add(t7);

		sig3 = new JButton("Next");
		sig3.setBounds(740, 490, 90, 30);
		sig3.setBackground(new Color(108, 246, 248, 0));
		sig3.setFont(new Font ("cooper black", 3, 20));
		sig3.setForeground(Color.black);
		sig3.setFocusable(false);
		sig3.setVisible(false);
		sig3.setActionCommand("sig3");
		add(sig3);

		fichas = new JPanel ();
		fichas.setBounds(180, 180, 655, 345);
		fichas.setBackground(Color.LIGHT_GRAY);
		fichas.setVisible(false);
		add (fichas);

		//p4		

		i8 = new JLabel();
		i8.setBounds(200, 190, 400, 300);
		ImageIcon img8 = new ImageIcon("imagenes/vtut8.png");
		icono = new ImageIcon(img8.getImage().getScaledInstance(i8.getWidth(), i8.getHeight(),
				Image.SCALE_DEFAULT));
		i8.setIcon(icono);
		i8.setVisible(false);
		add(i8);

		t8 = new JLabel ("Darle click al");
		t8.setBounds(650, 300, 300, 50);
		t8.setBackground(new Color(108, 246, 248, 0));
		t8.setFont(new Font("cooper black", 0, 20));
		t8.setForeground(Color.black);
		t8.setVisible(false);
		add(t8);

		t88 = new JLabel ("nivel que desea");
		t88.setBounds(645, 330, 300, 50);
		t88.setBackground(new Color(108, 246, 248, 0));
		t88.setFont(new Font("cooper black", 0, 20));
		t88.setForeground(Color.black);
		t88.setVisible(false);
		add(t88);

		sig4 = new JButton("Next");
		sig4.setBounds(740, 490, 90, 30);
		sig4.setBackground(new Color(108, 246, 248, 0));
		sig4.setFont(new Font ("cooper black", 3, 20));
		sig4.setForeground(Color.black);
		sig4.setFocusable(false);
		sig4.setVisible(false);
		sig4.setActionCommand("sig4");
		add(sig4);
		nivel = new JPanel ();

		nivel.setBounds(180, 180, 655, 345);
		nivel.setBackground(Color.LIGHT_GRAY);
		nivel.setVisible(false);
		add (nivel);

		//p5	

		i9 = new JLabel();
		i9.setBounds(200, 200, 410, 300);
		ImageIcon img9 = new ImageIcon("imagenes/vtut9.png");
		icono = new ImageIcon(img9.getImage().getScaledInstance(i9.getWidth(), i9.getHeight(),
				Image.SCALE_DEFAULT));
		i9.setIcon(icono);
		i9.setVisible(false);
		add(i9);

		t91 = new JLabel ("1. Click Tirar dado");
		t91.setBounds(615, 200, 300, 50);
		t91.setBackground(new Color(108, 246, 248, 0));
		t91.setFont(new Font("cooper black", 0, 14));
		t91.setForeground(Color.black);
		t91.setVisible(false);
		add(t91);

		t92 = new JLabel ("2. Pancracio dira el numero");
		t92.setBounds(615, 240, 300, 50);
		t92.setBackground(new Color(108, 246, 248, 0));
		t92.setFont(new Font("cooper black", 0, 14));
		t92.setForeground(Color.black);
		t92.setVisible(false);
		add(t92);

		t93 = new JLabel ("3. Aparecen los turnos");
		t93.setBounds(615, 280, 300, 50);
		t93.setBackground(new Color(108, 246, 248, 0));
		t93.setFont(new Font("cooper black", 0, 14));
		t93.setForeground(Color.black);
		t93.setVisible(false);
		add(t93);

		t94 = new JLabel ("4. Jugadores y casilla actual");
		t94.setBounds(615, 320, 300, 50);
		t94.setBackground(new Color(108, 246, 248, 0));
		t94.setFont(new Font("cooper black", 0, 14));
		t94.setForeground(Color.black);
		t94.setVisible(false);
		add(t94);

		t95 = new JLabel ("5. Movimiento automatico");
		t95.setBounds(615, 360, 300, 50);
		t95.setBackground(new Color(108, 246, 248, 0));
		t95.setFont(new Font("cooper black", 0, 14));
		t95.setForeground(Color.black);
		t8.setVisible(false);
		add(t95);

		sig5 = new JButton("Next");
		sig5.setBounds(740, 490, 90, 30);
		sig5.setBackground(new Color(108, 246, 248, 0));
		sig5.setFont(new Font ("cooper black", 3, 20));
		sig5.setForeground(Color.black);
		sig5.setFocusable(false);
		sig5.setVisible(false);
		sig5.setActionCommand("sig5");
		add(sig5);

		dado_movimiento_turnos = new JPanel ();
		dado_movimiento_turnos.setBounds(180, 180, 655, 345);
		dado_movimiento_turnos.setBackground(Color.LIGHT_GRAY);
		dado_movimiento_turnos.setVisible(false);
		add (dado_movimiento_turnos);

		//p6		

		i10 = new JLabel();
		i10.setBounds(200, 200, 110, 110);
		ImageIcon img10 = new ImageIcon("imagenes/vtut10.png");
		icono = new ImageIcon(img10.getImage().getScaledInstance(i10.getWidth(), i10.getHeight(),
				Image.SCALE_DEFAULT));
		i10.setIcon(icono);
		i10.setVisible(false);
		add(i10);

		t10 = new JLabel ("Si caes en serpiente tendrás que bajar");
		t10.setBounds(315, 200, 400, 100);
		t10.setBackground(new Color(108, 246, 248, 0));
		t10.setFont(new Font("cooper black", 0, 20));
		t10.setForeground(Color.black);
		t10.setVisible(false);
		add(t10);

		i11 = new JLabel();
		i11.setBounds(200, 400, 110, 110);
		ImageIcon img11 = new ImageIcon("imagenes/vtut11.png");
		icono = new ImageIcon(img11.getImage().getScaledInstance(i11.getWidth(), i11.getHeight(),
				Image.SCALE_DEFAULT));
		i11.setIcon(icono);
		i11.setVisible(false);
		add(i11);

		t11 = new JLabel ("Si caes en escalera responderas una pregunta para subir");
		t11.setBounds(315, 400, 400, 100);
		t11.setBackground(new Color(108, 246, 248, 0));
		t11.setFont(new Font("cooper black", 0, 13));
		t11.setForeground(Color.black);
		t11.setVisible(false);
		add(t11);

		sig6 = new JButton("Next");
		sig6.setBounds(740, 490, 90, 30);
		sig6.setBackground(new Color(108, 246, 248, 0));
		sig6.setFont(new Font ("cooper black", 3, 20));
		sig6.setForeground(Color.black);
		sig6.setFocusable(false);
		sig6.setVisible(false);
		sig6.setActionCommand("sig6");
		add(sig6);

		escaleras_y_serpientes = new JPanel ();
		escaleras_y_serpientes.setBounds(180, 180, 655, 345);
		escaleras_y_serpientes.setBackground(Color.LIGHT_GRAY);
		escaleras_y_serpientes.setVisible(false);
		add (escaleras_y_serpientes);

		//p7	

		i12 = new JLabel();
		i12.setBounds(200, 250, 200, 200);
		ImageIcon img12 = new ImageIcon("imagenes/vtut12.png");
		icono = new ImageIcon(img12.getImage().getScaledInstance(i12.getWidth(), i12.getHeight(),
				Image.SCALE_DEFAULT));
		i12.setIcon(icono);
		i12.setVisible(false);
		add(i12);

		t12 = new JLabel ("Tambien tiene estas opciones");
		t12.setBounds(415, 300, 400, 100);
		t12.setBackground(new Color(108, 246, 248, 0));
		t12.setFont(new Font("cooper black", 0, 25));
		t12.setForeground(Color.black);
		t12.setVisible(false);
		add(t12);

		opciones = new JPanel ();
		opciones.setBounds(180, 180, 655, 345);
		opciones.setBackground(Color.LIGHT_GRAY);
		opciones.setVisible(false);
		add (opciones);

		//others

		back = new JButton("Back");
		back.setBounds(850, 550, 100, 50);
		back.setBackground(new Color(108, 246, 248, 0));
		back.setFont(new Font ("cooper black", 3, 20));
		back.setForeground(Color.white);
		back.setVisible(true);
		back.setActionCommand("BACKTUTO");
		add(back);

		img_fondo = new JLabel("", JLabel.CENTER);
		img_fondo.setIcon(new ImageIcon("imagenes/Fondo5.gif"));
		add(img_fondo);

		/**
		 * @param img_fondo, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;
	 t1, t2, t3, t33, t4, t5, t6, t66,  t7, t8, t88, t91, t92, t93, t94, t95, t10, t11, t12;
	inicio, jugadores, fichas, nivel, dado_movimiento_turnos, escaleras_y_serpientes, opciones;
	sig1, sig2, sig3, sig4, sig5, sig6, back

	@return img_fondo, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;
	 t1, t2, t3, t33, t4, t5, t6, t66,  t7, t8, t88, t91, t92, t93, t94, t95, t10, t11, t12;
	inicio, jugadores, fichas, nivel, dado_movimiento_turnos, escaleras_y_serpientes, opciones;
	sig1, sig2, sig3, sig4, sig5, sig6, back

		 */

	}

	public JLabel getI12() {
		return i12;
	}

	public void setI12(JLabel i12) {
		this.i12 = i12;
	}

	public JLabel getT12() {
		return t12;
	}

	public void setT12(JLabel t12) {
		this.t12 = t12;
	}

	public JLabel getI9() {
		return i9;
	}

	public void setI9(JLabel i9) {
		this.i9 = i9;
	}

	public JLabel getT91() {
		return t91;
	}

	public void setT91(JLabel t91) {
		this.t91 = t91;
	}

	public JLabel getT92() {
		return t92;
	}

	public void setT92(JLabel t92) {
		this.t92 = t92;
	}

	public JLabel getT93() {
		return t93;
	}

	public void setT93(JLabel t93) {
		this.t93 = t93;
	}

	public JLabel getT94() {
		return t94;
	}

	public void setT94(JLabel t94) {
		this.t94 = t94;
	}

	public JLabel getT95() {
		return t95;
	}

	public void setT95(JLabel t95) {
		this.t95 = t95;
	}

	public JLabel getImg_fondo() {
		return img_fondo;
	}

	public void setImg_fondo(JLabel img_fondo) {
		this.img_fondo = img_fondo;
	}

	public JLabel getI1() {
		return i1;
	}

	public void setI1(JLabel i1) {
		this.i1 = i1;
	}

	public JLabel getI2() {
		return i2;
	}

	public void setI2(JLabel i2) {
		this.i2 = i2;
	}

	public JLabel getI3() {
		return i3;
	}

	public void setI3(JLabel i3) {
		this.i3 = i3;
	}

	public JLabel getI4() {
		return i4;
	}

	public void setI4(JLabel i4) {
		this.i4 = i4;
	}

	public JLabel getI5() {
		return i5;
	}

	public void setI5(JLabel i5) {
		this.i5 = i5;
	}

	public JLabel getI6() {
		return i6;
	}

	public void setI6(JLabel i6) {
		this.i6 = i6;
	}

	public JLabel getI7() {
		return i7;
	}

	public void setI7(JLabel i7) {
		this.i7 = i7;
	}

	public JLabel getI8() {
		return i8;
	}

	public void setI8(JLabel i8) {
		this.i8 = i8;
	}

	public JLabel getT1() {
		return t1;
	}

	public void setT1(JLabel t1) {
		this.t1 = t1;
	}

	public JLabel getT2() {
		return t2;
	}

	public void setT2(JLabel t2) {
		this.t2 = t2;
	}

	public JLabel getT3() {
		return t3;
	}

	public void setT3(JLabel t3) {
		this.t3 = t3;
	}

	public JLabel getT33() {
		return t33;
	}

	public void setT33(JLabel t33) {
		this.t33 = t33;
	}

	public JLabel getT4() {
		return t4;
	}

	public void setT4(JLabel t4) {
		this.t4 = t4;
	}

	public JLabel getT5() {
		return t5;
	}

	public void setT5(JLabel t5) {
		this.t5 = t5;
	}

	public JLabel getT6() {
		return t6;
	}

	public void setT6(JLabel t6) {
		this.t6 = t6;
	}

	public JLabel getT66() {
		return t66;
	}

	public void setT66(JLabel t66) {
		this.t66 = t66;
	}

	public JLabel getT7() {
		return t7;
	}

	public void setT7(JLabel t7) {
		this.t7 = t7;
	}

	public JLabel getT8() {
		return t8;
	}

	public void setT8(JLabel t8) {
		this.t8 = t8;
	}

	public JLabel getT88() {
		return t88;
	}

	public void setT88(JLabel t88) {
		this.t88 = t88;
	}

	public JPanel getInicio() {
		return inicio;
	}

	public void setInicio(JPanel inicio) {
		this.inicio = inicio;
	}

	public JPanel getJugadores() {
		return jugadores;
	}

	public void setJugadores(JPanel jugadores) {
		this.jugadores = jugadores;
	}

	public JPanel getFichas() {
		return fichas;
	}

	public void setFichas(JPanel fichas) {
		this.fichas = fichas;
	}

	public JPanel getNivel() {
		return nivel;
	}

	public void setNivel(JPanel nivel) {
		this.nivel = nivel;
	}

	public JPanel getDado_movimiento_turnos() {
		return dado_movimiento_turnos;
	}

	public void setDado_movimiento_turnos(JPanel dado_movimiento_turnos) {
		this.dado_movimiento_turnos = dado_movimiento_turnos;
	}

	public JPanel getEscaleras_y_serpientes() {
		return escaleras_y_serpientes;
	}

	public void setEscaleras_y_serpientes(JPanel escaleras_y_serpientes) {
		this.escaleras_y_serpientes = escaleras_y_serpientes;
	}

	public JPanel getOpciones() {
		return opciones;
	}

	public void setOpciones(JPanel opciones) {
		this.opciones = opciones;
	}

	public JButton getSig1() {
		return sig1;
	}

	public void setSig1(JButton sig1) {
		this.sig1 = sig1;
	}

	public JButton getSig2() {
		return sig2;
	}

	public void setSig2(JButton sig2) {
		this.sig2 = sig2;
	}

	public JButton getSig3() {
		return sig3;
	}

	public void setSig3(JButton sig3) {
		this.sig3 = sig3;
	}

	public JButton getSig4() {
		return sig4;
	}

	public void setSig4(JButton sig4) {
		this.sig4 = sig4;
	}

	public JButton getSig5() {
		return sig5;
	}

	public void setSig5(JButton sig5) {
		this.sig5 = sig5;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}

	public JLabel getI10() {
		return i10;
	}

	public void setI10(JLabel i10) {
		this.i10 = i10;
	}

	public JLabel getI11() {
		return i11;
	}

	public void setI11(JLabel i11) {
		this.i11 = i11;
	}

	public JLabel getT10() {
		return t10;
	}

	public void setT10(JLabel t10) {
		this.t10 = t10;
	}

	public JLabel getT11() {
		return t11;
	}

	public void setT11(JLabel t11) {
		this.t11 = t11;
	}

	public JButton getSig6() {
		return sig6;
	}

	public void setSig6(JButton sig6) {
		this.sig6 = sig6;
	}
}
