package zwyklamateria.struktury;

public class SuperGromada extends Struktura{
	
	String identity, opis;
	public SuperGromada(String name, String opis){
		super(name, SUPERGROMADA);
		this.identity = Struktura.SUPERGROMADA;
		id = Struktura.SUPERGROMADA;
		this.opis = opis;
	}
	
}
