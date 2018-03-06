package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import core.Listy;
import core.Main;
import gui.HelloPanel;
import gui.PanelObiekty;
import gui.PanelPlanetoida;
import zwyklamateria.obiekty.Planetoida;

public class SavePlanetoidaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Listy.obiekty.add(new Planetoida(PanelObiekty.tnazwa.getText(), Float.parseFloat(PanelObiekty.tmasa.getText()), 
					Double.parseDouble(PanelObiekty.tsrednica.getText()), Integer.parseInt(PanelObiekty.twiek.getText()), 
					PanelPlanetoida.tglowny.getText(), Float.parseFloat(PanelPlanetoida.tobiegu.getText())));
		} catch (NumberFormatException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Main.w.changePanel(new HelloPanel());
		}

}

