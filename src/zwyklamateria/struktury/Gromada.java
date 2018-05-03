package zwyklamateria.struktury;

import core.SQLiteJDBC;

public class Gromada extends Struktura{
	static final String IDENTITY = "ID_GROM";
	public static final String SIZE = "ROZMIAR";
	
	public Gromada(String name, String rozmiar){
		super(name, GROMADA);
		attributes.put(Gromada.IDENTITY, GROMADA);
		attributes.put(Gromada.SIZE, rozmiar);
		//rozmiarS = rozmiar;
	}
	
	public void setSize(String size)
	{
		this.attributes.put(Gromada.SIZE, size);
	}
	
	public int persist() {
		int struct_id = super.persist();
		
		SQLiteJDBC.persist_tstruktury_additional_attributes(struct_id, Gromada.SIZE, attributes.get(Gromada.SIZE));
			return 0;
		
	}
	
}
