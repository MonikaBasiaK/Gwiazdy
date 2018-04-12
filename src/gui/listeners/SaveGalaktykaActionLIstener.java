package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Listy;
import core.Main;
import gui.HelloPanel;
import gui.PanelGalaktyka;
import gui.PanelStruktury;
import zwyklamateria.struktury.Galaktyka;

public class SaveGalaktykaActionLIstener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Galaktyka galaktyka = new Galaktyka(PanelStruktury.tnazwa.getText(), String.valueOf(PanelGalaktyka.comboTyp.getSelectedItem()),
				PanelGalaktyka.tgrubosc.getText(), PanelGalaktyka.tszacowana_ilosc_gwiazd.getText());
		galaktyka.persist();
		Listy.struktury.add(galaktyka);

		Main.w.changePanel(new HelloPanel());
		
	}

}
