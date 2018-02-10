package gui;

import core.Utilities;
import gui.listeners.SavePlanetoidaActionListener;

public class PanelPlanetoida extends PanelObiekty{
	public PanelPlanetoida(){
		super();
		Utilities.getInstance().zapisz.addActionListener(new SavePlanetoidaActionListener());
	}
}
