
package zwyklamateria.struktury;

import core.SQLiteJDBC;

public class Gwiazdozbior extends Struktura{
	
	static final String IDENTITY = "ID_GW";
	public static final String STARS = "GWIAZDY";	
	
	public Gwiazdozbior(String name, String gwiazdy){
		super(name, GWIAZDOZBIOR);
		attributes.put(IDENTITY, GWIAZDOZBIOR);
		attributes.put(STARS, gwiazdy);
	}
	
	public void setStars(String stars)
	{
		this.attributes.put(Gwiazdozbior.STARS, stars);
	}
	public int persist() {
		int struct_id = super.persist();
		
		SQLiteJDBC.persist_tstruktury_additional_attributes(struct_id, Gwiazdozbior.STARS, attributes.get(Gwiazdozbior.STARS));
			return 0;
		
	}
	
}
