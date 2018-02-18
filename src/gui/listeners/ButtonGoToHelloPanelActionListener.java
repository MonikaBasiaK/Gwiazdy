package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import gui.HelloPanel;

public class ButtonGoToHelloPanelActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {

		Main.w.changePanel(new HelloPanel());
	
	}

}
