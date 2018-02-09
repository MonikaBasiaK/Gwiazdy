package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelGwiazda;

public class HelloPanelGwiazdaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Utilities.setBackgroud("images/gwiazda.jpg");
    	Main.w.changePanel(new PanelGwiazda());
  	}

}
