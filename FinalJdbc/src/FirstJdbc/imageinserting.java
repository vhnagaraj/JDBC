package FirstJdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class imageinserting {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		String url = "jdbc:mysql://localhost:3306/finaljdbc";
		String uName = "root";
		String Pass = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,uName,Pass);

		
		    //inserting images
		
		String q = "insert into images(pic) values(?)";
		PreparedStatement ps = connection.prepareStatement(q);
		FileInputStream fs = new FileInputStream("apple.jpeg");
		ps.setBinaryStream(1,fs,fs.available());
		ps.executeUpdate();
		System.out.println("image inserted Succesfully");
	}

}
