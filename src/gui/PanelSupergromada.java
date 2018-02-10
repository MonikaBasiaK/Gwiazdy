package gui;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import core.Utilities;
import gui.listeners.SaveSuperGromadaActionListener;

public class PanelSupergromada extends PanelStruktury{
	
	private JLabel opis = new JLabel("Opis");
	public static JTextArea topis = new JTextArea("");
	public static JScrollPane panel;
	
	public PanelSupergromada(){
		super();
		
		setLayout(null);
		
		PanelSupergromada.topis.setText("");
		PanelStruktury.helloLabel.setForeground(Color.white);
		PanelStruktury.nazwa.setForeground(Color.white);
		opis.setFont(Utilities.getInstance().g);
		opis.setBounds(x/2 -130, 140, 150, 30);
		opis.setForeground(Color.WHITE);
		
		panel = new JScrollPane(topis);
		panel.setBounds(x/2 -10, 140, 200, 200);
        topis.setEditable(true);
        topis.setFont(Utilities.getInstance().g);
        
        
        Utilities.getInstance().zapisz.addActionListener(new SaveSuperGromadaActionListener());
        
        add(Utilities.getInstance().zapisz);
        add(panel);
        add(opis);
        add(Utilities.getInstance().panelImgLab);
        
	}
	
}
