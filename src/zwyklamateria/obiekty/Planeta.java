package zwyklamateria.obiekty;

import java.util.HashMap;

public class Planeta  extends Obiekt{
	
	public static String ksiezyce = "KS";
	public static String kategoria = "KAT";
	public static String identity = "IDT";
	
	public Planeta(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu, String ksiezyce, String kategoria)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
		attributes.put(this.ksiezyce, ksiezyce);
		attributes.put(this.kategoria, kategoria);
		attributes.put(this.identity, PLANETA);

		id = PLANETA;
	}
	
	public void setKsiezyce(String ksiezyce){
		this.attributes.put(this.ksiezyce, ksiezyce);
	}
	public void setKategoria(String kategoria){
		this.kategoria = kategoria;
	}
}
