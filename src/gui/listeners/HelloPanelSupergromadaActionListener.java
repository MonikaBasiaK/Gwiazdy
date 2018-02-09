package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelSupergromada;

public class HelloPanelSupergromadaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Utilities.setBackgroud("images/supergromada.jpg");
		Main.w.changePanel(new PanelSupergromada());
	}
	

}
