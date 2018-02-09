package gui;

import core.Utilities;
import gui.listeners.SaveMeteoroidActionListener;

public class PanelMeteoroid extends PanelObiekty{
	
	public PanelMeteoroid(){
		super();
		
		Utilities.zapisz.addActionListener(new SaveMeteoroidActionListener());
	}

}
