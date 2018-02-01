package zwyklamateria.struktury;

public class Struktura {

	String name;
	
	/*public static int STRUKTURA = 2;
	public static int SPADAM_STAD = 0;
	public static int GWIAZDOZBIOR = 1;
	public static int GALAKTYKA = 2;
	public static int GRUPA = 3;
	public static int GROMADA = 4;
	public static int SUPERGROMADA = 5;*/
	
	public static int NAZWA = 0;
	public static int ROZMIAR = 1;
	
	public static String STRUKTURA = "struktury";
	public static String GWIAZDOZBIOR = "Gwiazdozbior";
	public static String GALAKTYKA = "Galaktyka";
	public static String GRUPA = "Grupa";
	public static String GROMADA = "Gromada";
	public static String SUPERGROMADA = "SuperGromada";
	
	
public Struktura(){}

	/*public Struktura(){
		
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Nazwa: ");
		this.name = odczyt.nextLine();
		
	}*/

	public String showDane(){
		return "nazwa:"+this.name+",";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String showName() {
		return this.name;
	}
}
