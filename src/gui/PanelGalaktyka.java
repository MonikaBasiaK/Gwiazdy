package gui;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import core.Utilities;
import gui.listeners.SaveGalaktykaActionLIstener;
import gui.listeners.TypGalaktykiActionListener;

public class PanelGalaktyka extends PanelStruktury{

	private JLabel grubosc = new JLabel("Grubosc");
	private JLabel szacowana_ilosc_gwiazd = new JLabel("~Ilosc gwiazd");
	private JLabel typ = new JLabel("Typ");
	public static JTextField tgrubosc = new JTextField("");
	public static JTextField tszacowana_ilosc_gwiazd = new JTextField("");
	public static String []t = {"", "spiralna", "soczewkowata", "eiptyczna", "nieregularna"};
	public static JComboBox<?> comboTyp = new JComboBox<Object>(t);
	public static String ttyp = new String("");
	
	public PanelGalaktyka(){
		super();
		
		PanelGalaktyka.tgrubosc.setText("");
        PanelGalaktyka.tszacowana_ilosc_gwiazd.setText("");
        comboTyp.setSelectedIndex(0);			
		this.grubosc.setFont(Utilities.g);
		this.szacowana_ilosc_gwiazd.setFont(Utilities.g);
		this.typ.setFont(Utilities.g);
		nazwa.setForeground(Color.white);
		helloLabel.setForeground(Color.white);
		this.grubosc.setForeground(Color.white);
		this.typ.setForeground(Color.white);
		this.szacowana_ilosc_gwiazd.setForeground(Color.white);
		
		this.grubosc.setBounds(x/2 -130, 140, 150, 30);
        this.typ.setBounds(x/2 -130, 180, 150, 30);
        this.szacowana_ilosc_gwiazd.setBounds(x/2 -130, 220, 150, 30);
        tgrubosc.setBounds(x/2 -10, 140, 200, 30);
        comboTyp.setBounds(x/2 -10, 180, 200, 30);
        tszacowana_ilosc_gwiazd.setBounds(x/2 -10, 220, 200, 30);
        
            
        comboTyp.addActionListener(new TypGalaktykiActionListener());
        Utilities.zapisz.addActionListener(new SaveGalaktykaActionLIstener());
        
        add(this.grubosc);
        add(tgrubosc);
        add(this.szacowana_ilosc_gwiazd);
        add(tszacowana_ilosc_gwiazd);
        add(this.typ);
        add(PanelGalaktyka.comboTyp);
        add(Utilities.zapisz);
        add(Utilities.panelImgLab);
		
	}

}
