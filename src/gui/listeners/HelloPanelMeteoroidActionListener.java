package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelMeteoroid;

public class HelloPanelMeteoroidActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Utilities.setBackgroud("images/meteoroid.jpg");
		Main.w.changePanel(new PanelMeteoroid());
	}

}
