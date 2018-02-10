package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelGromada;

public class HelloPanelGromadaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Utilities.getInstance().setBackgroud("images/gromada.jpg");
		Main.w.changePanel(new PanelGromada());
	}

}
