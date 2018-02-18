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
		Listy.struktury.add(new Galaktyka(PanelStruktury.tnazwa.getText(), PanelGalaktyka.comboTyp.getToolTipText(),
				Integer.parseInt(PanelGalaktyka.tgrubosc.getText()), Long.parseLong(PanelGalaktyka.tszacowana_ilosc_gwiazd.getText())));
		
		Main.w.changePanel(new HelloPanel());
		
	}

}
