package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.AddNew;
import core.Gwiazdy;
import core.Utilities;
import zwyklamateria.obiekty.Kometa;


public class PanelKometa extends PanelObiekty{
	
	public PanelKometa(){
		super();
		
		PanelObiekty.zapisz.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Gwiazdy.obiekty.add(new Kometa(tnazwa.getText(), Float.parseFloat( tmasa.getText()), 
						Double.parseDouble(tsrednica.getText()), Integer.parseInt(twiek.getText()), 
						tglowny.getText(), Float.parseFloat(tobiegu.getText())));
					
			}
		});
		
	}

}
