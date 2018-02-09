package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.Utilities;
import gui.PanelGrupa;

public class HelloPanelGrupaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Utilities.setBackgroud("images/grupa.jpg");
		Main.w.changePanel(new PanelGrupa());
	}

}
