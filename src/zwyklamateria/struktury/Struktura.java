package zwyklamateria.struktury;

public class Struktura{

	protected String name;
	//public static String identity;
		
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

	public String showName() {
		return this.name;
	}
}
