package foodonlineordering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static Connection con;
	
	public static Connection getConnection()
	{
		
		if(con==null)
		{
			try {
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				con=DriverManager.getConnection("jdbc:mysql://localhost/sampledb", "root", "");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return con;
	}
	
	
	
}
