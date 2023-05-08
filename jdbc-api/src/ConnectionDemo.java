import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

import java.sql.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;


public class ConnectionDemo {
	
	public static void main(String args[]) {
		
		
		try {
			
			Connection conn=JdbcFactory.getConnection();
			System.out.println("Connected Successfully");
			DatabaseMetaData meta=conn.getMetaData();
			System.out.println("DB Name: "+meta.getDatabaseProductName());
			System.out.println("DB Ver: "+meta.getDatabaseProductVersion());
			System.out.println("Driver Name: "+meta.getDriverName());
			System.out.println("Driver Ver:" +meta.getDriverVersion());
		}catch(SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		
	}

}
