package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import core.Main;
import core.Utilities;

public class NoCoTy extends JPanel{
	JTextField tnocoty;
     
    public NoCoTy() {
    	
        //setLayout(new FlowLayout());  - ustawia domysle polozenie komponentow gui
    	setLayout(null);
    	tnocoty = new JTextField("No co ty nie powiesz");
    	this.tnocoty.setFont(PanelObiekty.f);
    	tnocoty.setBounds(HelloPanel.x/2 -10, 340, 200, 30);
    	//Backgroud cd
    	Utilities.setBackgroud("images/nocoty.gif");
    	//------------
    	
        
        add(PanelObiekty.back);
        add(tnocoty);
        add(Utilities.panelImgLab);
    }
    
}
