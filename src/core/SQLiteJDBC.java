package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import zwyklamateria.obiekty.Gwiazda;
import zwyklamateria.obiekty.Kometa;
import zwyklamateria.obiekty.Meteoroid;
import zwyklamateria.obiekty.Obiekt;
import zwyklamateria.obiekty.Planeta;
import zwyklamateria.obiekty.PlanetaKarlowata;
import zwyklamateria.obiekty.Planetoida;
import zwyklamateria.obiekty.Satelita;
import zwyklamateria.struktury.Galaktyka;
import zwyklamateria.struktury.Gromada;
import zwyklamateria.struktury.Grupa;
import zwyklamateria.struktury.Gwiazdozbior;
import zwyklamateria.struktury.Struktura;
import zwyklamateria.struktury.SuperGromada;

public class SQLiteJDBC {
  
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
	     		                 "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
	     		                 " identity VARCHAR(255), " +
	     		                 " nazwa VARCHAR(255), " +
	     		                 " masa FLOAT, " + 
	     		                 " srednica DOUBLE, " + 
	     		                 " wiek INTEGER not NULL, " + 
	     		                 " obiektGlowny VARCHAR(255), " + 
	     		                 " okresObiegu FLOAT)"; 
	     		  
	     			stmt.executeUpdate(sqlObiekt);
	     		   	String sqlObiekty_additional = "CREATE TABLE IF NOT EXISTS TOBIEKTY_ADDTIONAL_ATTRIBUTES" +
		     	                 "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
		     	                 " obiekt_id INTEGER, " +
		     	                 " name VARCHAR(255), " + 
		     	                 " value VARCHAR(255))"; 
	     	  
	     		   	stmt.executeUpdate(sqlObiekty_additional);
	     		   	String sqlStruktury = "CREATE TABLE IF NOT EXISTS TSTRUKTURY" +
		     	                 "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
		     	                 " identity VARCHAR(255), " +
		     	                 " nazwa VARCHAR(255))"; 
	     	  
	     		   	stmt.executeUpdate(sqlStruktury);	
	     		   	String sqlStruktury_additional = "CREATE TABLE IF NOT EXISTS TSTRUKTURY_ADDTIONAL_ATTRIBUTES" +
			                   "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
			                   " struktura_id INTEGER, " +
			                   " name VARCHAR(255), " + 
			                   " value VARCHAR(255))"; 

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

