package gui;

import java.awt.Color;

import javax.swing.JButton;

import core.Utilities;
import gui.listeners.SavePKarlowataActionListener;

public class PanelPKarlowata extends PanelObiekty{
	
	 public JButton zapisz = new JButton("ZAPISZ");
	 
	public PanelPKarlowata(){
		
		super();
		
		nazwa.setForeground(Color.WHITE);
        masa.setForeground(Color.WHITE);
        srednica.setForeground(Color.WHITE);
        wiek.setForeground(Color.WHITE);
        o_glowny.setForeground(Color.WHITE);
        o_obiegu.setForeground(Color.WHITE);
        helloLabel.setForeground(Color.white);
        this.zapisz.setBounds(x/2 + 350, 400, 150, 30);
        
		this.zapisz.addActionListener(new SavePKarlowataActionListener());
		add(this.zapisz);
		add(Utilities.getInstance().panelImgLab);
	     
		 
	}

}
