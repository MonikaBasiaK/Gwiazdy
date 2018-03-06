package zwyklamateria.obiekty;

import java.sql.SQLException;

public class Gwiazda extends Obiekt{
	
	String gwiazdozbior = "GW";
	String identity = "ID_GW"; 
	
	
	public Gwiazda(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu, String gwiazdozbior) throws SQLException
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, GWIAZDA);
		attributes.put(this.gwiazdozbior, gwiazdozbior);
		//hm.put(this.identity, GWIAZDA);
		//id = GWIAZDA;
	}
	
	public void setGwiazdozbior(String gwiazdozbior)
	{
		attributes.put(this.gwiazdozbior, gwiazdozbior);
	}
	public String getGwiazdozbior()
	{
		return attributes.get(this.gwiazdozbior);
	}
	public String getIdentity(){
		return attributes.get(this.identity);
	}
	
}
