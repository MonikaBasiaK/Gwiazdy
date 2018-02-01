package zwyklamateria.obiekty;
import java.io.Serializable;

public class Gwiazda extends Obiekt  implements Serializable{
	
	private String gwiazdozbior;
	
	//Czyli to jest zbêdne w zasadzie?
	public Gwiazda(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu, String gwiazdozbior)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
		this.gwiazdozbior = gwiazdozbior;
		
	}
	
	public Gwiazda(){
		
	}
	

/*
	public Gwiazda(String name, String gwiazdozbior){
		this.nazwa = name;
		this.gwiazdozbior = gwiazdozbior;
		
		
	}
	public Gwiazda() {
		super();

		System.out.println("Gwiazdozbior: ");
		Scanner odczyt3 = new Scanner(System.in);
		String gwiazdozbior = odczyt3.nextLine();

		this.gwiazdozbior = gwiazdozbior;
	}*/
	
	
}
