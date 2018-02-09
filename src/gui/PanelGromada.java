package gui;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import core.Utilities;
import gui.listeners.SaveGromadaActionListener;

public class PanelGromada extends PanelStruktury{
	
	private JLabel rozmiar = new JLabel("Rozmiar");
	public static JTextField trozmiar = new JTextField("");
	
	public PanelGromada(){
		super();
		
		trozmiar.setText("");
		PanelStruktury.helloLabel.setForeground(Color.white);
		PanelStruktury.nazwa.setForeground(Color.white);
		this.rozmiar.setForeground(Color.white);
		this.rozmiar.setFont(Utilities.g);
		trozmiar.setFont(Utilities.g);
		
		this.rozmiar.setBounds(x/2 -130, 140, 150, 30);
        trozmiar.setBounds(x/2 -10, 140, 200, 30);
        
        Utilities.zapisz.addActionListener(new SaveGromadaActionListener());
		
		add(this.rozmiar);
		add(trozmiar);
		add(Utilities.zapisz);
		add(Utilities.panelImgLab);
		
		
	}

}
