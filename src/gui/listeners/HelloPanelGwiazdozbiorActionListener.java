package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelGwiazdozbior;

public class HelloPanelGwiazdozbiorActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Utilities.getInstance().setBackgroud("images/gwiazdozbior.jpg");
		Main.w.changePanel(new PanelGwiazdozbior());
    	}

}
