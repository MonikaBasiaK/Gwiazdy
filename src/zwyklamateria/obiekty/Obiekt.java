package zwyklamateria.obiekty;

public class Obiekt{
	
	public static String identity; 
	public static String typ;
	public static String ksiezyce;
	public static String kategoria;
	public static String gwiazdozbior;
		
	protected String nazwa;
	protected float masa;
	protected double srednica;
	protected int wiek;
	protected String obiekt_glowny;
	protected float okres_obiegu;
		
	public static int NAZWA = 0;
	public static int MASA = 1;
	public static int SREDNICA = 2;
	public static int WIEK = 3;
	public static int OBIEKT_GLOWNY = 4;
	public static int OKRES_OBIEGU = 5;
	public static int ROZMIAR = 6;
		
	public static String OBIEKT = "obiekty";
	public static String GWIAZDA = "Gwiazda";
	public static String KOMETA = "Kometa";
	public static String METEOROID = "Meteoroid";
	public static String PLANETA = "Planeta";
	public static String PLANETA_KARLOWATA = "PlanetaKarlowata";
	public static String PLANETOIDA = "Planetoida";
	public static String SATELITA = "Satelita";
	
	public Obiekt(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu) {
		
		this.nazwa = nazwa;
		this.masa = masa;
		this.srednica = srednica;
		this.wiek = wiek; 
		this.obiekt_glowny = obiekt_glowny;
		this.okres_obiegu = okres_obiegu;
	}
	
	public Obiekt(){}
	 	
	 public void setName(String nazwa){
		 this.nazwa = nazwa;
	 }
	 public void setMasa(float masa){
		 this.masa = masa;
	 }
	  public void setSrednica(double srednica){
		 this.srednica = srednica;
	 }
	  public void setWiek(int wiek){
		 this.wiek = wiek;
	 }
	 public void setOGlowny(String obiekt_glowny){
		 this.obiekt_glowny = obiekt_glowny;
	 }
	 public void setOObiegu(float okres_obiegu){
		 this.okres_obiegu = okres_obiegu;
	 }
	 
	public String showName(){
		return this.nazwa;
	}
	
}
