package com.lg.addrApp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lg.addrApp.Model.PostSeason;

public class MYSQLHandler {
     Connection con;
     static Statement state;
     final String USER_ID = "root";
     final String USER_PW = "1126";
     final String DBNAME = "my db";
     
     String jdbcDriver = "com.mysql.cj.jdbc.Driver";
 	 String dbUrl = "jdbc:mysql://localhost/" + 
 	     DBNAME +
 	     "?autoReconnect=true&serverTimezone=UTC";
 	 
 	 public MYSQLHandler()
 	 {
 		 connectDB();
 	 }
 	 
 	 private void connectDB()
 	 {
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
 	 
 	 public void closeDB()
 	 {
 		 try {
 			 state.close();
 			 con.close();
 			 System.out.println("DB 접속 해제!");
 		 } catch (SQLException e) {
 			 e.printStackTrace();
 		 }
 	 }
 	 
 	 public void insertDB()
 	 {
 		 String query = "insert into postseason values"
 				 + (("'필라델피아 필리스', '1883', '1980, 2008', '내셔널리그 동부지구 3위'"));
 		 
 		 String name = "필라델피아 필리스";
 		 String open = "1883";
 		 String champion = "1980, 2008";
 		 String division = "내셔널리그 동부지구 3위";
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
 	 
 	 public void INSERT_DATA(PostSeason p)
 	 {
 		 String query2 = String.format("insert into postseason(name, open, "
 				 + "champion, division)"
 				 + " values('%s', '%s', '%s', '%s')",
 				 p.getName(), p.getOpen(), p.getChampion(), p.getDivision());
 		 try {
 		 state.executeUpdate(query2);
 		 } catch (SQLException e) {
 			 e.printStackTrace();
 		 }
 	 }
 	 
 	 public void updateDB()
 	 {
 		 String query = "update postseason set name = 'LA 다저스'"
 				 + " where name = '필라델피아 필리스'";
 		 
 		 try {
			state.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
 	 }
 	 
 	public void updateDB(String searchName, String fixName)
	 {
		 String query = String.format("update postseason set name = '%s'"
				 + " where name = '%s'", fixName, searchName);
		 
		 try {
			state.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
 	
 	public void deleteDB(String delName)
	 {
		 String query = String.format("delete from postseason"
				 + " where name = '%s'", delName);
		 
		 try {
			state.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
 	
 	public static void showDB()
	{
		String query = "select * from postseason";
		try {
			ResultSet rs = state.executeQuery(query);
			if (rs != null)
			{
				rs = state.getResultSet();
				int n = 0;
				while(rs.next())
				{
					System.out.print((n+1) + "\t");
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\t");
					System.out.print(rs.getString(5) + "\t");
					System.out.println(rs.getString(17));
					n++;
				}
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
 	 
 	 
 	 public void CREATE_TABLE()
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
 	 
 	 public void DELETE_TABLE()
 	 {
 		 String query = "delete table PostSeason";
 		 try {
 			 state.executeUpdate(query);
 		 } catch (SQLException e) {
 			 checkError(e);
 		 }
 	 }
 	 
 	 public void checkError(SQLException e)
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
}
