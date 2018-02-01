package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

import core.AddNew;
import core.Gwiazdy;
import core.Utilities;
import zwyklamateria.obiekty.*;

public class PanelGwiazda extends PanelObiekty{
	
	private JLabel gwiazdozbior = new JLabel("Gwiazdozbior");
    private JTextField tgwiazdozbior = new JTextField("");
    private Font g = new Font("Gabriola", Font.BOLD, 20);
    
    public PanelGwiazda(){
		super();
		
		
		this.gwiazdozbior.setFont(g);
    
        this.gwiazdozbior.setBounds(x/2 -130, 340, 150, 30);
        this.tgwiazdozbior.setBounds(x/2 -10, 340, 200, 30);
        
        PanelObiekty.zapisz.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        	/*System.out.println(tgwiazdozbior.getText());*/
        		Gwiazdy.obiekty.add(new Gwiazda(tnazwa.getText(), Float.parseFloat( tmasa.getText()), 
    				Double.parseDouble(tsrednica.getText()), Integer.parseInt(twiek.getText()), 
    				tglowny.getText(), Float.parseFloat(tobiegu.getText()), tgwiazdozbior.getText()));
    			
        		tgwiazdozbior.setText("");
        		
        	}
        }
        );
        
        add(this.gwiazdozbior);
        add(this.tgwiazdozbior);
        
	}

}
