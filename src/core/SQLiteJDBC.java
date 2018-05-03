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
	     		                 "("+ SQLiteJDBC.ID +"INTEGER PRIMARY KEY AUTOINCREMENT,"+ 
	     		                 SQLiteJDBC.identity +" VARCHAR(255), " +
	     		                 SQLiteJDBC.nazwa +" VARCHAR(255), " +
	     		                 SQLiteJDBC.masa +"FLOAT, " + 
	     		                 SQLiteJDBC.srednica +"DOUBLE, " + 
	     		                 SQLiteJDBC.wiek +"INTEGER not NULL, " + 
	     		                 SQLiteJDBC.obiektGlowny +"VARCHAR(255), " + 
	     		                 SQLiteJDBC.okresObiegu +"FLOAT)"; 
	     			
	     			stmt.executeUpdate(sqlObiekt);
	     		   	String sqlObiekty_additional = "CREATE TABLE IF NOT EXISTS TOBIEKTY_ADDTIONAL_ATTRIBUTES" +
		     	                 "("+ SQLiteJDBC.ID +"INTEGER PRIMARY KEY AUTOINCREMENT," +
		     	                 SQLiteJDBC.obiekt_id +"INTEGER, " +
		     	                 SQLiteJDBC.name +"VARCHAR(255), " + 
		     	                 SQLiteJDBC.value +"VARCHAR(255))"; 
	     	  
	     		   	stmt.executeUpdate(sqlObiekty_additional);
	     		   	String sqlStruktury = "CREATE TABLE IF NOT EXISTS TSTRUKTURY" +
		     	                 "("+ SQLiteJDBC.ID +"INTEGER PRIMARY KEY AUTOINCREMENT," +
		     	                 SQLiteJDBC.identity +"VARCHAR(255), " +
		     	                 SQLiteJDBC.nazwa +"VARCHAR(255))"; 
	     	  
	     		   	stmt.executeUpdate(sqlStruktury);	
	     		   	String sqlStruktury_additional = "CREATE TABLE IF NOT EXISTS TSTRUKTURY_ADDTIONAL_ATTRIBUTES" +
			                   "(" + SQLiteJDBC.ID +"INTEGER PRIMARY KEY AUTOINCREMENT," +
			                   	SQLiteJDBC.struktura_id +"INTEGER, " +
			                   	SQLiteJDBC.name +"VARCHAR(255), " + 
			                   	SQLiteJDBC.value +"VARCHAR(255))"; 

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
        Statement stmt = null;

        try {
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = null;
            ResultSet rs_additional_attributes = null;

            rs = stmt.executeQuery("SELECT * FROM TOBIEKTY;");
            //add_objects_from_db_to_list();
            while (rs.next()) {
                int id = rs.getInt(SQLiteJDBC.ID);
                String identity = rs.getString(SQLiteJDBC.identity);
                String nazwa = rs.getString(SQLiteJDBC.nazwa);
                float masa = rs.getFloat(SQLiteJDBC.masa);
                double srednica = rs.getDouble(SQLiteJDBC.srednica);
                int wiek = rs.getInt(SQLiteJDBC.wiek);
                String obiekt_glowny = rs.getString(SQLiteJDBC.obiektGlowny);
                float okres_obiegu = rs.getFloat(SQLiteJDBC.okresObiegu);

                rs_additional_attributes = stmt.executeQuery("SELECT * FROM TOBIEKTY_ADDTIONAL_ATTRIBUTES WHERE"+ SQLiteJDBC.obiekt_id +"==id;");
                String name, value = "";

                if (identity.equals(Obiekt.GWIAZDA)) {
                	Gwiazda gwiazda = new Gwiazda(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, "");
                    name = rs_additional_attributes.getString(SQLiteJDBC.name);
                    value = rs_additional_attributes.getString(SQLiteJDBC.value);

                    if (name.equals(Gwiazda.gwiazdozbior)) gwiazda.setGwiazdozbior(value);
                    Listy.obiekty.add(gwiazda);
                } else if (identity.equals(Obiekt.KOMETA)) {
                    Listy.obiekty.add(new Kometa(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu));
                } else if (identity.equals(Obiekt.METEOROID)) {
                    Listy.obiekty.add(new Meteoroid(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu));
                } else if (identity.equals(Obiekt.PLANETA)) {
                    Planeta planeta = new Planeta(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, "", "");
                    while (rs_additional_attributes.next()) {
                        name = rs_additional_attributes.getString(SQLiteJDBC.name);
                        value = rs_additional_attributes.getString(SQLiteJDBC.value);
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
                    name = rs_additional_attributes.getString(SQLiteJDBC.name);
                    value = rs_additional_attributes.getString(SQLiteJDBC.value);

                    if (name.equals(Satelita.typ)) satelita.setTyp(value);
                        Listy.obiekty.add(satelita);
                }
                //System.out.println( "ID = " + id );
                //System.out.println( "NAME = " + nazwa );

            }


            rs = stmt.executeQuery("SELECT * FROM TSTRUKTURY;");
            rs_additional_attributes = stmt.executeQuery("SELECT * FROM TSTRUKTURY_ADDTIONAL_ATTRIBUTES WHERE"+ SQLiteJDBC.struktura_id + "==id;");
            while (rs.next()) {
                int id = rs.getInt(SQLiteJDBC.ID);
                String identity = rs.getString(SQLiteJDBC.identity);
                String nazwa = rs.getString(SQLiteJDBC.nazwa);

                String name, value = "";

                if (identity.equals(Struktura.GALAKTYKA)) {
                    Galaktyka galaktyka = new Galaktyka(nazwa, "", "", "");

                    while (rs_additional_attributes.next()) {
                        name = rs_additional_attributes.getString(SQLiteJDBC.name);
                        value = rs_additional_attributes.getString(SQLiteJDBC.value);

                        if (name.equals(Galaktyka.TYPE)) galaktyka.setTyp(value);
                        else if (name.equals(Galaktyka.THICKNESS)) galaktyka.setGrubosc(value);
                        else if (name.equals(Galaktyka.ESTIMATED_STARS_COUNT)) galaktyka.setSzacowana_ilosc_gwiazd(value);
                    }
                    Listy.struktury.add(galaktyka);
                    
                } else if (identity.equals(Struktura.GROMADA)) {
                	Gromada gromada = new Gromada(nazwa, "");
                    name = rs_additional_attributes.getString(SQLiteJDBC.name);
                    value = rs_additional_attributes.getString(SQLiteJDBC.value);

                    if (name.equals(Gromada.SIZE)) gromada.setSize(value);
                    	Listy.struktury.add(gromada);
                    
                } else if (identity.equals(Struktura.GRUPA)) {
                	Grupa grupa = new Grupa(nazwa, "");
                    name = rs_additional_attributes.getString(SQLiteJDBC.name);
                    value = rs_additional_attributes.getString(SQLiteJDBC.value);
                    if (name.equals(Grupa.GALAXYIES)) grupa.setGalaxyies(value);
                    	Listy.struktury.add(grupa);
                    
                } else if (identity.equals(Struktura.GWIAZDOZBIOR)) {
                	Gwiazdozbior gwiazdozbior = new Gwiazdozbior(nazwa, "");
                    name = rs_additional_attributes.getString(SQLiteJDBC.name);
                    value = rs_additional_attributes.getString(SQLiteJDBC.value);
                    if (name.equals(Gwiazdozbior.STARS)) gwiazdozbior.setStars(value);
                    	Listy.struktury.add(gwiazdozbior);
                    
                } else if (identity.equals(Struktura.SUPERGROMADA)) {
                	SuperGromada supergromada = new SuperGromada(nazwa, "");
                    name = rs_additional_attributes.getString(SQLiteJDBC.name);
                    value = rs_additional_attributes.getString(SQLiteJDBC.value);
                    if (name.equals(SuperGromada.DESCRIPTION)) supergromada.setDescription(value);
                    	Listy.struktury.add(supergromada);
                }

            }
            rs.close();
            rs_additional_attributes.close();
            stmt.close();
            c.close();
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
							"VALUES(null, ?, ?, ?);";
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
							"VALUES(null, ?, ?, ?);";
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

//--------------------------------------------
	

public static void update() {
	
	   Connection c = connect();
	   Statement stmt = null;
	   
	   try {
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "UPDATE OBIEKTY set WIEK = 25000 where ID=1;";
	      stmt.executeUpdate(sql);
	      c.commit();

	      ResultSet rs = stmt.executeQuery( "SELECT * FROM OBIEKTY;" );
	      
	      while ( rs.next() ) {
	    	  int id = rs.getInt("ID");
	    	  String identity = rs.getString("identity");
		      String  nazwa = rs.getString("nazwa");
		      int wiek = rs.getInt("wiek");
		         
	         System.out.println( "ID = " + id );
	         System.out.println( "NAZWA = " + nazwa );
	         System.out.println( "IDENTITY = " + identity );
	         System.out.println( "WIEK = " + wiek );
	         System.out.println();
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	   } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	   }
	    System.out.println("Operation done successfully");
	   }
}
