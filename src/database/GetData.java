package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GetData {
	
	public GetData(String database_name, String sql_statement) throws Exception{
		get(database_name, sql_statement);
	}
	
	public static ArrayList<String> get(String database_name, String sql_statement) throws Exception{
		try{
			Connection con = GetConnection.getConnection(database_name);
			
			PreparedStatement stmt = con.prepareStatement(sql_statement);
			
			ResultSet result = stmt.executeQuery();
			
			ArrayList<String> array = new ArrayList<String>();
			
			while(result.next()){
				System.out.print(result.getString("first"));
				System.out.print(" ");
				System.out.println(result.getString("last"));
				array.add(result.getString("last"));
			}
			System.out.println("All records have been selected.");
			return array;
		}catch(Exception e){System.out.println(e);};
		return null;
	}

}
