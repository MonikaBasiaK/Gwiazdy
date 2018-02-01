package core;
import core.Utilities;
import zwyklamateria.obiekty.Kometa;
import zwyklamateria.obiekty.Obiekt;

//import com.google.gson.Gson;

public class AddNew {
	
	Obiekt obj = new Obiekt();
	//public static Gson gson = new Gson();
	//String json = gson.toJson(obj); 
	
	public AddNew(){
		Gwiazdy.obiekty.add(new Kometa("kom", 1, 2, 7, "lala", 77));
		//String json = gson.toJson(Utilities.obiekty); 
		//System.out.println(json);
	}
	
	
	/* (tnazwa.getText(), Float.parseFloat( tmasa.getText()), 
						Double.parseDouble(tsrednica.getText()), Integer.parseInt(twiek.getText()), 
						tglowny.getText(), Float.parseFloat(tobiegu.getText())
	 * 
	 * 
	 * 
	 * JSONObject obj = new JSONObject();
	 
	 public AddNew() throws JSONException{

     obj.put("name", "foo");
     obj.put("num", new Integer(100));
     obj.put("balance", new Double(1000.21));
     obj.put("is_vip", new Boolean(true));

     System.out.println(obj);
     
	 }
	
	String typ[] = {"obiekt", "strukture"};
	String obiekt[] = {"gwiazde", "komete", "meteoroid", "planete", "planete karlowata½", "planetoide½", "satelite½"};
	String struktura[] = {"gwiazdozbior", "galaktyke", "grupe", "gromade", "supergromade"};*/

	
	/*
	public static String printData(ArrayList<Obiekt> list){
		String s = new String("");
		for(Obiekt obj : list){
			System.out.print((obj).showName() + " , ");
			//s = (obj).showName() + " ";
			
		}	
		return s;	
	}
	public static String printData2(ArrayList<Struktura> list){
		String s = new String("");
		for(Struktura struct : list){
			
			System.out.print((struct).showName() + " , ");
			//s = (struct).showName() + "  ";
		}	
		return s;
	}*/
	
	/*
	Scanner in = new Scanner(System.in);
	
	public int powitanie(String t[]){	
		
		System.out.println("Co chcesz zrobic?");		
		
		for(int i=0; i<t.length; i++){
			int ii = i +1;
			System.out.println("Dodac " + t[i] + " - wybierz " + ii);
			}	
		System.out.println("Wyjsc z programu  - wybierz  0");
		
		int re = in.nextInt();
		return re;
	}
	
	public int dodaj(){
		
		int wynik = 0;
		int answ = powitanie(typ);
	
	//-------------------------------------------------------------------------------
		
		if( answ == Obiekt.SPADAM_STAD)
			System.out.println("Dziekujemy ");
			
		else if(answ == Obiekt.OBIEKT)
			wynik = powitanie(obiekt);
			
		else if(answ == Struktura.STRUKTURA)
			wynik = powitanie(struktura);
		
		else{
			System.out.println("Nieprzewidziana sytuacja. Wybierz jeszcze raz: ");
			dodaj();
			}
		
	//-------------------------------------------------------------------------------	
		
		if(answ == Obiekt.OBIEKT)
		{	
			if (wynik>Obiekt.SPADAM_STAD && wynik<=Obiekt.SATELITA)	
			{
				System.out.println("Wybrales " + obiekt[wynik-1] + "\n");	
				
			}
						
			if( wynik == Obiekt.SPADAM_STAD){
			System.out.println("Dziekujemy ");
			answ = Obiekt.SPADAM_STAD;
			}
			
			else if(wynik == Obiekt.GWIAZDA)
			*/
			/*
			 //to niepotrzbne
			  {
				Scanner odczyt = new Scanner(System.in);
				System.out.println("Nazwa gwiazdy: ");
				String nazwa_gwiazdy = odczyt.nextLine();
				System.out.println("Nazwa gwiazdozbioru: ");
				String gwiazdozbior = odczyt.nextLine();
				
				obiekty.add(new Gwiazda(nazwa_gwiazdy, gwiazdozbior));
				System.out.println("------");
				struktury.add(new Gwiazdozbior(nazwa_gwiazdy, gwiazdozbior));
				System.out.println("------");
				obiekty.add(new Gwiazda());
				System.out.println("------");
				struktury.add(new Gwiazdozbior());
				
			}*/
				
			/*	
			obiekty.add(new Gwiazda());			
			
			else if(wynik == Obiekt.KOMETA)
			obiekty.add(new Kometa());
			
			else if(wynik == Obiekt.METEOROID)
			obiekty.add(new Meteoroid());
					
			else if(wynik == Obiekt.PLANETA)
			obiekty.add(new Planeta());
			
			else if(wynik == Obiekt.PLANETA_KARLOWATA)
			obiekty.add(new PlanetaKarlowata());
			
			else if(wynik == Obiekt.PLANETOIDA)
			obiekty.add(new Planetoida());
			
			else if(wynik == Obiekt.SATELITA)
			obiekty.add(new Satelita());
			
			else
			{
			System.out.println("Nieprzewidziana sytuacja. Wybierz jeszcze raz: ");
			dodaj();
			}
		
		}
		
		else if (answ == Struktura.STRUKTURA)
		{
			{
				if (wynik>Struktura.SPADAM_STAD && wynik<=Struktura.SUPERGROMADA)	
				{
					System.out.println("Wybrales " + struktura[wynik-1]+ "\n");
					
				}
			}
			
			if( wynik == Struktura.SPADAM_STAD){
				System.out.println("Dziekujemy ");
				answ = Struktura.SPADAM_STAD;
			}
				
			else if(wynik == Struktura.GWIAZDOZBIOR)
			struktury.add(new Gwiazdozbior());
				
			else if(wynik == Struktura.GALAKTYKA)
			struktury.add(new Galaktyka());
				
			else if(wynik == Struktura.GRUPA)
			struktury.add(new Grupa());
						
			else if(wynik == Struktura.GROMADA)
			struktury.add(new Gromada());
				
			else if(wynik == Struktura.SUPERGROMADA)
			struktury.add(new SuperGromada());
				
			else
			{
				System.out.println("Nieprzewidziana sytuacja. Wybierz jeszcze raz: ");
				dodaj();
			}
		}
		
		//-------------------------------------------------------------------------------
		
		return answ;
	}
	

	public void run(){
		int answ = 0;
		do{
		answ = dodaj();
		}while(answ != 0);
		
		System.out.println("Dodane obiekty:");
		printData(obiekty);
		System.out.println("\nDodane struktury:");
		printData2(struktury);
		System.exit(0);
	}
	*/
}
