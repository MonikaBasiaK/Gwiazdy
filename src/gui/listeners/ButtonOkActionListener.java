package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import gui.HelloPanel;
import gui.Katalog;

public class ButtonOkActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Katalog.displayArea.setText("");
    	Main.w.changePanel(new HelloPanel());
   }

}
