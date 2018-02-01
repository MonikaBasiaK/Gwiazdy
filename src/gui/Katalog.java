package gui;

import core.AddNew;
import core.Main;
import core.Utilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Katalog extends JPanel {
    private JLabel helloLabel = new JLabel("Katalog");
    private JTextArea displayArea = new JTextArea("");
     
    private Font f = new Font("SansSerif", Font.BOLD, 20);
    public static Font g = new Font("Gabriola", Font.BOLD, 15);
    
    private JButton ok = new JButton("	OK	");
    int x;
	private Object panel;
    
   
    public Katalog() throws ClassNotFoundException {
    	
        setLayout(null);
        //setBackground(Color.white);
        displayArea.setEditable(false);
        this.helloLabel.setFont(f);
        this.ok.setFont(f);
        this.displayArea.setFont(g);
 
        x = Utilities.centre()/4;
        this.helloLabel.setBounds(x-50, 20, 100, 30);
        this.ok.setBounds(x/2 + 310, 20, 180, 30); 
        
        JScrollPane panel = new JScrollPane(displayArea);
        panel.setBounds(x/2-120, 70, 610, 360);
        displayArea.setText(Utilities.daneZPliku);
         String [] subObiekty = {"gwiazda", "kometa", "meteoroid", "planeta", "p.karlowata", "planetoida", "satelita"};
    
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
            	displayArea.setText("");
            	Main.w.changePanel(new HelloPanel());
            }
            
        });


        add(this.helloLabel);
        add(this.ok);
        add(panel);
    }
    
    
   /* 
    public static String print(){
    	String s = new String("");
    	s = "W KATALOGU ZNAJDUJA SIE NASTEPUJACE OBIEKTY:\n "+ AddNew.printData(Utilities.obiekty) + "\n" 
    		+ "W KATALOGU ZNAJDUJA SIE NASTEPUJACE STRUKTURY:\n" + AddNew.printData2(Utilities.struktury);
    return s;
    }*/
    
}


//-------
/*
 JMenuBar menuBar = new JMenuBar();
JMenu menu = new JMenu("A Menu");

JMenuItem obiekty = new JMenuItem("Dodaj obiekt", new ImageIcon("images/obiekty.jpg"));
JMenuItem struktury = new JMenuItem("Dodaj strukture", new ImageIcon("images/struktury.jpg"));

JMenuItem menuItem = new JMenuItem();

menu.setMnemonic(KeyEvent.VK_A);
menu.getAccessibleContext().setAccessibleDescription(
       "The only menu in this program that has menu items");
menuBar.add(menu);

obiekty.setMnemonic(KeyEvent.VK_B);
struktury.setMnemonic(KeyEvent.VK_B);

menu.add(obiekty);
menu.add(struktury);

menuItem.setAccelerator(KeyStroke.getKeyStroke(
       KeyEvent.VK_2, ActionEvent.ALT_MASK));

menuItem = new JMenuItem("gwiazda");
obiekty.add(menuItem);
menuItem = new JMenuItem("kometa");
obiekty.add(menuItem);
menuItem = new JMenuItem("meteoroid");
obiekty.add(menuItem);
menuItem = new JMenuItem("planeta");
obiekty.add(menuItem);
menuItem = new JMenuItem("p.karlowata");
obiekty.add(menuItem);
menuItem = new JMenuItem("planetoida");
obiekty.add(menuItem);
menuItem = new JMenuItem("satelita");
obiekty.add(menuItem);
menuItem = new JMenuItem("gwiazdozbior");
struktury.add(menuItem);
menuItem = new JMenuItem("galaktyka");
struktury.add(menuItem);
menuItem = new JMenuItem("grupa");
struktury.add(menuItem);
menuItem = new JMenuItem("gromada");
struktury.add(menuItem);
menuItem = new JMenuItem("supergromada");
struktury.add(menuItem);*/

//menuBar.setBounds(x-120, 20, 100, 30);
//this.setJMenuBar(menuBar);
