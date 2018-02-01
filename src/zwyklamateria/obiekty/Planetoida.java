package zwyklamateria.obiekty;

import java.io.Serializable;

public class Planetoida extends Obiekt implements Serializable{

	public Planetoida(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
	}

	public Planetoida(){
		
	}
}
