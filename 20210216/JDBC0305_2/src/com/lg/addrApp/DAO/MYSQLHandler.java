package com.lg.addrApp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.lg.addrApp.Model.PostSeason;

public class MYSQLHandler {
     Connection con;
     Statement state;
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
				System.out.println("DB ���� ����!");
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
 			 System.out.println("DB ���� ����!");
 		 } catch (SQLException e) {
 			 e.printStackTrace();
 		 }
 	 }
 	 
 	 public void insertDB()
 	 {
 		 String query = "insert into PostSeason values"
 				 + (("'�ʶ��Ǿ� �ʸ���', '1883', '1980, 2008', '���ųθ��� �������� 3��'"));
 		 
 		 String name = "�ʶ��Ǿ� �ʸ���";
 		 String open = "1883";
 		 String champion = "1980, 2008";
 		 String division = "���ųθ��� �������� 3��";
 		 String query2 = String.format("insert into PostSeason(name, open, "
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
 		 String query2 = String.format("insert into PostSeason(name, open, "
 				 + "champion, division)"
 				 + " values('%s', '%s', '%s', '%s')",
 				 p.getName(), p.getOpen(), p.getChampion(), p.getDivision());
 		 try {
 		 state.executeUpdate(query2);
 		 } catch (SQLException e) {
 			 e.printStackTrace();
 		 }
 	 }
 	 
 	 public void CREATE_TABLE()
 	 {
 		 String query = "create table PostSeason ("
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
 			 System.out.println("���̺��� �̹� �����մϴ�.");
 			 break;
 			 
 		 case 1051:
 			 System.out.println("������ ���̺��� �������� �ʽ��ϴ�.");
 			 break;
 		 }
 	 }
}