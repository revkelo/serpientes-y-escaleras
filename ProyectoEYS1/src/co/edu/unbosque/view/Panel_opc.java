package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_opc extends JPanel {

    private JButton jugar;
    private JButton tutorial;
    private JButton creditos;

    public Panel_opc() {
    	
        setLayout(null);
        setBackground(new Color(108, 246, 248, 0));
        
        inicializarComponentes();
        
        setVisible(true);
    }

	private void inicializarComponentes() {

    	jugar = new JButton("JUGAR");
    	jugar.setBounds(150, 20, 250, 50);
    	jugar.setBackground(new Color(108, 246, 248, 0));
    	jugar.setFont(new Font ("cooper black", 3, 30));
    	jugar.setForeground(Color.white);
    	jugar.setFocusable(false);
    	jugar.setActionCommand("JUGAR");
        add(jugar);

    	tutorial = new JButton("TUTORIAL");
    	tutorial.setBounds(150, 100, 250, 50);
    	tutorial.setBackground(new Color(108, 246, 248, 0));
    	tutorial.setFont(new Font ("cooper black", 3, 30));
    	tutorial.setForeground(Color.white);
    	tutorial.setFocusable(false);
    	tutorial.setActionCommand("TUTORIAL");
        add(tutorial);

    	creditos = new JButton("CRÉDITOS");
    	creditos.setBounds(150, 180, 250, 50);
    	creditos.setBackground(new Color(108, 246, 248, 0));
    	creditos.setFont(new Font ("cooper black", 3, 30));
    	creditos.setForeground(Color.white);
    	creditos.setFocusable(false);
    	creditos.setActionCommand("CREDITOS");
        add(creditos);

    }

	public JButton getJugar() {
		return jugar;
	}

	public void setJugar(JButton jugar) {
		this.jugar = jugar;
	}

	public JButton getTutorial() {
		return tutorial;
	}

	public void setTutorial(JButton tutorial) {
		this.tutorial = tutorial;
	}

	public JButton getCreditos() {
		return creditos;
	}

	public void setCreditos(JButton creditos) {
		this.creditos = creditos;
	}
}