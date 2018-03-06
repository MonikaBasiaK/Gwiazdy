package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import core.Listy;
import core.Main;
import gui.HelloPanel;
import gui.PanelObiekty;
import gui.PanelPlaneta;
import zwyklamateria.obiekty.Planeta;

public class SavePlanetaActionListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			Listy.obiekty.add(new Planeta(PanelObiekty.tnazwa.getText(), Float.parseFloat( PanelObiekty.tmasa.getText()),
			        Double.parseDouble(PanelObiekty.tsrednica.getText()), Integer.parseInt(PanelObiekty.twiek.getText()),
			        PanelObiekty.tglowny.getText(), Float.parseFloat(PanelObiekty.tobiegu.getText()), 
			        PanelPlaneta.tksiezyce.getText(), PanelPlaneta.tkategoria.getToolTipText()));
		} catch (NumberFormatException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Main.w.changePanel(new HelloPanel());
		}

}

