package gui;

import gui.listeners.SaveActionListener;

public class PanelPKarlowata extends PanelObiekty {
	
	public PanelPKarlowata(){
		super();
		 PanelObiekty.zapisz.addActionListener(new SaveActionListener());
		 
		
		
	}

}
