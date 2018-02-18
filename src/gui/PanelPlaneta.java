package gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import core.Utilities;
import gui.listeners.KategoriaPlanetyActionListener;
import gui.listeners.SavePlanetaActionListener;

public class PanelPlaneta extends PanelObiekty{
	private JLabel ksiezyce = new JLabel("Ksiezyce");
	public static JTextField tksiezyce = new JTextField();
	private JLabel kategoria = new JLabel("Kategoria");
	public static String []t = {"", "gazowa", "skalista"};
	public static JComboBox<?> tkategoria = new JComboBox<Object>(t);
	public static String wybranaKategoria = new String("");
	public JButton zapisz = new JButton("ZAPISZ");
	
	public PanelPlaneta(){
		
		super();
		
		PanelPlaneta.tksiezyce.setText("");
        tkategoria.setSelectedIndex(0);
		this.ksiezyce.setFont(Utilities.getInstance().g);
		this.kategoria.setFont(Utilities.getInstance().g);
		
		this.ksiezyce.setBounds(x/2 -130, 340, 150, 30);
        tksiezyce.setBounds(x/2 -10, 340, 200, 30);
        this.kategoria.setBounds(x/2 + 240, 100, 150, 30);
        tkategoria.setBounds(x/2 + 350, 100, 100, 30);
        this.zapisz.setBounds(x/2 + 350, 400, 150, 30);
        
        this.zapisz.addActionListener(new SavePlanetaActionListener());
		tkategoria.addActionListener( new KategoriaPlanetyActionListener());
	
        add(this.kategoria);
		add(tkategoria);
		add(this.ksiezyce);
		add(tksiezyce);
		add(this.zapisz);
		add(tkategoria);
		add(Utilities.getInstance().panelImgLab);}
	
}
