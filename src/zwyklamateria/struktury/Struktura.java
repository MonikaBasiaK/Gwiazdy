package zwyklamateria.struktury;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

import core.Utilities;

public class Struktura{

	protected String name;
	String id;
	String typS, galaktykiS, gwiazdyS, opisS;
	int gruboscS;
	long szacowana_ilosc_gwiazdS;
	int rozmiarS;
	
		
	public static int NAZWA = 0;
	public static int ROZMIAR = 1;
	
	public static String STRUKTURA = "struktury";
	public static String GWIAZDOZBIOR = "Gwiazdozbior";
	public static String GALAKTYKA = "Galaktyka";
	public static String GRUPA = "Grupa";
	public static String GROMADA = "Gromada";
	public static String SUPERGROMADA = "SuperGromada";
	
	HashMap<String, Object> attributes = new HashMap<String, Object>();
	
	public Struktura(String name, String id){
		this.name = name;	
		this.id = id;
		persist();
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	public void setIdentity(String id) {
		this.id = id;
	}

	public String getIdentity() {
		return this.id;
	}
	
	public String getTyp(){
		return this.typS;
	}
	public int getGrubosc(){
		return this.gruboscS;
	}
	public long getSzacowana_ilosc_gwiazd(){
		return this.szacowana_ilosc_gwiazdS;
	}
	public int getRozmiar(){
		return this.rozmiarS;
	}
	public String getGalaktyki(){
		return this.galaktykiS;
	}
	
	public String getGwiazdy(){
		return this.gwiazdyS;
	}
	public String getOpis(){
		return this.opisS;
	}
	public void persist() {
		try{
			Connection c = Utilities.getInstance().dbConnection;
			String sql = "INSERT INTO TSTRUKTURY (ID, identity, nazwa) " +
	                " VALUES (null, ?, ?);"; 
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setString(1, this.id);
			stmt.setString(2, this.name);
			stmt.executeUpdate(sql);
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
