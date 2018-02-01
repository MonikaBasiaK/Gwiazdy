package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

import core.AddNew;
import core.Gwiazdy;
import core.Utilities;
import zwyklamateria.obiekty.Satelita;

public class PanelSatelita extends PanelObiekty{
	private JLabel typ = new JLabel("Typ");
	public String [] t = {"naturalna", "sztuczna"};
	private JComboBox ttyp = new JComboBox(t);
	private String wybranyTyp = "";
	
	public PanelSatelita(){
		super();
		this.typ.setFont(HelloPanel.g);
		this.typ.setBounds(x/2 -130, 340, 150, 30);
        this.ttyp.setBounds(x/2 -10, 340, 200, 30);
        
        ttyp.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		JComboBox combo = (JComboBox)e.getSource();
        		wybranyTyp = (String)combo.getSelectedItem();
        	}
        });
        
        zapisz.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Gwiazdy.obiekty.add(new Satelita(tnazwa.getText(), Float.parseFloat( tmasa.getText()), 
				Double.parseDouble(tsrednica.getText()), Integer.parseInt(twiek.getText()), 
				tglowny.getText(), Float.parseFloat(tobiegu.getText()), ttyp.getToolTipText() ));
        	}

        });
        
        add(typ);
        add(ttyp);
	}
	
	

}
