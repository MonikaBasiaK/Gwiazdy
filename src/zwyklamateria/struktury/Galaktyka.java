package zwyklamateria.struktury;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Galaktyka extends Struktura  implements Serializable{

	String typ;
	int grubosc;
	long szacowana_ilosc_gwiazd;
	double masa;
	
	public Galaktyka(){
	}
	
	/*public Galaktyka(){
		super();
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Typ(spiralna, soczewkowa, eliptyczna, nieregularna): ");
		this.typ = odczyt.nextLine();
		
		System.out.println("grubosc(w latach swoetlnych): ");
		this.grubosc = odczyt.nextInt();
		
		System.out.println("Szacowan ilosc gwiazd(w milirdach): ");
		this.szacowana_ilosc_gwiazd = odczyt.nextLong();
		
		System.out.println("Masa(w jednostkach masy slonca): ");
		this.masa = odczyt.nextDouble();
		odczyt.close();
	}*/
	
}
