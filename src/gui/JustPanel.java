package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import core.Main;
import core.Utilities;

public class JustPanel extends JPanel{
	
	JButton noCoTy;
     
    public JustPanel() {
    	
        //setLayout(new FlowLayout());  - ustawia domysle polozenie komponentow gui
    	setLayout(null);
    	noCoTy = new JButton("to jest glupie");
    	this.noCoTy.setBounds(PanelObiekty.x/4 -60, 90, 120, 30);
        
    	
    	//Backgroud cd
    	Utilities.setBackgroud("images/ups.gif");
    	//------------
    	noCoTy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
    			Main.w.changePanel(new NoCoTy());
    		}
    	});
        
        add(PanelObiekty.back);
        add(noCoTy);
        add(Utilities.panelImgLab);
    }
    
}
