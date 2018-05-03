package zwyklamateria.obiekty;

import java.sql.SQLException;

public class PlanetaKarlowata extends Obiekt{

	String identity = "ID_PKAR";
	public PlanetaKarlowata(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu) throws SQLException
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, PLANETA_KARLOWATA);
		//hm.put(this.identity, PLANETA_KARLOWATA);
		//id = PLANETA_KARLOWATA;
	}
	public int persist() {
		super.persist();
		return 0;
		
	}
}
