package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelPlaneta;

public class HelloPanelPlanetaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Utilities.setBackgroud("images/planeta.jpg");
		Main.w.changePanel(new PanelPlaneta());
	}

}
