package zwyklamateria.obiekty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import core.Utilities;

public class Obiekt{
	
	public  String id; 
	public  String typ;
	public  String ksiezyce;
	public  String kategoria;
	public  String gwiazdozbior;
		
	protected String nazwa;
	protected float masa;
	protected double srednica;
	protected int wiek;
	protected String obiekt_glowny;
	protected float okres_obiegu;
		
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
	HashMap<String, String> attributes = new HashMap<>();
	
	public Obiekt(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu, String id) throws SQLException {
		
		this.nazwa = nazwa;
		this.masa = masa;
		this.srednica = srednica;
		this.wiek = wiek; 
		this.obiekt_glowny = obiekt_glowny;
		this.okres_obiegu = okres_obiegu;  
		this.id = id;
	}
	
	public Obiekt(){}
	 	
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
	 public void setIdentity(String identity){
		 this.id = identity;
	 }
	 
	public String getName(){
		return this.nazwa;
	}
	public float getMasa(){
		 return this.masa;
	 }
	  public double getSrednica(){
		 return this.srednica;
	 }
	  public int gettWiek(){
		 return this.wiek;
	 }
	 public String getOGlowny(){
		 return this.obiekt_glowny;
	 }
	 public float getOObiegu(){
		 return this.okres_obiegu;
	 }
	public String getIdentity(){
		return this.id;
	}
	
	public void setGwiazdozbior(String gwiazdozbior){
		this.gwiazdozbior = gwiazdozbior;
	}
	public String getGwiazdozbior(){
		return this.gwiazdozbior;
	}
	
	public void setKategoria(String k){
		this.kategoria = k;
	}
	public String getKategoria(){
		return this.kategoria;
	}
	public void setKsiezyce(String ks){
		this.ksiezyce = ks;
	
	}
	public String getKsiezyce(){
		return this.ksiezyce;
	}
	
	public void setTyp(String typ){
		this.typ = typ;
	}
	public String getTyp(){
		return this.typ;
	}
	
	public int persist() {
		try{
			Connection c = Utilities.getInstance().dbConnection;
			String sql = "INSERT INTO TOBIEKTY (ID, identity, nazwa, masa, srednica, wiek, obiektGlowny, okresObiegu) " +
	                " VALUES (null, ?, ?, ?, ?, ?, ?, ?);"; 
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setString(1, this.id);
			stmt.setString(2, this.nazwa);
			stmt.setFloat(3, this.masa);
			stmt.setDouble(4,  this.srednica);
			stmt.setInt(5, this.wiek);
			stmt.setString(6, this.obiekt_glowny);
			stmt.setFloat(7, this.okres_obiegu);
			stmt.executeUpdate(sql);
			
			sql = "SELECT max(ID) FROM TOBIEKTY"+
					"WHERE identity=? AND nazwa=? AND masa=? AND srednica=? AND wiek=? AND obiektGlowny=? AND okresObiegu=?;";
			PreparedStatement stmt2 = c.prepareStatement(sql);
			stmt2.setString(1, this.id);
			stmt2.setString(2, this.nazwa);
			stmt2.setFloat(3, this.masa);
			stmt2.setDouble(4,  this.srednica);
			stmt2.setInt(5, this.wiek);
			stmt2.setString(6, this.obiekt_glowny);
			stmt2.setFloat(7, this.okres_obiegu);
			ResultSet max = stmt2.executeQuery(sql);
			return max.getInt(1);
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return -1;
	}
}
