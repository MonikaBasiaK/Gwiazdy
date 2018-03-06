package zwyklamateria.struktury;

public class Grupa extends Struktura{
		
	String galaktyki, identity;	
	
	public Grupa(String name, String galaktyki)
	{
		super(name, GRUPA);
		this.identity = Struktura.GRUPA;
		//id = GRUPA;
		this.galaktyki = galaktyki;
	}
}
