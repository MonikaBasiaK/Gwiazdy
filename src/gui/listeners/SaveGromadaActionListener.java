package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Listy;
import core.Main;
import gui.HelloPanel;
import gui.PanelGromada;
import gui.PanelStruktury;
import zwyklamateria.struktury.Gromada;

public class SaveGromadaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Gromada gromada = new Gromada(PanelStruktury.tnazwa.getText(), PanelGromada.trozmiar.getText());
		gromada.persist();
		Listy.struktury.add(gromada);
		
		Main.w.changePanel(new HelloPanel());
	
	}

}
