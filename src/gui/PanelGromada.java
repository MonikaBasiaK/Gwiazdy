package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import core.Utilities;
import gui.listeners.SaveGromadaActionListener;

public class PanelGromada extends PanelStruktury{
	
	private JLabel rozmiar = new JLabel("Rozmiar");
	public static JTextField trozmiar = new JTextField("");
	 public JButton zapisz = new JButton("ZAPISZ");
	
	public PanelGromada(){
		super();
		
		trozmiar.setText("");
		PanelStruktury.helloLabel.setForeground(Color.white);
		PanelStruktury.nazwa.setForeground(Color.white);
		this.rozmiar.setForeground(Color.white);
		this.rozmiar.setFont(Utilities.getInstance().g);
		trozmiar.setFont(Utilities.getInstance().g);
		
		this.rozmiar.setBounds(x/2 -130, 140, 150, 30);
        trozmiar.setBounds(x/2 -10, 140, 200, 30);
        this.zapisz.setBounds(x/2 + 350, 400, 150, 30);
        
        this.zapisz.addActionListener(new SaveGromadaActionListener());
		
		add(this.rozmiar);
		add(trozmiar);
		add(this.zapisz);
		add(Utilities.getInstance().panelImgLab);
		
		
	}

}
