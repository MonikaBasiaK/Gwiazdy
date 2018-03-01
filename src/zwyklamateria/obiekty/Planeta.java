package zwyklamateria.obiekty;

public class Planeta  extends Obiekt{
	
	String ksiezyce;
	String kategoria;
	String identity;
	
	public Planeta(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu, String ksiezyce, String kategoria)
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
		this.ksiezyce = ksiezyce;
		this.kategoria = kategoria;
		this.identity = PLANETA;
		id = PLANETA;
	}
	
	public void setKsiezyce(String ksiezyce){
		this.ksiezyce = ksiezyce;
	}
	public void setKategoria(String kategoria){
		this.kategoria = kategoria;
	}
}
