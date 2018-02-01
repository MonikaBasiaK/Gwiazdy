package core;

import java.util.ArrayList;

import zwyklamateria.obiekty.Obiekt;
import zwyklamateria.struktury.Galaktyka;
import zwyklamateria.struktury.Struktura;

public class Gwiazdy {
	
	public static ArrayList<Obiekt> obiekty = new ArrayList<>();
	public static ArrayList<Struktura> struktury = new ArrayList<>();
	public static ArrayList<Obiekt> obiektyTest = new ArrayList<>();
	public Gwiazdy(){
	
		//potrzebne do testu odczytu to Json - by by³y ju¿ jakieœ wypelnione listy w œrodku
		
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
	}
	

}
