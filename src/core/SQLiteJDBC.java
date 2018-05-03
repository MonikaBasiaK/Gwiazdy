package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import zwyklamateria.obiekty.*;
import zwyklamateria.struktury.*;

public class SQLiteJDBC {
	
	static String identity = "identity";
    static String nazwa = "nazwa";
    static String masa = "masa";
    static String srednica = "srednica";
    static String wiek = "wiek";
    static String obiektGlowny = "obiektGlowny";
    static String okresObiegu = "okresObiegu";
    static String ID = "ID";
    static String obiekt_id = "obiekt_id";
    static String struktura_id = "struktura_id";
    static String name = "name";
    static String value = "value";
  
	public static Connection connect() {
	      Connection c = null;
	      try {
			         Class.forName("org.sqlite.JDBC");
			         c = DriverManager.getConnection("jdbc:sqlite:gwiazdy.db");
		      }catch ( Exception e ) {
			         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			         System.exit(0);
		    }
		    System.out.println("Opened database successfully");
			
	        Statement stmt = null;
		    try {
	     			stmt = c.createStatement();
	     			String sqlObiekt = "CREATE TABLE IF NOT EXISTS TOBIEKTY" +
	     		                 "("+ SQLiteJDBC.ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"+
	     		                 SQLiteJDBC.identity +" VARCHAR(255), " +
	     		                 SQLiteJDBC.nazwa +" VARCHAR(255), " +
	     		                 SQLiteJDBC.masa +" FLOAT, " +
	     		                 SQLiteJDBC.srednica +" DOUBLE, " +
	     		                 SQLiteJDBC.wiek +" INTEGER not NULL, " +
	     		                 SQLiteJDBC.obiektGlowny +" VARCHAR(255), " +
	     		                 SQLiteJDBC.okresObiegu +" FLOAT)";
	     			
	     			stmt.executeUpdate(sqlObiekt);
	     		   	String sqlObiekty_additional = "CREATE TABLE IF NOT EXISTS TOBIEKTY_ADDTIONAL_ATTRIBUTES" +
		     	                 "("+ SQLiteJDBC.ID +" INTEGER PRIMARY KEY AUTOINCREMENT," +
		     	                 SQLiteJDBC.obiekt_id +" INTEGER, " +
		     	                 SQLiteJDBC.name +" VARCHAR(255), " +
		     	                 SQLiteJDBC.value +" VARCHAR(255))";
	     	  
	     		   	stmt.executeUpdate(sqlObiekty_additional);
	     		   	String sqlStruktury = "CREATE TABLE IF NOT EXISTS TSTRUKTURY" +
		     	                 "("+ SQLiteJDBC.ID +" INTEGER PRIMARY KEY AUTOINCREMENT," +
		     	                 SQLiteJDBC.identity +" VARCHAR(255), " +
		     	                 SQLiteJDBC.nazwa +" VARCHAR(255))";
	     	  
	     		   	stmt.executeUpdate(sqlStruktury);	
	     		   	String sqlStruktury_additional = "CREATE TABLE IF NOT EXISTS TSTRUKTURY_ADDITIONAL_ATTRIBUTES" +
			                   "(" + SQLiteJDBC.ID +" INTEGER PRIMARY KEY AUTOINCREMENT," +
			                   	SQLiteJDBC.struktura_id +" INTEGER, " +
			                   	SQLiteJDBC.name +" VARCHAR(255), " +
			                   	SQLiteJDBC.value +" VARCHAR(255))";

	     		   	stmt.executeUpdate(sqlStruktury_additional);
	     		   	stmt.close();
	     			
	     	} catch ( Exception e ) 
	     		{
		             System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		             System.exit(0);
	     		}
			    System.out.println("Table created successfully");
			    return c;
}
	
