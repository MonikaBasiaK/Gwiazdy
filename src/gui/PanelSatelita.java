package gui;

import javax.swing.JComboBox;
import javax.swing.JLabel;

import core.Utilities;
import gui.listeners.SaveSatelitaActionListener;
import gui.listeners.TypSatelityActionListener;

public class PanelSatelita extends PanelObiekty{
	private JLabel typ = new JLabel("Typ");
	public static String [] t = {"", "naturalna", "sztuczna"};
	public static JComboBox<?> ttyp = new JComboBox<Object>(t);
	public static String wybranyTyp = new String("");
	
	public PanelSatelita(){
		super();
		
		ttyp.setSelectedIndex(0);
		this.typ.setFont(Utilities.g);
		this.typ.setBounds(x/2 -130, 340, 150, 30);
        ttyp.setBounds(x/2 -10, 340, 200, 30);
        
        ttyp.addActionListener(new TypSatelityActionListener());
        Utilities.zapisz.addActionListener(new SaveSatelitaActionListener());
        
        add(typ);
        add(ttyp);
        add(Utilities.panelImgLab);
	}
	
	

}
