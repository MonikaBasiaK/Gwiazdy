package gui;

import core.Utilities;
import gui.listeners.SavePlanetoidaActionListener;

public class PanelPlanetoida extends PanelObiekty{
	public PanelPlanetoida(){
		super();
		Utilities.zapisz.addActionListener(new SavePlanetoidaActionListener());
	}
}
