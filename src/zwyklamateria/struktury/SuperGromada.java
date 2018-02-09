package zwyklamateria.struktury;

public class SuperGromada extends Struktura{
	
	String identity, opis;
	public SuperGromada(String name, String opis){
		super(name);
		this.identity = Struktura.SUPERGROMADA;
		this.opis = opis;
	}
	
}
