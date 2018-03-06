package zwyklamateria.obiekty;

import java.sql.SQLException;

public class Satelita extends Obiekt{
		
	 String typ = "TYP"; 
	 String identity = "ID_SAT";
	
		public Satelita(String nazwa, float masa,  double srednica, int wiek, 
				String obiekt_glowny, float okres_obiegu, String typ) throws SQLException
		{
			super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, SATELITA);
			attributes.put(this.typ, typ);
			//hm.put(this.identity, SATELITA);
			//id = SATELITA;
			
		}	
}
