package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana_menus extends JFrame {

	private Panel_opc po;
	private Panel_escoger_jugadores pjug;
	private Panel_escoger_ficha pfic;
	private Panel_escoger_tablero ptab;
	private JButton back;
	private JLabel img_fondo;
	
	public Ventana_menus () {
		setTitle("KEDANIKA");
		setSize (1000, 650);
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	private void inicializarComponentes() {

        getContentPane().setLayout(new BorderLayout());


		po = new Panel_opc();
		po.setBounds(225, 225, 540, 250);
		getContentPane().add(po);
		
		back = new JButton("Back");
		back.setBounds(850, 550, 100, 50);
		back.setBackground(new Color(108, 246, 248, 0));
		back.setFont(new Font ("cooper black", 3, 20));
		back.setForeground(Color.white);
		back.setVisible(false);
		back.setActionCommand("BACK");
        add(back);
        
		pjug = new Panel_escoger_jugadores ();
		pjug.setBounds(225, 150, 540, 350);
		getContentPane().add(pjug);	
		
		pfic = new Panel_escoger_ficha ();
		pfic.setBounds(220, 170, 600, 350);
		getContentPane().add(pfic);	
		
		ptab = new Panel_escoger_tablero();
		ptab.setBounds(225, 150, 540, 350);
		getContentPane().add(ptab);	

		img_fondo = new JLabel("", JLabel.CENTER);
		img_fondo.setIcon(new ImageIcon("imagenes/Fondo1.gif"));
		add(img_fondo);
		
	}


	public Panel_escoger_tablero getPtab() {
		return ptab;
	}

	public void setPtab(Panel_escoger_tablero ptab) {
		this.ptab = ptab;
	}

	public Panel_escoger_ficha getPfic() {
		return pfic;
	}

	public void setPfic(Panel_escoger_ficha pfic) {
		this.pfic = pfic;
	}

	public Panel_escoger_jugadores getPjug() {
		return pjug;
	}

	public void setPjug(Panel_escoger_jugadores pjug) {
		this.pjug = pjug;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}


	public Panel_opc getPo() {
		return po;
	}

	public void setPo(Panel_opc po) {
		this.po = po;
	}

	public JLabel getImg_fondo() {
		return img_fondo;
	}

	public void setImg_fondo(JLabel img_fondo) {
		this.img_fondo = img_fondo;
	}

}