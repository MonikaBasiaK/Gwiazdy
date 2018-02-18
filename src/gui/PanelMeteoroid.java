package gui;

import javax.swing.JButton;

import core.Utilities;
import gui.listeners.SaveMeteoroidActionListener;

public class PanelMeteoroid extends PanelObiekty{
	
	 public JButton zapisz = new JButton("ZAPISZ");
	 
	public PanelMeteoroid(){
		super();
		this.zapisz.setBounds(x/2 + 350, 400, 150, 30);
		
		this.zapisz.addActionListener(new SaveMeteoroidActionListener());
		add(this.zapisz);
	}

}
