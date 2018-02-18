package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Listy;
import core.Main;
import gui.HelloPanel;
import gui.PanelObiekty;
import gui.PanelSatelita;
import zwyklamateria.obiekty.Satelita;

public class SaveSatelitaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Listy.obiekty.add(new Satelita(PanelObiekty.tnazwa.getText(), Float.parseFloat( PanelObiekty.tmasa.getText()),
		        Double.parseDouble(PanelObiekty.tsrednica.getText()), Integer.parseInt(PanelObiekty.twiek.getText()),
		        PanelObiekty.tglowny.getText(), Float.parseFloat(PanelObiekty.tobiegu.getText()), 
		        PanelSatelita.ttyp.getSelectedItem().toString()));
		
		Main.w.changePanel(new HelloPanel());
		}
}
