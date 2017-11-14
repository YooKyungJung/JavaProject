package test;

public class Main {
	public static void main(String[] args) {
		DBConnection connection = new DBConnection();
		System.out.println("관리자여부: "+connection.isAdmin("admin", "admin"));
		
		
		
	}
}
