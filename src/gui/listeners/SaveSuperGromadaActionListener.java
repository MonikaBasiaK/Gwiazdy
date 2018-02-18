package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Listy;
import core.Main;
import gui.HelloPanel;
import gui.PanelStruktury;
import gui.PanelSupergromada;
import zwyklamateria.struktury.SuperGromada;

public class SaveSuperGromadaActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Listy.struktury.add(new SuperGromada(PanelStruktury.tnazwa.getText(), PanelSupergromada.topis.getText()));
		
		Main.w.changePanel(new HelloPanel());
		}

}
