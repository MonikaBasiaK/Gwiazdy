package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import core.Utilities;
import gui.listeners.SaveGwiazdaActionListener;

public class PanelGwiazda extends PanelObiekty{
	
	private JLabel gwiazdozbior = new JLabel("Gwiazdozbior");
    public static JTextField tgwiazdozbior = new JTextField("");
    public JButton zapisz = new JButton("ZAPISZ");
     
    public PanelGwiazda(){
		super();
		
		PanelGwiazda.tgwiazdozbior.setText("");
		this.gwiazdozbior.setFont(Utilities.getInstance().g);
		this.gwiazdozbior.setBounds(x/2 -130, 340, 150, 30);
        tgwiazdozbior.setBounds(x/2 -10, 340, 200, 30);
        this.zapisz.setBounds(x/2 + 350, 400, 150, 30);
       
        this.zapisz.addActionListener(new SaveGwiazdaActionListener());
        
        add(gwiazdozbior);
        add(tgwiazdozbior);
        add(this.zapisz);
        add(Utilities.getInstance().panelImgLab);
        
	}

}
