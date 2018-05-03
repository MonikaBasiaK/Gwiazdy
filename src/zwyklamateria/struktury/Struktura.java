package zwyklamateria.struktury;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import core.Utilities;

public class Struktura{

	private String name;
	private String id;
	private String typS, galaktykiS, gwiazdyS, opisS;
	private int gruboscS;
	private long szacowana_ilosc_gwiazdS;
	private int rozmiarS;
	
		
	public static int NAZWA = 0;
	public static int ROZMIAR = 1;
	
	public static String STRUKTURA = "struktury";
	public static String GWIAZDOZBIOR = "Gwiazdozbior";
	public static String GALAKTYKA = "Galaktyka";
	public static String GRUPA = "Grupa";
	public static String GROMADA = "Gromada";
	public static String SUPERGROMADA = "SuperGromada";
	
	HashMap<String, String> attributes = new HashMap<String, String>();
	
	public Struktura(String name, String id){
		this.name = name;	
		this.id = id;
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
	public int persist() {
		try{
			Connection c = Utilities.getInstance().dbConnection;
			String sql = "INSERT INTO TSTRUKTURY (ID, identity, nazwa)" +
	                " VALUES (null, ?, ?);";
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setString(1, this.id);
			stmt.setString(2, this.name);
			stmt.executeUpdate();
			
			sql = "SELECT max(ID) FROM TSTRUKTURY" +
					" WHERE identity = ? and nazwa = ?;";
			PreparedStatement stmt2 = c.prepareStatement(sql);
			stmt2.setString(1, this.id);
			stmt2.setString(2, this.name);
			ResultSet max = stmt2.executeQuery();
			
			return max.getInt(1);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return -1;
	}
}
