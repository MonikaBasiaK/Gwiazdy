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
		
		Listy.struktury.add(new Gromada(PanelStruktury.tnazwa.getText(), Integer.parseInt(PanelGromada.trozmiar.getText())));
		
		Main.w.changePanel(new HelloPanel());
	
	}

}
