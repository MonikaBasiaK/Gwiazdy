package zwyklamateria.obiekty;

import java.io.Serializable;
import java.util.ArrayList;

public class Planeta  extends Obiekt  implements Serializable{
	
	//protected ArrayList<String> ksiezyce = new ArrayList<>();
		//Planety dzielone s¹ na dwie kategorie: du¿e gazowe olbrzymy o ma³ej 
	// gêstoœci oraz mniejsze planety skaliste. 
	protected String ksiezyce;
	protected String kategoria;
	
	public Planeta(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu, String ksiezyce, String kategoria)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
		this.ksiezyce = ksiezyce;
		this.kategoria =kategoria;
		
	}
	
	public Planeta(){
		
	}
	
	/*
	public static void printData(ArrayList<String> list){
		for(String moon : list){
			System.out.print(moon + " , ");
		}
		System.out.println();
	}*/
	
	/*
	public Planeta(){
		super();
		System.out.println("Ksiezyce(jeœli chcesz zakoñczyæ dodawanie, wpisz end): ");
		String ksiezyc = "";
		Scanner odczyt = new Scanner(System.in);
		
		//No i co z tym zrobic? ;)
		boolean flag = true;
		
		
		while(flag){
			ksiezyc = odczyt.nextLine();
			if(ksiezyc.equals("end"))
			{
				flag = false;
			}
			else
			{
				ksiezyce.add(ksiezyc);
				printData(ksiezyce);
			}
		}
		
		System.out.println("Kategoria (gazowa/skalista): ");
		String kategoria;
		kategoria = odczyt.nextLine();
		this.kategoria = kategoria;
		
	} */

}
