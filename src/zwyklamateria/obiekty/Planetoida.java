package zwyklamateria.obiekty;

public class Planetoida extends Obiekt{

	String identity;
	
	public Planetoida(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
		this.identity = PLANETOIDA;
		id = PLANETOIDA;
	}
}
