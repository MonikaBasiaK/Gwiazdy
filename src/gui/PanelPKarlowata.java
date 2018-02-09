package gui;

import java.awt.Color;

import core.Utilities;
import gui.listeners.SavePKarlowataActionListener;

public class PanelPKarlowata extends PanelObiekty{
	
	public PanelPKarlowata(){
		
		super();
		nazwa.setForeground(Color.WHITE);
        masa.setForeground(Color.WHITE);
        srednica.setForeground(Color.WHITE);
        wiek.setForeground(Color.WHITE);
        o_glowny.setForeground(Color.WHITE);
        o_obiegu.setForeground(Color.WHITE);
        helloLabel.setForeground(Color.white);
		Utilities.zapisz.addActionListener(new SavePKarlowataActionListener());
		 
	}

}
