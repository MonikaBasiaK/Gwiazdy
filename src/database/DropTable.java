package database;

import java.sql.Connection;
import java.sql.Statement;

public class DropTable {
	
	public DropTable(String database_name, String table_name) throws Exception{
		dropTable(database_name, table_name);
	}
	
	public static void dropTable(String database_name, String table_name) throws Exception{
		try{
			//new GetConnection();
			Connection con = GetConnection.getConnection(database_name);
			Statement stmt = con.createStatement();
			String sql = "DROP TABLE "+table_name; 
	        stmt.executeUpdate(sql);
		 
			System.out.println("Table "+table_name+" was deleted");
			stmt.close();
			con.close();   
		}catch(Exception e){System.out.println(e);};
				
	}

}
