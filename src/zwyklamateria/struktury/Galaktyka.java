package zwyklamateria.struktury;

import core.SQLiteJDBC;

public class Galaktyka extends Struktura{

	static final String IDENTITY = "ID_GAL";
	public static final String TYPE = "TYP"; 
	public static final String THICKNESS = "GRUBOSC";
	public static final String ESTIMATED_STARS_COUNT = "ESC";
	
	public Galaktyka(String name, String typ, String grubosc, String szacowana_ilosc_gwiazd){
		super(name, GALAKTYKA);
		attributes.put(Galaktyka.IDENTITY, GALAKTYKA);
		attributes.put(Galaktyka.TYPE, typ);
		attributes.put(Galaktyka.THICKNESS, grubosc);
		attributes.put(Galaktyka.ESTIMATED_STARS_COUNT, szacowana_ilosc_gwiazd);
		this.persist();
		}
	
	public void setTyp(String typ){
		attributes.put(Galaktyka.TYPE, typ);
	}
	public void setGrubosc(String grubosc){
		attributes.put(Galaktyka.THICKNESS, grubosc);
	}
	public void setSzacowana_ilosc_gwiazd(String szacowana_ilosc_gwiazd){
		attributes.put(Galaktyka.ESTIMATED_STARS_COUNT, szacowana_ilosc_gwiazd);
	}
	public int persist() {
		int struct_id = super.persist();
		
		SQLiteJDBC.persist_tstruktury_additional_attributes(struct_id, Galaktyka.TYPE, attributes.get(Galaktyka.TYPE));
		SQLiteJDBC.persist_tstruktury_additional_attributes(struct_id, Galaktyka.THICKNESS, attributes.get(Galaktyka.THICKNESS));
		SQLiteJDBC.persist_tstruktury_additional_attributes(struct_id, Galaktyka.ESTIMATED_STARS_COUNT, attributes.get(Galaktyka.ESTIMATED_STARS_COUNT));
			return 0;
		
	}
}
