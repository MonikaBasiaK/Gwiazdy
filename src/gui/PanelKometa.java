package gui;

import core.Utilities;
import gui.listeners.SaveKometaActionListener;


public class PanelKometa extends PanelObiekty{
	
	public PanelKometa(){
		
		super();
		Utilities.getInstance().zapisz.addActionListener(new SaveKometaActionListener());
		
	}

}
