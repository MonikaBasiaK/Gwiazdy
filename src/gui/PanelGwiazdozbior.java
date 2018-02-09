package gui;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import core.Utilities;
import gui.listeners.ButtonBackActionListener;
import gui.listeners.SaveGwiazdozbiorActionListener;

public class PanelGwiazdozbior extends PanelStruktury{
	
	 public static JTextArea displayArea = new JTextArea("");
	 private JLabel gwiazdy = new JLabel("Gwiazdy");
	 public static JScrollPane panel;
	    
	public PanelGwiazdozbior(){
		super();
		
		setLayout(null);
		
		PanelGwiazdozbior.displayArea.setText("");
	    gwiazdy.setFont(Utilities.g);
		gwiazdy.setForeground(Color.WHITE);
		helloLabel.setForeground(Color.white);
		PanelStruktury.nazwa.setForeground(Color.white);
		gwiazdy.setBounds(x/2 -130, 140, 150, 30);
		
		panel = new JScrollPane(displayArea);
        panel.setBounds(x/2 -10, 140, 500, 200);
        displayArea.setEditable(true);
        displayArea.setFont(Utilities.g);
        
        Utilities.zapisz.addActionListener(new SaveGwiazdozbiorActionListener());
        
       add(panel);
       add(this.gwiazdy);
       add(Utilities.back);
       add(Utilities.panelImgLab);
	}

}
