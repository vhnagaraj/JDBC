package FirstJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:mysql://localhost:3306/finaljdbc";
		String uName = "root";
		String Pass = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,uName,Pass);
		
		String que = "create table nagaraj(id int primary key auto_increment,uname varchar(10) not null) ";
		
				
		//creating a statement
		Statement state = connection.createStatement();
		state.executeUpdate(que);
		System.out.println("table created in databse");
		connection.close();
	}

}
