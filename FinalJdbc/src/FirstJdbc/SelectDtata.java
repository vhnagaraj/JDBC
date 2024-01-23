package FirstJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDtata {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/finaljdbc";
		String uName = "root";
		String Pass = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,uName,Pass);
		
		String q = "select * from table1";
		Statement createStatement = connection.createStatement();
		ResultSet executeQuery = createStatement.executeQuery(q);
		
		while(executeQuery.next()) {
			
			int id = executeQuery.getInt(1);
			String name = executeQuery.getString(2);
			String city = executeQuery.getString(3);
			System.out.println(id+ " "+name+ " "+city);
			
		}
		
		connection.close();
	}

}
