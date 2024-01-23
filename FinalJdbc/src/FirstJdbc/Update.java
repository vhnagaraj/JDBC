package FirstJdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		
		String url = "jdbc:mysql://localhost:3306/finaljdbc";
		String uName = "root";
		String Pass = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,uName,Pass);
		
		String q = "update table1 set Tname=? ,Tcity=? where Tid=?";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name :");
		String name = br.readLine();
		System.out.println("enter city :");
		String city = br.readLine();
		System.out.println("enter id :");
		int id = Integer.parseInt(br.readLine());
		
		PreparedStatement ps = connection.prepareStatement(q);
		ps.setString(1, name);
		ps.setString(2, city);
		ps.setInt(3, id);
		
		ps.executeUpdate();
		System.out.println("donr.......");
		connection.close();
		
		
	}

}
