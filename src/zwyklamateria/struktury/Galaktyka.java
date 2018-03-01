package zwyklamateria.struktury;

public class Galaktyka extends Struktura{

	String typ, identity;
	int grubosc;
	long szacowana_ilosc_gwiazd;
	
	public Galaktyka(String name, String typ, int grubosc, long szacowana_ilosc_gwiazd){
		super(name);
		this.identity = Struktura.GALAKTYKA;
		id = GALAKTYKA;
		this.typ = typ;
		this.grubosc = grubosc;
		this.szacowana_ilosc_gwiazd = szacowana_ilosc_gwiazd;
		typS = typ;
		gruboscS = grubosc;
		szacowana_ilosc_gwiazdS = szacowana_ilosc_gwiazd;		
	
	}
	
	public void setTyp(String typ){
		this.typ = typ;
	}
	public void setGrubosc(int grubosc){
		this.grubosc = grubosc;
	}
	public void setSzacowana_ilosc_gwiazd(long szacowana_ilosc_gwiazd){
		this.szacowana_ilosc_gwiazd = szacowana_ilosc_gwiazd;
	}
}
