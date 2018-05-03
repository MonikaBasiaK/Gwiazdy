package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Main;
import core.SQLiteJDBC;
import gui.Katalog;

public class ButtonPrzejrzyjDaneActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			SQLiteJDBC.select();
			Main.w.changePanel(new Katalog());
		} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
		}
	}

}
