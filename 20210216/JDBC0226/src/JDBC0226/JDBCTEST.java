package JDBC0226;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTEST {
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
	    connectDB();
	    insertDB();
	    showDB();
	    closeDB();

	}
	
	public static void connectDB()
	{
		try {
			// Class.forName(jdbcDriver).newInstance();
			Class.forName(jdbcDriver);
			con = DriverManager.getConnection(dbUrl, USER_ID, USER_PW);
			if (con != null)
			{
				state = con.createStatement();
				System.out.println("DB Á¢¼Ó ¼º°ø!");
			} 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeDB()
	{
		try {
			state.close();
			con.close();
			System.out.println("DB Á¢¼Ó ÇØÁ¦!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertDB()
	{
		String query = 
			"insert into t_user values " + 
		   "(0, 'È«±æµ¿', 100, 'hong@naver.com', "
		   + "'010-1234-1234', '´ëÇÑ¹Î±¹ ¾îµò°¡', "
		   + "now())";
		
		String name = "±è±æµ¿";
		int age = 101;
		String email = "hong@naver.com";
		String tel = "010-1234-1234";
		String address = "´ëÇÑ¹Î±¹ ¾îµò°¡";
		String query2 = String.format("insert into t_user(user_nm, user_age,"
				+ "email, user_phone, user_address)" 
				+ " values('%s', %d, '%s', '%s', '%s')", 
				         name, age, email, tel, address);
		
		try {
			state.executeUpdate(query2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void showDB()
	{
		String query = "select * from t_user";
		try {
			ResultSet rs = state.executeQuery(query);
			if (rs != null) {
				rs = state.getResultSet();
				int count = 0;
				while (rs.next()) {
					System.out.print(count + "\t");
					System.out.print(rs.getString("user_nm") + "\t");
					System.out.print(rs.getString("user_age") + "\t");
					System.out.print(rs.getString("email") + "\t");
					System.out.print(rs.getString("user_phone") + "\t");
					System.out.print(rs.getString("user_address") + "\t");
					System.out.println(rs.getString(7));
					count++;
				}
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
