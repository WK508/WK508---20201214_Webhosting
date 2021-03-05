package JDBC0304;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PostSeason_Main {
	
	static Connection con;
	static Statement state;
	static final String USER_ID = "root";
	static final String USER_PW = "1126";
	static final String DBNAME = "my db";
	
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String dbUrl = "jdbc:mysql://localhost/" + 
	     DBNAME +
	     "?autoReconnect=true&serverTimezone=UTC";
	
	static final int CREATE_TABLE = 1;
	static final int DELETE_TABLE = 2;
	static final int INSERT_DATA = 3;
	static final int INSERT_RAND_DATA = 4;
	static final int VIEW_DATA = 5;
	static final int UPDATE_DATA = 6;
	static final int DELETE_DATA = 7;
	static final int MAIN_EXIT = 8;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		connectDB();
	      while (true)
	      {
	    	  switch (menu(s))
	    	  {
	    	   case CREATE_TABLE:
	    		   CREATE_TABLE();
	    		  break;
	    		  
	    	   case DELETE_TABLE:
	    		   DELETE_TABLE();
	    		  break;
	    		  
	    	   case INSERT_DATA:
	    		   INSERT_DATA();
	    		  break;
	    		  
	    	   case INSERT_RAND_DATA:
		    		  break;
	    		  
	    	   case VIEW_DATA:
	    		   VIEW_DATA();
	    		  break;
	    		  
	    	   case UPDATE_DATA:
	    		  break;
	    		  
	    	   case DELETE_DATA:
	    		  break;
	    		  
	    	   case MAIN_EXIT:
	    		   System.out.println("프로그램 종료");
	    		   closeDB();
	    		   s.close();
	    		   System.exit(0);
	    		  break;
	    	  }
	      }
	}
	
	public static void connectDB() {
		try {
			// Class.forName(jdbcDriver).newInstance();
			Class.forName(jdbcDriver);
			con = DriverManager.getConnection(dbUrl, USER_ID, USER_PW);
			if (con != null)
			{
				state = con.createStatement();
				System.out.println("DB 접속 성공!");
			} 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeDB() {
		{
			try {
				state.close();
				con.close();
				System.out.println("DB 접속 해제!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void CREATE_TABLE()
	{
		String query = "create table postseason (" 
	                   + "id INT(13) NOT NULL AUTO_INCREMENT," 
				       + "name VARCHAR(30) NOT NULL," 
	                   + "open VARCHAR(10) NOT NULL,"
	                   + "champion VARCHAR(300) NOT NULL," 
	                   + "division VARCHAR(50) NOT NULL," 
	                   + "PRIMARY KEY(id))";
		try {
			state.executeUpdate(query);
		} catch (SQLException e) {
             checkError(e);
		}
	}
			
	
	public static void DELETE_TABLE()
	{
		String query = "delete table mlbteam";
		try {
			state.executeUpdate(query);
		} catch (SQLException e) {
			checkError(e);
		}
	}
			
    public static void checkError(SQLException e)
    {
    	switch (e.getErrorCode())
    	{
    	  case 1050:
    		  System.out.println("테이블이 이미 존재합니다.");
    		 break;
    	  case 1051:
    		  System.out.println("삭제할 테이블이 존재하지 않습니다.");
    		 break;
    	}
    }
	
	public static void INSERT_DATA()
	{
		String query = 
				"insert into mlbteam values"
				+ "(17, '샌프란시스코 자이언츠', '1883', "
			    + "'1905, 1921, 1922, 1933, 1954, 2010, 2012, 2014', "
				+ "내셔널리그 서부지구 3위)";
		
		String name = "샌프란시스코 자이언츠";
		String open = "1883";
		String champion = "1905, 1921, 1922, 1933, 1954, 2010, 2012, 2014";
		String division = "내셔널리그 서부지구 3위";
		String query2 = String.format("insert into mlbteam(name, open, "
				+ "champion, division)"
				+ " values('%s', '%s', '%s', '%s')",
				name, open, champion, division);
		
		try {
			state.executeUpdate(query2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void VIEW_DATA()
	{
		String query = "select * from postseason";
		try {
			ResultSet rs = state.executeQuery(query);
			if (rs != null)
			{
				rs = state.getResultSet();
				int count = 0;
				while(rs.next())
				{
					System.out.print(count + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("open") + "\t");
					System.out.print(rs.getString("champion") + "\t");
					System.out.print(rs.getString("division") + "\t");
					System.out.println(rs.getString(17));
					count++;
				}
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

		
	

	public static int menu(Scanner s)
	{
		System.out.println("--------------------------------");
		System.out.println("MYSQL DB 관리 v1.0");
		System.out.println("--------------------------------");
		System.out.println("1. 테이블 생성");
		System.out.println("2. 테이블 삭제");
		System.out.println("3. 데이터 추가");
		System.out.println("4. 랜덤 데이터 추가");
		System.out.println("5. 데이터 보기");
		System.out.println("6. 데이터 수정");
		System.out.println("7. 데이터 삭제");
		System.out.println("8. 종료");
		System.out.println("--------------------------------");
		System.out.print("메인 메뉴 선택 : ");
		
		return s.nextInt();
		
		
	}
}
