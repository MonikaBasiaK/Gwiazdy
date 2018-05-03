package zwyklamateria.obiekty;

import java.sql.SQLException;

import core.SQLiteJDBC;

public class Gwiazda extends Obiekt{
	
	public static final String gwiazdozbior = "GW";
	static final String identity = "ID_GW"; 
	
	
	public Gwiazda(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu, String gwiazdozbior) throws SQLException
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, GWIAZDA);
		attributes.put(Gwiazda.gwiazdozbior, gwiazdozbior);
		//hm.put(this.identity, GWIAZDA);
		//id = GWIAZDA;
	}
	
	public void setGwiazdozbior(String gwiazdozbior)
	{
		attributes.put(Gwiazda.gwiazdozbior, gwiazdozbior);
	}
	public String getGwiazdozbior()
	{
		return attributes.get(Gwiazda.gwiazdozbior);
	}
	public String getIdentity(){
		return attributes.get(Gwiazda.identity);
	}
	
	public int persist() {
		int object_id = super.persist();
		
		SQLiteJDBC.persist_tobiekty_additional_attributes(object_id, Gwiazda.gwiazdozbior, attributes.get(Gwiazda.gwiazdozbior));
		return 0;
		
	}
	
}
