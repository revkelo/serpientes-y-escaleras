package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_escoger_tablero extends JPanel {

    private JButton facil, inter, dificil;
    private JLabel tab6, tab9, tab12;
	
    public Panel_escoger_tablero() {
    	
        setLayout(null);
        setBackground(new Color(108, 246, 248, 0));
        
        inicializarComponentes();
        
        setVisible(false);
        
    }

	private void inicializarComponentes() {
		
		facil = new JButton ("FÁCIL");
		facil.setBounds(0, 80, 130, 40);
		facil.setBackground(new Color(108, 246, 248, 0));
		facil.setFont(new Font ("cooper black", 3, 20));
		facil.setForeground(Color.white);
		facil.setActionCommand("tfacil");
		facil.setFocusable(false);
		facil.setVisible(true);
        add(facil);
        
        inter = new JButton ("MEDIO");
        inter.setBounds(0, 160, 130, 40);
        inter.setBackground(new Color(108, 246, 248, 0));
        inter.setFont(new Font ("cooper black", 3, 20));
        inter.setForeground(Color.white);
        inter.setActionCommand("tintermedio");
        inter.setFocusable(false);
        inter.setVisible(true);
        add(inter);
        
        dificil = new JButton ("DIFICIL");
        dificil.setBounds(0, 240, 130, 40);
        dificil.setBackground(new Color(108, 246, 248, 0));
        dificil.setFont(new Font ("cooper black", 3, 20));
        dificil.setForeground(Color.white);
        dificil.setActionCommand("tdificil");
        dificil.setFocusable(false);
        dificil.setVisible(true);
        add(dificil);
		
        tab6 = new JLabel();
        tab6.setBounds(250, 20, 300, 300);
        tab6.setIcon(new ImageIcon("imagenes/Tab6.PNG"));
        tab6.setVisible(false);
		add(tab6);
		
		tab9 = new JLabel();
		tab9.setBounds(250, 0, 350, 350);
		tab9.setIcon(new ImageIcon("imagenes/Tab9.PNG"));
		tab9.setVisible(false);
		add(tab9);
		
		tab12 = new JLabel();
		tab12.setBounds(250, 0, 350, 350);
		tab12.setIcon(new ImageIcon("imagenes/Tab12.PNG"));
		tab12.setVisible(false);
		add(tab12);
		
	}

	public JButton getFacil() {
		return facil;
	}

	public void setFacil(JButton facil) {
		this.facil = facil;
	}

	public JButton getInter() {
		return inter;
	}

	public void setInter(JButton inter) {
		this.inter = inter;
	}

	public JButton getDificil() {
		return dificil;
	}

	public void setDificil(JButton dificil) {
		this.dificil = dificil;
	}

	public JLabel getTab6() {
		return tab6;
	}

	public void setTab6(JLabel tab6) {
		this.tab6 = tab6;
	}

	public JLabel getTab9() {
		return tab9;
	}

	public void setTab9(JLabel tab9) {
		this.tab9 = tab9;
	}

	public JLabel getTab12() {
		return tab12;
	}

	public void setTab12(JLabel tab12) {
		this.tab12 = tab12;
	}

	
}