package zwyklamateria.obiekty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import core.Utilities;

public class Planeta  extends Obiekt{
	
	String ksiezyce = "KS";
	String kategoria = "KAT";
	//String identity = "ID_PL";
	
	public Planeta(String nazwa, float masa,  double srednica, int wiek, 
			String obiekt_glowny, float okres_obiegu, String ksiezyce, String kategoria) throws SQLException
	{
		super(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, PLANETA);
		attributes.put(this.ksiezyce, ksiezyce);
		attributes.put(this.kategoria, kategoria);
		//attributes.put(this.identity, PLANETA);
	}
	
	public void setKsiezyce(String ksiezyce)
	{
		this.attributes.put(this.ksiezyce, ksiezyce);
	}
	public void setKategoria(String kategoria)
	{
		this.attributes.put(this.kategoria, kategoria);
	}
	public void persist() {
		try{
			Connection c = Utilities.getInstance().dbConnection;
			Statement s = c.createStatement();	
			ResultSet max = s.executeQuery( "SELECT max(ID) FROM OBIEKTY;" );
			int this_obiekt_id = max.getInt(1) + 1;

			String sql = "INSERT INTO TOBIEKTY_ADDTIONAL_ATTRIBUTES (ID, obiekt_id, name, value)"  +
                    "VALUES (null, ?, 'ksiezyce', ?);";
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setInt(1, this_obiekt_id);
			stmt.setString(2, attributes.get("KS"));
        	stmt.executeUpdate(sql);
        	
        	sql = "INSERT INTO TOBIEKTY_ADDTIONAL_ATTRIBUTES (ID, obiekt_id, name, value)"  +
                    "VALUES (null, ?, 'identity', ?);";
        	stmt.setInt(1, this_obiekt_id);
			stmt.setString(2, attributes.get("KAT"));
        	stmt.executeUpdate(sql);
        	
			  
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
