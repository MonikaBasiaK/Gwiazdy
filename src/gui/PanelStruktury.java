package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import core.Utilities;
import gui.listeners.ButtonBackActionListener;
import gui.listeners.ButtonExitActionListener;
import gui.listeners.SaveActionListener;

public class PanelStruktury extends JPanel {
	
	public static JLabel helloLabel = new JLabel("WPROWADZ DANE");
	public static JLabel nazwa = new JLabel("Nazwa");
	public static JTextField tnazwa = new JTextField("");
	static int x = Utilities.centre()/4;
	       
	public PanelStruktury(){
		 
		 setLayout(null);
		 
		 PanelStruktury.tnazwa.setText("");			
		 nazwa.setFont(Utilities.getInstance().g);
		 helloLabel.setFont(Utilities.getInstance().g);
		
		 nazwa.setBounds(x/2 -130, 100, 150, 30);
	     tnazwa.setBounds(x/2 -10, 100, 200, 30);
	     
	     Utilities.getInstance().exit.setBounds(x/2 + 350, 20, 150, 30);
	     helloLabel.setBounds(x-50, 20, 150, 30);
	     Utilities.getInstance().zapisz.setBounds(x/2 + 350, 400, 150, 30);
	     Utilities.getInstance().back.setBounds(x/4 -50, 20, 115, 30);
	        
	        
	     Utilities.getInstance().zapisz.addActionListener(new SaveActionListener());
	       
		add(helloLabel);
        add(Utilities.getInstance().exit);
        add(Utilities.getInstance().back);
        add(Utilities.getInstance().zapisz);
        add(nazwa);
		add(tnazwa);
		add(Utilities.getInstance().panelImgLab);
	}

}
