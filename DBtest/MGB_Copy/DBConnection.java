package MGB_Copy;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DBConnection {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnection() {
		try {
			Class.forName("comm.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial","root","mirim546");
			st=(Statement) con.createStatement();
			
		}catch(Exception e) {
			System.out.println("데이터베이스 연결오류: "+e.getMessage());
		}
	}
	public boolean isAdmin(String adminId, String adminPW) {
		try {
			String SQL="SELECT * FROM adminID = "+adminId+" and adminPW = "+adminPW;
			rs=st.executeQuery(SQL);
			if(rs.next()) {
				return true;
			}
		}catch(Exception e) {
			System.out.println("데이터베이스 검색오류: "+e.getMessage());
		}
		return false;
	}

}
