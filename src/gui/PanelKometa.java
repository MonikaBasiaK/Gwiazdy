package gui;

import javax.swing.JButton;

import gui.listeners.SaveKometaActionListener;


public class PanelKometa extends PanelObiekty{
	
	 public JButton zapisz = new JButton("ZAPISZ");
	
	public PanelKometa(){
		
		super();
		
		this.zapisz.setBounds(x/2 + 350, 400, 150, 30);
		this.zapisz.addActionListener(new SaveKometaActionListener());
		
		add(this.zapisz);
		
	}

}
