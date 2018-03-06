package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.SQLiteJDBC;
import core.Utilities;

public class ButtonExitActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	
     	Utilities.getInstance().zapisDoPlikuJson("gwiazdy.txt");
     	System.exit(0);	
	}

}
