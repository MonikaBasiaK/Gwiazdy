package database;

import java.sql.Connection;
import java.sql.Statement;

public class CreateDatabase {
	
	public CreateDatabase(String database_name) throws Exception{
		creatTable(database_name);
	}
	public static void creatTable(String database_name) throws Exception{
		try{
			new GetConnection();
			Connection con = GetConnection.getConnection(database_name);
			Statement stmt = con.createStatement();
			String sql = "CREATE DATABASE "+database_name; 
	        stmt.executeUpdate(sql);
		 
			System.out.println("Database is being created");
			stmt.close();
			con.close();   
		}catch(Exception e){System.out.println(e);};
				
	}

}
