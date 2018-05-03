package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Listy;
import core.Main;
import gui.HelloPanel;
import gui.PanelGrupa;
import gui.PanelStruktury;
import zwyklamateria.struktury.Grupa;

public class SaveGrupaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		Grupa grupa = new Grupa(PanelStruktury.tnazwa.getText(), PanelGrupa.tgalaktyki.getText());
		grupa.persist();
		Listy.struktury.add(grupa);
	
		Main.w.changePanel(new HelloPanel());
	}
}
