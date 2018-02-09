package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelKometa;

public class HelloPanelKometaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Utilities.setBackgroud("images/kometa.jpg");
    	Main.w.changePanel(new PanelKometa());
	}

}
