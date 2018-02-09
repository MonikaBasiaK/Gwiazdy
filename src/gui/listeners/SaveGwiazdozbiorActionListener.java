package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Listy;
import gui.PanelGwiazdozbior;
import gui.PanelStruktury;
import zwyklamateria.struktury.Gwiazdozbior;

public class SaveGwiazdozbiorActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
			
		Listy.struktury.add(new Gwiazdozbior(PanelStruktury.tnazwa.getText(), PanelGwiazdozbior.displayArea.getText()));
			
	}

}
