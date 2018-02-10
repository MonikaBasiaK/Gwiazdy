package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelGalaktyka;

public class HelloPanelGalaktykaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Utilities.getInstance().setBackgroud("images/galaktyka.jpg");
		Main.w.changePanel(new PanelGalaktyka());
	}

}
