package zwyklamateria.obiekty;

import java.io.Serializable;

public class Satelita extends Obiekt  implements Serializable{
		//sztuczne, takie jak np. satelity telekomunikacyjne
		//naturalne, zwane ksiê¿ycami
		private String typ; 
		
		public Satelita(String nazwa, float masa,  double srednica, int wiek, 
				String obiekt_glowny, float okres_obiegu, String typ)
		{
			super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu);
			this.typ = typ;
		}	
		
		public Satelita(){
			
		}
		
		/*
		public Satelita(){
			super();
			System.out.println("Typ(naturalna czy sztuczna) : ");
			String typ;
			Scanner s = new Scanner(System.in);
			typ = s.nextLine();
			this.typ = typ;
		}*/
}
