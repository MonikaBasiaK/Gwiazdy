package database;

public class DatabaseMain {
	
	/*String sql_create_table_stmt = "CREATE TABLE REGISTRATION " +
            "(id INTEGER not NULL, " +
            " first VARCHAR(255), " + 
            " last VARCHAR(255), " + 
            " age INTEGER, " + 
            " PRIMARY KEY ( id ))";*/
	
	String sql_create_table_stmt = "CREATE TABLE GWIAZDA " +
			"(id INTEGER not NULL, " +
            " nazwa VARCHAR(255), " +
            " masa FLOAT, " + 
            " srednica DOUBLE, " + 
            " wiek INTEGER not NULL, " + 
            " obiektGlowny VARCHAR(255), " + 
            " okresObiegu FLOAT, " + 
            " gwiazdozbior VARCHAR(255), " + 
            " PRIMARY KEY ( id ))";
	
	//String sql_post_stmt = "INSERT INTO REGISTRATION VALUES (100, 'Zara', 'Ali', 18)";
	
	String sql_post_stmt = "INSERT INTO GWIAZDA VALUES (3, 'Gwiazdka3', 1, 2, 3, 'obiekcik', 4, 'kalafior')";
	
	//String sql_get_data_stmt = "SELECT first, last, age FROM REGISTRATION WHERE first LIKE '%Zara%'";
	
	public DatabaseMain() throws Exception{
		
	//new CreateDatabase("gwiazdy");
	//new CreateTable("gwiazdy", sql_create_table_stmt);
	//new DropTable("gwiazdy", "GWIAZDA");
	new Post("gwiazdy", sql_post_stmt);
	//new GetData("gwiazdy", sql_get_data_stmt);
	}

}
