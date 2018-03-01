package zwyklamateria.obiekty;

public class PlanetaKarlowata extends Obiekt{

	String identity;
	public PlanetaKarlowata(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
		this.identity = PLANETA_KARLOWATA;
		id = PLANETA_KARLOWATA;
	}
}
