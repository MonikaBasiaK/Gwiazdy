package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelPlanetoida;

public class HelloPanelPlanetoidaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Utilities.setBackgroud("images/planetoida.jpg");
		Main.w.changePanel(new PanelPlanetoida());
		}

}
