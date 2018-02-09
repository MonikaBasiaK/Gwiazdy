package gui;

import core.Utilities;
import gui.listeners.ButtonOkActionListener;
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
        this.helloLabel.setFont(Utilities.f);
        this.ok.setFont(Utilities.f);
        this.helloLabel.setBounds(x-50, 20, 100, 30);
        this.ok.setBounds(x/2 + 310, 20, 180, 30); 
        panel = new JScrollPane(displayArea);
        panel.setBounds(x/2-120, 70, 610, 360);
        displayArea.setEditable(false);
        displayArea.setFont(g);
        displayArea.setText(Utilities.daneZPliku);
        
        ok.addActionListener(new ButtonOkActionListener());

        add(this.helloLabel);
        add(this.ok);
        add(panel);
	}
}