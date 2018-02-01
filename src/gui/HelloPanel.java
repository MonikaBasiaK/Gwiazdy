package gui;

import core.AddNew;
import core.Gwiazdy;
import core.Main;
import core.Utilities;
import zwyklamateria.obiekty.Gwiazda;
import zwyklamateria.obiekty.Obiekt;
import zwyklamateria.struktury.Galaktyka;
import zwyklamateria.struktury.Struktura;

import javax.swing.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HelloPanel extends JPanel{

	private JLabel helloLabel = new JLabel("WITAMY");
    private JLabel obiekt = new JLabel("DODAJ OBIEKT");
    private JLabel struktura = new JLabel("DODAJ STRUKTURE");
    
    public static Font f = new Font("SansSerif", Font.BOLD, 20);
    private Font i = new Font("Impact", Font.BOLD, 20);
    public static Font g = new Font("Gabriola", Font.BOLD, 20);
    
    public static JButton exit = new JButton("EXIT");
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
    
    //private JButton add = new JButton("ADD");
    
    public static String wybor;
    public static int x;
    
     
    public HelloPanel() {
    	
        //setLayout(new FlowLayout());  - ustawia domysle polozenie komponentow gui
    	setLayout(null);
    	
    	//Backgroud cd
    	Utilities.setBackgroud("images/tenor.gif");
    	
    	//-----------
    	
    	  //setBackground(Color.white);
        this.helloLabel.setFont(g);
        this.obiekt.setFont(i);
        this.struktura.setFont(i);
        exit.setFont(f);
       // this.add.setFont(f);
        this.gwiazda.setFont(g);
        this.kometa.setFont(g);
        this.meteoroid.setFont(g);
        this.planeta.setFont(g);
        this.planeta_karlowata.setFont(g);
        this.planetoida.setFont(g);
        this.satelita.setFont(g);
        this.gwiazdozbior.setFont(g);
        this.galaktyka.setFont(g);
        this.grupa.setFont(g);
        this.gromada.setFont(g);
        this.supergromada.setFont(g);
        this.przejrzyj.setFont(g);

        x = Utilities.centre()/4;
        this.helloLabel.setBounds(x-50, 20, 100, 30);
        this.przejrzyj.setBounds(x/2 + 310, 20, 180, 30);
        
        this.obiekt.setBounds(x/2 -100, 100, 150, 30);
        this.struktura.setBounds(x/2 + 100, 100, 200, 30);
        exit.setBounds(x/2 + 350, 100, 100, 30);
        
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
        
        
      
        //this.add.setBounds(x/2 + 350, 300, 100, 30);
        //this.tAdd.setBounds(x/2 + 350, 400, 200, 30);

        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	//---------------------------------------
            	//TEST ZAPISU I ODCZYTU
            	//1.wrzucam z gwiazdy.txt -> ArrayList obiekty
            	try {
					Utilities.odczytZPliku("gwiazdy.txt");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	Struktura g1;
            	g1 = new Galaktyka();
            	g1.setName("GALAKtyczka");
            	Gwiazdy.struktury.add(g1);
            	//2. ArrayList obiekty -> obiekty.txt
            	//Utilities.writeToFile("obiekty.txt");
            	
            	//3. obiekty.txt -> ArrayList obiektyTest
            	//Utilities.readFromFile("obiekty.txt");
            	
            	//4. obiektyTest -> daneprzelane.txt
            	//Utilities.zapisDoPliku("daneprzelane.txt");
            	
            	//for(Obiekt o: Utilities.obiektyTest) System.out.println(o.showName());
            	//------------------------------------------
            	
            	// ============ to Json =========================
            	  Gwiazdy listy = new Gwiazdy();
            	//String json = Utilities.gson.toJson(listy); 
            	
            	String json = Utilities.gson.toJson(Gwiazdy.obiekty); 
        		
        		//System.out.println(json);
        		
        		//json.replaceAll("\"", "\'");
        		System.out.println(json);
        		
        		
        		String deJson = "[{'nazwa': 'Gwiazdka','masa':1.0,'srednica':11.0,'wiek':111,'obiekt_glowny':'g','okres_obiegu':1111.0}]";
               
        		//==============from Json ========================
        		//obiektListType =  new TypeToken<ArrayList<Obiekt>>().getType();
                //Gwiazdy.obiektyTest = Utilities.gson.fromJson(json, ArrayList<Obiekt>);


                //w zmiennej json musi być gwiazda w postaci JSON
                //Gwiazda gw1 = Utilities.gson.fromJson(json, Gwiazda.class);
        		
        		//ArrayList<Obiekt> newObiektList = Utilities.gson.fromJson(json, obiektListType);

        		System.exit(0);
            }
        });

        gwiazda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Utilities.setBackgroud("images/gwiazda.jpg");
            	Main.w.changePanel(new PanelGwiazda());
                
            }
        });
        
        kometa.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Utilities.setBackgroud("images/kometa.jpg");
            	Main.w.changePanel(new PanelKometa());
        		}
        }
        		);
        
        meteoroid.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Utilities.setBackgroud("images/meteoroid.jpg");
        		Main.w.changePanel(new PanelMeteoroid());
        		}
        }
        		);
        
        planeta_karlowata.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Utilities.setBackgroud("images/karlowata.jpg");
        		Main.w.changePanel(new PanelPKarlowata());
        		}
        }
        		);
        
        planetoida.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Utilities.setBackgroud("images/planetoida.jpg");
        		Main.w.changePanel(new PanelPlanetoida());
        		}
        }
        		);
        planeta.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Utilities.setBackgroud("images/planeta.jpg");
        		Main.w.changePanel(new PanelPlaneta());
        	}
        }
        		);
        satelita.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Utilities.setBackgroud("images/satelita.jpg");
        		Main.w.changePanel(new PanelSatelita());
        	}
        }
        		);
        
        gwiazdozbior.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		//Main.w.changePanel(new PanelGwiazdozbior());
        	}
        }
        		);
        
        galaktyka.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		//Main.w.changePanel(new PanelGalaktyka());
        	}
        }
        		);
        grupa.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		//Main.w.changePanel(new PanelStruktury());
        		wybor = "grupa";
        	}
        }
        		);
        gromada.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		//Main.w.changePanel(new PanelGromada());
        	}
        }
        		);
        supergromada.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		//Main.w.changePanel(new PanelStruktury());
        		wybor = "supergromada";
        	}
        }
        		);
       
        przejrzyj.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Utilities.setBackgroud("images/m.jpg");
        		try {
					Main.w.changePanel(new Katalog());
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		/*
        		try {
					AddNew.odczytZPliku();
					System.out.println(AddNew.obiekty.size());
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
        		 //AddNew.readFromFile("myfile.txt");
        		 //AddNew.writeToFile(AddNew.obiekty, "myfileOdczyt.txt");
                 
        	}
        }
        		);
        
       
        add(this.helloLabel);
        add(exit);
        //add(this.add);
        //add(this.tAdd);
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
        add(Utilities.panelImgLab);
    }
    
    
   /* public static int centre() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int)(dimension.getWidth());
        int y = (int) (dimension.getHeight());
        return x;
    }*/
    
  
    
   

   /* public static Object wybrany; 
	
	public void actionPerformed(ActionEvent e) {
		Object event = e.getSource();
		//wybrany = event;
		
		if(event == exit){
			System.exit(0);
		}
		else if(event == gwiazda){
			Main.w.changePanel(new Panel2());
		}
		else if((event == kometa ) || (event == meteoroid )|| 
				(event == planeta_karlowata) || (event ==planetoida)){
			
		}
		else if(event == planeta){
			
		}
		else if(event == satelita){
			
		}
		else if(event == gwiazdozbior){
			
		}
		else if(event == galaktyka){
			
		}
		else if((event == grupa) || (event == supergromada)){
			
		}
		else if(event == gromada){
			
		}
		
		
	}*/
    
}
