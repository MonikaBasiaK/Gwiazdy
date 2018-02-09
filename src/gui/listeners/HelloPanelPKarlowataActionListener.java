package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelPKarlowata;

public class HelloPanelPKarlowataActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Utilities.setBackgroud("images/karlowata.jpg");
		Main.w.changePanel(new PanelPKarlowata());
	}

}
