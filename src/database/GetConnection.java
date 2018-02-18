package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	
	public GetConnection(){}
	
	public static Connection getConnection(String database_name) throws Exception{
		try{
			String DRIVER = "com.mysql.jdbc.Driver";
			//String URL = "jdbc:mysql://5.172.255.182:3306";
			String URL = "jdbc:mysql://localhost:3306/"+database_name;
			String USER = "root";
			String PASS = "";
			
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected");
			return conn;
			}catch(Exception e){System.out.println(e);};
			return null;
		
		}

}
