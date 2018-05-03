package zwyklamateria.obiekty;

import java.sql.SQLException;

public class Meteoroid extends Obiekt{
	
	String identity = "ID_MET";
	public Meteoroid(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu) throws SQLException
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, METEOROID);
		//hm.put(this.identity, METEOROID);
		//id = METEOROID;
	}
	
	public int persist() {
		super.persist();
		return 0;
		
	}
}
