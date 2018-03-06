package zwyklamateria.struktury;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import core.Utilities;

public class Galaktyka extends Struktura{

	String typ = "TYP"; 
	String identity = "ID_GAL";
	int grubosc;
	long szacowana_ilosc_gwiazd;
	
	public Galaktyka(String name, String typ, int grubosc, long szacowana_ilosc_gwiazd){
		super(name, GALAKTYKA);
		attributes.put(this.identity, GALAKTYKA);
		id = GALAKTYKA;
		attributes.put(this.typ, typ);
		attributes.put("grubosc", grubosc);
		attributes.put("szacowana_ilosc_gwiazd", szacowana_ilosc_gwiazd);
		this.persist();
		}
	
	public void setTyp(String typ){
		attributes.put(this.typ, typ);
	}
	public void setGrubosc(int grubosc){
		attributes.put("grubosc", grubosc);
	}
	public void setSzacowana_ilosc_gwiazd(long szacowana_ilosc_gwiazd){
		attributes.put("szacowana_ilosc_gwiazd", szacowana_ilosc_gwiazd);
	}
	public void persist() {
		try{
			Connection c = Utilities.getInstance().dbConnection;
			Statement s = c.createStatement();	
			ResultSet max = s.executeQuery( "SELECT max(ID) FROM OBIEKTY;" );
			int this_struct_id = max.getInt(1) + 1;

			String sql = "INSERT INTO TSTRUKTURY_ADDTIONAL_ATTRIBUTES (ID, struktura_id, name, value) " +
	                " VALUES (null, ?, ?, ?);"; 
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setInt(1, this_struct_id);
			stmt.setString(2, "typ");
			stmt.setString(3, (String) attributes.get(typ));
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO TSTRUKTURY_ADDTIONAL_ATTRIBUTES (ID, struktura_id, name, value) " +
	                " VALUES (null, ?, ?, ?);"; 
			stmt = c.prepareStatement(sql);
			stmt.setInt(1, this_struct_id);
			stmt.setString(2, "grubosc");
			stmt.setInt(3,  (int) attributes.get("grubosc"));
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO TSTRUKTURY_ADDTIONAL_ATTRIBUTES (ID, struktura_id, name, value) " +
	                " VALUES (null, ?, ?, ?);"; 
			stmt = c.prepareStatement(sql);
			stmt.setInt(1, this_struct_id);
			stmt.setString(2, "szacowana_ilosc_gwiazd");
			stmt.setLong(3, (long) attributes.get("szacowana_ilosc_gwiazd"));
			stmt.executeUpdate(sql);
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
