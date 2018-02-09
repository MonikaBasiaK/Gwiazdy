package gui;

import core.*;
import gui.listeners.ButtonBackActionListener;
import gui.listeners.ButtonExitActionListener;
import gui.listeners.SaveActionListener;
import javax.swing.*;

public class PanelObiekty extends JPanel {
	
	public static JLabel helloLabel = new JLabel("WPROWADZ DANE");
    protected JLabel nazwa = new JLabel("Nazwa");
    protected JLabel masa = new JLabel("Masa");
    protected JLabel srednica = new JLabel("Srednica");
    protected JLabel wiek = new JLabel("Wiek");
    protected JLabel o_glowny = new JLabel("Obiekt glowny");
    protected JLabel o_obiegu = new JLabel("Okres biegu");
    public static JTextField tnazwa = new JTextField("");
    public static JTextField tmasa = new JTextField("");
    public static JTextField tsrednica = new JTextField("");
    public static JTextField twiek = new JTextField("");
    public static JTextField tglowny = new JTextField("");
    public static JTextField tobiegu = new JTextField("");
    public static int x = Utilities.centre()/4;
    
    public PanelObiekty() {
        setLayout(null);
        
        PanelObiekty.tnazwa.setText("");
		PanelObiekty.tmasa.setText("");
		PanelObiekty.tsrednica.setText("");
		PanelObiekty.twiek.setText("");
		PanelObiekty.tglowny.setText("");
		PanelObiekty.tobiegu.setText("");
		
        this.nazwa.setFont(Utilities.g);
        this.masa.setFont(Utilities.g);
        this.srednica.setFont(Utilities.g);
        this.wiek.setFont(Utilities.g);
        this.o_glowny.setFont(Utilities.g);
        this.o_obiegu.setFont(Utilities.g);
       	PanelObiekty.helloLabel.setFont(Utilities.g);
	        
        this.nazwa.setBounds(x/2 -130, 100, 150, 30);
        this.masa.setBounds(x/2 -130, 140, 150, 30);
        this.srednica.setBounds(x/2 -130, 180, 150, 30);
        this.wiek.setBounds(x/2 -130, 220, 150, 30);
        this.o_glowny.setBounds(x/2 -130, 260, 150, 30);
        this.o_obiegu.setBounds(x/2 -130, 300, 150, 30);
        tnazwa.setBounds(x/2 -10, 100, 200, 30);
        tmasa.setBounds(x/2 -10, 140, 200, 30);
        tsrednica.setBounds(x/2 -10, 180, 200, 30);
        twiek.setBounds(x/2 -10, 220, 200, 30);
        tglowny.setBounds(x/2 -10, 260, 200, 30);
        tobiegu.setBounds(x/2 -10, 300, 200, 30);
        Utilities.exit.setBounds(x/2 + 350, 20, 150, 30);  
        helloLabel.setBounds(x-50, 20, 150, 30);
        Utilities.zapisz.setBounds(x/2 + 350, 400, 150, 30);
        Utilities.back.setBounds(x/4 -50, 20, 115, 30);
        
        Utilities.exit.addActionListener(new ButtonExitActionListener());
        Utilities.back.addActionListener(new ButtonBackActionListener());
        Utilities.zapisz.addActionListener(new SaveActionListener());
       
        add(PanelObiekty.helloLabel);
        add(Utilities.exit);
        add(Utilities.back);
        add(Utilities.zapisz);
        add(this.nazwa);
        add(this.masa);
        add(this.srednica);
        add(this.wiek);
        add(this.o_glowny);
        add(this.o_obiegu);
        add(tnazwa);
        add(tmasa);
        add(tsrednica);
        add(twiek);
        add(tglowny);
        add(tobiegu);
        add(Utilities.panelImgLab);
     }
       
}
