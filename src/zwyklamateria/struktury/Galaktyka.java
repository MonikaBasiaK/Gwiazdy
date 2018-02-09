package zwyklamateria.struktury;

public class Galaktyka extends Struktura{

	String typ, identity;
	int grubosc;
	long szacowana_ilosc_gwiazd;
	
	public Galaktyka(String name, String typ, int grubosc, long szacowana_ilosc_gwiazd){
		super(name);
		this.identity = Struktura.GALAKTYKA;
		this.typ = typ;
		this.grubosc = grubosc;
		this.szacowana_ilosc_gwiazd = szacowana_ilosc_gwiazd;		
	}
}
