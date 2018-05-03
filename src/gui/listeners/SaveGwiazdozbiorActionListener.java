package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Listy;
import core.Main;
import gui.HelloPanel;
import gui.PanelGwiazdozbior;
import gui.PanelStruktury;
import zwyklamateria.struktury.Gwiazdozbior;

public class SaveGwiazdozbiorActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
			
		Gwiazdozbior gwiazdozbior = new Gwiazdozbior(PanelStruktury.tnazwa.getText(), 
				PanelGwiazdozbior.displayArea.getText());
		gwiazdozbior.persist();
		Listy.struktury.add(gwiazdozbior);
		Main.w.changePanel(new HelloPanel());
	}

}
