package database;

import java.sql.Connection;
import java.sql.Statement;

public class DropDatabase {
	public DropDatabase(String database_name) throws Exception{
		dropDatabase(database_name);
	}
	
	public static void dropDatabase(String database_name) throws Exception{
		try{
			Connection con = GetConnection.getConnection(database_name);
			Statement stmt = con.createStatement();
			String sql = "DROP DATABASE "+database_name; 
	        stmt.executeUpdate(sql);
		 
			System.out.println("Database "+database_name+" was deleted");
			stmt.close();
			con.close();   
		}catch(Exception e){System.out.println(e);};
				
	}
}
