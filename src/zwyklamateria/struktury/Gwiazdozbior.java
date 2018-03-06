
package zwyklamateria.struktury;

public class Gwiazdozbior extends Struktura{
	
	String identity;
	protected String gwiazdy;	
	
	public Gwiazdozbior(String name, String gwiazdy){
		super(name, GWIAZDOZBIOR);
		this.gwiazdy = gwiazdy;
		this.identity = Struktura.GWIAZDOZBIOR;
		id = GWIAZDOZBIOR;
	}
	
}
