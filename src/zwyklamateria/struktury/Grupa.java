package zwyklamateria.struktury;

import core.SQLiteJDBC;

public class Grupa extends Struktura{
		
	static final String IDENTITY = "ID_GRU";
	public static final String GALAXYIES = "GAL";	
	
	public Grupa(String name, String galaktyki)
	{
		super(name, GRUPA);
		attributes.put(Grupa.IDENTITY, GRUPA);
		attributes.put(Grupa.GALAXYIES, galaktyki);
	}
	
	public void setGalaxyies(String galaxyies)
	{
		this.attributes.put(Grupa.GALAXYIES, galaxyies);
	}
	public int persist() {
		int struct_id = super.persist();
		
		SQLiteJDBC.persist_tstruktury_additional_attributes(struct_id, Grupa.GALAXYIES, attributes.get(Grupa.GALAXYIES));
			return 0;
		
	}
}
