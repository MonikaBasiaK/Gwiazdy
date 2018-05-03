package zwyklamateria.obiekty;

import java.sql.SQLException;

import core.SQLiteJDBC;

public class Satelita extends Obiekt{
		
	 public static final String typ = "TYP"; 
	 static final String identity = "ID_SAT";
	
		public Satelita(String nazwa, float masa,  double srednica, int wiek, 
				String obiekt_glowny, float okres_obiegu, String typ) throws SQLException
		{
			super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, SATELITA);
			attributes.put(Satelita.typ, typ);
			//hm.put(this.identity, SATELITA);
			//id = SATELITA;
			
		}	
		
		public int persist() {
			int object_id = super.persist();
			
			SQLiteJDBC.persist_tobiekty_additional_attributes(object_id, Satelita.typ, attributes.get(Satelita.typ));
			return 0;
			
		}
}
