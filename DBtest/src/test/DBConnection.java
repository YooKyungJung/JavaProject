package test;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBConnection {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mirimguidebook","root","mirim546");
			st=(Statement) con.createStatement();
			
		}catch(Exception e) {
			System.out.println("데이터베이스 연결오류: "+e.getMessage());
		}
	}
	public boolean isAdmin(String adminId, String adminPW) {
		try {
			String SQL="SELECT * FROM adminID = '"+adminId+"' and adminPW = '"+adminPW+"'";
			rs=((java.sql.Statement) st).executeQuery(SQL);
			if(rs.next()) {
				return true;
			}
		}catch(Exception e) {
			System.out.println("데이터베이스 검색오류: "+e.getMessage());
		}
		return false;
	}

}