	/*
	public static void insert(){
		Connection c = connect();
		Statement stmt = null;
		
		String sql = "";
		
		try {
        
		c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        
        stmt = c.createStatement();		   
        
        for(Obiekt o: Listy.obiekty_new){
        	ResultSet max = stmt.executeQuery( "SELECT max(ID) FROM OBIEKTY;" );
        	int this_obiekt_id = max.getInt(1) + 1;
        	//int max_obiekt_id = Integer.parseInt(max.toString());
        	//System.out.println(max_obiekt_id);
        	
        	sql = "INSERT INTO TOBIEKTY ( ID, identity, nazwa, masa, srednica, wiek, obiektGlowny, okresObiegu) " +
                   " VALUES (this_obiekt_id, o.getIdentity(), o.getName(), o.getMasa(), o.getSrednica(), o.gettWiek(), o.getOGlowny(), "
                   + "o.getOObiegu());"; 
        	stmt.executeUpdate(sql);
        	
        	ResultSet max_additional = stmt.executeQuery( "SELECT max(ID) FROM OBIEKTY_ADDTIONAL_ATTRIBUTES;" );
        	//int max_additional_obiekt_id = Integer.parseInt(max_additional.toString());
        	int this_additional_obiekt_id = max_additional.getInt(1) + 1;
        	
        	if(o.getIdentity().equals(Obiekt.GWIAZDA)){
            	sql = "INSERT INTO TOBIEKTY_ADDTIONAL_ATTRIBUTES (ID, obiekt_id, name, value)"  +
                        "VALUES (this_additional_obiekt_id; this_additional_obiekt_id, 'gwiazdozbior', o.getGwiazdozbior() );"; 
            	stmt.executeUpdate(sql);
            	
       		  } 
        	else if(o.getIdentity().equals(Obiekt.PLANETA)){
                	sql = "INSERT INTO OBIEKTY_ADDTIONAL_ATTRIBUTES (ID, obiekt_id, name, value)"  +
                            "VALUES (this_additional_obiekt_id, this_additional_obiekt_id, 'ksiezyce', o.getKsiezyce() );"; 
                	stmt.executeUpdate(sql);
                	
                	this_additional_obiekt_id++;
                	sql = "INSERT INTO OBIEKTY_ADDTIONAL_ATTRIBUTES (ID, obiekt_id, name, value)"  +
                            "VALUES (this_additional_obiekt_id, this_additional_obiekt_id, 'ksiezyce', o.getKsiezyce() );";  
                	stmt.executeUpdate(sql);
                	
        	}
        	if(o.getIdentity().equals(Obiekt.SATELITA)){
            	sql = "INSERT INTO OBIEKTY_ADDTIONAL_ATTRIBUTES (ID, obiekt_id, name, value)"  +
                        "VALUES (this_additional_obiekt_id, this_additional_obiekt_id, 'typ', o.getTyp() );"; 
            	stmt.executeUpdate(sql);
            	
       		  } 
        	
        	}
        
 	   for(Struktura s: Listy.struktury_new){
 		  ResultSet max = stmt.executeQuery( "SELECT max(ID) FROM STRUKTURY;" );
 	      //int max_struktura_id = Integer.parseInt(max.toString());
 	     int this_struktura_id = max.getInt(1) + 1;
 		 
 		  sql = "INSERT INTO STRUKTURY ( ID, identity, nazwa) " +
                  " VALUES (this_struktura_id, s.getIdentity(), s.getName());"; 
       	stmt.executeUpdate(sql);
       	
       	ResultSet max_additional = stmt.executeQuery( "SELECT max(ID) FROM OBIEKTY_ADDTIONAL_ATTRIBUTES;" );
    	//int max_additional_struct_id = Integer.parseInt(max_additional.toString());
    	int this_additional_obiekt_id = max_additional.getInt(1) + 1;
    	
       	if(s.getIdentity().equals(Struktura.GALAKTYKA)){
           	sql = "INSERT INTO STRUKTURY_ADDTIONAL_ATTRIBUTES (ID, struktura_id, name, value)"  +
                       "VALUES (this_additional_obiekt_id, this_struktura_id, 'typ', s.getTyp() );";
           	stmt.executeUpdate(sql);
           	
           	this_additional_obiekt_id ++;
           	sql = "INSERT INTO STRUKTURY_ADDTIONAL_ATTRIBUTES (ID, struktura_id, name, value)"  +
                    "VALUES (this_additional_obiekt_id, this_struktura_id, 'grubosc', s.getGrubosc().toString() );";
           	stmt.executeUpdate(sql);
           	
           	this_additional_obiekt_id++;
           	sql = "INSERT INTO STRUKTURY_ADDTIONAL_ATTRIBUTES (ID, struktura_id, name, value)"  +
                   " VALUES (this_additional_obiekt_id, this_struktura_id, 'szacowana_ilosc_gwiazd', s.getSzacowana_ilosc_gwiazd().toString() );";
           	stmt.executeUpdate(sql);
           	
      		  } 
       	else if(s.getIdentity().equals(Struktura.GROMADA)){
        	sql = "INSERT INTO STRUKTURY_ADDTIONAL_ATTRIBUTES (ID, struktura_id, name, value)"  +
                 "VALUES (this_additional_obiekt_id, this_struktura_id, 'rozmiar', s.getRozmiar().toString() );";
        	stmt.executeUpdate(sql);
        
       	}
       	else if(s.getIdentity().equals(Struktura.GRUPA)){
           	sql = "INSERT INTO STRUKTURY_ADDTIONAL_ATTRIBUTES (ID, struktura_id, name, value)"  +
                       "VALUES (this_additional_obiekt_id, this_struktura_id, 'galaktyki', s.getGalaktyki() );"; 
        	stmt.executeUpdate(sql);
      		  } 
       	else if(s.getIdentity().equals(Struktura.GWIAZDOZBIOR)){
           	sql = "INSERT INTO STRUKTURY_ADDTIONAL_ATTRIBUTES (ID, struktura_id, name, value)"  +
                       "VALUES (this_additional_obiekt_id, this_struktura_id, 'gwiazdy', s.getGwiazdy() );"; 
        	stmt.executeUpdate(sql);
       	}
    	else if(s.getIdentity().equals(Struktura.SUPERGROMADA)){
           	sql = "INSERT INTO STRUKTURY_ADDTIONAL_ATTRIBUTES (ID, struktura_id, name, value)"  +
                       "VALUES (this_additional_obiekt_id, this_struktura_id, 'opis', s.getOpis() );"; 
        	stmt.executeUpdate(sql);
       	}
 		     }  

        stmt.close();
        c.commit();
        c.close();
     } catch ( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
     }
     System.out.println("Records created successfully");
  }*/
	
