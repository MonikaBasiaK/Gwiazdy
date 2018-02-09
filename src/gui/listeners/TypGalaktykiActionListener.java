package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import gui.PanelGalaktyka;

public class TypGalaktykiActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<?> combo = (JComboBox<?>)e.getSource();
		PanelGalaktyka.ttyp = (String)combo.getSelectedItem();
		
	}

}
