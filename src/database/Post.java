package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Post {
	
	public Post(String database_name, String table_name) throws Exception{
		post(database_name, table_name);
	}
	
	public static void post(String database_name, String sql_statement) throws Exception{
		try{
			Connection con = GetConnection.getConnection(database_name);
			PreparedStatement posted = con.prepareStatement(sql_statement);
			posted.executeUpdate();
			
			//posted.close();
			//con.close();
		}catch(Exception e){System.out.println(e);};
		
			System.out.println("Insert completed.");
	}

}
