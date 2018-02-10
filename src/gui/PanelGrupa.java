package gui;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import core.Utilities;
import gui.listeners.SaveGrupaActionListener;

public class PanelGrupa extends PanelStruktury{
	
	private JLabel galaktyki = new JLabel("Galaktyki");
	public static JTextField tgalaktyki = new JTextField("");
	
	public PanelGrupa(){
		super();
		
		tgalaktyki.setText("");
		this.galaktyki.setFont(Utilities.getInstance().g);
		this.galaktyki.setForeground(Color.white);
		PanelStruktury.helloLabel.setForeground(Color.white);
		PanelStruktury.nazwa.setForeground(Color.white);
		
		this.galaktyki.setBounds(x/2 -130, 140, 150, 30);
        tgalaktyki.setBounds(x/2 -10, 140, 200, 30);
        
        Utilities.getInstance().zapisz.addActionListener(new SaveGrupaActionListener());
        
        add(this.galaktyki);
        add(tgalaktyki);
        add(Utilities.getInstance().zapisz);
        add(Utilities.getInstance().panelImgLab);
      }

}
