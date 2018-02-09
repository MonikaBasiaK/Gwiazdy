package zwyklamateria.obiekty;

public class Satelita extends Obiekt{
		
	protected String typ; 
	protected String identity;
	
		public Satelita(String nazwa, float masa,  double srednica, int wiek, 
				String obiekt_glowny, float okres_obiegu, String typ)
		{
			super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
			this.typ = typ;
			this.identity = SATELITA;
		}	
}
