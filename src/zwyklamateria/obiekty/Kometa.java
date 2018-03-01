package zwyklamateria.obiekty;

public class Kometa  extends Obiekt{
	
	String identity;
	public Kometa(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
		this.identity =	KOMETA;
		id = KOMETA;
	}
}
