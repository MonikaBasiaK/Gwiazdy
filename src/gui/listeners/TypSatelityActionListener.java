package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import gui.PanelSatelita;

public class TypSatelityActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<?> combo = (JComboBox<?>)e.getSource();
		PanelSatelita.wybranyTyp = (String)combo.getSelectedItem();
	}

}
