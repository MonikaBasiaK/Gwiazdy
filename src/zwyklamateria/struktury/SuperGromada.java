package zwyklamateria.struktury;

import core.SQLiteJDBC;

public class SuperGromada extends Struktura{
	
	static final String IDENTITY = "ID_SG"; 
	public static final String DESCRIPTION = "OPIS";
	
	public SuperGromada(String name, String opis){
		super(name, SUPERGROMADA);
		attributes.put(IDENTITY, SUPERGROMADA);
		attributes.put(DESCRIPTION, opis);
	}
	public void setDescription(String descript)
	{
		this.attributes.put(SuperGromada.DESCRIPTION, descript);
	}
	
	public int persist() {
		int struct_id = super.persist();
		
		SQLiteJDBC.persist_tstruktury_additional_attributes(struct_id, SuperGromada.DESCRIPTION, attributes.get(SuperGromada.DESCRIPTION));
			return 0;
		
	}
	
}