	public static void select(){
		Connection c = connect();
		Statement stmt = null;
		
		try {
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");
			stmt = c.createStatement();
			ResultSet rs = null;
			ResultSet rs_additional_attributes = null;
			
			rs = stmt.executeQuery( "SELECT * FROM OBIEKTY;" );
			//add_objects_from_db_to_list();
				while ( rs.next() ) {
					 int id = rs.getInt("ID");
					 String identity = rs.getString("identity");
			         String  nazwa = rs.getString("nazwa");
			         float masa  = rs.getFloat("masa");
			         double srednica = rs.getDouble("srednica");
			         int wiek = rs.getInt("wiek");
			         String obiekt_glowny = rs.getString("obiektGlowny");
			         float okres_obiegu = rs.getFloat("okresObiegu");
			         		
			         rs_additional_attributes = stmt.executeQuery( "SELECT * FROM OBIEKTY_ADDTIONAL_ATTRIBUTES WHERE obiekt_id==id;" );
			         String name, value = "";	
			            
			         if(identity.equals(Obiekt.GWIAZDA))
			         {
			        	name = rs_additional_attributes.getString("name");
					    value = rs_additional_attributes.getString("value");
					         
					  if(name.equals("gwiazdozbior"))
					  Listy.obiekty.add(new Gwiazda(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, value));
			         }
			         
			         else if(identity.equals(Obiekt.KOMETA))
			         {
			        	 Listy.obiekty.add(new Kometa(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu));
				     }
			         
			         else if(identity.equals(Obiekt.METEOROID))
			         {
			        	 Listy.obiekty.add(new Meteoroid(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu));
				     }
			         else if(identity.equals(Obiekt.PLANETA))
			         {
			        	 Planeta planeta = new Planeta(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, "", "");
			        	 while ( rs_additional_attributes.next() ) {
				        	 name = rs_additional_attributes.getString("name");
					         value = rs_additional_attributes.getString("value");
					         if(name.equals("ksiezyce")) planeta.setKsiezyce(value);
					         else if(name.equals("kategoria")) planeta.setKategoria(value);
			        	 }
			        	 Listy.obiekty.add(planeta);
				    }
			        
			         else if(identity.equals(Obiekt.PLANETA_KARLOWATA))
			         {
			        	 Listy.obiekty.add(new PlanetaKarlowata(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu));
				     }
			         
			         else if(identity.equals(Obiekt.PLANETOIDA))
			         {
			        	 Listy.obiekty.add(new Planetoida(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu));
				     }
			         
			         else if(identity.equals(Obiekt.SATELITA))
			         {
			        	name = rs_additional_attributes.getString("name");
					    value = rs_additional_attributes.getString("value");
					         
					  if(name.equals("typ"))
					  Listy.obiekty.add(new Satelita(nazwa, masa, srednica, wiek, obiekt_glowny, okres_obiegu, value));
			         }
			         //System.out.println( "ID = " + id );
			         //System.out.println( "NAME = " + nazwa );
				
			}
			
			
			
				rs = stmt.executeQuery( "SELECT * FROM STRUKTURY;" );
				rs_additional_attributes = stmt.executeQuery( "SELECT * FROM STRUKTURY_ADDTIONAL_ATTRIBUTES WHERE struktura_id==id;" );
				while ( rs.next() ) {
		         int id = rs.getInt("id");
		         String identity = rs.getString("identity");
		         String nazwa = rs.getString("nazwa");
		         
		         String name, value = "";
		         
		         if(identity.equals(Struktura.GALAKTYKA))
		         {
		        	 Galaktyka galaktyka = new Galaktyka(nazwa, "", 0, 0);
			     
		        	 while ( rs_additional_attributes.next() ) 
		        	 {
		        	 name = rs_additional_attributes.getString("name");
			         value = rs_additional_attributes.getString("value");
			         
			         if(name.equals("typ")) galaktyka.setTyp(value);
			         else if(name.equals("grubosc")) galaktyka.setGrubosc(Integer.parseInt(value));
			         else if(name.equals("szacowana_ilosc_gwiazd")) galaktyka.setSzacowana_ilosc_gwiazd(Long.parseLong(value));
		         	} 
		         	Listy.struktury.add(galaktyka);
		         }
		         
		         else if(identity.equals(Struktura.GROMADA))
		         {
		        	 name = rs_additional_attributes.getString("name");
			         value = rs_additional_attributes.getString("value");
			         
			         if(name.equals("rozmiar"))	Listy.struktury.add(new Gromada(nazwa, Integer.parseInt(value)));
		         }
		         else if(identity.equals(Struktura.GRUPA))
		         {
		        	 name = rs_additional_attributes.getString("name");
			         value = rs_additional_attributes.getString("value");
			         
			         if(name.equals("galaktyki"))	Listy.struktury.add(new Grupa(nazwa, value));
		         }
		         else if(identity.equals(Struktura.GWIAZDOZBIOR))
		         {
		        	 name = rs_additional_attributes.getString("name");
			         value = rs_additional_attributes.getString("value");
			         
			         if(name.equals("gwiazdy"))	Listy.struktury.add(new Gwiazdozbior(nazwa, value));
		         }
		         else if(identity.equals(Struktura.SUPERGROMADA))
		         {
		        	 name = rs_additional_attributes.getString("name");
			         value = rs_additional_attributes.getString("value");
			         
			         if(name.equals("opis")) Listy.struktury.add(new SuperGromada(nazwa, value));
		         }
		      
			}
	      rs.close();
	      rs_additional_attributes.close();
	      stmt.close();
	      c.close();
	   } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	   }
	   System.out.println("Operation done successfully");
	  }
	
	
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