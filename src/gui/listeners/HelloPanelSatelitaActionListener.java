package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelSatelita;

public class HelloPanelSatelitaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Utilities.setBackgroud("images/satelita.jpg");
		Main.w.changePanel(new PanelSatelita());
	}

}
