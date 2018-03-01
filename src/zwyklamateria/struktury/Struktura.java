package zwyklamateria.struktury;

public class Struktura{

	protected String name;
	String id;
	String typS, galaktykiS, gwiazdyS, opisS;
	int gruboscS;
	long szacowana_ilosc_gwiazdS;
	int rozmiarS;
	
		
	public static int NAZWA = 0;
	public static int ROZMIAR = 1;
	
	public static String STRUKTURA = "struktury";
	public static String GWIAZDOZBIOR = "Gwiazdozbior";
	public static String GALAKTYKA = "Galaktyka";
	public static String GRUPA = "Grupa";
	public static String GROMADA = "Gromada";
	public static String SUPERGROMADA = "SuperGromada";
	
	
	public Struktura(String name){
		this.name = name;		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	public void setIdentity(String id) {
		this.id = id;
	}

	public String getIdentity() {
		return this.id;
	}
	
	public String getTyp(){
		return this.typS;
	}
	public int getGrubosc(){
		return this.gruboscS;
	}
	public long getSzacowana_ilosc_gwiazd(){
		return this.szacowana_ilosc_gwiazdS;
	}
	public int getRozmiar(){
		return this.rozmiarS;
	}
	public String getGalaktyki(){
		return this.galaktykiS;
	}
	
	public String getGwiazdy(){
		return this.gwiazdyS;
	}
	public String getOpis(){
		return this.opisS;
	}
}
