package gui;

import core.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelObiekty extends JPanel {
	
    private JLabel helloLabel = new JLabel("WPROWADZ DANE");
    private JLabel nazwa = new JLabel("Nazwa");
    private JLabel masa = new JLabel("Masa");
    private JLabel srednica = new JLabel("Srednica");
    private JLabel wiek = new JLabel("Wiek");
    private JLabel o_glowny = new JLabel("Obiekt glowny");
    private JLabel o_obiegu = new JLabel("Okres biegu");
    public static JTextField tnazwa = new JTextField("");
    public static JTextField tmasa = new JTextField("");
    public static JTextField tsrednica = new JTextField("");
    public static JTextField twiek = new JTextField("");
    public static JTextField tglowny = new JTextField("");
    public static JTextField tobiegu = new JTextField("");
       
    public static JButton back = new JButton("<| BACK");
    static JButton zapisz = new JButton("ZAPISZ");
    private JTextArea textArea;
    private JScrollPane scrollPane;
    static Font f = new Font("SansSerif", Font.BOLD, 20);
    static Font i = new Font("Impact", Font.BOLD, 20);
    static Font g = new Font("Gabriola", Font.BOLD, 20);
    static int x = Utilities.centre()/4;
    static String tytul = new String("");
    static String s = new String("");
    
    private JButton joke = new JButton("Tutaj lepiej nie wchodz");
    
  
    
    public PanelObiekty() {
        setLayout(null);
        setBackground(Color.white);
        
        //if(HelloPanel.wybor.equals("kometa")){
        //	HelloPanel.setBackgroud("images/kometa.jpg");
        //}
        
        //textArea = new JTextArea("5, 20");
        //scrollPane = new JScrollPane(textArea); 
        //textArea.setEditable(true);
        
        this.back.setFont(f);
        this.helloLabel.setFont(g);
        this.nazwa.setFont(g);
        this.masa.setFont(g);
        this.srednica.setFont(g);
        this.wiek.setFont(g);
        this.o_glowny.setFont(g);
        this.o_obiegu.setFont(g);
        zapisz.setFont(f);
        
        
        //sssssssssssss
        //this.scrollPane.setBounds(x+100, 20, 150, 150);
        
        this.helloLabel.setBounds(x-50, 20, 150, 30);
        zapisz.setBounds(x/2 + 350, 400, 150, 30);
        back.setBounds(x/4 -50, 20, 115, 30);
                
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
        
        HelloPanel.exit.setBounds(x/2 + 350, 20, 150, 30);        
        add(HelloPanel.exit);
        joke.setBounds(x/4 -50, 400, 170, 30);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.w.changePanel(new HelloPanel());
            }
        });
        
        
        zapisz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	posprzataj();
            }
        });
        
        
        joke.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Main.w.changePanel(new JustPanel());
        	}        	
        });
        
        add(this.helloLabel);
        add(this.back);
        add(zapisz);
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
        add(joke);
        
        add(Utilities.panelImgLab);
        //add(this.textArea);
        //add(this.scrollPane);
        
        
    }
   
    public static void posprzataj(){
    	tnazwa.setText("");
        tmasa.setText("");
        tsrednica.setText("");
        twiek.setText("");
        tglowny.setText("");
        tobiegu.setText("");
        
        Main.w.changePanel(new HelloPanel());
    }
    
     
    public static void s_dane(){
    	s = new String(tnazwa.getText() + " ::MASA: " + tmasa.getText()
		+" ::SREDNICA: "+ tsrednica.getText()+ " ::WIEK: "+ twiek.getText()
		+" ::OBIEKT GLOWNY:"+ tglowny.getText()+" ::OKRES OBIEGU: "+ tobiegu.getText());

    }
    
}
