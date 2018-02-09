package zwyklamateria.struktury;

public class Grupa extends Struktura{
		
	String galaktyki, identity;	
	
	public Grupa(String name, String galaktyki)
	{
		super(name);
		this.identity = Struktura.GRUPA;
		this.galaktyki = galaktyki;
	}
}
