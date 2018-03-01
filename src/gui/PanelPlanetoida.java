package gui;

import javax.swing.JButton;

import core.Utilities;
import gui.listeners.SavePlanetoidaActionListener;

public class PanelPlanetoida extends PanelObiekty{
	
	public JButton zapisz = new JButton("ZAPISZ");
	 
	public PanelPlanetoida(){
		super();
		this.zapisz.setBounds(x/2 + 350, 400, 150, 30);
		
		this.zapisz.addActionListener(new SavePlanetoidaActionListener());
		add(this.zapisz);
		add(Utilities.getInstance().panelImgLab);
	     
	}
}
