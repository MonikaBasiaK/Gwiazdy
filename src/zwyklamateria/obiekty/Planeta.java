package zwyklamateria.obiekty;

import java.sql.SQLException;
import core.SQLiteJDBC;

public class Planeta  extends Obiekt{
	
	public static final String ksiezyce = "KS";
	public static final String kategoria = "KAT";
	//String identity = "ID_PL";
	
	public Planeta(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu, String ksiezyce, String kategoria) throws SQLException
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, PLANETA);
		attributes.put(Planeta.ksiezyce, ksiezyce);
		attributes.put(Planeta.kategoria, kategoria);
		//attributes.put(this.identity, PLANETA);
	}
	
	public void setKsiezyce(String ksiezyce)
	{
		this.attributes.put(Planeta.ksiezyce, ksiezyce);
	}
	public void setKategoria(String kategoria)
	{
		this.attributes.put(Planeta.kategoria, kategoria);
	}
	public int persist() {
		int object_id = super.persist();
		
		SQLiteJDBC.persist_tobiekty_additional_attributes(object_id, Planeta.ksiezyce, attributes.get(Planeta.ksiezyce));
		SQLiteJDBC.persist_tobiekty_additional_attributes(object_id, Planeta.kategoria, attributes.get(Planeta.kategoria));
		
		return 0;
		
	}
}
