package zwyklamateria.obiekty;

import java.sql.SQLException;

public class Planetoida extends Obiekt{

	String identity = "ID_PLAN";
	
	public Planetoida(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu) throws SQLException
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, PLANETOIDA);
		//hm.put(this.identity, PLANETOIDA);
		//id = PLANETOIDA;
	}
	
	public int persist() {
		super.persist();
		return 0;
		
	}
}
