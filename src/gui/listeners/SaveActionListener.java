package gui.listeners;

import core.Gwiazdy;
import gui.PanelObiekty;
import zwyklamateria.obiekty.PlanetaKarlowata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Gwiazdy.obiekty.add(new PlanetaKarlowata(PanelObiekty.tnazwa.getText(), Float.parseFloat( PanelObiekty.tmasa.getText()),
                Double.parseDouble(PanelObiekty.tsrednica.getText()), Integer.parseInt(PanelObiekty.twiek.getText()),
                PanelObiekty.tglowny.getText(), Float.parseFloat(PanelObiekty.tobiegu.getText())));
    }
}
