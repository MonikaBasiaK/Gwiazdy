
package zwyklamateria.struktury;
import java.io.Serializable;
import java.util.ArrayList;

public class Gwiazdozbior extends Struktura  implements Serializable{
	
	
	protected ArrayList<String> gwiazdy = new ArrayList<>();	
	
	public Gwiazdozbior(){}
	
	public void printData(ArrayList<String> list){
		for(String moon : list){
			System.out.print(moon + " , ");
		}
		System.out.println();
	}
	
	/*public Gwiazdozbior(){
		super();
				
		String star;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Wprowadz kolejne gwiazdy wchodzace w sklad gwiazdozbioru: ");
		
		star = odczyt.nextLine();
		//while(star != "end"){
			gwiazdy.add(star);
			//printData(gwiazdy);
			//star = odczyt.nextLine(); 
		//}
		
	}*/
	
	/*
	public Gwiazdozbior(String name_of_star, String name_of_gwiazdozbior){
		this.name = name_of_gwiazdozbior;
		this.gwiazdy.add(name_of_star);
		}
	*/
}
