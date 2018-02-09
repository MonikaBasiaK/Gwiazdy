package zwyklamateria.obiekty;

public class Gwiazda extends Obiekt{
	
	String gwiazdozbior;
	String identity; 
	
	
	public Gwiazda(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu, String gwiazdozbior)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
		this.gwiazdozbior = gwiazdozbior;
		this.identity = GWIAZDA;
	}
	
}
