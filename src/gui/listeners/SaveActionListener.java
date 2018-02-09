package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import gui.HelloPanel;

public class SaveActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Main.w.changePanel(new HelloPanel());	       
        }

}
