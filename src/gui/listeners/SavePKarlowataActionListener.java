package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Listy;
import core.Main;
import gui.HelloPanel;
import gui.PanelObiekty;
import zwyklamateria.obiekty.PlanetaKarlowata;

public class SavePKarlowataActionListener implements ActionListener{
	
public void actionPerformed(ActionEvent e) {
	
		Listy.obiekty.add(new PlanetaKarlowata(PanelObiekty.tnazwa.getText(), Float.parseFloat( PanelObiekty.tmasa.getText()),
        Double.parseDouble(PanelObiekty.tsrednica.getText()), Integer.parseInt(PanelObiekty.twiek.getText()),
        PanelObiekty.tglowny.getText(), Float.parseFloat(PanelObiekty.tobiegu.getText())));
		
		Main.w.changePanel(new HelloPanel());
		}

}