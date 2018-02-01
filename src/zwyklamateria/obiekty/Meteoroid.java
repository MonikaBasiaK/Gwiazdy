package zwyklamateria.obiekty;

import java.io.Serializable;

public class Meteoroid extends Obiekt  implements Serializable{
	public Meteoroid(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
	}

	public Meteoroid(){
		
	}

}
