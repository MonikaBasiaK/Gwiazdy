package zwyklamateria.obiekty;

import java.sql.SQLException;

public class Kometa  extends Obiekt{
	
	String identity = "ID_KOM";
	public Kometa(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu) throws SQLException
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, KOMETA);
		//hm.put(this.identity, KOMETA);
		//id = KOMETA;
	}
}
