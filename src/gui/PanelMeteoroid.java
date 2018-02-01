package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.AddNew;
import core.Gwiazdy;
import core.Utilities;
import zwyklamateria.obiekty.Meteoroid;

public class PanelMeteoroid extends PanelObiekty{
	
	public PanelMeteoroid(){
		super();
		
		zapisz.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Gwiazdy.obiekty.add(new Meteoroid(tnazwa.getText(), Float.parseFloat( tmasa.getText()), 
				Double.parseDouble(tsrednica.getText()), Integer.parseInt(twiek.getText()), 
				tglowny.getText(), Float.parseFloat(tobiegu.getText())));
		
        		
			}
		});
	}

}