	public static void select() {
		
		Connection c = Utilities.getInstance().dbConnection;

        try {
			Statement stmtTObiekty = c.createStatement();
			Statement stmtTObiektyAA = c.createStatement();
			Statement stmtTStruktury = c.createStatement();
			Statement stmtTStrukturyAA = c.createStatement();

			ResultSet rsTObiekty = stmtTObiekty.executeQuery("SELECT * FROM TOBIEKTY;");

            System.out.println("Opened database successfully");
            //add_objects_from_db_to_list();
            while (rsTObiekty.next()) {
                int id = rsTObiekty.getInt(SQLiteJDBC.ID);
                String identity = rsTObiekty.getString(SQLiteJDBC.identity);
                String nazwa = rsTObiekty.getString(SQLiteJDBC.nazwa);
                float masa = rsTObiekty.getFloat(SQLiteJDBC.masa);
                double srednica = rsTObiekty.getDouble(SQLiteJDBC.srednica);
                int wiek = rsTObiekty.getInt(SQLiteJDBC.wiek);
                String obiekt_glowny = rsTObiekty.getString(SQLiteJDBC.obiektGlowny);
                float okres_obiegu = rsTObiekty.getFloat(SQLiteJDBC.okresObiegu);

				ResultSet rsTObiektyAA = stmtTObiektyAA.executeQuery("SELECT * FROM TOBIEKTY_ADDTIONAL_ATTRIBUTES WHERE "+ SQLiteJDBC.obiekt_id +" = " + id + ";");
                String name, value = "";

                if (identity.equals(Obiekt.GWIAZDA)) {
                	Gwiazda gwiazda = new Gwiazda();
                	gwiazda.setName(nazwa);
                	gwiazda.setMasa(masa);
                	gwiazda.setSrednica(srednica);
                	gwiazda.setWiek(wiek);
                	gwiazda.setOGlowny(obiekt_glowny);
                	gwiazda.setOObiegu(okres_obiegu);
                    name = rsTObiektyAA.getString(SQLiteJDBC.name);
                    value = rsTObiektyAA.getString(SQLiteJDBC.value);

                    if (name.equals(Gwiazda.gwiazdozbior)) gwiazda.setGwiazdozbior(value);
                    Listy.obiekty.add(gwiazda);
                } else if (identity.equals(Obiekt.KOMETA)) {
                    Listy.obiekty.add(new Kometa(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu));
                } else if (identity.equals(Obiekt.METEOROID)) {
                    Listy.obiekty.add(new Meteoroid(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu));
                } else if (identity.equals(Obiekt.PLANETA)) {
                    Planeta planeta = new Planeta(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, "", "");
                    while (rsTObiektyAA.next()) {
                        name = rsTObiektyAA.getString(SQLiteJDBC.name);
                        value = rsTObiektyAA.getString(SQLiteJDBC.value);
                        if (name.equals(Planeta.ksiezyce)) planeta.setKsiezyce(value);
                        else if (name.equals(Planeta.kategoria)) planeta.setKategoria(value);
                    }
                    Listy.obiekty.add(planeta);
                } else if (identity.equals(Obiekt.PLANETA_KARLOWATA)) {
                    Listy.obiekty.add(new PlanetaKarlowata(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu));
                } else if (identity.equals(Obiekt.PLANETOIDA)) {
                    Listy.obiekty.add(new Planetoida(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu));
                } else if (identity.equals(Obiekt.SATELITA)) {
                	Satelita satelita = new Satelita(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, "");
                    name = rsTObiektyAA.getString(SQLiteJDBC.name);
                    value = rsTObiektyAA.getString(SQLiteJDBC.value);

                    if (name.equals(Satelita.typ)) satelita.setTyp(value);
                        Listy.obiekty.add(satelita);
                }
				rsTObiektyAA.close();
            }


			ResultSet rsTStruktury = stmtTStruktury.executeQuery("SELECT * FROM TSTRUKTURY;");
            while (rsTStruktury.next()) {
                int id = rsTStruktury.getInt(SQLiteJDBC.ID);
                String identity = rsTStruktury.getString(SQLiteJDBC.identity);
                String nazwa = rsTStruktury.getString(SQLiteJDBC.nazwa);

				ResultSet rsTStrukturyAA = stmtTStrukturyAA.executeQuery("SELECT * FROM TSTRUKTURY_ADDITIONAL_ATTRIBUTES WHERE "+ SQLiteJDBC.struktura_id + " = " + id + ";");
                String name, value = "";

                if (identity.equals(Struktura.GALAKTYKA)) {
                    Galaktyka galaktyka = new Galaktyka(nazwa, "", "", "");

                    while (rsTStrukturyAA.next()) {
                        name = rsTStrukturyAA.getString(SQLiteJDBC.name);
                        value = rsTStrukturyAA.getString(SQLiteJDBC.value);

                        if (name.equals(Galaktyka.TYPE)) galaktyka.setTyp(value);
                        else if (name.equals(Galaktyka.THICKNESS)) galaktyka.setGrubosc(value);
                        else if (name.equals(Galaktyka.ESTIMATED_STARS_COUNT)) galaktyka.setSzacowana_ilosc_gwiazd(value);
                    }
                    Listy.struktury.add(galaktyka);
                    
                } else if (identity.equals(Struktura.GROMADA)) {
                	Gromada gromada = new Gromada(nazwa, "");
                    name = rsTStrukturyAA.getString(SQLiteJDBC.name);
                    value = rsTStrukturyAA.getString(SQLiteJDBC.value);

                    if (name.equals(Gromada.SIZE)) gromada.setSize(value);
                    	Listy.struktury.add(gromada);
                    
                } else if (identity.equals(Struktura.GRUPA)) {
                	Grupa grupa = new Grupa(nazwa, "");
                    name = rsTStrukturyAA.getString(SQLiteJDBC.name);
                    value = rsTStrukturyAA.getString(SQLiteJDBC.value);
                    if (name.equals(Grupa.GALAXYIES)) grupa.setGalaxyies(value);
                    	Listy.struktury.add(grupa);
                    
                } else if (identity.equals(Struktura.GWIAZDOZBIOR)) {
                	Gwiazdozbior gwiazdozbior = new Gwiazdozbior(nazwa, "");
                    name = rsTStrukturyAA.getString(SQLiteJDBC.name);
                    value = rsTStrukturyAA.getString(SQLiteJDBC.value);
                    if (name.equals(Gwiazdozbior.STARS)) gwiazdozbior.setStars(value);
                    	Listy.struktury.add(gwiazdozbior);
                    
                } else if (identity.equals(Struktura.SUPERGROMADA)) {
                	SuperGromada supergromada = new SuperGromada(nazwa, "");
                    name = rsTStrukturyAA.getString(SQLiteJDBC.name);
                    value = rsTStrukturyAA.getString(SQLiteJDBC.value);
                    if (name.equals(SuperGromada.DESCRIPTION)) supergromada.setDescription(value);
                    	Listy.struktury.add(supergromada);
                }
                rsTStrukturyAA.close();

            }
            rsTObiekty.close();
            rsTStruktury.close();
            stmtTObiekty.close();
			stmtTStruktury.close();
			stmtTObiektyAA.close();
			stmtTStrukturyAA.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
	
	public static void persist_tobiekty_additional_attributes(int object_id, String name, String value) {
		try {
			Connection c = Utilities.getInstance().dbConnection;
			
			String sql = "INSERT INTO TOBIEKTY_ADDITIONAL_ATTRIBUTES("+ SQLiteJDBC.ID +", "+ 
						  SQLiteJDBC.obiekt_id +", "+ SQLiteJDBC.name +", "+ SQLiteJDBC.value +")"+
							" VALUES(null, ?, ?, ?);";
			PreparedStatement stmt = null;
			stmt = c.prepareStatement(sql);
			
			stmt.setInt(1, object_id);
			stmt.setString(2, name);
			stmt.setString(3, value);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void persist_tstruktury_additional_attributes(int struct_id, String name, String value) {
		try {
			Connection c = Utilities.getInstance().dbConnection;
			
			String sql = "INSERT INTO TSTRUKTURY_ADDITIONAL_ATTRIBUTES("+ SQLiteJDBC.ID +", "+
						  SQLiteJDBC.struktura_id +", "+ SQLiteJDBC.name +", "+ SQLiteJDBC.value +")"+
							" VALUES(null, ?, ?, ?);";
			PreparedStatement stmt= null;
			stmt = c.prepareStatement(sql);
			
			stmt.setInt(1, struct_id);
			stmt.setString(2, name);
			stmt.setString(3, value);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}