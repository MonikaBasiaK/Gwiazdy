package zwyklamateria.struktury;

public class Gromada extends Struktura{
	String identity;
	int rozmiar;
	public Gromada(String name, int rozmiar){
		super(name);
		this.identity = Struktura.GROMADA;
		id = GROMADA;
		this.rozmiar = rozmiar;
		rozmiarS = rozmiar;
	}
	
}
