package zwyklamateria.obiekty;

import java.io.Serializable;

public class PlanetaKarlowata extends Obiekt  implements Serializable {

	public PlanetaKarlowata(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
	}
	
	public PlanetaKarlowata(){
		
	}
}
