package JDBC0304;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCTEST_3 {
	static Connection con;
	static Statement state;
	static final String USER_ID = "root";
	static final String USER_PW = "1126";
	static final String DBNAME = "my db";
	
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String dbUrl = "jdbc:mysql://localhost/" + 
	     DBNAME +
	     "?autoReconnect=true&serverTimezone=UTC";
	
	public static void main(String[] args) {
		

	}
	
	
	}


