package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import core.Listy;
import core.Main;
import gui.HelloPanel;
import gui.PanelObiekty;
import zwyklamateria.obiekty.Meteoroid;

public class SaveMeteoroidActionListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			Listy.obiekty.add(new Meteoroid(PanelObiekty.tnazwa.getText(), Float.parseFloat( PanelObiekty.tmasa.getText()),
			Double.parseDouble(PanelObiekty.tsrednica.getText()), Integer.parseInt(PanelObiekty.twiek.getText()),
			PanelObiekty.tglowny.getText(), Float.parseFloat(PanelObiekty.tobiegu.getText())));
		} catch (NumberFormatException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Main.w.changePanel(new HelloPanel());
		}

}
