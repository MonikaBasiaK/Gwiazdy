package zwyklamateria.obiekty;

import java.io.Serializable;

public class Obiekt  implements Serializable{
	
	protected String nazwa;
	
	//Masy gwiazd zawieraj� si� w przybli�eniu w przedziale od 1,5913 � 1029[99] do 3,9782 � 1032 kg[157],
	//co w jednostkach masy S�o�ca oznacza zakres od 0,08 do 150-200  M
	
	//w jednostce masy S�onca M
	protected float masa;
	//w km
	protected double srednica;
	protected int wiek;

	protected String obiekt_glowny;
	//w dniach
	protected float okres_obiegu;
	
	/*public static int SPADAM_STAD = 0;
	public static int OBIEKT = 1;
	public static int GWIAZDA = 1;
	public static int KOMETA = 2;
	public static int METEOROID = 3;
	public static int PLANETA = 4;
	public static int PLANETA_KARLOWATA = 5;
	public static int PLANETOIDA = 6;
	public static int SATELITA = 7;*/
	
	public static int NAZWA = 0;
	public static int MASA = 1;
	public static int SREDNICA = 2;
	public static int WIEK = 3;
	public static int OBIEKT_GLOWNY = 4;
	public static int OKRES_OBIEGU = 5;
	public static int ROZMIAR = 6;
		
	public static String OBIEKT = "obiekty";
	public static String GWIAZDA = "Gwiazda";
	public static String KOMETA = "Kometa";
	public static String METEOROID = "Meteoroid";
	public static String PLANETA = "Planeta";
	public static String PLANETA_KARLOWATA = "PlanetaKarlowata";
	public static String PLANETOIDA = "Planetoida";
	public static String SATELITA = "Satelita";
	
	
	public Obiekt(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu) {
		
		this.nazwa = nazwa;
		this.masa = masa;
		this.srednica = srednica;
		this.wiek = wiek; 
		this.obiekt_glowny = obiekt_glowny;
		this.okres_obiegu = okres_obiegu;
	}
	 public Obiekt(){
		 
	 }
	 	
	 public void setName(String nazwa){
		 this.nazwa = nazwa;
	 }
	 public void setMasa(float masa){
		 this.masa = masa;
	 }
	  public void setSrednica(double srednica){
		 this.srednica = srednica;
	 }
	  public void setWiek(int wiek){
		 this.wiek = wiek;
	 }
	 public void setOGlowny(String obiekt_glowny){
		 this.obiekt_glowny = obiekt_glowny;
	 }
	 public void setOObiegu(float okres_obiegu){
		 this.okres_obiegu = okres_obiegu;
	 }
	 
	public String showName(){
		return this.nazwa;
	}
	
	public String showDane(){
		return "nazwa:"+this.nazwa+", masa:"+this.masa+", srednica:"+this.srednica+", wiek:"+this.wiek
				+", obiekt glowny:"+this.obiekt_glowny+", okres obiegu:"+ this.okres_obiegu+",";
	}
	
	/*
	public Obiekt() {
		System.out.println("Podaj dane: \n");

		Scanner odczyt = new Scanner(System.in);
		System.out.println("Nazwa: ");
		this.nazwa = odczyt.nextLine();

		System.out.println("Masa (w jednostce masy Slonca M): ");
		this.masa = odczyt.nextFloat();

		System.out.println("Srednica (w km): ");
		this.srednica = odczyt.nextDouble();

		System.out.println("Wiek: ");
		this.wiek = odczyt.nextInt();

		System.out.println("Okraza obiekt: ");
		Scanner odczyt2 = new Scanner(System.in);
		this.obiekt_glowny = odczyt2.nextLine();

		System.out.println("Okres obiegu (w dniach): ");
		this.okres_obiegu = odczyt.nextFloat();
	}*/
	
}
