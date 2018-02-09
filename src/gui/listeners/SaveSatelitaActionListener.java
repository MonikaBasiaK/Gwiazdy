package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Listy;
import gui.PanelObiekty;
import gui.PanelSatelita;
import zwyklamateria.obiekty.Satelita;

public class SaveSatelitaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Listy.obiektyTest.add(new Satelita(PanelObiekty.tnazwa.getText(), Float.parseFloat( PanelObiekty.tmasa.getText()),
		        Double.parseDouble(PanelObiekty.tsrednica.getText()), Integer.parseInt(PanelObiekty.twiek.getText()),
		        PanelObiekty.tglowny.getText(), Float.parseFloat(PanelObiekty.tobiegu.getText()), 
		        PanelSatelita.ttyp.getToolTipText()));
		}
}