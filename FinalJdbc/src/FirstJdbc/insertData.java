package FirstJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertData {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		String url = "jdbc:mysql://localhost:3306/finaljdbc";
		String uName = "root";
		String Pass = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,uName,Pass);
		
      
		

		String q1 = "insert into nagaraj(uname) values (?)";
		PreparedStatement ps = connection.prepareStatement(q1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name = sc.next();
		
	
		
		//setting values dymnamically
		ps.setString(1,name);
	
		
		ps.executeUpdate();
		System.out.println("inserted values succesfully");
		connection.close();
	}

}
