package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import core.AddNew;
import core.Gwiazdy;
import core.Utilities;
import zwyklamateria.obiekty.Planeta;

public class PanelPlaneta extends PanelObiekty{
	private JLabel ksiezyce = new JLabel("Ksiezyce");
	private JTextField tksiezyce = new JTextField();
	private JLabel kategoria = new JLabel("Kategoria");
	String []t = {"gazowa", "skalista"};
	private JComboBox tkategoria = new JComboBox(t);
	private String wybranaKategoria = new String("");
	
	 //GridBagConstraints gbc = new GridBagConstraints();

	public PanelPlaneta(){
		super();
	//tkategoria.addItem("sth");
		//HelloPanel.setBackgroud("images/1.gif");
		this.ksiezyce.setFont(HelloPanel.g);
		this.kategoria.setFont(HelloPanel.g);
		
		this.ksiezyce.setBounds(x/2 -130, 340, 150, 30);
        this.tksiezyce.setBounds(x/2 -10, 340, 200, 30);
        
        this.kategoria.setBounds(x/2 + 240, 100, 150, 30);
        this.tkategoria.setBounds(x/2 + 350, 100, 100, 30);
        
        
		add(this.kategoria);
		add(this.tkategoria);
		add(this.ksiezyce);
		add(this.tksiezyce);
		//add(HelloPanel.panelImgLab);
		
		zapisz.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Gwiazdy.obiekty.add(new Planeta(tnazwa.getText(), Float.parseFloat( tmasa.getText()), 
				Double.parseDouble(tsrednica.getText()), Integer.parseInt(twiek.getText()), 
				tglowny.getText(), Float.parseFloat(tobiegu.getText()), tkategoria.getToolTipText(),
				 wybranaKategoria ));
				
        		tksiezyce.setText("");
			}
		});
		
		posprzataj();
		
		tkategoria.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JComboBox combo = (JComboBox)e.getSource();
                 wybranaKategoria = (String)combo.getSelectedItem();
                 
                 }
		});
	}
	
}
