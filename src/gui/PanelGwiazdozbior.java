package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import core.Utilities;
import gui.listeners.SaveGwiazdozbiorActionListener;

public class PanelGwiazdozbior extends PanelStruktury{
	
	 public static JTextArea displayArea = new JTextArea("");
	 private JLabel gwiazdy = new JLabel("Gwiazdy");
	 public static JScrollPane panel;
	 public JButton zapisz = new JButton("ZAPISZ");
	    
	public PanelGwiazdozbior(){
		super();
		
		setLayout(null);
		
		PanelGwiazdozbior.displayArea.setText("");
	    gwiazdy.setFont(Utilities.getInstance().g);
		gwiazdy.setForeground(Color.WHITE);
		helloLabel.setForeground(Color.white);
		PanelStruktury.nazwa.setForeground(Color.white);
		gwiazdy.setBounds(x/2 -130, 140, 150, 30);
		this.zapisz.setBounds(x/2 + 350, 400, 150, 30);
		
		panel = new JScrollPane(displayArea);
        panel.setBounds(x/2 -10, 140, 500, 200);
        displayArea.setEditable(true);
        displayArea.setFont(Utilities.getInstance().g);
        
        this.zapisz.addActionListener(new SaveGwiazdozbiorActionListener());
        
       add(panel);
       add(this.gwiazdy);
       add(this.zapisz);
       add(Utilities.getInstance().panelImgLab);
	}

}
