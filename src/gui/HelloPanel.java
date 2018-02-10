package gui;

import core.Utilities;
import gui.listeners.ButtonExitActionListener;
import gui.listeners.ButtonPrzejrzyjDaneActionListener;
import gui.listeners.HelloPanelGalaktykaActionListener;
import gui.listeners.HelloPanelGromadaActionListener;
import gui.listeners.HelloPanelGrupaActionListener;
import gui.listeners.HelloPanelGwiazdaActionListener;
import gui.listeners.HelloPanelGwiazdozbiorActionListener;
import gui.listeners.HelloPanelKometaActionListener;
import gui.listeners.HelloPanelMeteoroidActionListener;
import gui.listeners.HelloPanelPKarlowataActionListener;
import gui.listeners.HelloPanelPlanetaActionListener;
import gui.listeners.HelloPanelPlanetoidaActionListener;
import gui.listeners.HelloPanelSatelitaActionListener;
import gui.listeners.HelloPanelSupergromadaActionListener;
import javax.swing.*;

public class HelloPanel extends JPanel{
	private JLabel helloLabel = new JLabel("WITAMY");
    private JLabel obiekt = new JLabel("DODAJ OBIEKT");
    private JLabel struktura = new JLabel("DODAJ STRUKTURE");
    private JButton gwiazda = new JButton("GWIAZDA");
    private JButton kometa = new JButton("KOMETA");
    private JButton meteoroid = new JButton("METEOROID");
    private JButton planeta = new JButton("PLANETA");
    private JButton planeta_karlowata = new JButton("P. KARLOWATA");
    private JButton planetoida = new JButton("PALNETOIDA");
    private JButton satelita = new JButton("SATELITA");
    private JButton gwiazdozbior = new JButton("GWIAZDOZBIOR");
    private JButton galaktyka = new JButton("GALAKTYKA");
    private JButton grupa = new JButton("GRUPA");
    private JButton gromada = new JButton("GROMADA");
    private JButton supergromada = new JButton("SUPERGROMADA");
    private JButton przejrzyj = new JButton("Przejrzyj katalog");
    public static String wybor;
    public static int x;
	     
    public HelloPanel() {
    	
        setLayout(null);
    	Utilities.getInstance().setBackgroud("images/tenor.gif");
    	x = Utilities.centre()/4;
    	
    	this.helloLabel.setFont(Utilities.getInstance().g);
        this.obiekt.setFont(Utilities.getInstance().i);
        this.struktura.setFont(Utilities.getInstance().i);
        this.gwiazda.setFont(Utilities.getInstance().g);
        this.kometa.setFont(Utilities.getInstance().g);
        this.meteoroid.setFont(Utilities.getInstance().g);
        this.planeta.setFont(Utilities.getInstance().g);
        this.planeta_karlowata.setFont(Utilities.getInstance().g);
        this.planetoida.setFont(Utilities.getInstance().g);
        this.satelita.setFont(Utilities.getInstance().g);
        this.gwiazdozbior.setFont(Utilities.getInstance().g);
        this.galaktyka.setFont(Utilities.getInstance().g);
        this.grupa.setFont(Utilities.getInstance().g);
        this.gromada.setFont(Utilities.getInstance().g);
        this.supergromada.setFont(Utilities.getInstance().g);
        this.przejrzyj.setFont(Utilities.getInstance().g);
        this.helloLabel.setBounds(x-50, 20, 100, 30);
        this.przejrzyj.setBounds(x/2 + 310, 20, 180, 30);
        Utilities.getInstance().exit.setBounds(x/2 + 350, 100, 100, 30);
        this.obiekt.setBounds(x/2 -100, 100, 150, 30);
        this.struktura.setBounds(x/2 + 100, 100, 200, 30);
        this.gwiazda.setBounds(x/2 -100, 140, 150, 30);
        this.kometa.setBounds(x/2 -100, 180, 150, 30);
        this.meteoroid.setBounds(x/2 -100, 220, 150, 30);
        this.planeta.setBounds(x/2 -100, 260, 150, 30);
        this.planeta_karlowata.setBounds(x/2 -100, 300, 150, 30);
        this.planetoida.setBounds(x/2 -100, 340, 150, 30);
        this.satelita.setBounds(x/2 -100, 380, 150, 30);
        this.gwiazdozbior.setBounds(x/2 + 100, 140, 200, 30);
        this.galaktyka.setBounds(x/2 + 100, 180, 200, 30);
        this.grupa.setBounds(x/2 + 100, 220, 200, 30);
        this.gromada.setBounds(x/2 + 100, 260, 200, 30);
        this.supergromada.setBounds(x/2 + 100, 300, 200, 30);

        przejrzyj.addActionListener(new ButtonPrzejrzyjDaneActionListener());
        gwiazda.addActionListener(new HelloPanelGwiazdaActionListener());
        kometa.addActionListener(new HelloPanelKometaActionListener());
        meteoroid.addActionListener(new HelloPanelMeteoroidActionListener());
        planeta_karlowata.addActionListener(new HelloPanelPKarlowataActionListener());
        planetoida.addActionListener(new HelloPanelPlanetoidaActionListener());
        planeta.addActionListener(new HelloPanelPlanetaActionListener());
        satelita.addActionListener(new HelloPanelSatelitaActionListener());
        gwiazdozbior.addActionListener(new HelloPanelGwiazdozbiorActionListener());
        galaktyka.addActionListener(new HelloPanelGalaktykaActionListener());
        grupa.addActionListener(new HelloPanelGrupaActionListener());
        gromada.addActionListener(new HelloPanelGromadaActionListener());
        supergromada.addActionListener(new HelloPanelSupergromadaActionListener());
        
        add(this.helloLabel);
        add(Utilities.getInstance().exit);
        add(this.obiekt);
        add(this.struktura);
        add(this.gwiazda);
        add(this.kometa);
        add(this.meteoroid);
        add(this.planeta);
        add(this.planeta_karlowata);
        add(this.planetoida);
        add(this.satelita);
        add(this.gwiazdozbior);
        add(this.galaktyka);
        add(this.grupa);
        add(this.gromada);
        add(this.supergromada);
        add(this.przejrzyj);
        add(Utilities.getInstance().panelImgLab);
    }
}
