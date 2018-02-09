package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Listy;
import gui.PanelObiekty;
import zwyklamateria.obiekty.Kometa;

public class SaveKometaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Listy.obiekty.add(new Kometa(PanelObiekty.tnazwa.getText(), Float.parseFloat( PanelObiekty.tmasa.getText()),
        Double.parseDouble(PanelObiekty.tsrednica.getText()), Integer.parseInt(PanelObiekty.twiek.getText()),
        PanelObiekty.tglowny.getText(), Float.parseFloat(PanelObiekty.tobiegu.getText())));
		}

}