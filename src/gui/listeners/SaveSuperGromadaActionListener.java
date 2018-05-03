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
		
		SuperGromada supergromada = new SuperGromada(PanelStruktury.tnazwa.getText(), 
				PanelSupergromada.topis.getText());
		supergromada.persist();
		Listy.struktury.add(supergromada);
		
		Main.w.changePanel(new HelloPanel());
		}

}
