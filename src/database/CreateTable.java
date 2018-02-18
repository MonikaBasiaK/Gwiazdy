package database;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
	
	
	public CreateTable(String database_name, String sql_statement) throws Exception{
		creatTable(sql_statement, database_name);
	}
	public static void creatTable(String sql_statement, String database_name) throws Exception{
		try{
			new GetConnection();
			Connection con = GetConnection.getConnection(database_name);
			Statement stmt = con.createStatement();
			String sql = sql_statement; 
	        stmt.executeUpdate(sql);
		 
			System.out.println("Table is being created");
			stmt.close();
			con.close();   
		}catch(Exception e){System.out.println(e);};
				
	}

}
