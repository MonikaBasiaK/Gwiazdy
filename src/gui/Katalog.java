package gui;

import core.Utilities;
import gui.listeners.ButtonGoToHelloPanelActionListener;
import javax.swing.*;
import java.awt.*;

public class Katalog extends JPanel {
	
    private JLabel helloLabel = new JLabel("Katalog");
    public static JTextArea displayArea = new JTextArea("");
    public static Font g = new Font("Gabriola", Font.BOLD, 15);
    private JButton ok = new JButton("	OK	");
    JScrollPane panel;
    int x;
    
	public Katalog() throws ClassNotFoundException {
    	
        setLayout(null);
        
        x = Utilities.centre()/4;
        this.helloLabel.setFont(Utilities.getInstance().f);
        this.ok.setFont(Utilities.getInstance().f);
        this.helloLabel.setBounds(x-50, 20, 100, 30);
        this.ok.setBounds(x/2 + 310, 20, 180, 30); 
        panel = new JScrollPane(displayArea);
        panel.setBounds(x/2-120, 70, 610, 360);
        displayArea.setEditable(false);
        displayArea.setFont(g);
        displayArea.setText(Utilities.getInstance().daneZPliku);
        
        ok.addActionListener(new ButtonGoToHelloPanelActionListener());

        add(this.helloLabel);
        add(this.ok);
        add(panel);
	}
}